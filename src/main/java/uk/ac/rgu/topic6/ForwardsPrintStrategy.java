package uk.ac.rgu.topic6;

public class ForwardsPrintStrategy implements PrintStrategy{

    @Override
    public void print(String[] values) {
        /* An enhanced for-loop instead of using int i=0 etc. */
        for(String value : values){
            System.out.println(value);
        }
        
    }
    
}
