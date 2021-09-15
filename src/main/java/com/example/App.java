package com.example;

import com.example.logging.Log;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Log4j2 Test");

        Boolean status = Log.setupLogging("log4j2");

        if(!status){
            System.out.print("Log setup failed. Quitting");
            return;
        }

        wait(1000);

        Log.logError("This is an error");
        Log.logTrace("This is a trace message");
        Log.logDebug("This is a debug message");

        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to quit...");
        input.nextLine();  
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
