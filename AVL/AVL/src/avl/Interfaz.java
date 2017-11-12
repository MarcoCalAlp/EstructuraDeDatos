/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Addiel
 */
public class Interfaz {
static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in) );
    public Interfaz() {
    }
    public StringBuilder toStringMenu(){
        StringBuilder s = new StringBuilder();
        s.append("=============================================== MENU ===============================================");
        s.append("1-  Inclusión de nuevos libros dentro del árbol."); 
        s.append("2-  Mostrar todos los libros de un mismo tipo.");
        s.append("3-  Mostrar todos los libros de un autor.");
        s.append("4-  Mostrar por nombre de autor.");
        s.append("5-  Mostrar por codigo (ISBN).");
        s.append("6-  Verificar si el árbol es completo.");
        s.append("7-  Verificar si el árbol es perfecto.");
        s.append("8-  Verificar si el árbol esta lleno.");
        s.append("9-  Mostrar altura del árbol.");
        s.append("10- Mostrar nivel del árbol.");
        s.append("11- Mostrar peso del árbol.");
        s.append("12- Verificar ruta en el árbol.");
        s.append("13- Borrar un libro por codigo.");
        s.append("14- Borrar libros de un tipo determinado.");
        s.append("0-  Salir.");
        return s;
    }
    
    public Libro agregarLibro(){
        return null;
    }
    
    public void mostrarTipo(int tipo){
    }
    public void mostrarAutor(String autor){
    
    }
    public void mostrarCodigo(String codigo){
    
    }
    public boolean isComplete(){
         return false;
    }
    public boolean isFull(){
         return false;
    }
     public boolean isPerfect(){
         return false;
    }
    public int getAltura(){
        return 0;
    }
    public int getNivel(){
        return 0;
    }
    public int getPeso(){
        return 0;
    }
     public boolean isRuteAvaible(){
         return false;
    }
    public void deleteByCode(String code){}
    public void deleteByType(int type){}
    public void menu() throws Exception{ 
        int opc = -1;	
        int elem = -1;
        do
	{
            toStringMenu();
            ArbolAVL obj=new ArbolAVL();
            
        switch(opc){
            case 1:
            {
                    System.out.println("Ingrese un elemento");
                    elem=Integer.parseInt(entrada.readLine());
                    //obj.alta(elem);
                    break;
            }
            case 2:
            {
                    System.out.println("Buscar un elemento");
                    elem=Integer.parseInt(entrada.readLine());
                    /*if(obj.buscar(elem))
                    {
                            System.out.println("El elemento se encuentra en el arbol ");
                    }
                    else
                            System.out.println("El elemento NO se encuentra en el arbol ");*/
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

            case 5:
            {
                    System.out.println("Salir del Programa");
                    System.exit(0);
                    break;
            }
        }
	
	}while(opc<15);
	
    }
}

