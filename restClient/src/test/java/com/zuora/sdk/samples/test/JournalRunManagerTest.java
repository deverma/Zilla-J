package com.zuora.sdk.samples.test;

import org.junit.Test;

import com.zuora.sdk.lib.ZClient;
import com.zuora.sdk.samples.ConnectionManager;
import com.zuora.sdk.samples.JournalRunManager;

public class JournalRunManagerTest {
	  static final String SAMPLE_JOURNAL_RUN_KEY = "JR-00000004";
	   
	   @Test
	   public void test_create_journal_run(){
	      ZClient zClient = new ZClient();

	      // create a journal run resource manager
	      JournalRunManager jrManager = new JournalRunManager(zClient);

	      // Connect to the End Point using default tenant's credentials
	      if (new ConnectionManager().isConnected(zClient)) {
	    	  jrManager.createJournalRun();
	      }
	   }
	   
	   
	   @Test
	   public void test_get_journal_run(){
	      ZClient zClient = new ZClient();

	      // create a journal run resource manager
	      JournalRunManager jrManager = new JournalRunManager(zClient);

	      // Connect to the End Point using default tenant's credentials
	      if (new ConnectionManager().isConnected(zClient)) {
	    	  jrManager.getJournalRun(SAMPLE_JOURNAL_RUN_KEY);
	      }
	   }
}
