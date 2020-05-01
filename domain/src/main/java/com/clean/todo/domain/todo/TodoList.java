package com.clean.todo.domain.todo;

import java.util.List;
import java.util.Map;

import com.clean.todo.domain.common.PositiveOrZeroInt;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TodoList {
    // linked list?
    private final List<Todo> todoList;
    private final Map<Todo, PositiveOrZeroInt> todoIndexMap;

    public void splice(final Todo target, final PositiveOrZeroInt index) {
        if (todoIndexMap.containsKey(target) == false) {
            throw new IllegalArgumentException(String.format("cannot find todo: [%s]", target));
        }

        final PositiveOrZeroInt currentIndex = todoIndexMap.get(target);
        todoList.remove(currentIndex.intValue());
        todoList.add(index.intValue(), target);
    }

    public void addTodo(final Todo todo) {
        final PositiveOrZeroInt newIndex = new PositiveOrZeroInt(todoList.size());

        todoList.add(todo);
        todoIndexMap.put(todo, newIndex);
    }
}
