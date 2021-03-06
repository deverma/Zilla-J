package com.zuora.sdk.samples.test;

import org.junit.Test;

import com.zuora.sdk.lib.ZAPIResp;
import com.zuora.sdk.lib.ZClient;
import com.zuora.sdk.samples.ConnectionManager;
import com.zuora.sdk.samples.PaymentMethodManager;

public class PaymentMethodManagerTest {
   static final String SAMPLE_ACCOUNT_KEY = "A00001069";
   @Test
   public void test_payment_method(){
      // create a z_client
      ZClient zClient = new ZClient();

      // Create a payment method resource manager with a z_client
      PaymentMethodManager paymentMethodManager = new PaymentMethodManager(zClient);

      // Connect to the End Point using default tenant's credentials
      // and practice APIs
      ZAPIResp resp = null;
      if (new ConnectionManager().isConnected(zClient)) {
        resp = paymentMethodManager.getCreditCards(SAMPLE_ACCOUNT_KEY);
      }

      // follow nextPage if present
      while (resp != null) {
        String nextPageLink = (String)resp.get("nextPage");
        if (nextPageLink == null) {
          resp = null;
        } else {
          resp = paymentMethodManager.getCreditCards(SAMPLE_ACCOUNT_KEY, nextPageLink);
        }
      }

      String paymentMethodID = paymentMethodManager.createCreditCard(SAMPLE_ACCOUNT_KEY);
      if (paymentMethodID != null) {
        paymentMethodManager.updateCreditCard(paymentMethodID);
        paymentMethodManager.deleteCreditCard(paymentMethodID);
      }
   }
}
