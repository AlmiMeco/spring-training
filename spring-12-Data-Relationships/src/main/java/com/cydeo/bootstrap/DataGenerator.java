package com.cydeo.bootstrap;

import com.cydeo.entity.Payment;
import com.cydeo.entity.PaymentDetail;
import com.cydeo.enums.Status;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;

@Controller
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;


    public DataGenerator(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;

    }


    @Override
    public void run(String... args) throws Exception {


        Payment payment1 = new Payment(LocalDate.of(1994,4,6), new BigDecimal(3100), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal(2121), new BigDecimal(42441), LocalDate.of(2001,3,13) );
        Payment payment2 = new Payment(LocalDate.of(2001,6,19), new BigDecimal(24240), Status.SUCCESS);
        Payment payment3 = new Payment(LocalDate.of(2005,9,22), new BigDecimal(4242242), Status.FAILURE);

        payment1.setPaymentDetail(paymentDetail1);

//        paymentDetailRepository.save(paymentDetail1); <- this is made obsolete by CascadeType.XXXX in {Payment} class

        paymentRepository.save(payment1);
        paymentRepository.save(payment2);
        paymentRepository.save(payment3);

//                                                 {payment1}  ->   {paymentDetail1} -> {2001-03-13}
        System.out.println(paymentRepository.findById(1L).get().getPaymentDetail().getPayOutDate());




    }
}
