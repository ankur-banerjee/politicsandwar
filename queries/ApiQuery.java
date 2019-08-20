/**
 * 
 */
package com.github.src.game.pw.queries;


import com.github.src.game.pw.serviceimpl.PoliticsAndWarAPIException;
import com.github.src.game.pw.core.Response;
import com.github.src.game.pw.domain.Entity;
import com.github.src.game.pw.enums.QueryURL;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @author Ankur
 *
 */
public class ApiQuery<T extends Entity> {
	private String urlPart;
	private String urlStr = "";
	private T t;

	ApiQuery(String urlPart, T t) {
		this.urlPart = urlPart;
		this.t = t;
	}

	private static String convertStreamToString(java.io.InputStream is) {
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}

	public void buildUrlStr(boolean testServerMode) {
		String baseUrl = testServerMode ? QueryURL.TEST_URL.getUrl() : QueryURL.LIVE_URL.getUrl();
		urlStr = baseUrl.concat(urlPart);
	}

	public Response fetchAPI() {
		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlStr);
			conn = (HttpURLConnection) url.openConnection();
			conn.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36");
			conn.setRequestMethod("GET");
			int respCode = conn.getResponseCode();
			String respMessage = String.format("Politics and War API returned '%s' from url: %s",
					respCode + " " + conn.getResponseMessage(), urlPart);

			InputStream stream = conn.getErrorStream();

			if (stream == null) {
				stream = conn.getInputStream();
				return new Response<>(convertStreamToString(stream), t);
			} else {
				throw new PoliticsAndWarAPIException(respMessage);
			}
		} catch (IOException e) {
			throw new PoliticsAndWarAPIException(e);
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
	}

	public String getUrlStr() {
		return urlStr;
	}
}
