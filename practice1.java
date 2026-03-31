package java_lab;

public class Animal {
	static class Animals {
	    void sound() {
	        System.out.println("Animal makes sound");
	    }
	}
	static class Dog extends Animals {
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}
	static class Cat extends Animals {
	    void sound() {
	        System.out.println("Cat meows");
	    }
	}
	
	    public static void main(String[] args) {
	    	System.out.println("SAMEER ACHARA(24EARCS145)");
	        Animals a;  
	        a = new Dog();
	        a.sound();  
	        a = new Cat();
	        a.sound();  
	    }
	}


