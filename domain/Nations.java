/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.SNationContainer;


import java.util.List;
/**
 * @author Ankur
 *
 */
public class Nations extends Entity {
	@SerializedName("success")
	@Expose
	private boolean success;
	@SerializedName("nations")
	@Expose
	private List<SNationContainer> nations = null;

	public boolean isSuccess() {
		return success;
	}

	public List<SNationContainer> getNations() {
		return nations;
	}
}
