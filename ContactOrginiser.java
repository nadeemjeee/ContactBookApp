import java.util.List;

public class ContactOrginiser { // Algorithm
    // sort contacts by name
    public static void bubbleSort(List<Contacts> list){   
        int n = list.size();
        for(int repeat = 0; repeat<n-1; repeat ++){ // sorting name alphabetically-Bubble sort

            for (int i = 0; i<n-1; i++){
                String name1 = list.get(i).getName();
                String name2 = list.get(i+1).getName();

                if(name1.compareToIgnoreCase(name2)>0){
                    Contacts temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }
            }
        }

       
    }  
}          
    

