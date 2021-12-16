package com.login.Dao;
import java.sql.*;

import com.login.User.CodFisc;
import com.login.User.Elettore;
import com.login.User.Scrutinatore;
import com.login.User.User;

public class UserDaoImpl implements UserDao{

    private Connection myConnection;
    
    public UserDaoImpl() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/voto";
        String root = "root";
        String pass = "root";
        myConnection = DriverManager.getConnection(url, root, pass);
    }

    @Override
    public User getElettore(CodFisc codFisc) throws SQLException {
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultSet = myStatement.executeQuery("Select * from Elettore where codFiscale= '" + codFisc.getCodFisc() + "';");
        myResultSet.next();
        return new Elettore(myResultSet.getString("nome"), myResultSet.getString("cognome"), new CodFisc(myResultSet.getString("codFiscale")), myResultSet.getDate("data"),myResultSet.getString("sex").charAt(0), myResultSet.getString("password"), myResultSet.getBoolean("votato"));
        
    }

    @Override
    public User getScrutinatore(CodFisc codFisc) throws SQLException {
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultSet = myStatement.executeQuery("Select * from Scrutinatore where codFiscale= '" + codFisc.getCodFisc() + "';");
        myResultSet.next();
        return new Scrutinatore(myResultSet.getString("nome"), myResultSet.getString("cognome"), new CodFisc(myResultSet.getString("codFiscale")), myResultSet.getDate("data"), myResultSet.getString("sex").charAt(0), myResultSet.getString("password"));
    }

    @Override
    public void updateUser(User user) {
        
    }

    @Override
    public void deleteUser(User user) {
    
    }


    
}
