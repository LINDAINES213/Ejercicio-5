import java.util.Scanner;

public class Batalla {
    
    Scanner sn = new Scanner(System.in);
    

    //Guerrero guerreros;
       //Objeto tipo explorador
    Explorador exploradores = new Explorador();
    Cazador cazadores = new Cazador();
    Enemigos enemigos = new Enemigos();
    //Jefe jefes = new Jefe();
    Vista vista = new Vista();

    public void GuerrerovsJefe(){

        int danoAtaque = 0;
        Guerrero guerreros = new Guerrero();
        guerreros.setAtaque(30);
        guerreros.setVidas(100);
        Jefe jefes = new Jefe();
        jefes.getAtaque();
        jefes.getVidas();

        do{
            danoAtaque = guerreros.atacar();
            System.out.println("\nAtaque realizado");
            jefes.recibirataque(danoAtaque);
            if(jefes.getEstado().equals("Derrotado")){
                System.out.println("\nEl Jefe ha sido derrotado");
            }
            System.out.println("\nLas vidas restantes del Guerrero son " + exploradores.getVidas());
            System.out.println("\nLas vidas restantes del jefe son " + jefes.getVidas() + "\n");
           // System.out.println("\nLas vidas restantes del Mago y del Gigante de Hielo son " + enemigos.getVidas());
        } while(guerreros.getEstado().equals("En Combate") && jefes.getEstado().equals("En Combate"));
    }
    
    public void JefevsGuerrero(){
        int danoAtaque = 0;
        Guerrero guerreros = new Guerrero();
        guerreros.getNombre();
        guerreros.getAtaque();
        guerreros.getVidas();
        Jefe jefes = new Jefe();
        jefes.getNombre();
        jefes.getAtaque();
        jefes.getVidas();

        do{
            danoAtaque = jefes.atacar();
            System.out.println("Ataque realizado");
            guerreros.recibirataque(danoAtaque);
            if(guerreros.getVidas() <= 0){
                 System.out.println("El Guerrero ha sido derrotados");
            }
            System.out.println("Las vidas restantes del Guerrero son " + guerreros.getVidas());
            System.out.println("Las vidas restantes del jefe son " + jefes.getVidas());
            System.out.println("Las vidas restantes del Mago y del Gigante de Hielo son" + enemigos.getVidas());

        } while(guerreros.getEstado().equals("En Combate") && jefes.getEstado().equals("En Combate"));

        
    
            /**else if (opcion4 == 2){
                    danoAtaque = guerreros.atacar();
                    System.out.println("Ataque realizado");
                    enemigos.recibirataque(danoAtaque);
                    if(enemigos.getVidas() <= 0){
                        System.out.println("Los enemigos han sido derrotados");
                    }
                }*/
    }
}
