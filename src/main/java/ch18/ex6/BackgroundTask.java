package ch18.ex6;

import java.util.concurrent.Executors;

public class BackgroundTask {
	private Runnable task;
	
	public BackgroundTask(Runnable task) {
		this.task = task;
	}
	
	public void invoke() {
		Executors.newSingleThreadExecutor().submit(task);
	}
}
