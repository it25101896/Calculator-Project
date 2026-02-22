public class Calculator{
    public int add(int a, int b){
        return a+b;
}
    public int multiply(int a, int b){
    return a*b;
}
    public int square(int num){
    return num*num;
}

    public static void main(String[]args) {

        Calculator calc = new Calculator();

        int part1A = calc.multiply(3, 4);
        int part1B = calc.multiply(5, 7);
        int sum1 = calc.add(part1A, part1B);
        int result1 = calc.square(sum1);

        System.out.println("Result 1:(3*4+5*7)^2= " + result1);

        int sum2A = calc.add(4, 7);
        int sum2B = calc.add(8, 3);
        int square2A = calc.square(sum2A);
        int square2B = calc.square(sum2B);
        int result2 = calc.add(square2A, square2B);

        System.out.println("Result 2: (4+7)^2+(8+3)^2 =" + result2);

    }

    }