package JavaProblems.Advanced.JavaVarargs;

public class Add {
    public void add(int... number) {
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        for (int temp : number) {
            builder.append(temp).append("+");
            sum += temp;

        }
        System.out.println(builder.substring(0, builder.length()-1) + "=" + sum);

    }
}
