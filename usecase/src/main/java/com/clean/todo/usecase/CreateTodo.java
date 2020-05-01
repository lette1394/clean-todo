package com.clean.todo.usecase;

import com.clean.todo.domain.todo.Todo;
import com.clean.todo.usecase.port.IdGenerator;
import com.clean.todo.usecase.port.TodoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class CreateTodo {
    private final TodoRepository todoRepository;
    private final IdGenerator idGenerator;

    public Todo create(final String title, final String contents) {
        final Todo todo = new Todo(idGenerator.generate(), title, contents);

        return todoRepository.save(todo);
    }
}
