package exam.codewriting.q2;

import java.util.LinkedList;

/*
 * We now wish to create a SolarSystem class. The beginnings of this class have been
provided to you below. Examine the instructions and complete the remaining methods.
 */

public class SolarSystem {

	// Instance variables (do not change)
	private String name ;
	private LinkedList < Planet > planets ;
	// Write the constructor for the SolarSystem class.
	// When a SolarSystem is first created, it should not contain any planets.

	public SolarSystem(String name) {
		this.name = name;
		this.planets = new LinkedList<>();
	}
	
	public String getName () {
		return name;
	}
	
	public void addPlanet ( Planet p) {
		planets.add(p);
	}
	
	public int getNumberOfPlanets () {
		return planets.size();
	}
	
	/**
	* Returns the sum of the masses of all planets in the solar system
	*/

	public double getTotalMass () {
		int total = 0;
    	for (int i = 0; i < planets.size(); i++) {
        	total += planets.get(i).getMass();
    	}
    	return total;
	}
	
	public static void main(String[] args) {
		//Write a line of code that creates an instance of the Planet class by calling the constructor. You should
		//also declare a variable to hold the newly created instance.
		Planet Alina = new Planet("Alina", 500000);
		Planet Leah = new Planet("Leah", 600000);
		//Write a line of code that creates an instance of the SolarSystem class by calling the constructor. You
		//should also declare a variable to hold the newly created instance.
		SolarSystem Alinasystem = new SolarSystem("Alinasystem");
		//Write a line of code that will add the Planet to the SolarSystem
		Alinasystem.addPlanet(Alina);
		Alinasystem.addPlanet(Leah);
		//Write a line of code that will retrieve the total mass from the SolarSystem
		System.out.println(Alinasystem.getTotalMass());
	}
}
