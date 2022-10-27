package com.brightslearning.designpattern;

public class Runner {
    public static void main(String[] args) {
        TaskManager manager = new ListTaskManager();
        manager.addTask(new TaskImpl("Washing clothes"));
        manager.addTask(new TaskImpl("Clean kitchen"));
        manager.performTasks();
    }
}
