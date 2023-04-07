package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "paymentDetails")
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal merchantPayoutAmt, commissionAmt;

    private LocalDate payOutDate;

    public PaymentDetail(BigDecimal merchantPayoutAmt, BigDecimal commissionAmt, LocalDate payOutDate) {
        this.merchantPayoutAmt = merchantPayoutAmt;
        this.commissionAmt = commissionAmt;
        this.payOutDate = payOutDate;
    }
}
