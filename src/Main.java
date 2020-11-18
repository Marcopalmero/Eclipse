
public class Main {
	COCHE c1;
	COCHE c2;{
	c1=new COCHE();
	c2=new COCHE("Renault", "Scenic");
	System.out.println("La marca del coche 1 es: "+c1.getMarca());
	System.out.println("El modelo del coche 1 es: "+c1.getModelo());
	System.out.println("La marca del coche 2 es: "+c2.getMarca());
	System.out.println("El modelo del coche 2 es: "+c2.getModelo());
	c1.setMarca("Opel");
	c1.setModelo("Astra");
	c2.setMarca("Peugeot");
	c2.setModelo("308");
	System.out.println("Ahora la marca del coche 1 es: "
	+c1.getMarca());
	System.out.println("Ahora el modelo del coche 1 es: "
			+c1.getModelo());
			System.out.println("Ahora la marca del coche 2 es: "
			+c2.getMarca());
			System.out.println("Ahora el modelo del coche 2 es: "
			+c2.getModelo());
}
}