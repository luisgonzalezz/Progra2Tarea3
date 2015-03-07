
public class Loro extends Animal {//Herencia de la clase animal
	
	Loro(String nombre, int edad)//Constructor de loro
	{
		super(nombre,edad); //Parametros del constructor animal
	}
	
	String hablar()  //Metodo para hablar
	{
		return "ARR ARRR ME LLAMO PERIQUIN"; //El loro tiene nombre :O
	}

}
