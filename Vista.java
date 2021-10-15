/**
 * Esta clase es la vista donde se muestran mensajes con impresiones
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

import java.util.Scanner;

public class Vista {
    
    //Objeto tipo scanner
    Scanner sn = new Scanner(System.in);
    //Vista vista = new Vista();
    //Objeto tipo enemigo
    //Enemigos enemigos = new Enemigos();
    //Objeto tipo jefe
    //Jefe jefes = new Jefe();
    //Objeto tipo guerrero
    Guerrero guerreros = new Guerrero();
    //Objeto tipo explorador
    Explorador exploradores = new Explorador();
    Cazador cazadores = new Cazador();
    Enemigos enemigos = new Enemigos();
    Jefe jefes = new Jefe();
    /**
     * Texto del primer menu
    */
    public int menu(){
        int opcion;

        String menu = "\nBienvenido al juego. Elija una opción:\n" +
                       "1. Simulador de Juego\n" +
                       "2. Ver personajes disponibles\n" +
                       "3. Salir del Juego\n";
        
        System.out.println(menu);
        opcion =  sn.nextInt();
               
        return opcion;

    }

    /**
     * Texto del tercer menu
    */
    public int menuataque(){
        int opcion3;
        String menuataque = "1. Ataque Normal\n" +
                            "2. Usar Item (Jugador)\n" +
                            "3. Usar Habilidad Especial(Enemigo o Jefe)\n";
        
        System.out.println(menuataque);
        opcion3 =  sn.nextInt();  
        return opcion3; 
    }

    public int AtaqueAEnemigo(){

        int opcion4;
        String menuataque = "A quien desea atacar?\n" +
                            "1. Jefe\n" +
                            "2. Mago y Gigante de Hielo\n";

        System.out.println(menuataque);
        opcion4 =  sn.nextInt();  
        return opcion4;
    }

    public int AtaqueAJugador(){

        int opcion5;
        String menuataque = "Como desea atacar?\n" +
                            "1. Ataque normal\n" +
                            "2. Ataque con Habilidad especial\n";

        System.out.println(menuataque);
        opcion5 =  sn.nextInt();  
        return opcion5;
    }

    /**
     * Texto del menu para elegir personajes
    */
    public int personaje(){
        int opcion2;

        String personaje = "\nElija un personajes\n" +
                        "1. Guerrero\n" +
                        "2. Explorador\n";
        
        System.out.println(personaje);
        opcion2 = sn.nextInt();
        return opcion2;
    }

    /**
     * Imprime los atributos de todos los combatientes, tanto jugadores como enemigos
    */
    public void combatientes(){
        System.out.println("\nLista de Jugadores Disponibles: \n");
        guerreros.infoGuerrero();
        exploradores.infoExplorador();
        cazadores.infoCazador();
        System.out.println("\nLista de Enemigos: \n");
        enemigos.infoMago();
        enemigos.infoGiganteHielo();
        jefes.infoJefe();
    }

    /**
     * Crea e imprime el mensaje de despedida
    */
    public String salir(){
        String salir = "\nFin del Juego\n";
        System.out.println(salir);
        return salir;
    }
}