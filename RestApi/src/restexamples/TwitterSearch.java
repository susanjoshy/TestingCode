package restexamples;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
;

public class TwitterSearch {
	public static void main(String[] args) {
		
		HttpClient httpClient =HttpClientBuilder.create().build();
		Header[] headers=null;
		
		try{
			HttpGet httpGetRequest=new HttpGet("https://api.twitter.com/1.1/search/tweets.json?q=%40twitterapi");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}

