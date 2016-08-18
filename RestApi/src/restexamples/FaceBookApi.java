package restexamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FaceBookApi {
	public static void main(String[] args) {
		
	
	
	HttpClient httpClient =HttpClientBuilder.create().build();
	Header[] headers=null;
	try{
		// HttpGet me?fields=id,name,posts
					/*POST graph.facebook.com
					  /{user-id}/feed?
					    message={message}&amp;
					    access_token={access-token}*/
		
		//facebook HttpGet on name and post(limited to 1 post) -here me is the {user-id}
		// here either use the user -id as 1189484381080048 or me
		/*String url="https://graph.facebook.com/me/feed?message=Hello&access_token=CAACEdEose0cBADzHHYoAm2edVk6oA3AYt0ZAgQs2tVmZCTfBUTpgDkUEruhXqyhOxIgs1Iy6XwjaTSVWH1DGovLI31kjJ9IStVdxsWPquZBHYz9rQbAuNZBt12p2ZCRJDbwboLa4B7rx4ymk1zc9SRjYve1rPG0gytLZCmZBDmbgeaYSJfmnwHZBbT0LCGmhbUGBpjwM0uEt6gZDZD";
		HttpPost post=new HttpPost(url);
		try {
			HttpResponse httpResponse=httpClient.execute(post);
			System.out.println("Htttp sttaus is  "+httpResponse.getStatusLine());
			System.out.println("content type is  :"+httpResponse.getEntity().getContentType());
			System.out.println("content length is    :"+httpResponse.getEntity().getContentLength());
			System.out.println("printing reponse headers ");
			headers=httpResponse.getAllHeaders();
				for(Header header:headers){
					System.out.println("key:"+header.getName()+"  "+header.getValue());
				
				}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}*/
		HttpGet httpGetRequest=new HttpGet("https://graph.facebook.com/me?fields=name,posts.limit(2)&access_token=EAACEdEose0cBALjBTyNcx1rzID8ZA6C7rQYu3kpeDwrKWjU96FKjfeCdjd7nnEXd4D3FxboDEa07uKS4MiQkBF4DOMMY3FV0HXBVLZCVERB0rUODEanZBaZAbVF1Q186wloQNzycZBLAWzevK8c6wP172ZAQGkn0OnoiSGbKO1ZAwZDZD");
		httpGetRequest.setHeader("Content-Type", "application/json");
		HttpResponse httpResponse =httpClient.execute(httpGetRequest);
		
		System.out.println("Htttp sttaus is  "+httpResponse.getStatusLine());
		System.out.println("content type is  :"+httpResponse.getEntity().getContentType());
		System.out.println("content length is    :"+httpResponse.getEntity().getContentLength());
		// to check the media type 
		String mimeType = ContentType.getOrDefault(httpResponse.getEntity()).getMimeType();
		
		System.out.println("\n mimeType is "+mimeType);
		
		/*String server=httpResponse.getFirstHeader("Server").getValue();
		
		 if (server == null) {
             System.out.println("Key 'Server' is not found!");
         } else {
             System.out.println("Server - " + server);
         }*/
		
		System.out.println("printing reponse headers ");
		headers=httpResponse.getAllHeaders();
			for(Header header:headers){
				System.out.println("key:"+header.getName()+"  "+header.getValue());
			
			}
		//HttpEntity entity = httpResponse.getEntity();
		/*BufferedReader rd = new BufferedReader (new InputStreamReader(httpResponse.getEntity().getContent()));
		
		
		  String line = null;
		  System.out.println("\n Content is:");
		  
		  while ((line = rd.readLine()) != null) {
	
		    System.out.println("\n "+line);
		  }*/
		 /*String json=IOUtils.toString(httpResponse.getEntity().getContent());
		   
		    
		  JSONParser jsonParser = new JSONParser();
		  Object obj=jsonParser.parse(rd);
		  
		
		              JSONObject jsonObject = (JSONObject) obj;
		             String fname= (String)jsonObject.get("fname");
		              */
		  
		 
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      httpClient.getConnectionManager().shutdown();
	    }
	
	
	}

	

}
