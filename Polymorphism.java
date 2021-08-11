package com.techment.test.day8;
abstract class Animal
{
	abstract void shout();
	
}
class Dog extends Animal
{
	void shout()
	{
		System.out.println("Bark");
	}
}
class Cat extends Animal
{
	void shout()
	{
		System.out.println("Meow");
	}
}
class Horse extends Animal
{
	void shout()
	{
		System.out.println("Neigh");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Animal animal = new Horse();
		animal.shout();

	}

}
