/**
 * 
 */
package com.github.src.game.pw.queries;

import com.github.src.game.pw.domain.War;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class WarQuery implements IEntityQuery {

	private int wid;

	public WarQuery(int wid) {
		this.wid = wid;
	}
	
	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		String url = QueryURL.WAR_URL.getUrl().concat(Integer.toString(wid));
		return new ApiQuery<>(url, new War());
	}

}
