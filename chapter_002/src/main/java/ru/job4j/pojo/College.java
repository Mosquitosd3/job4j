package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Horbunkov Nikolay Aleksandrovich ");
        student.setGroup("job4j ");
        student.setDateOfReceipt("17.02.2020");
        System.out.println(student.getFullName() + student.getGroup() + student.getDateOfReceipt());
    }
}
