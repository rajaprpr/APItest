package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader f = new FileReader(
				"C:\\Users\\Keep Smile\\eclipse-workspace\\cucumber_07_2020\\APITest_Maven\\src\\test\\resources\\Json\\config.json");
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(f);
		
		JSONObject j = (JSONObject) obj;
		Object o = j.get("ad");
		
		JSONObject j2 = (JSONObject) o;
			
		System.out.println(j2.get("url"));
	}

}
