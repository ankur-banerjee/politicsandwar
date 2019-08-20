/**
 * 
 */
package com.github.src.game.pw.queries;

import com.github.src.game.pw.domain.Alliance;
import com.github.src.game.pw.enums.QueryURL;
/**
 * @author Ankur
 *
 */
public class AllianceQuery implements IEntityQuery {
	private int aid;

	  public AllianceQuery(int aid) {
	    this.aid = aid;
	  }

	  @Override
	  public ApiQuery build() {
	    String url = QueryURL.ALLIANCE_URL.getUrl().concat("id=").concat(Integer.toString(aid));
	    return new ApiQuery<>(url, new Alliance());
	  }
}
