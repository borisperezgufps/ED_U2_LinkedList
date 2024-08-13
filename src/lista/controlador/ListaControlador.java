/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.controlador;

import javax.swing.JOptionPane;
import lista.modelo.LinkedList;
import lista.vista.ListaVista;
/**
 *
 * @author borisperezg
 */
public class ListaControlador {
    
    private ListaVista frame;
    private LinkedList negocio;

    public ListaControlador(ListaVista frame) {
        this.frame = frame;
        negocio = new LinkedList();
    }
    
    public void addLast(){
        try{
            int value = Integer.parseInt(frame.getTxtValor().getText());
            boolean isSorted = frame.getRbnSorted().isSelected();
            if(isSorted)
                negocio.addSorted(value);
            else
                negocio.addLast(value);

            showListInTextArea();
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Debe ingresar un número");
        }
    }
    
    public void update(){
        try{
            int value = Integer.parseInt(frame.getTxtValor().getText());
            int newValue = Integer.parseInt(frame.getTxtValorNuevo().getText());
            
            negocio.update(value, newValue);
            
            showListInTextArea();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Debe ingresar un número en ambos campos");
        }        
    }
    
    public void find(){
        try{
            int value = Integer.parseInt(frame.getTxtValor().getText());
            
            boolean found = negocio.find(value);
            if(found)
                JOptionPane.showMessageDialog(frame, "Se encontró el nodo");
            else
                JOptionPane.showMessageDialog(frame, "No se encontró el nodo");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Debe ingresar un número en ambos campos");
        } 
       
    }
    
    public void delete(){
        try{
            int value = Integer.parseInt(frame.getTxtValor().getText());
            
            negocio.delete(value);
            
            showListInTextArea();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Debe ingresar un número en ambos campos");
        } 
    }
    
    private void showListInTextArea(){
        String listaString = negocio.print();
        frame.getTaVisualizacion().setText(listaString);
    }
    
}
