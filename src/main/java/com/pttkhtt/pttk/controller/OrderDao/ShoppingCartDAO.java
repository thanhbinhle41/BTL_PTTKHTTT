package com.pttkhtt.pttk.controller.OrderDao;

import com.pttkhtt.pttk.entity.other.Item;

import java.util.List;

public interface ShoppingCartDAO {
    public List<Item> getAllItemInCard(int id);
}
