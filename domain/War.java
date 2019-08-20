/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.WarContainer;

import java.util.List;
/**
 * @author Ankur
 *
 */
public class War extends Entity {
	@SerializedName("success")
	@Expose
	private boolean success;
	@SerializedName("war")
	@Expose
	private List<WarContainer> war = null;

	public boolean isSuccess() {
		return success;
	}

	public List<WarContainer> getWar() {
		return war;
	}
}
