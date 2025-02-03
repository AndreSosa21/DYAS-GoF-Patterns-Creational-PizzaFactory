package edu.unisabana.factories;

public interface PizzaFactory {
    AmasadorFactory creaAmasadorFactory();
    MoldeadorFactory creaMoldeadorFactory();
    HorneadorFactory creaHorneadorFactory();
}
