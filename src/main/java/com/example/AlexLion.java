package com.example;
import java.util.List;

public class AlexLion extends Lion {

    int NumberOfKittens = 0;
    List<String> friendsOfAlex = List.of("Марти","Глория", "Мелман");
    String placeOfLiving = "New York Zoo";

    public AlexLion(IFelineAnimal feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return NumberOfKittens;
    }
    public List<String> getFriends(){
        return friendsOfAlex;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }
}
