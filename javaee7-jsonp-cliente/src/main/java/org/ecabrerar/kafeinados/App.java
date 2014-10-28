package org.ecabrerar.kafeinados;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

/**
 * 
 *  Java API for JSON Processing (JSR 353)
 * @author ecabrerar
 * @see http://www.oracle.com/technetwork/articles/java/json-1973242.html
 * 
 */ 

public class App {
    public static void main( String[] args )    throws IOException {
       
       //The Streaming API
		URL url = new URL("https://api.github.com/users/ecabrerar/repos");
		 try (InputStream is = url.openStream();
		      JsonParser parser = Json.createParser(is)) {
		     while (parser.hasNext()) {
		         Event e = parser.next();
		         if (e == Event.KEY_NAME) {
		             switch (parser.getString()) {
		                 case "id":
		                     parser.next();
		                    System.out.print(parser.getString());
		                    System.out.print(": ");
		                    break;
		                case "name":
		                    parser.next();
		                    System.out.println(parser.getString());
		                    System.out.print(": ");
		                    break;
		                case "full_name":
		                    parser.next();
		                    System.out.println(parser.getString());
		                    System.out.println("---------");
		                    break;
		             }
		         }
		     }
		 }
		 
		 //The Object Model API
		 
		  try (InputStream is  = new URL("https://coderwall.com/ecabrerar.json").openStream();
		      JsonReader rdr = Json.createReader(is)) {

		     JsonObject obj = rdr.readObject();

		     System.out.print(obj.getString("username"));
	         System.out.print(": ");
	         System.out.println(obj.getString("name"));
	         System.out.print(": ");
	         System.out.print(obj.getString("location"));

	         System.out.println("-----------");

		     JsonObject account =  obj.getJsonObject("accounts");

		     System.out.print("accounts: "+account.getString("github"));

		     System.out.println("-----------");

		     JsonArray results = obj.getJsonArray("badges");
		     System.out.print("badges: ");
		     for (JsonObject result : results.getValuesAs(JsonObject.class)) {
		         System.out.print(result.getString("name"));
		         System.out.print(": ");
		         System.out.println(result.getString("description", ""));
		         System.out.print(": ");
		         System.out.print(result.getString("created"));
		         System.out.println("-----------");
		     }
		 }
		 
    }
}
