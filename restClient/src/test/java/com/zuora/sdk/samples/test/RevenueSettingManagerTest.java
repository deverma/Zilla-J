package com.zuora.sdk.samples.test;

import org.junit.Test;

import com.zuora.sdk.lib.ZClient;
import com.zuora.sdk.samples.ConnectionManager;
import com.zuora.sdk.samples.RevenueSettingManager;

public class RevenueSettingManagerTest {

   @Test
   public void test_get_revenue_events(){
      // Create a z_client
      ZClient zClient = new ZClient();

      // create an revenue setting resource manager
      RevenueSettingManager settingManager = new RevenueSettingManager(zClient);

      if (new ConnectionManager().isConnected(zClient)) {
    	  settingManager.getRevenueAutomationDate();
      }
   }
}
