package CoreJavaExercisesOOP;

import java.util.List;

public class ListOperations {

    public void iterateList(List<?> list){
        System.out.println("iterating list: \n");
        list.forEach(System.out::println);
    }

    public void campareList(List<?> listA, List<?> listB){
        System.out.println("the listA is equal to listB? ");
        System.out.println(listA.equals(listB));
    }

    public void returnNumOfItems(List<?> list){
        System.out.println("The num of items is: ");
        System.out.println(list.size());
    }

    public void replaceItem(List<String> list, int index, String item){
        System.out.println("Original list: " + list);
        list.set(index, item);
        System.out.println("Modified list: " + list);
    }

    public void deleteItem(List<String> list, int index){
        System.out.println("Original list: " + list);
        String itemRemoved = list.remove(index);
        System.out.println("Item removed: " + itemRemoved);
        System.out.println("Modified list: " + list);
    }

    public void exitsElement(List<String> list, String item){
        System.out.println("Does the list have the element " + item + "?  => " + list.contains(item));
    }

}
