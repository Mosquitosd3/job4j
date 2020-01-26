package ru.job4j.condition;

public class DummyBot {

    public static String answer(String qestion){
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(qestion)){
            rsl = "Привет, умник.";
        }else  if ("Пока.".equals(qestion)){
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
