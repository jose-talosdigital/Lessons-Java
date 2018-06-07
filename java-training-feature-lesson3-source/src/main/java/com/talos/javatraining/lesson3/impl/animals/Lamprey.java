package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.JawlessFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lamprey extends AbstractAnimal implements JawlessFish
{

	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = new ArrayList<>(getJawlessFishCharacteristics());
		characteristics.addAll(JawlessFish.super.getCharacteristics());
		characteristics.addAll(Arrays.asList("They have a sucker mouth with horny teeth and a rasping tongue"));
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
