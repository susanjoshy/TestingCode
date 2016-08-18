package restexamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GoogleMapApi {
public static void main(String[] args) {
	BufferedReader rd=null;
	JSONArray jArray=null;
	 JSONObject jObject=null;
		HttpClient httpClient =HttpClientBuilder.create().build();
		Header[] headers=null;
		
		try{
	//google map location serach 
	
	HttpGet httpGetRequest=new HttpGet("https://maps.googleapis.com/maps/api/geocode/json?address=sanjose&sensor=false");
	
	//instagram media search for the given lattitue and longitude of the location .need to pass autorization key 
	//HttpGet httpGetRequest=new HttpGet("https://api.instagram.com/v1/media/search?lat=35.39&lng=-105.47&distance=20");
	
	
	HttpResponse httpResponse =httpClient.execute(httpGetRequest);
	
	System.out.println("Htttp sttaus is  "+httpResponse.getStatusLine());
	
	
	String mimeType = ContentType.getOrDefault(httpResponse.getEntity()).getMimeType();//to check the media type 
	System.out.println("\n mimeType is "+mimeType);
	String server=httpResponse.getFirstHeader("Server").getValue();
	 if (server == null) {
        System.out.println("Key 'Server' is not found!");
    } else {
        System.out.println("Server - " + server);
    }
	System.out.println("printing reponse headers ");
	headers=httpResponse.getAllHeaders();
	for(Header header:headers){
		System.out.println("key:"+header.getName()+"  "+header.getValue());
		
	}
	 JSONParser parser=new JSONParser();
	//HttpEntity entity = httpResponse.getEntity();
	 /*rd = new BufferedReader (new InputStreamReader(httpResponse.getEntity().getContent()));
	 
	  String line = null;
	  System.out.println("\n Content is:");
	  while ((line = rd.readLine()) != null) {
	
	    System.out.println("\n "+line);
	
	  

	 
	  }*/
	  String json=IOUtils.toString(httpResponse.getEntity().getContent());
	  Object obj=parser.parse(json);
	  jObject=(JSONObject)obj;
	  Map<String,String> jsonMap=(Map)obj;
	  Iterator<Entry<String, String>> it=jsonMap.entrySet().iterator();
	  System.out.println("Key and values are");
	  while(it.hasNext()){
		  Map.Entry<String,String> entry=(Map.Entry)it.next();
		  Object key=entry.getKey();
		  Object value=entry.getValue();
		  
		  System.out.println(key + "   :"+value);
		 // Map.Entry <String,String>thisEntry = (Map.Entry<String,String>) itr.next();
	  }
		 System.out.println("Total no of json objects are  :"+jObject.size());
		 System.out.println(jObject.get("results"));
		jArray=(JSONArray)jObject.get("results");
		System.out.println("Ttal no of json array are  :"+jArray.size());
		for(int i=0;i<jArray.size();i++){
			System.out.println(jArray.get(i));
		}
	  if(jObject!=null && jObject.get("results") instanceof JSONArray){
		  System.out.println(jObject.get("results") +"It is json array");
	  }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      httpClient.getConnectionManager().shutdown();
    }
		
		
		
}
}
