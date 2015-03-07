
public class Animal {
String nombre; //atributos
int edad;

Animal (String nombre, int edad) //Constructor
{
	this.nombre=nombre;
	this.edad=edad;
}


String getNombre() //Retorna valores de la variable nombre
{
	return nombre;
}

int getEdad() //Retorna valores de la variable edad
{
	return edad;
}


void setNombre(String nombre) //Asigna valores a la variable nombre
{
	this.nombre = nombre;
}

void setEdad(int edad) //Asigna valores a la variable edad
{
	this.edad=edad;
}




}
