/**
 * 
 */
package com.github.src.game.pw.core;

import java.lang.reflect.Type;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;


import com.github.src.game.pw.serviceimpl.PoliticsAndWarAPIException;
import com.github.src.game.pw.domain.Alliances;
import com.github.src.game.pw.domain.Entity;
import com.github.src.game.pw.domain.Nations;
import com.github.src.game.pw.domain.Wars;



/**
 * @author Ankur
 *
 */
public class Response<T extends Entity> {
	
	private String jsonStr;
	  private Gson gson = new Gson();
	  private T t;

	  public Response(String jsonStr, T t) {
	    this.jsonStr = jsonStr;
	    this.t = t;
	  }

	  public String getJson() {
	    return jsonStr;
	  }

	  public T getEntity() {
	    try {
	      JsonElement jsonElement = new JsonParser().parse(jsonStr);
	      JsonObject jsonObject = jsonElement.getAsJsonObject();
	      if(!t.getClass().getName().equals(Wars.class.getName()) || !t.getClass().getName().equals(Alliances.class.getName()) ||
	          !t.getClass().getName().equals(Nations.class.getName())) {
	        if (jsonObject.has("error") || jsonObject.has("error_message") ||
	            jsonObject.has("general_message") || jsonObject.has("message")) {
	          if(jsonObject.has("general_message"))
	            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("general_message").getAsString());
	          else if(jsonObject.has("error"))
	            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("error").getAsString());
	          else if(jsonObject.has("error_message"))
	            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("error_message").getAsString());
	          else if(jsonObject.has("message"))
	            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("message").getAsString());
	        }
	      }
	      Type type = TypeToken.get(t.getClass()).getType();
	      return gson.fromJson(jsonStr,type);
	    } catch (JsonSyntaxException e) {
	      throw new PoliticsAndWarAPIException(e);
	    }
	  }

}
