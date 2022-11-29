package com.pttkhtt.pttk.controller.ItemDao;

import com.pttkhtt.pttk.entity.other.Item;

import java.util.List;

public interface CatalogDAO {
    public String getDescription();

    public String getName();

    public List<Item> getItemList();

    public void setDescription(String description);

    public void setName(String name);
}
