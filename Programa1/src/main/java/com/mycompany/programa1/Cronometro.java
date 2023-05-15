
package com.mycompany.programa1;

import java.util.Timer;

/**
 *
 * @author carlossalcidoa
 */
public class Cronometro {
    private Timer timer = new Timer();
    
    public void largarCrono(int tiempo){
        TareaAEjecutar tae = new TareaAEjecutar(timer);
        timer.schedule(tae, tiempo * 1000,100);
    }
}
