
public class Perro extends Animal {//Herencia de la clase animal
	
		Perro(String nombre, int edad)//Constructor de perro
		{
			super(nombre,edad); //Parametros del constructor animal
		}
		
		String ladrar()  //Metodo para ladrar
		{
			return "GUAUU GUAUUU SOY UN PERRO"; //El perro habla :O
		}

}
