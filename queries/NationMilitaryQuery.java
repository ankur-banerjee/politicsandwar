/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.NationMilitary;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class NationMilitaryQuery extends AuthenticatedQuery implements IEntityQuery {

	
	public NationMilitaryQuery(String apiKey) {
		super.apiKey = apiKey;
	}

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		checkApiKey();
		String url = QueryURL.NATION_MILITARY_URL.getUrl().concat("key=").concat(apiKey);
		return new ApiQuery<>(url, new NationMilitary());
	}

}
