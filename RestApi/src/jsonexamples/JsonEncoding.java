package jsonexamples;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;


public class JsonEncoding {
public static void main (String[] args){
	
	JSONObject object=new JSONObject();
	object.put("name", "susan");
	object.put("numb",1000);
	object.put("balance",1000.21);
	object.put("is_vip",true);
	System.out.println("the object is "+object);
	
	StringWriter out=new StringWriter();
	try {
		object.writeJSONString(out);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(out);
	
	
	
}
	
}
