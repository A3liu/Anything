package com.a3.Lamdba;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) throws Exception {
		HelloUtil.sayHello("ÁõÒ«É­", HelloUtil.chinese);
		System.out.println();
		System.out.println();
		System.out.println();
//		HelloUtil.sayHello2("ÁõÒ«É­", HelloUtil.chinese);
//		HelloUtil.sayHello("liuyaosen", HelloUtil.english);
		
		
		ExceptionUtil.checkCondition("can not handler unsupported ClickType", 1, c->c==2);
	}
}



class HelloUtil{
	
	public static Consumer<String> chinese=n->System.out.println("ÄãºÃ°¡!"+n);
	
	public static Consumer<String> english=n->System.out.println("hello "+n);
	
	public static void sayHello(String name,Consumer<String> language) {
		language.accept(name);
	}
	
	public static void sayHello2(String name,Consumer<String> language) {
		language.andThen(language);
	}
}


class ExceptionUtil{
	
	public static void tryCatch(String message,Consumer statement) {
		try {
			statement.accept(null);
		}catch(Exception e) {
			//xxxx
		}
	}
	
	public static <T> void checkCondition(String message,T t, Predicate<T> predicate) throws Exception {
		if(!predicate.test(t)) {
			throw new Exception(message);
		}
	}
}