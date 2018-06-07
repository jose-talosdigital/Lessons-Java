package com.talos.javatraining.lesson3;

import org.apache.commons.lang3.StringUtils;

import java.util.List;


public interface Animal
{

	String getName();

	List<String> getCharacteristics();

	String getFullDescription();

	public default String getName()
	{
		return getClass().getSimpleName();
	}

	public default String getFullDescription()
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

}
