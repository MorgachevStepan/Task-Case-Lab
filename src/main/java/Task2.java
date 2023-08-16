import java.util.Scanner;

/**
 * @author Stepan Morgachev
 * @date 16.08.2023 21:22
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntWrapper intWrapper1 = new IntWrapper(scanner.nextInt());
        IntWrapper intWrapper2 = new IntWrapper(scanner.nextInt());

        swapWithWrapperClass(intWrapper1, intWrapper2);

        System.out.println(intWrapper1 + " " + intWrapper2);
    }

    public static void swapWithWrapperClass(IntWrapper a, IntWrapper b){
        a.value = a.value + b.value;
        b.value = a.value - b.value;
        a.value = a.value - b.value;
    }

    static class IntWrapper{
        public int value;

        public IntWrapper(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "IntWrapper{" +
                    "value=" + value +
                    '}';
        }
    }
}
