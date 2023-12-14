package com.telusko.MultiThreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}
@SpringBootApplication
public class Synchronized {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(MultiThreadingApplication.class, args);
		Counter c = new Counter();
		Runnable obj1 = () ->{
			for(int i=0;i<1000;i++) {

				c.increment();
			}
		};
		Runnable  obj2 = () ->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
