/**
 * 
 */
package com.github.src.game.pw.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.MemberNationContainer;

import java.util.List;

/**
 * @author Ankur
 *
 */
public class Members extends Entity {
	
	@SerializedName("success")
	@Expose
	private boolean success;
	@SerializedName("nations")
	@Expose
	private List<MemberNationContainer> nations = null;

	public boolean isSuccess() {
		return success;
	}

	public List<MemberNationContainer> getNations() {
		return nations;
	}

}
