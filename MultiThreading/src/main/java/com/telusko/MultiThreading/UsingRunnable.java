package com.telusko.MultiThreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class C implements Runnable{
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

class D implements Runnable{
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
public class UsingRunnable {

	public static void main(String[] args) {
		SpringApplication.run(MultiThreadingApplication.class, args);
		
		Runnable obj1 = new C();
		Runnable obj2 = new D();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}

}
