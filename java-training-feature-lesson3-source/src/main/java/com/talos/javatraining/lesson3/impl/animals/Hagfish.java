package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Fish;
import com.talos.javatraining.lesson3.JawlessFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.List;


public class Hagfish extends AbstractAnimal implements JawlessFish
{

	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = new ArrayList<>(getJawlessFishCharacteristics());
		characteristics.addAll(JawlessFish.super.getCharacteristics());
		characteristics.add("They are living fossils");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
