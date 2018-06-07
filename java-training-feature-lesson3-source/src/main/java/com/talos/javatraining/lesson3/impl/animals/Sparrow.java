package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Bird;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Sparrow extends AbstractAnimal implements Bird
{

	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = new ArrayList<>(Bird.super.getCharacteristics());
		characteristics.addAll(Arrays.asList("They fly", "They sing"));
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
