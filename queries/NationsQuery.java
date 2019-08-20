/**
 * 
 */
package com.github.src.game.pw.queries;

import com.github.src.game.pw.domain.Nations;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class NationsQuery implements IEntityQuery {

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		String url = QueryURL.NATIONS_URL.getUrl();
	    return new ApiQuery<>(url,new Nations());
	}

}
