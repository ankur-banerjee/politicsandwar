/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.NationMilitaryContainer;


import java.util.List;
/**
 * @author Ankur
 *
 */
public class NationMilitary extends Entity {
	@SerializedName("success")
	@Expose
	private Boolean success;
	@SerializedName("nation_militaries")
	@Expose
	private List<NationMilitaryContainer> nationMilitaries = null;

	public Boolean isSuccess() {
		return success;
	}

	public List<NationMilitaryContainer> getNationMilitaries() {
		return nationMilitaries;
	}
}
