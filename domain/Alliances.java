/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.SAllianceContainer;

import java.util.List;

/**
 * @author Ankur
 *
 */
public class Alliances extends Entity {
	
	@SerializedName("success")
	  @Expose
	  private boolean success;
	  @SerializedName("alliances")
	  @Expose
	  private List<SAllianceContainer> alliances = null;

	  public boolean isSuccess() {
	    return success;
	  }

	  public List<SAllianceContainer> getAlliances() {
	    return alliances;
	  }
}
