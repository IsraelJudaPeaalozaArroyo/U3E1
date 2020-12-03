import  java.util.Scanner ;

public  class  Main {
    public  static  void  main ( String [] args ) {
    Scanner leer =  nuevo  Scanner ( System . In);
    int [] numeros =  nuevo  int [ 5 ];
     booleano  X =  verdadero ;
     int contador = 0 ;
     int opc = 0 ;
    while ( X ) {
        Sistema . fuera . println ( " MENÚ " );
        Sistema . fuera . println ( " Elija una opcion: " );
        Sistema . fuera . println ( " [1] Insertar Datp " );
        Sistema . fuera . println ( " [2] Eliminar Dato " );
        Sistema . fuera . println ( " [3] Mostrar " );
        Sistema . fuera . println ( " [4] Salir " );
        opc = leer . nextInt ();
        cambiar (opc) {
            caso  1 :
                Sistema . fuera . println ( " inserte un dato de tipo entero " );
                si (contador <  5 ) {
                    numeros [contador] = leer . nextInt ();
                    contador ++ ;
                } más {
                    Sistema . fuera . println ( " El arreglo esta lleno " );
                }
                romper ;
            caso  2 :
                si (contador ==  0 ) {
                    Sistema . fuera . println ( " El arreglo esta vacio " );
                } más {
                    Sistema . fuera . println ( " Dato Eliminado " );
                    numeros [contador - 1 ] =  0 ;
                    contador - ;
                }
                romper ;
            caso  3 :
                Sistema . fuera . println ( " Datos: " );
                para ( int j = numeros . longitud - 1 ; j > = 0 ; j - ) {
                    Sistema . fuera . println (numeros [j]);
                }
                romper ;
            caso  4 :
                 X =  falso ;
                Sistema . fuera . println ( " " );
                romper ;
                
            por defecto :
                Sistema . fuera . println ( " opcion incorrecta " );
        }
    } 
   
}
}
