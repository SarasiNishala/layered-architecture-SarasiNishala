package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SupperBO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SupperBO {
    boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
    boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
    String generateCustomerID() throws SQLException, ClassNotFoundException;
    void deleteCustomer(String id) throws SQLException, ClassNotFoundException;
}
