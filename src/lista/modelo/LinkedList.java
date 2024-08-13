/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.modelo;

import java.util.Iterator;

/**
 *
 * @author borisperezg
 */
public class LinkedList implements Iterator{
    
    // Ignorar por ahora, es para manejar iteradores
    private Node first;
    
    private Node head;
    private int size;
    
    /**
     * Agrega el nodo de manera ordenada en la lista.
     * Agrega de forma ascendente.
     * @param value 
     */
    public void addSorted(int value){
        
    }
    
    /**
     * Agrega el nodo en la última posición
     * @param value 
     */
    public void addLast(int value){
        
    }
    
    /**
     * Busca el nodo con el valor value y lo reemplaza
     * por el valor newValue
     * @param value
     * @param newValue 
     */
    public void update(int value, int newValue){
        
    }
    
    /**
     * Retorna verdadero si encuentra el nodo en la lista
     * @param value
     * @return 
     */
    public boolean find(int value){
        return false;
    }
    
    /**
     * Busca el nodo y lo elimina.
     * Si no lo encuentra, no pasa nada.
     * @param value 
     */
    public void delete(int value){
        
    }
    
    public int getSize(){
        return size;
    }
    
    /**
     * Retorna un string de la forma 
     * [valor1]->[valor2]->[valor3]
     * los corchetes y flechas son strings
     * los valores corresponden al contenido del nodo
     * Importante, no imprime en consola, debe retornar.
     * @return 
     */
    public String print(){
        String lista = "";
        
        // Contenido de ejemplo
        lista = "["+3+"]->["+6+"]->["+9+"]->["+15+"]";
        
        return lista;
    }

    // //////////////////////////////////////////
    // //////////////////////////////////////////
    // IGNORAR POR AHORA, ES PARA CUANDO SE VEA ITERADORES
    // //////////////////////////////////////////
    // //////////////////////////////////////////    
    
    @Override
    public boolean hasNext() {
        // TODO Implementar
        return false;
    }

    @Override
    public Object next() {
        // TODO Implementar
        return null;
    }
    
    public Iterator iterator( ) { 
        return null;
    
    }
    
}
