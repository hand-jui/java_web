package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;

public interface ICategoryRepo {

	ArrayList<CategoryDTO> select();

	int insert(String name); // rowCount

	int update(int id, String name); // rowCount

	int delete(int id); // rowCount

}
