/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.City;
import com.github.src.game.pw.enums.QueryURL;

/**
 * @author Ankur
 *
 */
public class CityQuery implements IEntityQuery {

	
	private int cid;

	public CityQuery(int cid) {
		this.cid = cid;
	}

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		String url = QueryURL.CITY_URL.getUrl().concat("id=").concat(Integer.toString(cid));
		return new ApiQuery<>(url, new City());
	}

}
