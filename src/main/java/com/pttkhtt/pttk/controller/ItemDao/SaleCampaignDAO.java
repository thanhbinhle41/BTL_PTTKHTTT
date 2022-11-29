package com.pttkhtt.pttk.controller.ItemDao;

import java.util.Date;

public interface SaleCampaignDAO {
    public String getDescription();

    public float getDiscount();

    public Date getEndDate();

    public String getNameSaleCampaign();

    public Date getStartDate();

    public void setDescription(String description);

    public void setDiscount(float discount);

    public void setEndDate(Date endDate);

    public void setStartDate (Date startDate);


}
