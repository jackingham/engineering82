package com.sparta.jack;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final Logger logger = LogManager.getLogger(App.class);

    public static void runExceptions(){
        int number = 20, divisor = 0;
        try {
            int quotient = number/divisor;
        } catch(ArithmeticException e){
            logger.error(e.getMessage(), e);
        } catch (Exception e){
            logger.error(e);
        }
    }

    public static void main( String[] args )
    {
        runExceptions();
    }
}
