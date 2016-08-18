//Rest Api to access the yahho weather serice for a given zipcode


package restexamples;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class RestYahooWeather {

	public static void main(String[] args) {
		//initialize the default Http  client
		
		DefaultHttpClient httpclient= new DefaultHttpClient();
		try{
		//specify host,protocol,and port
		HttpHost target=new HttpHost("weather.yahooapis.com",80,"http");
		//specify the http request
		HttpGet request=new HttpGet("/forecastrss?p=95129&u=f");
		System.out.println("executing request to yahoo weather"+target);
		//specify the response
		HttpResponse response=httpclient.execute(target, request);
		HttpEntity entity =response.getEntity();
		System.out.println("status line"+response.getStatusLine());
		Header[] headers=response.getAllHeaders();
		for(int i=0;i<headers.length;i++){
			System.out.println(headers[i]);
		}
		System.out.println("\nchecking the media /contenttype/pay load::::::");
		String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
		System.out.println("media type is "+mimeType);
		if(entity!=null){
			System.out.println("\nEntity is "+EntityUtils.toString(entity));
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			httpclient.getConnectionManager().shutdown();
		}
		
	}
}
