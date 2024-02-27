/**
 * 
 Builder Pattern က Creational Pattern တစ်ခု ဖြစ်ပါတယ်။ Builder ဆိုသည့် အတိုင်း object ကို ဆောက်သည့် နေရာမှာ အသုံးပြုပါတယ်။
 Builder Pattern က object ကို immutable လုပ်ချင်သည့် အခါမှာ အသုံးပြုပါတယ်။ ပုံမှန် အားဖြင့် object ကို immutable လုပ်ချင်သည့် အခါမှာ 
 Constructor မှာ pass လုပ်ပေးရပါတယ်။
 
 Builder Pattern က ရိုးရှင်းပြီး သုံးရတာ လွယ်ကူပါတယ်။ ပုံမှန် အားဖြင့် setter တွေ ထည့်သည့် အခါမှာ class က mutable ဖြစ်သွားပြီး 
 constructor ကနေ pass လုပ်ရင် code က ဖတ်ရတာ ခက်သွားပါတယ်။
 Builder pattern က တော့ ရိုးရှင်းလွယ်ကူ ပြီး ထပ်ဖြည့်သည့် အခါမှာလည်း လွယ်လင့် တကူ ဖြည့်နိုင်ပါတယ်။
 
 */

package com.ninja.builder;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String phone;
	private String address;

	// Private Constructor
	private Person(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.email = builder.email;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	@Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

	// Builder Class
	public static class Builder {
		private String firstName;
		private String lastName;
		private int age;
		private String email;
		private String phone;
		private String address;

		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Person build() {
			return new Person(this); // 'this' is a builder object
		}
	}
}
