package tsn.java.soap;

import java.io.Serializable;

// Указываем через Serializable что класс будет способен работать в web-технологии SOAP
// ДЛЯ КАЖДОГО ПОЛЯ НУЖНЫ СЕТТЕРЫ И ГЕТТЕРЫ, А ТАКЖЕ ОБЪЗАТЕЛЕН ПУСТОЙ КОНСТРУКТОР !
public class AnswerQE implements Serializable {
    private double y;


    public AnswerQE() {
    }

    public AnswerQE(double y) {
        this.y = y; 
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getY() {
        return y;
    }


    @Override
    public String toString() {
        return String.format("\nОтвет: Y = %.3f", y);
    }
}
