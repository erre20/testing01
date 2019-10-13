package com.testing.selenium.testing.selenium;

public class Test_Mergeando_01 {

	public static void main(String[] args) {
		
		System.out.println("Hola ctm!!");
		
		System.out.println("Wena CTM");
		System.out.println("01");
		System.out.println("02");
		
		String a1 = "me pica el culo";
		if(a1.contentEquals("me pica el culo")) {
			System.out.println("uhhh???");
		}
		
		System.out.println("03");
		System.out.println("04");
		System.out.println("05");
		
		
		System.out.println("esto va a generar un conflicto!!!");
		
		
		System.out.println("Conflicto virtual 2");
		
		System.out.println("Conflicto virtual");
		
		//*****************************************************
		String nombre1 = "Cristian";
		
		if(nombre1.contentEquals("Cristian")) {
			System.out.println("Esto va a generar un conflictirijillo");
		}
		
		
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		for(int i=0; i<nombre1.length(); i++) {
			System.out.println(nombre1.charAt(i));
		}
		
		System.out.println("Clase 007: CONSTANTES y OPERADORES 1");
        System.out.println("Una constante es un espacio en memoria que su valor no cambia nunca.");
               
        int a = 6;
        int b;        
        b=44;
        
        int c = b + a;
        
        //c+=30;
        
        System.out.println("La suma de " + a + " + " + b + " = " + c);
        
        System.out.println("*********************************************");
        System.out.println("PARTE 2: CONSTANTES Y OPERADORES");
        
        //Declaración de una constante
        final int d = 5;
        
        //d+=8; Esto no se puede hacer, no es posible cambiar el valor de una constante
        //      Si lo descomentaramos, nos daria un error, y no se podria ejecutar este código
        
        System.out.println(d);
        
        System.out.println("Un programa que transforma de peso a dolar");
        
        final float dolar = 675;
        float pesoChileno = 3000;
        
        float resultado = pesoChileno / dolar;
        
        System.out.println("El dolar está a: $ " + dolar + " y quiero saber cuántos dolares son: " + pesoChileno + " CLP su valor es: $ "  + resultado);
        
        //El metodo .sqrt() de la clase Math requiere que le pasemos un valor de tipo double
        double raiz = Math.sqrt(dolar);
        //Otra forma que igual funcionaria seria asi: (esto se llama REFUNDICIÓN)
        int raiz2 = (int)Math.sqrt(dolar);
        
        System.out.println(raiz);
        System.out.println(raiz2);
        
        System.out.println("*******************************************************");
        System.out.println("VIDEO 010: Refundiciones (Parseo)");
        
        double numero1 = 5.75;
                
        //REFUNDICIÓN (PARSEO)
        int resultadoRedondeo = (int)Math.round(numero1);//Refundimos (parseamos) un dato, lo convertimos de tipo long a int
        
        System.out.println(resultadoRedondeo);
        
        //Metodo .pow
        double base = 105;
        double exponente = 5;
        
        int resultadoPotencia = (int)Math.pow(base, exponente);
        
        System.out.println(resultadoPotencia);
        
        System.out.println("*******************************************************");
        System.out.println("VIDEO 011: Clase String");
        
        //String no es un tipo de dato, es una clase, por lo tanto nombre es un objeto (o instancia) de la clase String
        //Entonces el objeto nombre tiene metodos, que son metodos de la clase String
        String nombre = "Cristian";
        
        //.length() es un método de la clase String que me permite obtener la cantidad de letras de una cadena de caracteres
        int cantidadLetras = nombre.length();//Como nombre es un objeto, puedo acceder al metodo .length() que devuelve un int
        
        System.out.println(nombre + " tiene " + cantidadLetras + " letras. La letra de la posición 5 de Cristian es: " + nombre.charAt(5));
	}
	
}
