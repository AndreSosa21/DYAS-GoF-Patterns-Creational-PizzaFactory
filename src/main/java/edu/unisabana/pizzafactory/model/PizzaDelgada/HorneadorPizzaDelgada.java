
package edu.unisabana.pizzafactory.model.PizzaDelgada;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.factories.HorneadorFactory;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaDelgada implements HorneadorFactory {
    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
