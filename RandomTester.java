import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand_gen;
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("probably");
        responses.add("unlikely");
        responses.add("don't know");
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
    
    public int throwDice()
    {
        return rand_gen.nextInt(6)+1;
    }
    
    public String getResponse() 
    {
        int choice = rand_gen.nextInt(3);
                
        if (choice == 0)
        {
            return "yes";
        }
        else if (choice == 1)
        {
            return "no";
        }
        else
        {
            return "maybe";
        } 
    }
    
    public String getResponse2() 
    {
        int choice = rand_gen.nextInt(responses.size());
        return responses.get(choice);        
    }
    
    public int printRandomFromMax(int max)
    {
        return rand_gen.nextInt(max) + 1;
    }
}
