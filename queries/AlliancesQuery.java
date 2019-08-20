/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.Alliances;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class AlliancesQuery implements IEntityQuery {
	@Override
	public ApiQuery build() {
		String url = QueryURL.ALLIANCES_URL.getUrl();
		return new ApiQuery<>(url, new Alliances());
	}
}
