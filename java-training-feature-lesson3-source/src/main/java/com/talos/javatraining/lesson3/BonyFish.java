package com.talos.javatraining.lesson3;

import java.util.List;

import static java.util.Arrays.asList;

public interface BonyFish extends Fish {
    default List<String> getCharacteristics()
    {
        List<String> characteristics = Fish.super.getCharacteristics();
        characteristics.add("They have skeletons primarily composed of bone tissue");
        return characteristics;
    }
}
