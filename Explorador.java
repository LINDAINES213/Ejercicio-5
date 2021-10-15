/**
 * Esta clase es heredada de combatientes y posee las caracteristicas del guerrero
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

 import java.util.Arrays;

public class Explorador extends Combatientes {
    
    //objeto combatientes tipo guerrero
    Combatientes explorador = new Combatientes();
    Item itemE = new Item();

    public String[] infoExplorador(){
        
        String [] infoexplorador = new String[5];
        
        explorador.setNombre("Explorador");
        explorador.setVidas(80);
        explorador.setAtaque(22);
        itemE.setNomItem("Rayo Electrico");
        itemE.setNumItem(45);

        infoexplorador[0] = "Nombre: " +explorador.getNombre();
        infoexplorador[1] = "Vidas: " +Integer.toString(explorador.getVidas());
        infoexplorador[2] = "Fuerza de Ataque: " +Integer.toString(explorador.getAtaque());
        infoexplorador[3] = "Item disponible: " +itemE.getNomItem();
        infoexplorador[4] = "Fuerza de Ataque del Item: " +Integer.toString(itemE.getNumIten());
        System.out.println("\nJugador 2: " +Arrays.toString(infoexplorador));
        return infoexplorador;
        
    }

}
