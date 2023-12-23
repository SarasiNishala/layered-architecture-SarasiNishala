package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SupperBO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO extends SupperBO {
    ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
    boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
    boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    void deleteItem(String code) throws SQLException, ClassNotFoundException;

    String generateItemID() throws SQLException, ClassNotFoundException;

    ItemDTO getItemDetail(String code) throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;
}
