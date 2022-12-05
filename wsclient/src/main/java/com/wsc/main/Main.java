package com.wsc.main;

import com.wsclient.HelloWorld;
import com.wsclient.HelloWorldImplService;

public class Main {

	public static void main(String[] args) {
		
		HelloWorld servicio = new HelloWorldImplService().getHelloWorldImplPort();
		
		System.out.println("Suma: " + servicio.addnumber(3, 12));
		System.out.println("Resta: " + servicio.restnumber(3, 12));
		System.out.println("Producto: " + servicio.multiplynumber(3, 12));
		System.out.println("División: " + servicio.dividenumber(12, 3));
		System.out.println("Mensaje bienvenida: " + servicio.add("Pedro"));
		
	}

}
