import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        Collections.sort(list); 
        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}