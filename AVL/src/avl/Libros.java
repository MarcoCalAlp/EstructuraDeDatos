/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcovinicio
 */
@XmlRootElement(name="Libros")
public class Libros {
    private ArbolAVL<Libro> libros ;
    List<Libro> aux;
    File f;
    public Libros() {
      libros=new ArbolAVL<Libro>();
    }
     //---------------------------------
    
     @XmlElement(name = "Libros")
    public List<Libro> getAux() {
        return aux;
    }
    //---------------------------------
    
    public void setAux(List<Libro> aux) {
        this.aux = aux;
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
        if(buscarCodigo(l.getCodigo())!=null){
        System.out.println("!!!Ya existe un libro con este Codigo!!!");
        }
        else{
        libros.add(l);
        }
    }
    //---------------------------------
    public void AddLibroToList(Libro l){
        aux.add(l);
    }
    //---------------------------------
    public int TreeLibroAltura(){
        return libros.Altura();
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
    //----------------------------------
    public String imprime(){
        String s=" ";
        for(int i=0;i<libros.inOrden().size();i++){
            s+=libros.inOrden().get(i).toString();
        }
        return s;
    }
    //----------------------------------
    public void niveles(){
        libros.nodosNivel();
    }
    //----------------------------------
    public List<Libro> buscarTipo(int tipo){
        /*Busca un libro por su atributo tipo 
        y devuelve una lista de quienes la contienen*/
        List<Libro> recorrido= libros.inOrden();
        List<Libro> aux= new ArrayList<Libro>();
        for(int i=0;i<recorrido.size();i++){
            if(recorrido.get(i).getTipo()==tipo){
                aux.add(recorrido.get(i));
            }
        }
        return aux;    
    }
    //---------------------------------
    public String  imprimePorTipo(int tipo){
        String s="";
        List<Libro> recorrido=buscarTipo(tipo);
        if(recorrido!=null)
        {
            for(int i=0;i<recorrido.size();i++){
                s+=recorrido.get(i).toString();
            }
            return s;
        }
        else{
        return "No existe libro con este tipo";  
        }
    }
    //------------------------------------
    public List<Libro> buscarAutor(String autor){
        /*Busca un libro por su atributo autor 
        y devuelve una lista de quienes la contienen*/
        List<Libro> recorrido= libros.inOrden();
        List<Libro> aux= new ArrayList<Libro>();
        for(int i=0;i<recorrido.size();i++){
            if(recorrido.get(i).getAutor().equals(autor)){
                aux.add(recorrido.get(i));
            }
        }
        return aux;    
    }
    //--------------------------------------
     public String  imprimePorAutor(String autor){
        String s="";
        List<Libro> recorrido=buscarAutor(autor);
        if(recorrido!=null)
        {
            for(int i=0;i<recorrido.size();i++){
                s+=recorrido.get(i).toString();
            }
            return s;
        }
        else{
        return "No existe libro con este autor";   
        }
        
    }
    //---------------------------------------
    public List<Libro> buscarNombre(String nombre){
        /*Busca un libro por su atributo autor 
        y devuelve una lista de quienes la contienen*/
        List<Libro> recorrido= libros.inOrden();
        List<Libro> aux= new ArrayList<Libro>();
        for(int i=0;i<recorrido.size();i++){
            if(recorrido.get(i).getNombre().equals(nombre)){
                aux.add(recorrido.get(i));
            }
        }
        return aux;    
    } 
    //----------------------------------------
    public String  ImprimePorNombre(String nombre){
        String s="";
        List<Libro> recorrido=buscarNombre(nombre);
        if(recorrido!=null)
        {
            for(int i=0;i<recorrido.size();i++){
                s+=recorrido.get(i).toString();
            }
            return s;
        }
        else{
        return "No existe libro con este nombre";
        }
    }
    //-----------------------------------------
    public Libro buscarCodigo(String codigo){
        /*Busca un libro por su atributo autor 
        y devuelve una lista de quienes la contienen*/
        List<Libro> recorrido= libros.inOrden();
        for(int i=0;i<recorrido.size();i++){
            if(recorrido.get(i).getCodigo().equals(codigo)){
                return recorrido.get(i);
            }
        }
        return null;    
    } 
    //----------------------------------------
    public String  imprimePorCodigo(String codigo){
        String s="";
        Libro aux=buscarCodigo(codigo);
        if(aux!=null)
        {
            return aux.toString();
        }
        else{
            return "No existe libro con este codigo";
        }
    }
    //-------------------------------------------
    public void borrarPorCodigo(String codigo){
        if(buscarCodigo(codigo)!=null){
        libros.remove( buscarCodigo(codigo));
        }
        else{
            System.out.println("El libro que se quiere borrar no existe!!");
        }
    }
    //-------------------------------------------
    public void borrarPorTipo(int tipo){
        List<Libro> recorrido=buscarTipo(tipo);
        for(int i=0;i<recorrido.size();i++){
            libros.remove(recorrido.get(i));
        }
        System.out.println("!!Borrados con exito");
    }
    
    public void guardar() throws InterruptedException, FileNotFoundException, IOException{
        f = new File("archivoMaster.xml");
        String fichero = "archivoMaster.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
        for (int i = 0; i <aux.size(); i++)
        {
            oos.writeObject(aux.get(i));
        }
        oos.close();
       /*try{
            JAXBContext ctx = JAXBContext.newInstance(this.getClass());
           //realiza la conversion de obj java a xml
            Marshaller ma = ctx.createMarshaller();
            // prepara formato de archivo xml
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            ma.marshal(this,f);
             System.out.println("Archivo master creado con exito!");
        }catch(JAXBException e){
            System.out.println("Error: "+e.getCause());
            Thread.sleep(1000);
        }*/
    }
     public void recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
         String fichero = "archivoMaster.txt";
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
         Object obj = ois.readObject();
           
        // Mientras haya objetos
        while (obj!=null)
        {
            if (obj instanceof Libros)
            obj = ois.readObject();
            
        }
        ois.close();
       /*try{
           JAXBContext ctx = JAXBContext.newInstance(this.getClass());
           Unmarshaller um = ctx.createUnmarshaller();
           Libros lib = (Libros) um.unmarshal(f);
                
           for(int i = 0; i < libros.size();i++){
               this.AgregarLibro(lib.getAux().get(i));
               this.AddLibroToList(lib.getAux().get(i));
           }
           
           }catch(JAXBException e){}*/
          
    }
    
    
    
}
