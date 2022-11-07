package uk.ac.rgu.topic6;

public class App {
    
    private Logger logger;

    /* Declaring and populating an array on one line */
    private String[] words = {"aberdeen", "computer", "amphibian", "mouse"};

    public static void main(String[] args){

        /* Singleton demo below */

        /* Create an instance of App that we will use in the demos */
        App app = new App();

        /* Get the Singleton instance of VerboseLogger */
        Logger verbose1 = VerboseLogger.getInstance();
        app.setLogger(verbose1);
        
        app.doSomething(); //causes a message to be printed by the VerboseLogger

        /* Let's get the VerboseLogger again, this time storing in a different variable */
        Logger verbose2 = VerboseLogger.getInstance();
        app.setLogger(verbose2); // overwrite the existing logger

        app.doSomething(); //causes a message again...but watch the value of the numTimesCalled field

        /* We can also use a diferent logger, thanks to the interface... */
        Logger error = ErrorLogger.getInstance();
        app.setLogger(error);

        app.doSomething(); //causes another message...but watch out for the bit at the start

        /* Command demo below */

        Command[] commands = new Command[5];

        /* We can create a Command from a full-blown class implementation */
        Car car = new Car();
        CarStartCommand command1 = new CarStartCommand(car);
        commands[0] = command1;

        /* Or, more commonly, we use a method reference */
        Computer computer = new Computer();
        Command command2 = computer::turnOn;
        commands[1] = command2;

        commands[0].execute();
        commands[1].execute();

        /* Strategy demo below */
        App app3 = new App();

        /* Create an instance of ForwardsPrintStrategy */
        ForwardsPrintStrategy strategy1 = new ForwardsPrintStrategy();
        app.printWords(strategy1);

        /* Or we can use a lambda expression */

        PrintStrategy strategy2 = (values) -> {
            /* Backwards for-loop */
            for(int i=values.length-1; i>=0;i--){
                System.out.print(values[i]);
            }
        };
        app.printWords(strategy2);
    }

    public void printWords(PrintStrategy strategy){
        strategy.print(this.words);
    }

    public void doSomething(){
        if(this.logger != null){
            this.logger.log("doSomething() method called");
        }
    }

    public void setLogger(Logger logger){
        this.logger = logger;
    }

}
