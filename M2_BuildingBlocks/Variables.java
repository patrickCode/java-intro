package M2_BuildingBlocks;

public class Variables {
    public static void main(String[] args) {
        int num_1, num_2; // 2 variables by the name of num_1 and num_2 has been declared but not initialized - Declaration
        num_1 = 1; // Value of one of the previously declared is assigned
        num_1 = 10; //The previosly assigned value is overwritten by the new value
        num_2 = 12;
        int num_3 = 15; // 1 variable of type integer is initialized (Declared + Assigned) - Initialization

        int sum = num_1 + num_2 + num_3; // Values stored in the previously declared variables are used and added. The value is stored in another integer type variable
        System.out.println(sum); // Printing the result of the sum

        double divide = num_2 / num_1; // Since dividing 2 integers will produce a decimal number (precision), the result is stored on a variable of double type
        System.out.println(divide);

        double p_num_1 = num_1; // Automatic Type casting - Assigning the value of an integer into a decimal type
        double p_num_2 = num_2;
        divide = p_num_2 / p_num_1;
        System.out.println(divide);

        int divide_int = (int)divide; // Manual Type Casting (Coercion) - Narrowing the data type (lose precision along the way)
        System.out.println(divide_int);
    }
}
