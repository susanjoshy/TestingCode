package jsonexamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.JsonException;

public class JsonParser {
	static String filePath="/Users/susanjoshy/Documents/workspace/RestApi/src/jsonexamples/jsonParserfile.json";
	//@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser=new JSONParser();
		File f=new File(filePath);
		try {
			FileReader fReader=new FileReader(f);
			Object obj=parser.parse(fReader);
			
			JSONObject jsonObject =(JSONObject)obj;
			//System.out.println(jsonObject);
			
			JSONArray jArray=(JSONArray)jsonObject.get("CompanyList");
			
			
			//System.out.println(jArray);
			Map<String,String> jsonMap=(Map<String,String>)obj;
			
			
			/*System.out.println(jsonObject.containsKey("Name"));
			System.out.println(jsonObject.containsValue("JsonParsing"));
			System.out.println("KEYset contains CompanyList  :"+jsonObject.keySet().contains("CompanyList"));
			*/
			/*String name=(String)jsonObject.get("Name");
			String author=(String)jsonObject.get("Author");
			System.out.println("name is   :"+name);
			System.out.println("Author is   :"+author);
			System.out.println("companylist are  :");
			
			
			
			Iterator<String> it=jArray.iterator();
			System.out.println("JsonArray printed using iterator  :");
			while(it.hasNext()){
				System.out.println(it.next());
			}*/
			
			/*System.out.println("Total number of json objects are :"+jsonObject.size());
			
			System.out.println("toal number of objects in  Json array :"+jArray.size());*/
		//	System.out.println(jsonObject.keySet());
			
		Object json;
			try{
				json=jsonObject.get("Author");
				
				/*System.out.println("Author is :"+json);
				if(json!=null && json instanceof JSONObject)
				*/
				if(json instanceof JSONObject)
					System.out.println("It is a json object");
				
				else
					System.out.println("not a json object");
			
			json=jsonObject.get("CompanyList");
			if(json!=null && json instanceof JSONArray)
				System.out.println(json+"is json array object ");
			else
				System.out.println("not jsonarray object");
			}catch(JsonException e){
				e.printStackTrace();
			}
			
		
			
			/*Set<String> jsonKeys=jsonMap.keySet();
			for(Object o:jsonKeys){
				
				System.out.println(o);
				
			}

			Collection<String> values=jsonMap.values();
			System.out.println("the json values are :");
			for(Object  val:values){
				System.out.println(val);
			}
			
			System.out.println("printing  json objects using   for loop");
			
			for(Map.Entry<String,String>  entry:jsonMap.entrySet()){
				
				System.out.println(entry.getKey());
				//System.out.println(entry.getValue());
				
			}
			*/

			
			System.out.println("Print using Iterator ");
			
			Iterator<Map.Entry<String, String>> itr=jsonMap.entrySet().iterator();
			while(itr.hasNext()){
				Map.Entry <String,String>thisEntry = (Map.Entry<String,String>) itr.next();
				  Object key = thisEntry.getKey();
				  Object value = thisEntry.getValue();
				
				  System.out.println(key +":"+value);
				  if(key.equals("Author")){
						System.out.println("json key "+key+" avaialable");
						System.out.println("and the corresponding json value is "+value);
						
					}
				//System.out.println( (Map.Entry)itr.next().getKey()+(Map.Entry)itr.next().getValue() );
			}
			
			System.out.println("The Jsonarray contains company google : "+jArray.contains("google"));
			System.out.println("Is jsonarray empty?:"+jArray.isEmpty());
			System.out.println("printing  Json Array by  get(index)");
			if(!jArray.isEmpty()){
			for(int i=0;i<jArray.size();i++){
			System.out.println(jArray.get(i));
			}
			
			
			Object job=jsonObject.get("CompanyList");
			jArray=(JSONArray)job;
			System.out.println("Json array size is "+jArray.size());
			if(job==null || !(job instanceof JSONArray))
				System.out.println("passed value is not json array");
			else
				System.out.println("it is json array");
			jArray=(JSONArray)job;
			String value=(String)jArray.get(0);
			System.out.println(value );
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
