package com.example.laxexamples.Thread.execservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	public static void main(String[] arsg) {
		System.out.println(" Main Thread started here");
		
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		
		execService.shutdown();
		
		System.out.println(" Main Thread ends here");
	}
}
