/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.domain.Wars;
import com.github.src.game.pw.enums.QueryURL;

import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * @author Ankur
 *
 */
public class WarsQuery implements IEntityQuery {
	
	private int wid;
	private Integer[] aids;

	public WarsQuery(int wid, Integer[] aids) {
		this.wid = wid;
		this.aids = aids;
	}

	/* (non-Javadoc)
	 * @see com.github.src.game.pw.queries.IEntityQuery#build()
	 */
	@Override
	public ApiQuery build() {
		String url = QueryURL.WARS_URL.getUrl();
	    if (wid > 0 && aids == null) {
	      url = url.concat(Integer.toString(wid));
	    } else if (wid < 0 && aids != null) {
	      url = url.concat("?alliance_ids=")
	          .concat(Arrays.stream(aids).map(integer -> Integer.toString(integer)).collect(Collectors.joining(",")));
	    } else if (wid > 0 && aids != null) {
	      url = url.concat(Integer.toString(wid))
	          .concat("&alliance_id=")
	          .concat(Arrays.stream(aids).map(integer -> Integer.toString(integer)).collect(Collectors.joining(",")));
	    }
	    return new ApiQuery<>(url, new Wars());
	  }

}
