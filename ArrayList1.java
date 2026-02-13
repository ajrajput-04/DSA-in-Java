import java.util.*;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList();
        System.out.println(list + "->" + list.size());
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
       
        list.add(0,0);  // add element at the 0th index
        int val = list.get(1); // give the value of 1th index 
        list.set(1,5);
        System.out.println(val);
        System.out.println(list + "->" + list.size());
        list.remove(1);
        System.out.println(list);
        
       // looping in the list 
       System.out.println("----------------------------");
        for (int i =0; i<list.size(); i++){
           int val1 = list.get(i);
            System.out.print(val1 + " ");
         }
    

    }
    
}
