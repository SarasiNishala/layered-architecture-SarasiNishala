package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SupperDAO;
import com.example.layeredarchitecture.model.CustomDTO;

public interface QueryDAO extends SupperDAO {
    void CustomerOrderDetails(CustomDTO customDTO);
}