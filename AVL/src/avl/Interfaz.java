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
 * @author marcovinicio
 */
public class Interfaz {
    
     ArbolAVL obj=new ArbolAVL(); 
     Libros libs = new Libros();
static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in) );
    public Interfaz() {}
    public StringBuilder toStringMenu(){
        StringBuilder s = new StringBuilder();
        s.append("============ MENU =============================================== \n");
        s.append("=         1-  Inclusión de nuevos libros dentro del árbol.      = \n"); 
        s.append("=         2-  Mostrar todos los libros de un mismo tipo.        = \n");
        s.append("=         3-  Mostrar todos los libros de un autor.             = \n");
        s.append("=         4-  Mostrar por nombre de autor.                      = \n");
        s.append("=         5-  Mostrar por codigo (ISBN).                        = \n");
        s.append("=         6-  Verificar si el árbol es completo.                = \n");
        s.append("=         7-  Verificar si el árbol es perfecto.                = \n");
        s.append("=         8-  Verificar si el árbol esta lleno.                 = \n");
        s.append("=         9-  Mostrar altura del árbol.                         = \n");
        s.append("=         10- Mostrar nivel del árbol.                          = \n");
        s.append("=         11- Mostrar peso del árbol.                           = \n");
        s.append("=         12- Verificar ruta en el árbol.                       = \n");
        s.append("=         13- Borrar un libro por codigo.                       = \n");
        s.append("=         14- Borrar libros de un tipo determinado.             = \n");
        s.append("=         15- Cargar Archivo maestro.                           = \n");
        s.append("=         16- Grabar Informacion.                               = \n");
        s.append("=         0-  Salir.                                            = \n");
        s.append("================================================================= \n");
        return s;
    }
    
    private void agregarLibro() throws IOException{
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
    }
    //--------------------------------------------------------------
    private int ingresaTipo(){
      int tipo;
        try{
        System.out.println("=======Ingrese el tipo de libro=========");
        tipo=Integer.parseInt(entrada.readLine());
        return tipo;
        }
        catch(Exception e){
            System.out.println("Error , el caracter insertado no es un numero!!!");
            return -1;
        }
    }
    
    //--------------------------------------------------------------
    public void mostrarTipo()
    { 
        int seleccionado=ingresaTipo();
        if(seleccionado==-1){
            System.out.println("Intentelo de nuevo");
        }
        else{
            System.out.println(libs.imprimePorTipo(seleccionado)); 
        }   
    }
    //--------------------------------------------------------------
    public void mostrarAutor() throws IOException
    {
        String autor;
        System.out.println("=======Ingrese el nombre del autor=========");
        autor=entrada.readLine();
        System.out.println(libs.imprimePorAutor(autor));
       
    }
    //--------------------------------------------------------------
    public void mostrarCodigo() throws IOException{
        System.out.println("=======Ingrese el codigo del libro=========");
        System.out.println(libs.imprimePorAutor(entrada.readLine()));
    }
    //--------------------------------------------------------------
    public void mostrarNombre() throws IOException{
         System.out.println("=======Ingrese el codigo del libro=========");
        System.out.println(libs.ImprimePorNombre(entrada.readLine()));
    }
    //--------------------------------------------------------------
    public boolean esCompleto(){
         return false;
    }
    //--------------------------------------------------------------
    public void esLleno(){
        if(libs.treeLibroLLeno()==true){
            System.out.println("ES UN ARBOL LLENO");
        }
        else{
            System.out.println("NO ES UN ARBOL LLENO"); 
        }
    }
    //--------------------------------------------------------------
     public boolean esPerfecto(){
         return false;
    }
    //--------------------------------------------------------------
    public void Altura(){
       System.out.println("Altura del arbol :"+libs.TreeLibroAltura());
    }
    //--------------------------------------------------------------
    public void Nivel(){
        libs.niveles();
    }
    //--------------------------------------------------------------
    public void getPeso(){
        System.out.println("Altura del arbol :"+ libs.TreeLibroPeso());
    }
    //--------------------------------------------------------------
     public boolean RutaDisponible(){
         return false;
    }
    //--------------------------------------------------------------
     public void borraTipo(){
       int tipo=ingresaTipo();
        if(tipo==-1){
            System.out.println("Intentelo de nuevo");
        }
        else{
            libs.borrarPorTipo(tipo);
        }   
     }
    //---------------------------------------------------------------
     public void borraCodigo() throws IOException{
         System.out.println("=======Ingrese el codigo del libro que desea borrar=========");
        libs.borrarPorCodigo(entrada.readLine());
     }
     //---------------------------------------------------------------
     public void imprimeLibros(){
      System.out.println(libs.imprime());
     }
     //---------------------------------------------------------------
    public void menu() throws Exception{ 
        int opc = -1;	
        int elem = -1;
       
        do
	{  System.out.println(toStringMenu());
           System.out.println("Elija una opcion: "); 
           opc=Integer.parseInt(entrada.readLine());
        switch(opc){
            case 1:
            agregarLibro();
            break;
            
            case 2:
            mostrarTipo();
            break;
            
            case 3:
            this.mostrarAutor();
            break;
            
            case 4:
            this.mostrarNombre();
            break;
            
            case 5:
            this.mostrarCodigo();
            break;
            
            case 6:
            //this.esCompleto();
            break;
            
            case 7:
            //this.esPerfecto();
            break;
            
            case 8:
            this.esLleno();
            break;
            
            case 9:
            this.Altura();
            break;
            
            case 10:
            this.Nivel();
            break;
            
            case 11:
            this.getPeso();
            break;
            
            case 12:
            //this.RutaDisponible();
            break;
            
            case 13:
            this.borraCodigo();
            break;
            
            case 14:
            this.borraTipo();
            break;
            
            case 16:
            this.imprimeLibros();
            break;
            
            case 0:
            System.out.println("Saliendo del Programa......");
            Thread.sleep(1000);
            System.exit(0);
            break;
            
        }
	
	}while(opc<17);
	
    }
    //-------------------------------------------------
}

