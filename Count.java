//question 4
//Write a java program to count the number of digits in a number.


public class Count {

    public static void main(String[] args) {

        int count = 0, num = 0003452;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}