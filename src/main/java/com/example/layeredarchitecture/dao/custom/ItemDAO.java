package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {
   /* public boolean saveitem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    public void delete(String code) throws SQLException, ClassNotFoundException;
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;
    public String generateID() throws SQLException, ClassNotFoundException;

    ItemDTO getItemDetail(String code) throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;*/
}