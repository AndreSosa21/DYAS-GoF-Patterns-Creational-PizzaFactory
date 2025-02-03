package edu.unisabana.factories;

import edu.unisabana.pizzafactory.model.PizzaDelgada.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.MoldeadorPizzaDelgada;

public class PizzaGruesaFactory implements PizzaFactory {

     @Override
    public AmasadorFactory creaAmasadorFactory() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public MoldeadorFactory creaMoldeadorFactory() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public HorneadorFactory creaHorneadorFactory() {
        return new HorneadorPizzaDelgada();
        
    
    }
    
}
