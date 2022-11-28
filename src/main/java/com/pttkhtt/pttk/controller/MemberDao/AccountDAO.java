package com.pttkhtt.pttk.controller.MemberDao;

import com.pttkhtt.pttk.controller.DAO;
import com.pttkhtt.pttk.entity.member.Account;

public interface AccountDAO {
    public boolean checkLogin(Account account);
    public boolean resetPass(Account account);
}
