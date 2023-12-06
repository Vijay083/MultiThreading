package com.telusko.MultiThreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class A extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hello Bhaskar Reddy");
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
@SpringBootApplication
public class MultiThreadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiThreadingApplication.class, args);
		
		A obj1 = new A();
		obj1.start();
		B obj2 = new B();
		obj2.start();
	}

}
