

import javax.swing.JOptionPane;



public class TestRoach {// @ main class TestRoach

    public TestRoach() {

    }

    public static void main(String[] args) {

    	
    	
    	RoachPopulation bugs = new RoachPopulation(10);//

        System.out.println("Initial Roach population = " + bugs.get_RoachCount());

        bugs.breed();
        
        System.out.println("The Roach population after cycle 1 breeding is:"+ bugs);
        
        bugs.spray(0.5);

        System.out.println("The Roach population after cycle 1 50 percent spraying is:"+ bugs);

        bugs.breed();
        
        System.out.println("The Roach population after cycle 2 breeding is:"+ bugs);

        bugs.spray(0.6);

        System.out.println("The Roach population after cycle 2 60 percent spraying is:"+ bugs);

        bugs.breed();
        
        System.out.println("The Roach population after cycle 3 breeding is:"+ bugs);

        bugs.spray(0.7);
        
        System.out.println("The Roach population after cycle 3 70 percent spraying is:"+ bugs);

        

        bugs.breed();
        
        System.out.println("The Roach population after cycle 4 breeding is:"+ bugs);

        bugs.spray(0.8);

        System.out.println("The Roach population after cycle 4 80 percent spraying is:" +bugs);

       

    }

}
