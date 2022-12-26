package JavaProblems.OOP.JavaMethodOverriding;

public class JavaMethodOverriding {
    public static void main(String[] args) {
        Sport s = new Sport();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();

        Soccer ss = new Soccer();
        System.out.println(ss.getName());
        ss.getNumberOfTeamMembers();

//        Sport sport = new Soccer();
//        System.out.println(sport.getName());
//        sport.getNumberOfTeamMembers();
    }
}
