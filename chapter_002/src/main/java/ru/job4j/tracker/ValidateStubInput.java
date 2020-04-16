package ru.job4j.tracker;

public class ValidateStubInput extends ValidateInput {
    private String[] date;
    private int position;

    public ValidateStubInput(String[] data) {
        this.date = data;
    }

    @Override
    public String askStr(String question) {
        return date[position++];
    }
}
