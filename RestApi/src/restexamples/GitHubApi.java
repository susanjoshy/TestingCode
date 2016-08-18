package restexamples;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
;

public class GitHubApi {
	public static void main(String[] args) {
		String url="https://api.github.com/users/whiteboxhub";
		Header[] headers=null;
		//HttpClient client=new DefaultHttpClient();
		HttpClient httpClient =HttpClientBuilder.create().build();
		
		HttpGet request=new HttpGet(url);
		try {
			HttpResponse response=httpClient.execute(request);
			
			System.out.println("Reponse status code"+response.getStatusLine());
			
			System.out.println("printing reponse headers ");
			headers=response.getAllHeaders();
			for(Header header:headers){
				System.out.println("key:"+header.getName()+"  "+header.getValue());
				
			}
			 System.out.println("\nGet Response Header By Key ...\n");
	            String server = response.getFirstHeader("Server").getValue();

	            if (server == null) {
	                System.out.println("Key 'Server' is not found!");
	            } else {
	                System.out.println("Server - " + server);
	            }

	            System.out.println("\n Done");

			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
