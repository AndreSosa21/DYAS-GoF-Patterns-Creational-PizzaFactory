
package edu.unisabana.pizzafactory.model.PizzaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.factories.HorneadorFactory;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaIntegral implements HorneadorFactory {
    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
