package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {
    /*ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
    boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;
    void updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;
    boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
    void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;
    String generateID() throws SQLException, ClassNotFoundException ;

    CustomerDTO getCustomerDetail(String id) throws SQLException, ClassNotFoundException;

    CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;*/
}