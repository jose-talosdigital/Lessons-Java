package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.Animal;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

import static java.util.Arrays.asList;


public interface Mammal extends Animal {

    default List<String> getCharacteristics() {
        return asList("They have hair or fur", "They suckle milk when they are young");
    }

}