/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.TradePrice;
import com.github.src.game.pw.enums.QueryURL;
import com.github.src.game.pw.enums.ResourceType;
/**
 * @author Ankur
 *
 */
public class TradepriceQuery implements IEntityQuery {
	private String resource;

	public TradepriceQuery(ResourceType resource) {
		this.resource = resource.getName();
	}

	@Override
	public ApiQuery build() {
		String url = QueryURL.TRADEPRICE_URL.getUrl().concat("resource=").concat(resource);
		return new ApiQuery<>(url, new TradePrice());
	}
}
