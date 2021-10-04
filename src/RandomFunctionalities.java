public class RandomFunctionalities {

    /*this method returns the first and second word together*/
    public String putTogether(String firstWord, String secondWord) {

        //check if the first word's last character and second word's first character are equal
        if (firstWord.charAt(firstWord.length()-1) == (secondWord.charAt(0))) {
            //if equal, append the second word to the first word starting from index 1 instead of 0
            return firstWord.concat(secondWord.substring(1));
        }
        else {
            return firstWord.concat(secondWord);
        }
    }

    /*this method returns the word with the last three letters in reverse order*/
    public String SwapThree(String word) {

        //one character word will return the word itself
        if (word.length() <= 1) {
            return word;
        }
        //two character word will return the last character and then the first character
        if (word.length() == 2) {
            return "" + word.charAt(1) + word.charAt(0);
        }

        //words that are more than or equal to three characters will reverse the last three characters
        //and return the word with only the last three reversed
        String lastThreeChar = word.substring(word.length() - 3);
        StringBuilder reversedWord = new StringBuilder(lastThreeChar).reverse();
        return word.substring(0, word.length() - 3)+ reversedWord;
    }

    /*this method returns true if any one of the three integers is greater than the sum of the other two by 11 or more*/
    public Boolean overEleven(int first, int second, int third) {

        //check the three possible ways to return true
        if (first + second + 11 <= third || first + third + 11 <= second || second + third + 11 <= first) {
            return true;
        }

        return false;
    }

    /*this method returns true if the number is an odd number and false when otherwise*/
    public Boolean isOdd(int number) {

        if (number % 2 == 1) {
            return true;
        }

        return false;
    }

    /*this method returns true if the number is an even number and false when otherwise*/
    public Boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

    /*this method returns the number that is close to twenty-one or equal to twenty-one without going over*/
    public int twentyOne(int firstNumber, int secondNumber) {

        //if both numbers are equal to one another, return -1
        if (firstNumber == secondNumber) {
            return -1;
        }
        //if both numbers go over 21, return -1
        else if (firstNumber > 21 && secondNumber > 21) {
            return -1;
        }
        //any number that is closer to 21 will be returned
        if (java.lang.Math.abs(firstNumber - 21) < (java.lang.Math.abs(secondNumber - 21))) {

            return firstNumber;
        }
        return secondNumber;
    }
}
