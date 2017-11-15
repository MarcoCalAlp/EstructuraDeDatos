/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

/**
 *
 * @author Addiel
 */
public class AVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /*Libros libros= new Libros();
        Libro l=new Libro("Cocori","1231","Carmen Lyra","Cocori 9na Edicion",1);
        Libro l2=new Libro("FFF","999","Shakespare","FFF 7ma Edicion",2);
        Libro l3=new Libro("Programacion","8888","Camaño","Progra 7ma Edicion",1);
        Libro l4=new Libro("Rizitos","3211","Carmen Lyra","Rizitos 9na Edicion",1);
       
        libros.AgregarLibro(l);
        libros.AgregarLibro(l2);
        libros.AgregarLibro(l3);
        libros.AgregarLibro(l4);
        
        //libros.imprime();
        System.out.print(libros.imprime());
        System.out.println("--------Borrando por tipo-------");
        /*libros.borrarPorCodigo("1231");
        libros.borrarPorCodigo("999");
        libros.borrarPorCodigo("8888");
        libros.borrarPorTipo(1);
        System.out.println(libros.imprime());*/
        Interfaz in = new Interfaz();
        in.menu();
        
    }
    
}
