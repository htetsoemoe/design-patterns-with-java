package com.ninja.factory;

public class Client {
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("circle");
		circle.draw();
		
		Shape rectangle = ShapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Shape triangle = ShapeFactory.getShape("triangle");
		triangle.draw();
	}
}

/*
 * 
 Factory Pattern က Creational Pattern တစ်ခု ဖြစ်ပါတယ်။ Factory ဆိုသည့် အတိုင်း 
 စက်ရုံကနေ ပစ္စည်း ထုတ် သလို object တွေကို ဖန်တီးပေးသည့် pattern တစ်ခုပါ။

 Factory pattern မသုံးခင်မှာ Object တွေကို လက်ရှိ code တွေထဲကနေ ရောရေးပြီး ဖန်တီးပါတယ်။ 
 Factory pattern က single responsibility ဖြစ်ပြီး separation of concern အရ object ဖန်တီး မှု ကို ခွဲထုတ်ရေးသားလိုက်ခြင်း မျိုးပါပဲ။

Pros and Cons
	Tight coupling မဖြစ်အောင် ရှောင်ရှားနိုင်ပါတယ်။
	Single Responsibility နဲ့ Open/Closed Principle ကို လိုက်နာ ထားပါတယ်။
	မကောင်းတာကတော့ code တွေ complicated ဖြစ်နိုင်ပါတယ်။ မလိုအပ်ပဲ subclass တွေ များလာနိုင်ပါတယ်။

*/