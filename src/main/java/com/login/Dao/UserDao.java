package com.login.Dao;
import java.sql.SQLException;

import com.login.User.CodFisc;
import com.login.User.User;

public interface UserDao {
    public User getElettore(CodFisc codFisc) throws SQLException;
    public User getScrutinatore(CodFisc codFisc) throws SQLException;
    public void updateUser(User student);
    public void deleteUser(User student);
}
