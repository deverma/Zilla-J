package com.zuora.sdk.samples.test;

import org.junit.Test;

import com.zuora.sdk.samples.MultithreadedExecution;

public class MultithreadedExecutionTest {
   @Test
   public void test_multithreaded_execution(){
      Thread[] threads = new Thread[10];

      for (int i = 0; i < 5; i++) {
        threads[i] = new Thread(new MultithreadedExecution());
        System.out.println("thread =" + threads[i]);
      }

      // start the threads
      for (int i = 0; i < 5; i++) {
        System.out.println("thread =" + threads[i]);
        threads[i].start();
      }

      // join the threads
      for (int i = 0; i < 5; i++) {
        try {
          threads[i].join();
        } catch (Exception e) {}
      }
   }
}
