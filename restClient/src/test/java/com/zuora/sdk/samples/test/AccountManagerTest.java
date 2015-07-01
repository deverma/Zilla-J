package com.zuora.sdk.samples.test;

import org.junit.Test;

import com.zuora.sdk.lib.ZClient;
import com.zuora.sdk.samples.AccountManager;
import com.zuora.sdk.samples.ConnectionManager;

public class AccountManagerTest {
   static final String SAMPLE_ACCOUNT_KEY = "A00000222";
   
   @Test
   public void testAccountManager(){
      // Create a z_client
      ZClient zClient = new ZClient();

      // create an account resource manager
      AccountManager accountManager = new AccountManager(zClient);

      // Connect to the End Point using default tenant's credentials
      // and practice APIs
      if (new ConnectionManager().isConnected(zClient)) {
        accountManager.getSummary(SAMPLE_ACCOUNT_KEY);
        //accountManager.getDetails(SAMPLE_ACCOUNT_KEY);
        //String accountNumber = accountManager.create();
       /* if (accountNumber != null) {
          accountManager.update(accountNumber);
          accountManager.createWithSubscription();
        }*/
      }

   }
}
