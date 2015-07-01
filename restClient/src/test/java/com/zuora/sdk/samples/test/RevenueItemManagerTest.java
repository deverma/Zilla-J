package com.zuora.sdk.samples.test;

import org.junit.Test;

import com.zuora.sdk.lib.ZClient;
import com.zuora.sdk.samples.ConnectionManager;
import com.zuora.sdk.samples.RevenueItemManager;

public class RevenueItemManagerTest {
   static final String SAMPLE_CHARGE_REVENUE_SUMMARY_KEY = "CRS-00000001";
   static final String SAMPLE_REVENUE_SCHEDULE_KEY = "RS-00000001";
   static final String SAMPLE_REVENUE_EVENT_KEY = "RE-00000001";
   
   @Test
   public void test_revenue_item_manager(){
      // Create a z_client
      ZClient zClient = new ZClient();

      // create an revenue item resource manager
      RevenueItemManager riManager = new RevenueItemManager(zClient);

      // Connect to the End Point using default tenant's credentials
      if (new ConnectionManager().isConnected(zClient)) {
         riManager.getItemsByChargeRevenueSummary(SAMPLE_CHARGE_REVENUE_SUMMARY_KEY);
         riManager.getItemsByRevenueSchedule(SAMPLE_REVENUE_SCHEDULE_KEY);
         riManager.getItemsByRevenueEvent(SAMPLE_REVENUE_EVENT_KEY);
      }

   }
}
