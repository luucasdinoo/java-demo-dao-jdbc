package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

import java.sql.Connection;

public class DaoFactory {

    public static ISellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
