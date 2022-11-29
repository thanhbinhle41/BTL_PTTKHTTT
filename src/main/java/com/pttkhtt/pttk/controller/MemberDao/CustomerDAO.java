package com.pttkhtt.pttk.controller.MemberDao;

import com.pttkhtt.pttk.entity.member.Customer;

public interface CustomerDAO {
    public void editInformation(String id);

    public void getAllMember();

    public void getAllNewMember();

    public void getAllVipMember();

    public String getJoinDate();

    public String getLinkFB();

    public String getLinkPinterest();

    public String getLinkTweeter();

    public Customer getCustomerByID(String id);

    public void upToVIPMember(String id);
}
