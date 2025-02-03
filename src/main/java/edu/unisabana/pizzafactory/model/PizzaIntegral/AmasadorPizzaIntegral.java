
package edu.unisabana.pizzafactory.model.PizzaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.factories.AmasadorFactory;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaIntegral implements AmasadorFactory{
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
