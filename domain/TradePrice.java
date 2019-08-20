/**
 * 
 */
package com.github.src.game.pw.domain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.src.game.pw.domain.subdomain.HighestbuyContainer;
import com.github.src.game.pw.domain.subdomain.LowestbuyContainer;
/**
 * @author Ankur
 *
 */
public class TradePrice extends Entity {
	@SerializedName("resource")
	@Expose
	private String resource;
	@SerializedName("avgprice")
	@Expose
	private String avgprice;
	@SerializedName("marketindex")
	@Expose
	private String marketindex;
	@SerializedName("highestbuy")
	@Expose
	private HighestbuyContainer highestbuyContainer;
	@SerializedName("lowestbuy")
	@Expose
	private LowestbuyContainer lowestbuyContainer;

	public String getResource() {
		return resource;
	}

	public String getAvgprice() {
		return avgprice;
	}

	public String getMarketindex() {
		return marketindex;
	}

	public HighestbuyContainer getHighestbuy() {
		return highestbuyContainer;
	}

	public LowestbuyContainer getLowestbuy() {
		return lowestbuyContainer;
	}
}
