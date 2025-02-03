
package edu.unisabana.pizzafactory.model.PizzaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.factories.MoldeadorFactory;

/**
 *
 * @author cesarvefe
 */
public class MoldeadorPizzaIntegral implements MoldeadorFactory {
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }
    @Override
    public void molderarPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
