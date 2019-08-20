/**
 * 
 */
package com.github.src.game.pw.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * @author Ankur
 *
 */
public class TestPWClient {	
	
	public static void main(String[] args) {
		try {
			String inline = "";
			URL url = new URL("https://politicsandwar.com/api/nation/id=138541");//135523,108578,112905,138541
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode != 200) {
				throw new Exception();
			} else {
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				System.out.println("JSON data in string format");
				System.out.println(inline);
				sc.close();
			}
			
			JSONParser parse = new JSONParser();
			JSONObject jobj = (JSONObject)parse.parse(inline);
			System.out.println("Color: "+jobj.get("color"));
			
			/*JSONArray jsonarr_1 = (JSONArray) jobj.get("results");
			for(int i=0;i<jsonarr_1.size();i++)
			{
				//Store the JSON objects in an array
				//Get the index of the JSON object and print the values as per the index
				JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);
				//Store the JSON object in JSON array as objects (For level 2 array element i.e Address Components)
				JSONArray jsonarr_2 = (JSONArray) jsonobj_1.get("war_policy");
				System.out.println("Elements under results array");
				System.out.println("\ncolor: " +jsonobj_1.get("color"));
				System.out.println("Types: " +jsonobj_1.get("types"));
				//Get data for the Address Components array
				System.out.println("Elements under address_components array");
				System.out.println("The long names, short names and types are:");
				for(int j=0;j<jsonarr_2.size();j++)
				{
					//Same just store the JSON objects in an array
					//Get the index of the JSON objects and print the values as per the index
					JSONObject jsonobj_2 = (JSONObject) jsonarr_2.get(j);
					//Store the data as String objects
					String str_data1 = (String) jsonobj_2.get("cities");
					System.out.println(str_data1);
					String str_data2 = (String) jsonobj_2.get("soldierskilled");
					System.out.println(str_data2);
					System.out.println(jsonobj_2.get("soldiercasualties"));
					System.out.println("\n");
				}
				
			}*/
			//Disconnect the HttpURLConnection stream
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
