package com.company;

import java.io.*;

public class Main {
    static String s1, s2, s3, s4;
    public static void main(String[] args) throws IOException {
        if (args.length < 3) {
            switch (args.length) {
                case 0: {
                    if (args[0].equalsIgnoreCase("showlogs")) {
                        work.showlog();
                    } else if (args[0].equalsIgnoreCase("summary")) {
                        Summary.summary();
                    }
                }
                case 1: {
                    s1 = args[0];
                    s2 = args[1];
                }
            }


        } else {
            System.out.println("task name is too large");
        }
        work.m1(s1, s2);
        File f = new File("abc.txt");
    }

}
package com.company;

        import java.io.*;

public class work
{
    static String ss;
    public static void m1(String s1, String s2) throws FileNotFoundException {

        if (s2.equalsIgnoreCase("start")){
            System.out.println(s1);
            long time =System.currentTimeMillis();
            System.out.println(time);
            describestart(time); }

        else if (s2.equalsIgnoreCase("stop")){
            System.out.println(s1);
            long timeforstop = System.currentTimeMillis();
            describestart(timeforstop);}
    }

    public static void describestart(long t) throws FileNotFoundException {

        String s =("the start time of " + Main.s1 + t);
        PrintWriter p = new PrintWriter("abc.txt");
        p.println(s);

    }
    public static void describestop(long t) throws IOException {

        String s1 =  ("the stop time of " + Main.s1 + t);
        PrintWriter p = new PrintWriter("abc.txt");
        p.println(s1);
    }

    public static String showlog() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        if(br == null)
            System.out.println("no logs");
        while(br != null) {
            String ss =br.readLine();
            System.out.println(ss);
        }
        System.out.println(ss);
        return ss;
    }
}
class Summary{
    public static void summary() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        br.readLine();
        while( br != null){
            if( br.equals("the start time of")){
                for(int i = 17; i <100; i++){
                    br.
                }

            }
        }

    }
}

