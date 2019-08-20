/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.TradeContainer;

import java.util.List;
/**
 * @author Ankur
 *
 */
public class TradeHistory extends Entity {
	@SerializedName("success")
	@Expose
	private boolean success;
	@SerializedName("trades")
	@Expose
	private List<TradeContainer> tradeContainers = null;

	public boolean isSuccess() {
		return success;
	}

	public List<TradeContainer> getTrades() {
		return tradeContainers;
	}
}
