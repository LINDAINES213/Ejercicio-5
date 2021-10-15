/**
 * Esta clase es heredada de combatientes y posee las caracteristicas del guerrero
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

import java.util.Arrays;

public class Guerrero extends Combatientes {
    
    //objeto combatientes tipo guerrero
    Combatientes guerrero = new Combatientes();
    Item itemG = new Item();

    public Guerrero(){
        guerrero.setNombre("Guerrero");
        guerrero.setVidas(100);
        guerrero.setAtaque(30);
        itemG.setNomItem("Super Golpe");
        itemG.setNumItem(12);
    }


    public String[] infoGuerrero(){
        String [] infoguerrero = new String[5];
            
        infoguerrero[0] = "Nombre: " +guerrero.getNombre();
        infoguerrero[1] = "Vidas: " +Integer.toString(guerrero.getVidas());
        infoguerrero[2] = "Fuerza de Ataque: " +Integer.toString(guerrero.getAtaque());      
        infoguerrero[3] = "Item disponible: " +itemG.getNomItem();
        infoguerrero[4] = "Fuerza de Ataque del Item: " +Integer.toString(itemG.getNumIten());  
        System.out.println("Jugador 1: " +Arrays.toString(infoguerrero));
        return infoguerrero;
    }

    

}