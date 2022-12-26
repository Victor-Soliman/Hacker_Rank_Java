package JavaProblems.OOP.JavaInstanceofKeyword;

import java.util.ArrayList;
import java.util.Scanner;

import static JavaProblems.OOP.JavaInstanceofKeyword.InstanceOFTutorial.count;

public class JavaInstanceof {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}

class Student{}
class Rockstar{}
class Hacker{}
