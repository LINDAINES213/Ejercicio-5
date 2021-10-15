import java.util.Arrays;

public class Jefe extends Combatientes {
    
    //objeto combatientes tipo guerrero
    Combatientes jefe = new Combatientes();
    Item habilidadespecialJ1 = new Item();
    Item habilidadespecialJ2 = new Item();

    public Jefe(){

        jefe.setNombre("Jefe");
        jefe.setVidas(150);
        jefe.setAtaque(55);
        habilidadespecialJ1.setNomItem("Rayo Electrico");
        habilidadespecialJ1.setNumItem(40);
        habilidadespecialJ2.setNomItem("Rayo Electrico");
        habilidadespecialJ2.setNumItem(30);

    }
    

    public String[] infoJefe(){
        
        String [] infojefe = new String[7];

        infojefe[0] = "Nombre: " +jefe.getNombre();
        infojefe[1] = "Vidas: " +Integer.toString(jefe.getVidas());
        infojefe[2] = "Fuerza de Ataque: " +Integer.toString(jefe.getAtaque());
        infojefe[3] = "Item disponible: " +habilidadespecialJ1.getNomItem();
        infojefe[4] = "Fuerza de Ataque del Item: " +Integer.toString(habilidadespecialJ1.getNumIten());
        infojefe[5] = "Item disponible: " +habilidadespecialJ2.getNomItem();
        infojefe[6] = "Fuerza de Ataque del Item: " +Integer.toString(habilidadespecialJ2.getNumIten());
        System.out.println("\nJefe: " +Arrays.toString(infojefe));
        return infojefe;
    }

    
}
