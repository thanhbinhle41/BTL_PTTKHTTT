package com.pttkhtt.pttk.controller.OrderDao;

import java.util.Date;

public interface PaymentDAO {
    public Date getDatePay();

    public float getTotal();

    public void setDatePay(Date datePay);

    public void setTotal(float total);

    public void setType(int type);
}