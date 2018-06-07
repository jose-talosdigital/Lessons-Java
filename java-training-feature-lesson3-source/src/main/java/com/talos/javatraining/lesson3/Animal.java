package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.impl.animals.Dog;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public interface Animal
{
	default List<String> getCharacteristics() {
		return null;
	}

	default String getName()
	{
		return getClass().getSimpleName();
	}

	default String getFullDescription()
	{
		StringBuilder builder = new StringBuilder();
		String name = getName();
		String lastChr = name.substring(name.length()-1);
		builder.append(name).append(lastChr.equals("s") ? "es" : "s").append(" have these characteristics :");
		for (String characteristic : getCharacteristics())
		{
			builder.append(StringUtils.LF).append(StringUtils.CR).append("- ").append(characteristic);
		}
		return builder.toString();
	}

	static Animal create(String animal) throws NoSuchMethodException, IllegalAccessException, InstantiationException {

        try {
            String pack = Animal.class.getPackage().getName() + ".impl.animals.";
            Class<?> clazz = Animal.class.getClassLoader().loadClass( pack + animal);
            if(clazz == null){return null;}
            return (Animal) clazz.getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | ClassNotFoundException | ClassCastException e) {
            e.printStackTrace();
            return null;
        }
    }

}
