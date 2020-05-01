package com.clean.todo.usecase;

import com.clean.todo.domain.common.PositiveLong;
import com.clean.todo.domain.todo.Todo;
import com.clean.todo.usecase.port.TodoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class ToggleDone {
    private final TodoRepository todoRepository;

    public Todo toggleDoneById(final PositiveLong id) {
        Todo todo = todoRepository.findById(id);
        todo.toggleDone();
        return todoRepository.update(todo);
    }
}
