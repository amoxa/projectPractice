package com.fc.service.impl;

import com.fc.entity.Checkout;
import com.fc.mapper.CheckOutMapper;
import com.fc.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    CheckOutMapper checkOutMapper;

    public List<Checkout> getAllCheckOut(){
        return checkOutMapper.getAllCheckOut();
    }
}
