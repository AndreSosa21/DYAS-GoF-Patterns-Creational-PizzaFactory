
package edu.unisabana.pizzafactory.model.PizzaGruesa;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.factories.HorneadorFactory;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaGruesa implements HorneadorFactory {
    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza gruesa.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
