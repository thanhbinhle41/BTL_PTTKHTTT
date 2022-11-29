package com.pttkhtt.pttk.controller.ItemDao;

import com.pttkhtt.pttk.controller.DAO;
import com.pttkhtt.pttk.entity.other.Catalog;
import com.pttkhtt.pttk.entity.other.Item;

import java.util.List;

public class ItemDAOImpl  extends DAO implements ItemDAO {
    public ItemDAOImpl() {
        super();
    }

    @Override
    public List<Item> getAllItem() {
        return null;
    }

    @Override
    public List<Item> getAllItemByType(int type) {
        return null;
    }

    @Override
    public Catalog getItemByCatalog() {
        return null;
    }

    @Override
    public List<Item> getItemByName(String name) {
        return null;
    }

    @Override
    public List<Item> getItemBySale(int saleNum) {
        return null;
    }

    @Override
    public void sortItemByPrice() {

    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public float getSize() {
        return 0;
    }

    @Override
    public void setAmount(int amount) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public void setSize(float size) {

    }
}
