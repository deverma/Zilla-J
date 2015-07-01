package com.zuora.sdk.samples.test;

import org.junit.Test;

import com.zuora.sdk.lib.ZClient;
import com.zuora.sdk.samples.ConnectionManager;
import com.zuora.sdk.samples.OperationManager;

public class OperationManagerTest {
   static final String SAMPLE_ACCOUNT_KEY = "A00001069";
   @Test
   public void test_operation(){
      // Create a z_client
      ZClient zClient = new ZClient();

      // Create a z_client object and pass it to APIRepo
      OperationManager operationManager = new OperationManager(zClient);

      // Connect to the End Point using default tenant's credentials
      // and practice APIs
      if (new ConnectionManager().isConnected(zClient)) {
        operationManager.createBillRun(SAMPLE_ACCOUNT_KEY);
      }
   }
}
