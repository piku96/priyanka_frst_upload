package com.packagee;

public class HelloWorld {
	private static int counter=0;
	HelloWorld(){
		counter++;
	}
   private String message;
private String name;
   public static int getCounter() {
	return counter;
}
public static void setCounter(int counter) {
	HelloWorld.counter = counter;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
	