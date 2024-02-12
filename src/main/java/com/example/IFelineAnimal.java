package com.example;

import java.util.List;

public interface IFelineAnimal {
    public int getKittens();

    public int getKittens(int kittensCount);

    List<String> eatMeat() throws Exception;

}
