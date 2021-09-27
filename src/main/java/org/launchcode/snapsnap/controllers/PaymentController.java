package org.launchcode.snapsnap.controllers;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.launchcode.snapsnap.models.DTO.CreatePayment;
import org.launchcode.snapsnap.models.DTO.CreatePaymentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/create-payment-intent")
    public CreatePaymentResponse createPaymentIntent(@RequestBody CreatePayment createPayment) throws StripeException {
        PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
                .setCurrency("usd")
                .setAmount(15 * 100L) // hardcoding the price means we're not currently using the create payment object being sent in
                .build();
//        create a PaymentIntent with the order amount and currency
        PaymentIntent intent = PaymentIntent.create(createParams);
        return new CreatePaymentResponse(intent.getClientSecret());
    }
}
