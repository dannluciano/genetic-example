
/**
 * Write a description of class Individual here.
 * 
 * @author (Dann Luciano) 
 * @version (0.0.1)
 */
public class Individual {
    private double cromossome;
    
    public Individual(double cromossome) {
        this.cromossome = cromossome;
    }
    
    public Individual() {
        this.cromossome = Math.random();
    }
    
    public double getCromossome() {
        return this.cromossome;
    }
    
    public double evaluate() {
        return Math.pow(this.cromossome, 2);
    }
    
}
