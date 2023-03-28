package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoRepo {

	ArrayList<TodoDTO> select();

	int insert(TodoDTO dto);

	int update(TodoDTO dto);

	int delete(int id);

}
