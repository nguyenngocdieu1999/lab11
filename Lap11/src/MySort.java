
import java.util.ArrayList;
import java.util.Collections;
public class MySort {
       
public static <T extends Comparable<T>> T Max(ArrayList<T> a){
    T max = (T) a.get(0);
    for(int i=0; i<a.size(); i++){
        if(max.compareTo((T)a.get(i))<0){
            max= (T) a.get(i);
        }
    }
   return max;
}
public static void main(String[] args){
    int i;
ArrayList<String> strings = new ArrayList<> ();
strings.add("abhd");
strings.add("uay");
System.out.print("Original List:\n");
for(i=0; i<strings.size(); i++){
    System.out.println(strings.get(i));
}
System.out.println("Sorted List:");
sort(strings, 0, strings.size()-1);
for(i=0; i<strings.size(); i++){
    System.out.println(strings.get(i));
}
System.out.print("\nMax: "+ Max(strings)+"\n");
}
 
}
