package com.example;

import java.util.List;

// В класс Lion внесены изменения для разрыва зависимости от
// класса Feline был создан интерфейс IFelineAnimal

public class Lion {

    boolean hasMane;
    private IFelineAnimal felineAnimal;
    public Lion(String sex, IFelineAnimal felineAnimal) throws Exception {
        this.felineAnimal = felineAnimal;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    //Feline feline = new Feline();

    public int getKittens() {
        return felineAnimal.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineAnimal.eatMeat();
    }
}
