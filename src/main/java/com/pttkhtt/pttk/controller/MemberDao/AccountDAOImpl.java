package com.pttkhtt.pttk.controller.MemberDao;

import com.pttkhtt.pttk.controller.DAO;
import com.pttkhtt.pttk.entity.member.Account;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDAOImpl extends DAO implements AccountDAO{
    @Override
    public boolean checkLogin(Account account) {
        return false;
    }

    @Override
    public boolean resetPass(Account account) {
        return false;
    }
}
