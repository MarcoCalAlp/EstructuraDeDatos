/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

/**
 *
 * @author marcovinicio
 */
public class Libros {
    private ArbolAVL<Libro> libros ;

    public Libros() {
      libros=new ArbolAVL<Libro>();
    }
    //---------------------------------
    public ArbolAVL<Libro> getLibros() {
        return libros;
    }
    //---------------------------------
    public void setLibros(ArbolAVL<Libro> libros) {
        this.libros = libros;
    }
    //---------------------------------
    public void AgregarLibro(Libro l){
        libros.add(l);
    }
    //---------------------------------
    public int TreeLibroAltura(Libro dato){
        return libros.altura(dato);
    }
    //---------------------------------
    public int TreeLibroProfundidad(Libro dato){
        return libros.profundidad(dato); 
    }
    //----------------------------------
    public void eliminaLibro(Libro dato){
        libros.remove(dato);
    }
    //----------------------------------
    public boolean treeLibroLLeno(){
        return libros.esLleno();
    }
    //----------------------------------
    public int TreeLibroPeso(){
        return libros.Peso();
    }
    
    
    
    
    
}
