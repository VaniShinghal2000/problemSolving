package AllCollections;

import java.util.*;

public class BasicTwo {

    //Create a List<Integer> and add five numbers into it. Print all elements.
    public static void Creating(){
        List<Integer> myList=new ArrayList<>();
        myList.add(5);
        System.out.println(myList);
    }

    //Convert an array to a list and a list to an array.
    public static void Convert(){
        List<Integer> myList=new ArrayList<>();
        myList.add(2);
        myList.add(8);
        Integer[] myArray = new Integer[]{2, 3, 4, 5};
        Integer[] Arraynew=myList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(Arraynew));
        List<Integer> newList=new ArrayList<>(Arrays.asList(myArray));
        System.out.println(newList);

    }

    //Find the index of the first and last occurrence of an element.
    public static void Ocuurrence(){
        String s="vaani shinghal";
        String element="a";

        System.out.println( s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

    }

    //Reverse a list without using extra space
    public static void ReverseString(){
        List<Integer> myList=new ArrayList<>(Arrays.asList(2,3,4,5));
        Collections.reverse(myList);
        System.out.println(myList);
    }

    //Remove all duplicate elements from a list (preserve order).
    public static void DuplicateElements(){
        List<Integer> myList=new ArrayList<>();
        myList.add(5);
        myList.add(7);
        myList.add(5);
        myList.add(10);
        List<Integer> newList=new ArrayList<>(new LinkedHashSet<>(myList));
        System.out.println(newList);

    }

    //Merge two ArrayLists into a single list.
    public static void Merge(){
        List<Integer> myList=new ArrayList<>(Arrays.asList(5,3,4,6));
        List<Integer> myList2=new ArrayList<>(Arrays.asList(1,1,1,1));
        List<Integer> merged=new ArrayList<>(myList);
        merged.addAll(myList2);
        System.out.println(merged);


    }

    //Convert a List<String> into a comma-separated string.
    public static void ConvertByComma(){
        List<String> myList=new ArrayList<>(Arrays.asList("vani","satyam"));

        String result=String.join(",",myList);
        System.out.println(result);



    }

    //Filter out even numbers from a list of integers (example with Streams).
    //Also: count elements, sum elements, get distinct elements (all in one snippet).
    public static void EvenNo(){
        List<Integer> myList=new ArrayList<>(Arrays.asList(4,3,6,7,8,9));
        List<Integer> EvenNoList=new ArrayList<>();
        for(int i:myList){
            if(i%2==0){
                EvenNoList.add(i);
            }
        }
        System.out.println(EvenNoList);
        System.out.println(myList.size());
        long count=myList.stream().count();
        System.out.println(count);


    }

    //Create an unmodifiable list.
    public static void unmodifiable(){
        List<Integer> myList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> unmod=Collections.unmodifiableList(myList);
        //unmod.add(2);
        System.out.println(unmod);
    }

    //Find the second largest element in a list.
    public static void secondLargest(){
        List<Integer> myList=new ArrayList<>(Arrays.asList(2,6,3,4,0,6));
        Collections.sort(myList);
        System.out.println(myList.get(1));
    }

    //Find the frequency of each element in a list
    public static void Frequency(){
        List<String> myList=new ArrayList<>(Arrays.asList("a","b","a","c","d","m","d"));
        Map<String,Integer>  myMap=new HashMap<>();
       for(String item:myList){
           if(myMap.containsKey(item)){
               myMap.put(item,myMap.get(item)+1);
           }
           else{
               myMap.put(item,1);
           }
       }
        System.out.println(myMap);


    }

    //Compare two lists and find the common elements
    public static void Compare(){
        List<String> firstList=new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> secondList=new ArrayList<>(Arrays.asList("d","e","a"));
        List<String> common=new ArrayList<>();
        for(String s:firstList){
            if(secondList.contains(s)){
                common.add(s);
            }
        }

        System.out.println(common);



    }

    //LinkedList — add at beginning/end and remove first/last
    public static void add(){
        LinkedList<Integer> myList=new LinkedList<>(Arrays.asList(5,4,3,7));
        myList.addFirst(1);
        myList.addLast(0);
        System.out.println(myList);
    }

    //Q30. Detect and remove duplicates from a LinkedList
    public static void Duplicates(){
        LinkedList<String> myList=new LinkedList<>(Arrays.asList("a","b","c","a"));
        LinkedHashSet<String> mySet=new LinkedHashSet<>(myList);
        myList.clear();
        myList.addAll(mySet);
        System.out.println(myList);





    }

    //keep duplicate in another list
    public static void KeepDuplicate(){
        List<String> myList=new ArrayList<>(Arrays.asList("a","b","c","d","a","b"));
        HashSet<String> mySet=new HashSet<>();
        List<String> duplicates=new ArrayList<>();
        for(String s:myList){
            if(mySet.contains(s)){
                duplicates.add(s);
            }
            else {
                mySet.add(s);
            }

        }
        System.out.println("Duplicates are " +duplicates);


    }



    public static void main(String[] args) {
        Creating();
        Convert();
        Ocuurrence();
        ReverseString();
        DuplicateElements();
        Merge();
        ConvertByComma();
        EvenNo();
        unmodifiable();
        secondLargest();
        Frequency();
        Compare();
        add();
        Duplicates();
        KeepDuplicate();


    }




}
