package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.AnimalSupport;
import com.talos.javatraining.lesson3.groupInterfaces.Amphibian;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.List;


public class Frog extends AbstractAnimal implements Amphibian
{
	@Override
	public List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>(AnimalSupport.getAmphibianCharacteristics());
		characteristics.add("They croak");
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
