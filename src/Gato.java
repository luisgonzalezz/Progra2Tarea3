
public class Gato extends Animal {//Herencia de la clase animal
	
	Gato(String nombre, int edad)//Constructor de gato
	{
		super(nombre,edad); //Parametros del constructor animal
	}
	
	String maullar()  //Metodo para maullar
	{
		return "MIAAUUU SOY UN GATO"; //El gato habla :O
	}

}
