/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.Members;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class MembersQuery extends AuthenticatedQuery implements IEntityQuery {

	
	private int aid;

	public MembersQuery(String apiKey, int aid) {
		super.apiKey = apiKey;
		this.aid = aid;
	}

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		checkApiKey();
		String url = QueryURL.MEMBERS_URL.getUrl().concat("?allianceid=").concat(Integer.toString(aid)).concat("&key=")
				.concat(apiKey);
		return new ApiQuery<>(url, new Members());
	}

}
