package JavaProblems.Advanced.String;

import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    // (\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])    : pattern for IP : it works for hacker rank
    // (0*(?:[0-9][0-9]?|[0-2][0-5][0-5]))     : pattern for IP: it does not work good for hacker rank
    // ([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-9][0-9]|25[0-5])    : pattern for IP: it does not work good for hacker rank
    /*
     [01]?\\d{1,2}   matches numbers 0-199.
     2[0-4]\\d       matches numbers 200-249
     25[0-5]         matches numbers 250-255
*/
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." + num + "." + num + "." + num ;
}