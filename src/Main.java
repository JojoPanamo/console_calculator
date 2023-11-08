import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        String toDo;

        a = input.nextInt();
        b = input.nextInt();
        toDo = input.next();

        if(toDo.equals("+")){
            c = a+b;
            System.out.println(c);
        } else if (toDo.equals("-")) {
            c = a-b;
            System.out.println(c);
        } else if (toDo.equals("*")) {
            c = a*b;
            System.out.println(c);
        } else if (toDo.equals("/")) {
            c = a/b;
            System.out.println(c);
        }
    }
}