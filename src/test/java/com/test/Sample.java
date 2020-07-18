package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader read = new FileReader("C:\\Users\\Keep Smile\\eclipse-workspace\\cucumber_07_2020\\APITest_Maven\\src\\test\\resources\\Json\\sathya.json");
		
		JSONParser p = new JSONParser();
		Object o= p.parse(read);
		
		JSONObject j = (JSONObject) o;
		Object o2 = j.get("data");
		
		JSONArray a = (JSONArray) o2;
		Object obj = a.get(1);
		
		JSONObject f = (JSONObject) obj;
		
		System.out.println(f.get("first_name"));
		
		
		
		
		
		
		
	}
}
