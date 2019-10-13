package com.testing.selenium.testing.selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.stream.JsonReader;

public class JSON_Test01 {

	public static void main(String[] args) {
		
	
		try {
			
			JsonReader reader = new JsonReader(new FileReader("C:\\Users\\Casa\\Desktop\\testJSON.json"));
			
			reader.beginArray();
			while (reader.hasNext()) {

				reader.beginObject();
				while(reader.hasNext()) {
					
					String nombre = reader.nextName();
					if(nombre.equals("persona")) {
						System.out.println(reader.nextInt());
					}
					
				}
				
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}	

}
