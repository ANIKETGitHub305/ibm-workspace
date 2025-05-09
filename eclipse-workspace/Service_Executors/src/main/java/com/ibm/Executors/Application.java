package com.ibm.Executors;

import java.sql.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application
{
	public static void main( String[] args )
	{
		int vCPUs = Runtime.getRuntime().availableProcessors();
		System.out.println(vCPUs);
		ExecutorService service = Executors.newScheduledThreadPool(vCPUs);
		System.out.println(new Date(vCPUs));
		((ScheduledExecutorService) service).schedule(new Task(1),10,TimeUnit.SECONDS);
		ser
		
		
		
		
		
	}
	static class Task implements Runnable{
		int count;
		Task(int count){
			this.count = count;
			
		}
		@Override
		public void run() {
			System.out.println(Thread.currentThread()+ "---->"+ count);
		}
	}
}