/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.AllianceBankContainer;

import java.util.List;
/**
 * @author Ankur
 *
 */
public class Bank extends Entity {
	
	@SerializedName("success")
	  @Expose
	  private boolean success;
	  @SerializedName("alliance_bank_contents")
	  @Expose
	  private List<AllianceBankContainer> allianceBankContainers = null;

	  public boolean isSuccess() {
	    return success;
	  }

	  public List<AllianceBankContainer> getAllianceBanks() {
	    return allianceBankContainers;
	  }

}
