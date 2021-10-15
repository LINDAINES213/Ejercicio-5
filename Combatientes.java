/**
 * Esta clase tiene los getters y setters de los combatientes
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Combatientes {
    
    protected int vidas;
    protected String nombre;
    protected int ataque;
	protected String estado = "Atacando";

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

	public String getEstado(){
		return estado;
	}

	public int atacar(){
		int dano = 0;
		dano = this.ataque;
		return dano;
	}

	public void recibirataque(int danorecibido){
		this.vidas = this.vidas - danorecibido;
		if(this.vidas <= 0){
			this.estado = "Derrotado";
		}
	}
}