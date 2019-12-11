package com.webserviseclasses;

public class AnimalTypeService {
	
	public String getAnimalType(String animal)
	{
		String animalType="";
		if("Lion".equals(animal))
		{
			animalType="wild";
		}
		else if("Dog".equals(animal))
		{
			animalType="Domestic";
		}
		else
		{
			animalType="Dont Know";
		}
		return animalType;
			
	}

}
