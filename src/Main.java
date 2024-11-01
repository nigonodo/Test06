import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>(List.of("P1","P2","P3","N1","N3", "p6","P9","N5","N8","P6","P7","P1","N8","N5"));

    List<String> correctList=listOfPerson(list1);
        System.out.println(correctList);


    }


    public static List<String> listOfPerson(List<String> list){
        List<String> result=new ArrayList<>();
        for(String name:list){
           if(!nameIsExists(result,name)){
               result.add(name);
           }
        }
        return result;
    }
    public static boolean nameIsExists(List<String> list,String name){
        for(String str:list){
            if(str.equals(name)){
                return true;
            }

        }
        return false;
    }
}