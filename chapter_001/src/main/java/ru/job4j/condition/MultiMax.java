package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third){
        if(second > first && second > third){
            return second;
        }else if(third > first){
            return third;
        }else return first;
    }
}
