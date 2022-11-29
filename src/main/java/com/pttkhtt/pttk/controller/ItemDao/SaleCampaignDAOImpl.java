package com.pttkhtt.pttk.controller.ItemDao;

import com.pttkhtt.pttk.controller.DAO;

import java.util.Date;

public class SaleCampaignDAOImpl extends DAO implements SaleCampaignDAO {
    public SaleCampaignDAOImpl() {
        super();
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public float getDiscount() {
        return 0;
    }

    @Override
    public Date getEndDate() {
        return null;
    }

    @Override
    public String getNameSaleCampaign() {
        return null;
    }

    @Override
    public Date getStartDate() {
        return null;
    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public void setDiscount(float discount) {

    }

    @Override
    public void setEndDate(Date endDate) {

    }

    @Override
    public void setStartDate(Date startDate) {

    }
}
