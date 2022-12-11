import java.util.Scanner;
class Person
{
    String name;
    int age;
    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
class Trapezoid
{
    private static int upperBase;
    private static int  lowerBase;
    public Trapezoid(int upper, int lower)
    {
        upperBase = upper;
        lowerBase = lower;
    }
    public static double СalculationOfHalfSumOfBasesOfTrapezoid()
    {
        return (upperBase + lowerBase)/2.0;
    }
}
public class Main {
    public static void main(String[] args)
    {
        int[] numbers = new int[4];
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 5;
        numbers[3] = 7;
        System.out.println(numbers[0]&numbers[1]);
        System.out.println(numbers[2]&numbers[3]);
        System.out.println();
    }
    private static int CountDigit (int number)
    {
        int result = 0;
        String convertNumber = String.valueOf(number);
        for (int i = 0; i< convertNumber.length(); i++)
        {
            result++;
        }
        return result;
    }
    public static int Multiplate()
    {
        int number1 = 5;
        int number2 = 6;
        int result = number1/number2;
        System.out.printf("number1=%d, number2=%d, result=%d",number1, number2, result);
        return result;
    }
    private static void sum(int number1, int number2)
    {
        int result = number1 + number2;
        System.out.println(result);
    }
    public static void Array()
    {
        int[][] numbers = new int[][]
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j <numbers[i].length; j++)
            {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }
    }
    public static void Chicle()
    {
        int j = 8;
        do{
            System.out.println(j);
            j--;
        }
        while (j >0);
    }
    public static void BinoryManipulate()
    {
        int[] numbers = new int[4];
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 4;
        numbers[3] = 5;
        System.out.println(numbers[0]&numbers[1]);
        System.out.println(numbers[2]&numbers[3]);
    }

    public static void SetGetYourNameAgeHeight()
    {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        float height = in.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
        in.close();
    }

}