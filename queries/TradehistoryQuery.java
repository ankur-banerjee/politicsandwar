/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.TradeHistory;
import com.github.src.game.pw.enums.QueryURL;
import com.github.src.game.pw.enums.ResourceType;

import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * @author Ankur
 *
 */
public class TradehistoryQuery extends AuthenticatedQuery implements IEntityQuery {
	
	private Integer records;
	  private ResourceType[] resources;

	  public TradehistoryQuery(String apiKey, Integer records, ResourceType[] resources) {
	    super.apiKey = apiKey;
	    this.records = records;
	    this.resources = resources;
	  }

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		checkApiKey();
	    String url = QueryURL.TRADEHISTORY_URL.getUrl().concat("key=").concat(apiKey);
	    if (records != null)
	      url = url.concat("&records=").concat(Integer.toString(records));
	    if (resources != null)
	      url = url.concat("&resources=")
	          .concat(Arrays.stream(resources).map(ResourceType::getName).collect(Collectors.joining(",")));
	    return new ApiQuery<>(url, new TradeHistory());
	  }

}
