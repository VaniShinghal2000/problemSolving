package BasicOne;

public class BasicOne {

    //Reverse a string without using built-in functions.
    public static void ReverseString(){
        String providedString="vani";
        String reverseString="";
        for(int i=providedString.length()-1;i>=0;i--){
            reverseString=reverseString+providedString.charAt(i);


        }
        System.out.println(reverseString);



    }

    //Check if a string is a palindrome. //madam
    public static void IsPalindromeOrNot(){
        String toCheck="madam";
        String Empty="";
        for(int i=toCheck.length()-1;i>=0;i--) {
            Empty = Empty + toCheck.charAt(i);
        }

        if(toCheck.equals(Empty)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }


    //Swap two numbers without using a third variable.
    public static void SwapTwoNumbers(){

        int firstNumber=123;
        int secondNumber=245;
        System.out.println("Before Swapping numbers are : ");
        System.out.println("First Number : " +firstNumber + " Second number : "+ secondNumber);
        firstNumber = firstNumber+secondNumber;
        secondNumber=firstNumber-secondNumber;
        firstNumber=firstNumber-secondNumber;
        System.out.println("After Swapping numbers are : ");
        System.out.println("First Number : " +firstNumber + " Second number : "+ secondNumber);



    }


    //Count the number of vowels and consonants in a string.
    public static void countVowelsAndConsonants(){
        String givenString= "I am a good personooo";
        String withoutSpace=givenString.replace(" ","");
        System.out.println(withoutSpace);
        String vowels="aeiouAEIOU";
        int countVowels=0;
        int countConsonants=0;
        for(int i=0;i<=withoutSpace.length()-1;i++){
           char ch=withoutSpace.charAt(i);
           if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               countVowels++;
           }
           else {
               countConsonants++;
           }
        }
        System.out.println("Number of Vowels = "+ countVowels);
        System.out.println("Number of Consonants = "+ countConsonants);


    }


    //Remove duplicate characters from a string.
    public static void Duplicates(){
        String providedtring="vani shinghal";
        int count=0;
        String result="";
        String withoutSpace=providedtring.replace(" ","");
        for(int i=0;i<withoutSpace.length()-1;i++){
            char ch=withoutSpace.charAt(i);
            if(result.charAt(i)==withoutSpace.charAt(i)){

            }

        }
        System.out.println(count);


    }



    public static void main(String[] args) {

        ReverseString();
        IsPalindromeOrNot();
        SwapTwoNumbers();
        countVowelsAndConsonants();
        Duplicates();

    }


}
