package com.personal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		//var + lambda
		//var veio no java 10
		var list = List.of(1, 2, 3, 4);
		list.forEach(
				(var e) -> System.out.println(e)
		);
		list.forEach(System.out::println);

		//New Client HTTP - Suporte Http2, WebSocket, Api não bloqueante
		var httpClient = HttpClient.newBuilder().build();
		var request = HttpRequest.newBuilder().uri(URI.create("https://dog.ceo/api/breeds/list/all")).GET().build();
//		var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.body());

		//toArray em Collection
		var list2 = List.of(1, 2, 3, 4);
		var array = list2.toArray(Integer[]::new);
		System.out.println(array.length);


		//Novos métodos em String isBlank, lines, repeat, strip, stripLeading, stripTrailing

		var stringWithSpaces = "      ";
		System.out.println("isEmpty?"+ stringWithSpaces.isEmpty());
		System.out.println("isBlank?"+ stringWithSpaces.isBlank());
		var stringLines = "linha1\nlinha2\nlinha3";
		stringLines.lines().forEach(System.out::println);

		var stringRepeat = "abc";
		System.out.println(stringRepeat.repeat(3));

		var stringStrip = "     Tem alguns espaços no começo e no fim!      ";
		System.out.println(stringStrip.trim());
		System.out.println(stringStrip.strip());
		System.out.println(stringStrip.stripLeading());//remove da frente
		System.out.println(stringStrip.stripTrailing());//remove de trás


		//Remoção dos módulos Java EE e CORBA

		//Unicode 10.0 - 16018 novos caracteres

		//Epsilon Garbage Collector
		//No-op GC


		//Java Flight Recorder (JFR) faz parte da OpenJDK


		// java <arquivo.java>

	}
}
