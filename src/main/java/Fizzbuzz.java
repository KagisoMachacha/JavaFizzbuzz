public class Fizzbuzz {
    public static String process(int i) {
        boolean divisibleBy3 = (i % 3 == 0);
        boolean divisibleBy5 = (i % 5 == 0);

        if (divisibleBy3 && divisibleBy5){
            return "FizzBuzz";
        }

        else if (divisibleBy3){
            return "Fizz";
        }

        else if (divisibleBy5){
            return "Buzz";
        }

        return String.valueOf(i);
    }
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            String msg = process(i);
            System.out.println(msg);
        }
    }
}

