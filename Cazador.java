/**
 * Esta clase es heredada de combatientes y posee las caracteristicas del guerrero
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

import java.util.Arrays;

public class Cazador extends Combatientes {
    
    //objeto combatientes tipo guerrero
    Combatientes cazador = new Combatientes();
    Mascota mascotas = new Mascota();

    public void vidas(){
        
    }
    
    public String[] infoCazador(){
        
        String [] infoCazador = new String[5];
        
        cazador.setNombre("Cazador");
        cazador.setVidas(95);
        cazador.setAtaque(40);
        mascotas.setNombre("Perro");
        mascotas.setAtaque(15);
        mascotas.setVidas(cazador.getVidas());

        infoCazador[0] = "Nombre: " +cazador.getNombre();
        infoCazador[1] = "Vidas: " +Integer.toString(cazador.getVidas());
        infoCazador[2] = "Fuerza de Ataque: " +Integer.toString(cazador.getAtaque());
        infoCazador[3] = "Nombre de Mascota: " +mascotas.getNombre();
        infoCazador[4] = "Fuerza de Ataque Mascota: " +Integer.toString(mascotas.getAtaque());
        System.out.println("\nJugador 3: " +Arrays.toString(infoCazador));
        return infoCazador;
    }

}
