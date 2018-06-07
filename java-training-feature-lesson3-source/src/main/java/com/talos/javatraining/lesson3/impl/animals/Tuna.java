package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.BonyFish;
import com.talos.javatraining.lesson3.Fish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.List;


public class Tuna extends AbstractAnimal implements BonyFish
{

	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = new ArrayList<>(getBonyFishCharacteristics());
		characteristics.addAll(BonyFish.super.getCharacteristics());
		characteristics.add("Excellent swimmers");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
