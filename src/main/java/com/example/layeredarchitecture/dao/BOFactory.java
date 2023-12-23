package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.bo.custom.impl.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.ItemBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.PlaceOrderBOImpl;
import com.example.layeredarchitecture.bo.SupperBO;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    private static BOFactory getBaoFactory(){
        return (boFactory == null)? getBaoFactory(): boFactory;
    }
    public enum BAOTypes{
        CUSTOMER,ITEM,ORDER
    }

    public SupperBO getBO(BAOTypes baoTypes){
        switch (baoTypes){
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case ORDER:
                return new PlaceOrderBOImpl();
            default:
                return null;
        }
            
    }
}
