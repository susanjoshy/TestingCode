package restexamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;

public class GoogleSearch {
private static final String USER_AGENT = "Mozilla/5.0";

public static void main(String[] args) {
	Header[] headers;
	String url = "http://www.google.com/search?q=Apple";

	HttpClient client = HttpClientBuilder.create().build();
	HttpGet request = new HttpGet(url);

	// add request header
	request.addHeader("User-Agent", USER_AGENT);
	//request.setHeader("Content-Type","application/json");
	
	HttpResponse response;
	try {
		
		response = client.execute(request);
		//response.setHeader("Content-Type","application/json");
		System.out.println("Response Message : " 
                + response.getStatusLine().getReasonPhrase());

	System.out.println("Response Code : " 
                + response.getStatusLine().getStatusCode());
	
	String server=response.getFirstHeader("Server").getValue();
	
	 if (server == null) {
        System.out.println("Key 'Server' is not found!");
    } else {
        System.out.println("Server - " + server);
    }

	
	//to check the media/content  type 
	String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
	
	
	System.out.println("\n mimeType is :"+mimeType);
	
	System.out.println("content type is  :"+response.getEntity().getContentType());
	System.out.println("content length is    :"+response.getEntity().getContentLength());
	
	System.out.println("printing reponse headers ");
	headers=response.getAllHeaders();
		for(Header header:headers){
			System.out.println("key:"+header.getName()+"  "+header.getValue());
		
		}
		
	  String line = null;
	  BufferedReader rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));
	System.out.println("\n Content is:");
	  while ((line = rd.readLine()) != null) {
	
	    System.out.println("\n "+line);
	} 
	}catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
