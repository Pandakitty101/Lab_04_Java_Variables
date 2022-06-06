public class main {

    public static void main(String[] args)
    {
        int intOperandA = 7;
        int intOperandB = 1;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 3.5;
        double doubleOperandB = 2;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum of integers " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product of integers " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference of integers " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of " + intOperandA + " divided by " + intOperandB + " is " + intQuotient);
        System.out.println("The remainder of " + intOperandA + " divided by " + intOperandB + " is " + intModulo);

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient of " + doubleOperandA + " divided by " + doubleOperandB + " is " + doubleQuotient);
    }
}
