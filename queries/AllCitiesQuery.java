/**
 * 
 */
package com.github.src.game.pw.queries;

import com.github.src.game.pw.domain.AllCities;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class AllCitiesQuery extends AuthenticatedQuery implements IEntityQuery {

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	public AllCitiesQuery(String apiKey) {
	    super.apiKey = apiKey;
	  }
	
	@Override
	public ApiQuery build() {
		checkApiKey();
	    String url = QueryURL.ALL_CITIES_URL.getUrl().concat("key=").concat(apiKey);
		return new ApiQuery<>(url, new AllCities());
	}

}
