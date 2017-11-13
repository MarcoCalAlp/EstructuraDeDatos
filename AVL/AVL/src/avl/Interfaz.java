/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Addiel
 */
public class Interfaz {
     ArbolAVL obj=new ArbolAVL(); 
     Libros libs = new Libros();
static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in) );
    public Interfaz() {}
    public StringBuilder toStringMenu(){
        StringBuilder s = new StringBuilder();
        s.append("=============================================== MENU =============================================== \n");
        s.append("1-  Inclusión de nuevos libros dentro del árbol. \n"); 
        s.append("2-  Mostrar todos los libros de un mismo tipo. \n");
        s.append("3-  Mostrar todos los libros de un autor. \n");
        s.append("4-  Mostrar por nombre de autor. \n");
        s.append("5-  Mostrar por codigo (ISBN). \n");
        s.append("6-  Verificar si el árbol es completo. \n");
        s.append("7-  Verificar si el árbol es perfecto. \n");
        s.append("8-  Verificar si el árbol esta lleno. \n");
        s.append("9-  Mostrar altura del árbol. \n");
        s.append("10- Mostrar nivel del árbol. \n");
        s.append("11- Mostrar peso del árbol. \n");
        s.append("12- Verificar ruta en el árbol. \n");
        s.append("13- Borrar un libro por codigo. \n");
        s.append("14- Borrar libros de un tipo determinado. \n");
        s.append("15- Cargar Archivo maestro. \n");
        s.append("16- Grabar Informacion. \n");
        s.append("0-  Salir.");
        return s;
    }
    
    public void agregarLibro() throws IOException{
    String aux ="";
    int tipo =-1;
    Libro lib = new Libro();
    System.out.println("Ingrese codigo del libro");
    aux=entrada.readLine();
    lib.setCodigo(aux);
    System.out.println("Ingrese Nombre del libro");
    aux=entrada.readLine();
    lib.setNombre(aux);
    System.out.println("Ingrese Autor del libro");
    aux=entrada.readLine();
    lib.setAutor(aux);
    System.out.println("Ingrese una descripcion del libro");
    aux=entrada.readLine();
    lib.setDescripcion(aux);
    System.out.println("Ingrese el tipo de libro");
    tipo=parseInt(entrada.readLine());
    lib.setTipo(tipo);
     libs.AgregarLibro(lib);
     libs.AddToList(lib);
     System.out.println("Libro Agregado con exito!");
    }
    
    public void mostrarTipo(){
        libs.TreeMostrarPorTipo();
    }
    public void mostrarAutor(String autor){
    }
    public void mostrarCodigo(String codigo){
    }
    public boolean isComplete(){
         return false;
    }
    public boolean isFull(){
         return obj.isEmpty();
    }
     public boolean isPerfect(){
         return obj.esLleno();
    }
    public int getAltura(){
        return 0;
    }
    public int getNivel(){
        return 0;
    }
    public int getPeso(){
        return obj.Peso();
    }
     public boolean isRuteAvaible(){
         return false;
    }
    public void menu() throws Exception{ 
        int opc = -1;	
        int elem = -1;
        System.out.println(toStringMenu());
       
        do
	{
           System.out.println("Elija una opcion: "); 
           opc=Integer.parseInt(entrada.readLine());
        switch(opc){
            case 1:
            {       agregarLibro();
                   
                    break;
            }
            case 2:
            {
                    mostrarTipo();
                    break;
            }
            case 3:
            {
                    System.out.println("Eliminar un elemento");
                    elem=Integer.parseInt(entrada.readLine());
                    //obj.eliminarelemento(elem);

                    break;
            }
            case 4:
            {
                    System.out.println("Imprimir  En orden  Pre Orden  ");
                   // obj.visualizar();
                    System.out.println("\n");
                    break;
            }

            case 0:
            {
                    System.out.println("Saliendo del Programa......");
                    Thread.sleep(1000);
                    System.exit(0);
                    break;
            }
        }
	
	}while(opc<17);
	
    }
}

