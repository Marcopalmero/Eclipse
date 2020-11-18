
public class COCHE {

	String marca;
	String modelo;
	COCHE(){
	marca="ford";
	modelo="focus";
	}
	COCHE(String mar, String mod){
	marca=mar;
	modelo=mod;
	}
	public void setMarca(String mar){
	marca=mar;
	}
	public void setModelo(String mod){
	modelo=mod;
	}
	public String getMarca(){
	return marca;
	}
	public String getModelo(){
	return modelo;
	}
}