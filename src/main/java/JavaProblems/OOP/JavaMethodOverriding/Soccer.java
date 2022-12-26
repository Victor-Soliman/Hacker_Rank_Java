package JavaProblems.OOP.JavaMethodOverriding;

class Soccer extends Sport {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }

//    void getSomthing() {
//        System.out.println("Somthing");
//    }
}
