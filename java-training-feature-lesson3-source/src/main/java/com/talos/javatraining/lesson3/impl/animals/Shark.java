package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.CartilaginousFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.List;


public class Shark extends AbstractAnimal implements CartilaginousFish
{

	public List<String> getParentCharacteristics() {
		List<String> characteristics = new ArrayList<>(getCartilaginousFishCharacteristics());
		characteristics.addAll(CartilaginousFish.super.getCharacteristics());
		characteristics.add("Highly developed senses");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
