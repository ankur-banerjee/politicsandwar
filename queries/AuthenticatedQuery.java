/**
 * 
 */
package com.github.src.game.pw.queries;

import com.github.src.game.pw.serviceimpl.PoliticsAndWarAPIException;
/**
 * @author Ankur
 *
 */
public abstract class AuthenticatedQuery {
	String apiKey = null;

	void checkApiKey() {
		if (apiKey == null)
			throw new PoliticsAndWarAPIException("This Query requires API KEY. Current apiKey = null");
	}
}
