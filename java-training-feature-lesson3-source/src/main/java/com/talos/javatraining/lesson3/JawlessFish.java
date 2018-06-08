package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.Fish;

import java.util.List;

import static java.util.Arrays.asList;

public interface JawlessFish extends Fish {

    default List<String> getCharacteristics()
    {
        List<String> characteristics = Fish.super.getCharacteristics();
        characteristics.add("They don't have jaw");
        return characteristics;
    }
}
