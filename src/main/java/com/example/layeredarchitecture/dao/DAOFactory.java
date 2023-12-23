package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.impl.OrderDetailDAOImpl;
import com.example.layeredarchitecture.dao.impl.QueryDAOImpl;

import java.io.CharArrayReader;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){}
    public static DAOFactory getDaoFactory() {
        return (daoFactory == null)?daoFactory= new DAOFactory(): daoFactory;
    }

    public enum DAOTypes{
        CUSTOMER,ITEM,ORDER,ORDER_DETAIL,QUERY
    }

    public SupperDAO getDAO (DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
               return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDER:
                return new OrderDetailDAOImpl();
            case ORDER_DETAIL:
                return new OrderDetailDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            default:
                return null;
        }
    }

}
