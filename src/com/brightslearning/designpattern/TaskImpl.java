package com.brightslearning.designpattern;

public class TaskImpl implements Task {
    private String taskName;

    public TaskImpl(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return taskName;
    }
}
