package com.talos.javatraining.lesson3;

import java.util.List;

import static java.util.Arrays.asList;

public interface CartilaginousFish extends Fish {

    default List<String> getCartilaginousFishCharacteristics()
    {
        return asList("They have skeleton made of cartilage rather than bone");
    }
}
