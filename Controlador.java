public class Controlador {
    
    public static void main(String[] args){

        Vista vista = new Vista();
        Batalla batalla = new Batalla();
        //Enemigos enemigo;

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;
        int opcion5 = 0;

        while(opcion != 3){

            opcion = vista.menu();

            if(opcion == 1){

                opcion2 = vista.personaje();
                
                if(opcion2 == 1){
                    opcion3 = vista.menuataque();
                    if(opcion3 == 1){
                        opcion4 = vista.AtaqueAEnemigo();
                        if(opcion4 == 1){
                            batalla.GuerrerovsJefe();
                            opcion5 = vista.AtaqueAJugador();
                            if(opcion5 == 1){
                                batalla.JefevsGuerrero();
                            }
                        }
                    }
                }
            }
                    /**if(opcion == 1){
                        batalla.atAenemigo();
                        opcion3 = vista.menu3();
                        batalla.atAguerrero();
                    }

                } else if (opcion2 == 2){
                    vista.explorador();
                }
            
            } else*/ if (opcion == 2){

                vista.combatientes();

            } else if (opcion == 3){

                vista.salir();

            }
        }
        
    }
}
