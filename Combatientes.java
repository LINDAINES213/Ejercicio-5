/**
 * Esta clase tiene los getters y setters de los combatientes
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Combatientes {
    
    protected int vidas;
    protected String nombre;
    protected int ataque;

	public void setNombre (String nombre){
		this.nombre = nombre;
	}

	public void setAtaque (int ataque){
		this.ataque = ataque;
	}

	public void setVidas (int vidas){
		this.vidas = vidas;
	}

	public String getNombre (){
		return nombre;
	}

	public int getAtaque (){
		return ataque;
	}

	public int getVidas (){
		return vidas;
	}
}