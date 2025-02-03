
package edu.unisabana.pizzafactory.consoleview;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.factories.AmasadorFactory;
import edu.unisabana.factories.HorneadorFactory;
import edu.unisabana.factories.MoldeadorFactory;
import edu.unisabana.factories.PizzaDelgadaFactory;
import edu.unisabana.factories.PizzaFactory;
import edu.unisabana.factories.PizzaGruesaFactory;
import edu.unisabana.factories.PizzaIntegralFactory;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();            
            pp.prepararPizza(ingredientes, Tamano.PEQUENO, "delgada");
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, String tipo)
            throws ExcepcionParametrosInvalidos {
                PizzaFactory fabrica = null;

                // Seleccionar la fábrica según el tipo de masa
                if (tipo.equals("delgada")) {
                    fabrica = new PizzaDelgadaFactory();
                } else if (tipo.equals("gruesa")) {
                    fabrica = new PizzaGruesaFactory(); // Se debe implementar
                } else if (tipo.equals("integral")) {
                    fabrica = new PizzaIntegralFactory(); // Se debe implementar
                } else {
                    throw new ExcepcionParametrosInvalidos("Tipo de masa invalido: " + tipo);
                }
        
                // Crear los productos usando la fábrica seleccionada
                AmasadorFactory am = fabrica.creaAmasadorFactory();
                HorneadorFactory hpd = fabrica.creaHorneadorFactory();
                MoldeadorFactory mp = fabrica.creaMoldeadorFactory();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
