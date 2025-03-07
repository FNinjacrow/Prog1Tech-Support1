import java.util.Random;
import java.util.ArrayList;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random rand_gen;
    private ArrayList<String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        
        responses.add("That sounds interesting. Tell me more...");
        responses.add("Have you tried turning it off and on again?");
        responses.add("Sorry. I can't help you with that.");
        responses.add("I've never heard a problem like that one before.");
        responses.add("I'll have to check on that.");
        responses.add("I'm not paid enough to answer that.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
    
    public String fillResponses()
    {
        int choice = rand_gen.nextInt(responses.size());
        return responses.get(choice);     
    }
}
