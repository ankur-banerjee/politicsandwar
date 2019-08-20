/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.Bank;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class BankQuery extends AuthenticatedQuery implements IEntityQuery {

	
	private int aid;

	public BankQuery(String apiKey, int aid) {
		super.apiKey = apiKey;
		this.aid = aid;
	}

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		checkApiKey();
		String url = QueryURL.BANK_URL.getUrl().concat("?allianceid=").concat(Integer.toString(aid)).concat("&key=")
				.concat(apiKey);
		return new ApiQuery<>(url, new Bank());
	}

}
