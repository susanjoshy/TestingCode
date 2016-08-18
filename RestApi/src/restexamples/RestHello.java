package restexamples;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class RestHello {
	public static void main(String[] args) {
		
	
	
	String url="http://localhost:8080/Users/susanjoshy/Documents/workspace/RestTest/WebContent/WEB-INF/hello.html";
	HttpClient client=new DefaultHttpClient();
	try{
	HttpGet request=new HttpGet(url);
	System.out.println("request is "+request);
	HttpResponse response=client.execute(request);
	System.out.println("sttaus line is "+response.getStatusLine());
	
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
		client.getConnectionManager().shutdown();
	}
}
}
