package restexamples;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;


public class FaceBookPost {
	
	public static void main(String[] args) {
		HttpClient client=HttpClientBuilder.create().build();
		HttpResponse res=null;
		String accessToken = "EAACEdEose0cBAC5ZCe5dIuiAfsjruuSUZAhReMOFUV1nXZCCq063mp2addja8t90lHB7dhnPGlV3BXZBuxawMXJMCC0iAMpsZA3qXRFPWNNzFKYgKihFhN31Rk5ZBT74lyLZAStTgExLlN7ELfs36pBkz4oVSrutCStOOvvFBLsWAZDZD";
        String message = "Hello";

        String userId = "1189484381080048_1279168882111597";

        String requestURL = "https://graph.facebook.com/me/feed?message=Helloo&accessToken=EAACEdEose0cBAC5ZCe5dIuiAfsjruuSUZAhReMOFUV1nXZCCq063mp2addja8t90lHB7dhnPGlV3BXZBuxawMXJMCC0iAMpsZA3qXRFPWNNzFKYgKihFhN31Rk5ZBT74lyLZAStTgExLlN7ELfs36pBkz4oVSrutCStOOvvFBLsWAZDZD";

        HttpPost httpPost = new HttpPost( requestURL );
try {
	res=client.execute(httpPost);
	System.out.println("the status code is "+res.getStatusLine().getStatusCode());
	String response=IOUtils.toString(res.getEntity().getContent());
	System.out.println(response);
} catch (ClientProtocolException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

        /*List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
        nameValuePairs.add(new BasicNameValuePair("access_token", accessToken));
        nameValuePairs.add(new BasicNameValuePair("message", message));


        try {
			httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println();
*/
        /*// Create a response handler
        ResponseHandler<String> rh = new ResponseHandler<String>() {

            public String handleResponse(HttpResponse hr) throws ClientProtocolException, IOException {
                return "\n" + hr.getStatusLine() + "\n\n";
                   // + (hr.getEntity().getContent());
            }}
*/
			

        
	}
}
