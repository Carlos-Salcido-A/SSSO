package com.mycompany.programa1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class Proceso {
    //ArrayList <Proceso> procesos = new ArrayList<>();
    //Proceso listaProcesos[] = new Proceso[30];
    String nombre;
    int numero1;
    String operacion;
    int numero2;
    String ID;
    int tiempo;
    
    public Proceso(String nombre, int numero1, String operacion, int numero2, String ID, int tiempo){
        this.nombre=nombre;
        this.numero1=numero1;
        this.operacion=operacion;
        this.numero2=numero2;
        this.ID=ID;
        this.tiempo=tiempo;
    }

    Proceso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
 
    public String ImprimirNombre(){
        return this.nombre;
    }
    public String ImprimirId(){
        return this.ID;
    } 
    public String ImprimirOperacion(){
        return this.operacion;
    } 
    public int ImprimirTiempo(){
        return this.tiempo;
    } 
    public int ImprimirNum1(){
        return this.numero1;
    } 
    public int ImprimirNum2(){
        return this.numero2;
    } 
    
    
    
    public void insertarInfo(String nombre, int num1, String operacion, int num2, String id, int tiempo, int cont){
        
        /*procesos.add("nombre", 1, "operacion", 2, "id", 0);//[10] = new Proceso("nombre", 1, "operacion", 2, "id", 0);
        
        listaProcesos[cont] = new Proceso(nombre, num1, operacion, num2, id, tiempo);
        JOptionPane.showMessageDialog(null, "AAAAAAAAABC");
        System.out.println("owoowowow");
        System.out.println(listaProcesos[10].ImprimirNombre());
        System.out.println(listaProcesos[cont].ImprimirNombre());
        System.out.println("owoowowow");*/
    }
    
    public DefaultTableModel LoteTrabajando(){/*
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Tiempo");
        Object[] ob = new Object[2];
        //ob[0]= "aa";
        //ob[1]= "bbb";
        ob[0]= listaProcesos[10].ImprimirNombre();
        ob[1]= listaProcesos[10].ImprimirTiempo();
        //System.out.println(listaProcesos[10].ImprimirNombre());

        //String variable1 = listaProcesos[0].ImprimirNombre();
        //String variable2 = Integer.toString(listaProcesos[0].ImprimirTiempo());
        //System.out.println(variable1);
        //System.out.println(variable2);
        
        model.addRow(ob);
        
        return model;*/
        return null;
    }
    
    
}
