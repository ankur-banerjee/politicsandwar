/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.SWarContainer;

import java.util.List;

/**
 * @author Ankur
 *
 */
public class Wars extends Entity {
	@SerializedName("success")
	@Expose
	private boolean success;
	@SerializedName("wars")
	@Expose
	private List<SWarContainer> wars = null;

	public boolean isSuccess() {
		return success;
	}

	public List<SWarContainer> getWars() {
		return wars;
	}
}
