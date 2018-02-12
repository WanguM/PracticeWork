import jdk.nashorn.api.tree.WhileLoopTree;

public class Example_While {

    public static void main(String[] args) {

        int x = 5;

        while (x <= 10) {
            System.out.println("x=" + x);
            x++;
        }
    }
}