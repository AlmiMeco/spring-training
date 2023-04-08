package com.cydeo.bootstrap;

import com.cydeo.entity.Merchant;
import com.cydeo.entity.Payment;
import com.cydeo.entity.PaymentDetail;
import com.cydeo.enums.Status;
import com.cydeo.repository.MerchantRepository;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;

@Controller
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;


    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Payment payment1 = new Payment(LocalDate.of(1994,4,6), new BigDecimal(3100), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal(2121), new BigDecimal(42441), LocalDate.of(2001,3,13) );

        payment1.setPaymentDetail(paymentDetail1);


        Payment payment2 = new Payment(LocalDate.of(2001,6,19), new BigDecimal(24240), Status.SUCCESS);


        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),5);
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------




//        paymentDetailRepository.save(paymentDetail1); <- this is made obsolete by CascadeType.XXXX in {Payment} class
        payment1.setMerchant(merchant1);
        merchantRepository.save(merchant1);

        paymentRepository.save(payment1);
        paymentRepository.save(payment2);

//                                                 {payment1}  ->   {paymentDetail1} -> {2001-03-13}
        System.out.println(paymentRepository.findById(1L).get().getPaymentDetail().getPayOutDate());






    }
}
