package com.testing.selenium.testing.selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Test_2 {

	public static void main(String[] args) {
		
		//Permite parsear un JSON de json a otro tipo
		JSONParser parser = new JSONParser();

		try {
			
			//Convertimos en objeto el archivo JSON, parseamos el JSON con el parse
			//se puede parsear a cualquier wea, pero ahora queremos parsearlo a un objeto simplemente
			Object objeto = parser.parse(new FileReader("C:\\Users\\Casa\\Desktop\\testJSON.json"));
			
			//Ahora, el objeto, lo parseamos a un Objeto de tipo JSON
			JSONObject jsonObject = (JSONObject)objeto;
			System.out.println(jsonObject);		
			
			StringWriter out = new StringWriter();

			
			//Y volvemos a parsear ahora a un String cada elemento
			/*String fruta = (String) jsonObject.get("colors");
			String tamanio = (String) jsonObject.get("size");
			String color = (String) jsonObject.get("color");
			
			//Imprimimos en pantalla
			System.out.println(fruta);
			System.out.println(tamanio);
			System.out.println(color);*/
			
			//Loop arreglos
			/*JSONArray arregloJson = (JSONArray) jsonObject.get("colors");
			Iterator<String> iterator = arregloJson.iterator();
			
			while(iterator.hasNext()) {
				
				System.out.println(iterator.next());
			
			}*/
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
