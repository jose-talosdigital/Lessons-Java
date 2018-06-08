package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.Animal;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public interface Fish extends Animal
{

    default List<String> getCharacteristics()
    {
        List<String> characterisitics = new ArrayList<>();
        characterisitics.add("They have dominated the world's oceans, lakes and rivers");
        characterisitics.add("They breathe using gills");
        return characterisitics;
    }

}