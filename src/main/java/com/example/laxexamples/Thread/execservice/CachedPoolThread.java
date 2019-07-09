package com.example.laxexamples.Thread.execservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedPoolThread {

	public static void main(String[] args) {
		System.out.println(" Main Thread started here");
		
		ExecutorService execService = Executors.newCachedThreadPool();
		
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
