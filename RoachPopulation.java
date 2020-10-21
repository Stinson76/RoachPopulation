import java.text.DecimalFormat;

/**
 * 
 * @author Cedestinson Ductan
 *
 */


public class RoachPopulation {

    private double countRoach;

    public RoachPopulation(double num) {

        countRoach = num;// variable to track roach population
        
       

    }

    public double get_RoachCount() { // @ get_RoachCount take an initial amount of the roach population.

        return countRoach;

    }

    public void breed() {   //@ breed method double size of population 

        countRoach = countRoach*2;

    }
    
   

    public void spray(double percent) {  //@ spray method decreases the size of roach population by percentage.

    	 double sizePercent = percent*countRoach;  //determine size of percent that needs subtracted from roach population 
        
    	 countRoach = countRoach  - sizePercent;  //Subtract percentage size from the roach population 
        

    }
   
    
    DecimalFormat decFormat = new DecimalFormat("0.");
    
    public String toString() {   //returns roach population size after all the cycles.

        return "Roach Count = " + decFormat.format(countRoach);

    }

}
