package com.mycompany.programa2;


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
    int ttrans;
    
    public Proceso(String nombre, int numero1, String operacion, int numero2, String ID, int tiempo, int ttrans){
        this.nombre=nombre;
        this.numero1=numero1;
        this.operacion=operacion;
        this.numero2=numero2;
        this.ID=ID;
        this.tiempo=tiempo;
        this.ttrans=ttrans;
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
    public int getTtrans() {
        return ttrans;
    }

    public void setTtrans(int ttrans) {
        this.ttrans = ttrans;
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
    public int ImprimirTtrans(){
        return this.numero2;
    } 
}
