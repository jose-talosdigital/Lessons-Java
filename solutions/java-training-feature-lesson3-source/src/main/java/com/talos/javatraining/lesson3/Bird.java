package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.Animal;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

import static java.util.Arrays.asList;


public interface Bird extends Animal
{
    default List<String> getCharacteristics()
    {
        return asList("Coat of feathers", "Warm-blooded metabolisms");
    }


}