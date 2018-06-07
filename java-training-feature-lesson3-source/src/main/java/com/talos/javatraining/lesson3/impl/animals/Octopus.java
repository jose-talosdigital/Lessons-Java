package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.AnimalSupport;
import com.talos.javatraining.lesson3.groupInterfaces.Invertebrate;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.List;


public class Octopus extends AbstractAnimal implements Invertebrate
{
	@Override
	public List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>(AnimalSupport.getInvertebrateCharacteristics());
		characteristics.add("They have eight legs");
		return characteristics;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getFullDescription() {
		return null;
	}
}
