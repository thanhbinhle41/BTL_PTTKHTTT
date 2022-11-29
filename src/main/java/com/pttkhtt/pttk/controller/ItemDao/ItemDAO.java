package com.pttkhtt.pttk.controller.ItemDao;

import com.pttkhtt.pttk.entity.other.Catalog;
import com.pttkhtt.pttk.entity.other.Item;

import java.util.List;

public interface ItemDAO {
    public List<Item> getAllItem();

    public List<Item> getAllItemByType(int type);

    public Catalog getItemByCatalog();

    public List <Item> getItemByName(String name);

    public List <Item> getItemBySale(int saleNum);

    public void sortItemByPrice();

    public String getDescription();

    public String getName();

    public float getPrice();

    public float getSize();

    public void setAmount(int amount);

    public void setDescription (String description);

    public void setName (String name);

    public void setPrice(float price);

    public void setSize(float size);
}
