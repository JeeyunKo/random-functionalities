public class testingRandomFunctionalities {

    public static void main(String[] args) {

        RandomFunctionalities functions = new RandomFunctionalities();

        /*function putTogether*/
        System.out.println(functions.putTogether("concatenate", "everything"));
        System.out.println(functions.putTogether("control", "under"));
        System.out.println(functions.putTogether("pencil", "lead"));
        System.out.println();


        /*function swapThree*/
        System.out.println(functions.SwapThree("redundancy"));
        System.out.println(functions.SwapThree("pen"));
        System.out.println(functions.SwapThree("be"));
        System.out.println();

        /*function overEleven*/
        System.out.println(functions.overEleven(1, 2, 34));
        System.out.println(functions.overEleven(1, 2, 3));
        System.out.println(functions.overEleven(15, 0, 4));
        System.out.println(functions.overEleven(45, 99, 12));
        System.out.println();

        /*function isOdd*/
        System.out.println(functions.isOdd(456));
        System.out.println(functions.isOdd(0));
        System.out.println(functions.isOdd(233));
        System.out.println();

        /*function isEven*/
        System.out.println(functions.isEven(456));
        System.out.println(functions.isEven(0));
        System.out.println(functions.isEven(233));
        System.out.println();

        /*function twentyOne*/
        System.out.println(functions.twentyOne(19, 23));
        System.out.println(functions.twentyOne(21, 17));
        System.out.println(functions.twentyOne(18, 20));
        System.out.println(functions.twentyOne(21, 21));
        System.out.println(functions.twentyOne(24, 24));

    }
}
