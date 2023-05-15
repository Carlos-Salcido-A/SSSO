package programa5;

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
    String resultado;
    int ttrans;
    int tllegada;
    int tfinalizacion;
    int tretorno;
    int trespuesta;
    int tespera;
    int tservicio;
    
    public Proceso(String nombre, int numero1, String operacion, int numero2, String ID, int tiempo, 
            int ttrans, int tllegada, int tfinalizacion, int tretorno, int trespuesta, int tespera, int tservicio,String resultado){
        this.nombre=nombre;
        this.numero1=numero1;
        this.operacion=operacion;
        this.numero2=numero2;
        this.ID=ID;
        this.tiempo=tiempo;
        this.ttrans=ttrans;
        this.tllegada=tllegada;
        this.tfinalizacion=tfinalizacion;
        this.tretorno=tretorno;
        this.trespuesta=trespuesta;
        this.tespera=tespera;
        this.tservicio=tservicio;
        this.resultado=resultado;
    }

    Proceso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //GETTERS AND SETTERS
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
 public int getTllegada() {
        return tllegada;
    }

    public void setTllegada(int tllegada) {
        this.tllegada = tllegada;
    }

    public int getTfinalizacion() {
        return tfinalizacion;
    }

    public void setTfinalizacion(int tfinalizacion) {
        this.tfinalizacion = tfinalizacion;
    }

    public int getTretorno() {
        return tretorno;
    }

    public void setTretorno(int tretorno) {
        this.tretorno = tretorno;
    }

    public int getTrespuesta() {
        return trespuesta;
    }

    public void setTrespuesta(int trespuesta) {
        this.trespuesta = trespuesta;
    }

    public int getTespera() {
        return tespera;
    }

    public void setTespera(int tespera) {
        this.tespera = tespera;
    }

    public int getTservicio() {
        return tservicio;
    }

    public void setTservicio(int tservicio) {
        this.tservicio = tservicio;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    //IMPRIMIR ATRIBUTOS
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
        return this.ttrans;
    } 
    public int ImprimirTllegada(){
        return this.tllegada;
    } 
    public int ImprimirTfinalizacion(){
        return this.tfinalizacion;
    } 
    public int ImprimirTretorno(){
        return this.tretorno;
    } 
    public int ImprimirTrespuesta(){
        return this.trespuesta;
    }
    public int ImprimirTespera(){
        return this.tespera;
    }
    public int ImprimirTservicio(){
        return this.tservicio;
    } 
    
}
