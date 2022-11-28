package com.pttkhtt.pttk.controller.OrderDao;

import com.pttkhtt.pttk.controller.DAO;
import com.pttkhtt.pttk.entity.other.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDAOImpl extends DAO implements ShoppingCartDAO{

    @Override
    public List<Item> getAllItemInCard(int id) {
        Item item;
        List<Item> result = new ArrayList<>();
        String sql = "SELECT * FROM shoppingcart WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                item = new Item();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                item.setAmount(rs.getInt("amount"));
                item.setPhoto(rs.getString("photo"));
                item.setSize(rs.getFloat("size"));
                item.setDescription(rs.getString("description"));
                item.setPrice(rs.getFloat("price"));

                result.add(item);
            }
            return result;
        } catch (SQLException e) {
            return null;
        }

    }
}
