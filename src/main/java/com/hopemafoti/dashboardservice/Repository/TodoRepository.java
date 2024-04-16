package com.hopemafoti.dashboardservice.Repository;

import com.hopemafoti.dashboardservice.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,Integer> {
}
