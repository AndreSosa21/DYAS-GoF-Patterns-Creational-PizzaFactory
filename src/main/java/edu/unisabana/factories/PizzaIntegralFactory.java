package edu.unisabana.factories;

import edu.unisabana.pizzafactory.model.PizzaDelgada.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaIntegral.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.PizzaIntegral.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.PizzaIntegral.MoldeadorPizzaIntegral;

public class PizzaIntegralFactory implements PizzaFactory {

     @Override
    public AmasadorFactory creaAmasadorFactory() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public MoldeadorFactory creaMoldeadorFactory() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public HorneadorFactory creaHorneadorFactory() {
        return new HorneadorPizzaIntegral();
        
    
    }
    
}
