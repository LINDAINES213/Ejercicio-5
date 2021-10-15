import java.util.Scanner;

public class Batalla {
    
    Scanner sn = new Scanner(System.in);
    int opcion3, opcion4, danoAtaque = 0;

    Guerrero guerreros = new Guerrero();
    //Objeto tipo explorador
    Explorador exploradores = new Explorador();
    Cazador cazadores = new Cazador();
    Enemigos enemigos = new Enemigos();
    Jefe jefes = new Jefe();
    Vista vista = new Vista();

    public void GuerrerovsJefe(){
        do{
                    danoAtaque = guerreros.atacar();
                    System.out.println("Ataque realizado");
                    jefes.recibirataque(danoAtaque);
                    if(jefes.getVidas() <= 0){
                        System.out.println("El jefe ha sido derrotado");
                    }
                   System.out.println("La energia de" +guerreros.getNombre() + "es" + guerreros.getVidas());
                   System.out.println("La energia de" +jefes.getNombre() + "es" + jefes.getVidas());
                   System.out.println("La energia de" +enemigos.getNombre() + "es" + enemigos.getVidas());
                   //System.out.println("La energia de" +guerreros.getNombre() + "es" + guerreros.getVidas());

        } while(guerreros.getVidas()>0 && enemigos.getVidas()>0 && jefes.getVidas()>0);
    }
    
        public void JefevsGuerrero(){
            do{
                danoAtaque = jefes.atacar();
                System.out.println("Ataque realizado");
                guerreros.recibirataque(danoAtaque);
                if(guerreros.getVidas() <= 0){
                    System.out.println("Los enemigos han sido derrotados");
                }
                       System.out.println("La energia de" +guerreros.getNombre() + "es" + guerreros.getVidas());
                       System.out.println("La energia de" +jefes.getNombre() + "es" + jefes.getVidas());
                       System.out.println("La energia de" +enemigos.getNombre() + "es" + enemigos.getVidas());
                       //System.out.println("La energia de" +guerreros.getNombre() + "es" + guerreros.getVidas());
    
            } while(guerreros.getVidas()>0 && enemigos.getVidas()>0 && jefes.getVidas()>0);
    
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
