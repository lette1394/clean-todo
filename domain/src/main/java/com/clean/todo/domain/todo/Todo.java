package com.clean.todo.domain.todo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode(of = "id")
@RequiredArgsConstructor
public class Todo {
    private final Long id;
    private final String title;
    private final String contents;
    private boolean done = false;

    public void toggleDone() {
        this.done = !this.done;

    }
}
