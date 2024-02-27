package com.ninja.builder;
import com.ninja.builder.Person.Builder;

public class Main {
	public static void main(String[] args) {
		Person koko = new Builder("Ko", "Ko")
				.age(30)
				.email("koko@gmail.com")
				.phone("+1234567")
				.address("Mars Planet")
				.build();
		
		Person susu = new Builder("Su", "Su")
				.age(28)
				.email("susu@gmail.com")
				.phone("+1234567")
				.address("Venus Planet")
				.build();
		
		System.out.println(koko);
		System.out.println(susu);
	}

}
