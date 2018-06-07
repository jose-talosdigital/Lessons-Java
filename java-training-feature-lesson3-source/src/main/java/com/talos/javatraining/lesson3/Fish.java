package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.Animal;

import java.util.List;

import static java.util.Arrays.asList;


public interface Fish extends Animal
{

    default List<String> getCharacteristics()
    {
        return asList("They breathe using gills", "They have dominated the world's oceans, lakes and rivers");
    }

}