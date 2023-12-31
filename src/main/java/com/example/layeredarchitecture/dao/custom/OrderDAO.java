package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public interface OrderDAO extends CrudDAO <OrderDTO> {
    String generateNextId() throws SQLException, ClassNotFoundException;
    boolean getOrderDetail(String orderId) throws SQLException, ClassNotFoundException ;
    boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;
}