
package com.mycompany.programa1;

import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author carlossalcidoa
 */
public class TareaAEjecutar extends TimerTask{
    private Timer ti;
    public TareaAEjecutar(Timer ti){
        this.ti = ti;
    }
    
    
    @Override
    public void run() {
        System.out.println("AAAAA");
        //ti.cancel();
    }
     
}
