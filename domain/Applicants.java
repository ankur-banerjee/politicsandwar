/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.github.src.game.pw.domain.subdomain.ApplicantNationsContainer;

import java.util.List;
/**
 * @author Ankur
 *
 */
public class Applicants extends Entity {

	  @SerializedName("success")
	  @Expose
	  private boolean success;
	  @SerializedName("nations")
	  @Expose
	  private List<ApplicantNationsContainer> applicants = null;

	  public boolean isSuccess() {
	    return success;
	  }

	  public List<ApplicantNationsContainer> getApplicants() {
	    return applicants;
	  }
}
