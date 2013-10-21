import java.util.*;
/**
 * Write a description of class Population here.
 * 
 * @author (Dann Luciano) 
 * @version (0.0.1)
 */
public class Population
{
    List <Individual> population;
    
    public Population(int population_size) {
        this.population = new ArrayList<Individual>(population_size);
        for(int i = 0; i < population_size; i++) {
            this.population.add(new Individual());
        }
    }
    
    public double crossover(int index1, int index2) {
        return (population.get(index1).getCromossome() + 
                population.get(index2).getCromossome()) / 
                2.0;
    }
    
    public double mutation(int index) {
        return population.get(index).getCromossome() * Math.random();
    }
}
