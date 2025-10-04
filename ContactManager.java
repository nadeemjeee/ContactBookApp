import java.util.ArrayList;
import java.util.List;


public class ContactManager {
    private List<Contacts> contacts = new ArrayList<>();

    public void addContact(Contacts c){ // method addContact
        contacts.add(c);
    }
    public List<Contacts> getAll(){ // method getAll
        return contacts;
    }
    public List<Contacts> searchByName(String text){ //method searchByName
        List<Contacts> result = new ArrayList<>();
        for(Contacts c : contacts){
            if(c.getName().toLowerCase().contains(text.toLowerCase())){
                result.add(c);
            }
        }
        return result;
    }
    public void sortByName(){ // method sortByName 
       ContactOrginiser.bubbleSort(contacts);
    }
}
