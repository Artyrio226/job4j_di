package ru.job4j.di;

public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
        this.store = store;
    }

    public String ask(String question) {
        return consoleInput.askStr(question);
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        store.getAll().forEach(System.out::println);
    }
}
