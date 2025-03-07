import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand_gen;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        rand_gen = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void printOneRandom()
    {
        System.out.println("New interger: " + rand_gen.nextInt(100));
    }
    
    public void printMultiRandom(int howMany)
    {
        int count = 0;
        while (count < howMany){
            printOneRandom();
            count++;
        }
    }
    
    public void throwDice()
    {
        int output = rand_gen.nextInt(7);
        
        if(output > 0)
        { 
          System.out.println("Roll Result: " + output);
        }
    }
}
