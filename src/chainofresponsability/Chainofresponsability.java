package chainofresponsability;

/**
 *
 * @author daeperdomocr
 */

public class Chainofresponsability {
    private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);

      return errorLogger;	
   }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        CarFactory carFactory = new CarFactory();
        
        Car audi = carFactory.getCar("AUDI");
        Car Mercedes = carFactory.getCar("MERCEDES");
        Car mclaren = carFactory.getCar("MCLAREN");
                
        Car audifull = new  RinDecorator(carFactory.getCar("AUDI"));
        Car mercedesfull = new  RinDecorator(carFactory.getCar("MERCEDES"));
     
        loggerChain.logMessage(AbstractLogger.INFO,"Audi with normal rin");
        audi.process();

        loggerChain.logMessage(AbstractLogger.INFO,"Audi with deluxe rin");
        audifull.process();
        
        loggerChain.logMessage(AbstractLogger.INFO,"Mercedes with deluxe rin");
        mercedesfull.process(); 
        
        loggerChain.logMessage(AbstractLogger.INFO,"Mclaren with normal rin");
        mclaren.process();
        
    }    
}
