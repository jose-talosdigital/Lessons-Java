package com.talos.javatraining.lesson3;

import java.util.List;

import static java.util.Arrays.asList;

public interface BonyFish extends Fish {
    default List<String> getBonyFishCharacteristics()
    {
        return asList("They have skeletons primarily composed of bone tissue");
    }
}
