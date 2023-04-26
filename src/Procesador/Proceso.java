/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesador;

/**
 *
 * @author andre
 */
public class Proceso {
 
    private String name;
    private int time;
    private Proceso sig_proceso;
    
    public Proceso(String id)
    {
        this.name= id;
        // Aqui se puede definir el rango de tiempo
        this.time= (int)((Math.random()* 10) + 5);
        this.sig_proceso = null;
    }

    Proceso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String get_Nombre()
    {
        return this.name ;
    }
    
      public int get_Tiempo()
    {
        return this.time ;
    }
      
      public Proceso get_Next()
      {
          return this.sig_proceso;
      }
         public void set_Next(Proceso sig)
      {
          this.sig_proceso = sig;
      }
      
}
