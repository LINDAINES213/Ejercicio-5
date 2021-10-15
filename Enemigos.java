import java.util.Arrays;

public class Enemigos extends Combatientes {
    
    //objeto combatientes tipo guerrero
    Combatientes mago = new Combatientes();
    Combatientes gigantehielo = new Combatientes();
    Item habilidadespecialM = new Item();
    Item habilidadespecialG = new Item();

    public String[] infoMago(){
        
        String [] infomago = new String[5];
        
        mago.setNombre("Mago");
        mago.setVidas(60);
        mago.setAtaque(40);
        habilidadespecialM.setNomItem("Hechizo Fuego");
        habilidadespecialM.setNumItem(10);

        infomago[0] = "Nombre: " +mago.getNombre();
        infomago[1] = "Vidas: " +Integer.toString(mago.getVidas());
        infomago[2] = "Fuerza de Ataque: " +Integer.toString(mago.getAtaque());
        infomago[3] = "Item disponible: " +habilidadespecialM.getNomItem();
        infomago[4] = "Fuerza de Ataque del Item: " +Integer.toString(habilidadespecialM.getNumIten());
        System.out.println("Enemigo 1: " +Arrays.toString(infomago));
        return infomago;
    }

    public String[] infoGiganteHielo(){
        
        String [] infogigante = new String[5];
        
        mago.setNombre("Gigante de Hielo");
        mago.setVidas(60);
        mago.setAtaque(40);
        habilidadespecialM.setNomItem("Cubo de Hielo Gigante");
        habilidadespecialM.setNumItem(10);

        infogigante[0] = "Nombre: " +mago.getNombre();
        infogigante[1] = "Vidas: " +Integer.toString(mago.getVidas());
        infogigante[2] = "Fuerza de Ataque: " +Integer.toString(mago.getAtaque());
        infogigante[3] = "Item disponible: " +habilidadespecialM.getNomItem();
        infogigante[4] = "Fuerza de Ataque del Item: " +Integer.toString(habilidadespecialM.getNumIten());
        System.out.println("\nEnemigo 2: " +Arrays.toString(infogigante));
        return infogigante;
    }
}
