package lesson232.services;

import lesson232.NotEnoughMoneyException;
import lesson232.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }

}
