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
public class Libro implements Comparable {
    String nombre;
    String codigo;
    String autor;
    String descripcion;
    int tipo;

    public Libro() {
    }
    //------------------------------------

    public Libro(String nombre, String codigo, String autor, String descripcion, int tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    
    //------------------------------------
    public String getNombre() {
        return nombre;
    }
    //------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //------------------------------------
    public String getCodigo() {
        return codigo;
    }
    //------------------------------------
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //------------------------------------
    public String getAutor() {
        return autor;
    }
    //------------------------------------
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //------------------------------------
    public String getDescripcion() {
        return descripcion;
    }
    //------------------------------------
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //------------------------------------
    public int getTipo() {
        return tipo;
    }
    //------------------------------------
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    //------------------------------------
    @Override
    public String toString(){
        String parseInt=String.valueOf(tipo);
        String datos= "--------------"+"\n"+nombre+"\n"+codigo+"\n"+
        autor+"\n"+descripcion+"\n"+parseInt+"\n"+"-----------"+"\n"; 
        return datos;
    }
    //-----------------------------------

    @Override
    public int compareTo(Object o) {
        Libro lib=new Libro();
        lib=(Libro)o;
        int cod1=Integer.parseInt( lib.getCodigo());
        int cod2=Integer.parseInt(this.getCodigo());
        if(cod2==cod1){
        return 0;
        }
        else
        { 
            if(cod2<cod1)
             return -1;
            else{
                return 1;
            }
        }
    }
}
