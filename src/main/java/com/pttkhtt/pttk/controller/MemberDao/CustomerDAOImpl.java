package com.pttkhtt.pttk.controller.MemberDao;

import com.pttkhtt.pttk.controller.DAO;
import com.pttkhtt.pttk.entity.member.Customer;

public class CustomerDAOImpl extends DAO implements CustomerDAO {
    @Override
    public void editInformation(String id) {

    }

    @Override
    public void getAllNewMember() {

    }

    @Override
    public void getAllMember() {

    }

    @Override
    public void getAllVipMember() {

    }

    @Override
    public String getJoinDate() {
        return "";
    }

    @Override
    public String getLinkFB() {
        return "";
    }

    @Override
    public String getLinkPinterest() {
        return "";
    }

    @Override
    public String getLinkTweeter() {
        return "";
    }

    @Override
    public Customer getCustomerByID(String id) {
        Customer cus = new Customer();
        return cus;
    }

    @Override
    public void upToVIPMember(String id) {

    }

}
