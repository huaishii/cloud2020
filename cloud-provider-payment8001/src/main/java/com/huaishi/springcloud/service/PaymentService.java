package com.huaishi.springcloud.service;

import com.huaishi.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by huaishi on 2020/3/30
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

