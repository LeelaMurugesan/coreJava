package com.chainsys.threads;
public class CurrentTH {
    public static void main(String args[])
    {
     try{
         Thread t1=Thread.currentThread();
         System.out.println("Th ID: " +t1.getId() );
         System.out.println("Th State: " +t1.getState() );
         System.out.println("Th Priority: " +t1.getPriority());
         System.out.println("Th ISAlive: " +t1.isAlive());
         System.out.println("Th Max Priority: " +Thread.MAX_PRIORITY);
         System.out.println("Th Min priority: " +Thread.MIN_PRIORITY);
     }
catch(Exception e)
     {
         System.out.println(e.getMessage());
     }
    }
}
// a thread that is STOPPED can not be restarted, isAlive will be false
// Threads are created,managed,executed and stopped by the OS.

