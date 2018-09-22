package ch18.ex6;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BackgroundTaskTest {

	@Test
	@DisplayName("invokeメソッドによりRunnableオブジェクトのrunメソッドが別スレッドで実行される")
	void runnableObjectIsExecutedInOtherThreadByInvoke() throws InterruptedException {
		var backgroundThreadName = new AtomicReference<String>();
		var latch = new CountDownLatch(1);
		
		var task = new BackgroundTask(() -> {
			backgroundThreadName.set(Thread.currentThread().getName());
			latch.countDown();
		});
		
		task.invoke();
		latch.await();
		
		assertThat(backgroundThreadName).isNotEqualTo(Thread.currentThread().getName());
	}

}
