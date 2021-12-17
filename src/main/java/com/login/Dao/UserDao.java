package com.login.Dao;
import java.sql.SQLException;

import com.login.User.CodFisc;
import com.login.User.Elettore;
import com.login.User.Scrutinatore;
import com.login.User.User;

public interface UserDao {
    public Elettore getElettore(CodFisc codFisc) throws SQLException;
    public Scrutinatore getScrutinatore(CodFisc codFisc) throws SQLException;
    public void updateUser(User student);
    public void deleteUser(User student);
}
