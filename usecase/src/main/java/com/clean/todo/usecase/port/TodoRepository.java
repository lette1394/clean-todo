package com.clean.todo.usecase.port;

import com.clean.todo.domain.common.PositiveLong;
import com.clean.todo.domain.todo.Todo;

public interface TodoRepository {

    Todo save(Todo todo);

    Todo findById(PositiveLong id);

    Todo update(Todo todo);
}
