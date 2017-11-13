/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcovinicio
 */
public class Libros {
    private ArbolAVL<Libro> libros ;
    private List<Libro> libs;
    public Libros() {
      libros=new ArbolAVL<>();
      libs = new ArrayList();
    }
    //---------------------------------
    public ArbolAVL<Libro> getLibros() {
        return libros;
    }
    //---------------------------------

    public List<Libro> getLibs() {
        return libs;
    }
    //---------------------------------
    public void setLibs(List<Libro> libs) {
        this.libs = libs;
    }
    //---------------------------------
    public void setLibros(ArbolAVL<Libro> libros) {
        this.libros = libros;
    }
    //---------------------------------
    public void AgregarLibro(Libro l){
        libros.add(l);
       
    }
    public void AddToList(Libro l){
         libs.add(l);
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
    public List<Libro> TreeMostrarPorTipo(){
          int[] input = null;
          List<Libro> aux =  new ArrayList();
          for(int i=0; i<libros.size();i++){
              input[i] = libs.get(i).getTipo();
          }
          List<Integer>[] buckets = new ArrayList[10];
          for (int i = 0; i < buckets.length; i++) {
              buckets[i] = new ArrayList<Integer>();
          }
          // sort
          boolean flag = false;
          int tmp = -1, divisor = 1;
          while (!flag) {
              flag = true;
            // split input between lists
            for (Integer i : input) {
              tmp = i / divisor;
              buckets[tmp % 10].add(i);
              if (flag && tmp > 0) {
                  flag = false;
              }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < 10; b++) {
              for (Integer i : buckets[b]) {
                input[a++] = i;
              }
              buckets[b].clear();
            }
            // move to next digit
            divisor *= 10;
          }
          for(int j=0;j<libs.size();j++){
              if(input[j] == libs.get(j).getTipo()){
                  aux.add(libs.get(j));
              }
          
          }
          return aux;
        }
    }
    
    
    
    

