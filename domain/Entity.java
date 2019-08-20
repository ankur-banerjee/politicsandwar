/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.Gson;

/**
 * @author Ankur
 *
 */
public abstract class Entity {
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
}
