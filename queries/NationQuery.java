/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.Nation;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class NationQuery implements IEntityQuery {
	
	private int nid;

	public NationQuery(int nid) {
		this.nid = nid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		String url = QueryURL.NATION_URL.getUrl().concat("id=").concat(Integer.toString(nid));
		return new ApiQuery<>(url,new Nation());
	}

}
