/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.SCityContainer;

import java.util.List;
/**
 * @author Ankur
 *
 */
public class AllCities extends Entity {
	
	  @SerializedName("success")
	  @Expose
	  private Boolean success;
	  @SerializedName("all_cities")
	  @Expose
	  private List<SCityContainer> allCities = null;

	  public Boolean isSuccess() {
	    return success;
	  }

	  public List<SCityContainer> getAllCities() {
	    return allCities;
	  }

}
