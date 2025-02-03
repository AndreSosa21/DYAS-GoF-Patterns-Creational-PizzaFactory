package edu.unisabana.factories;

import edu.unisabana.pizzafactory.model.PizzaDelgada.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgada.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaGruesa.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.PizzaGruesa.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.PizzaGruesa.MoldeadorPizzaGruesa;

public class PizzaGruesaFactory implements PizzaFactory {

     @Override
    public AmasadorFactory creaAmasadorFactory() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public MoldeadorFactory creaMoldeadorFactory() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public HorneadorFactory creaHorneadorFactory() {
        return new HorneadorPizzaGruesa();
        
    
    }
    
}
