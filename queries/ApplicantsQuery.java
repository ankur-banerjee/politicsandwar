/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.Applicants;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class ApplicantsQuery implements IEntityQuery {

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	private int aid;

	public ApplicantsQuery(int aid) {
		this.aid = aid;
	}

	@Override
	public ApiQuery build() {
		String url = QueryURL.APPLICANTS_URL.getUrl().concat(Integer.toString(aid));
		return new ApiQuery<>(url, new Applicants());
	}

}
