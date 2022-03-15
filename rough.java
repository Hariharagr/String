package com.company;

import java.io.*;

public class Main{
                
                 static String s1,s2,s3,s4;
                
                  public static void main (String [] args) throws FileNotFoundException {
                   if(args.length < 3) {
                       
                          switch (args.length) { 
                                                 case 0:{
                                                          if(args[0].equalsIgnoreCase("showlogs"))
                                                          {
                                                              showlog();
                                                          }
                                                          else if(args[0].equalsIgnoreCase("description") ){
                                                            description();  
                                                         }
                                                 case 1: {
                                                          s1 = args[0];
                                                          s2 = args[1];
                                                           }}}
                   
                   
                    else
                     {
                     System.out.println("task name is too large");
                     }
                     m1(s1, s2);
                     File f = new File("abc.txt")
    } 
                    
     static void m1(String s1, String s2) throws FileNotFoundException {
    
        if (s2.equalsIgnoreCase("start")){
            System.out.println(s1);
           long time =System.currentTimeMillis();
            System.out.println(time);
              describestart(time);
        }
            
        else if (s2.equalsIgnoreCase("stop")){
            System.out.println(s1);
            long timeforstop = System.currentTimeMillis());
            describestart(timeforstop);}
            
            
        }
           static void describestart(long t) throws FileNotFoundException {
               System.out.println("the log time " + s1 + t);
               PrintWriter p = new PrintWriter("abc.txt");
                p.println(t);
              
           }
           static void describestop(long t) throws IOException {
               System.out.println("the log time " + s1 + t);
               PrintWriter p = new PrintWriter("abc.txt");
               p.println(t);
           }
          static void showlog() throws IOException {
                   BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
                   String ss =br.readLine();
                   System.out.println(ss);
               }
                  }
                  
          
          
          
          
          
          
          
          
          
                      
      }  
}
