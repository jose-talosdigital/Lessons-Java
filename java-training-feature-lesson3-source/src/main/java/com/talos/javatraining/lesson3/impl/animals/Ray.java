package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.CartilaginousFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ray extends AbstractAnimal implements CartilaginousFish
{

	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = new ArrayList<>(getCartilaginousFishCharacteristics());
		characteristics.addAll(CartilaginousFish.super.getCharacteristics());
		characteristics.addAll(Arrays.asList("They are flattened", "They have five gill openings"));
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
