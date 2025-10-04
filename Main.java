import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();
        boolean menu = true;

        while (menu) {
            System.out.println("""
                ====Menu===
                (1) Add Personal Contact
                (2) Add Business Contact
                (3) List all Contacts
                (4) Sort Contacts by Name
                (5) Search by name
                (0) Exit   
                    """);
            System.out.print("Enter your choice: ");
            String choice = myScanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Name: ");
                    String pName = myScanner.nextLine();
                    String pPhone;
                    while (true) {
                        System.out.print("PhoneNo: ");
                        pPhone = myScanner.nextLine();
                        if(pPhone.matches("\\d+")){
                            break;
                        }
                        else{
                            System.out.println("Please enter digits only");
                        }
                    }
                    System.out.print("email: ");
                    String pEmail = myScanner.nextLine();
                    System.out.print("City: ");
                    String pCity = myScanner.nextLine();
                    manager.addContact(new PersonalContact(pName, pPhone, pEmail, pCity));
                    break;
                case "2":
                    System.out.print("Name: ");
                    String bName = myScanner.nextLine();
                   String bPhone;
                    while (true) {
                        System.out.print("PhoneNo: ");
                        bPhone = myScanner.nextLine();
                        if(bPhone.matches("\\d+")){
                            break;
                        }
                        else{
                            System.out.println("Please enter digits only");
                        }
                    }
                    System.out.print("email: ");
                    String bEmail = myScanner.nextLine();
                    System.out.print("City: ");
                    String bCity = myScanner.nextLine();
                     System.out.print("Company: ");
                    String bCompany= myScanner.nextLine();
                    manager.addContact(new BusinessContact(bName, bPhone, bEmail, bCity, bCompany));
                    break;
                case "3":
                    System.out.println("\n == All Contact ==");
                    for(Contacts c : manager.getAll()){
                        System.out.println(c);
                    }
                    break;
                case "4":
                    manager.sortByName();
                    System.out.println("Sorted Contacts (A-Z)");
                    for(Contacts c : manager.getAll()){
                        System.out.println(c);
                    }
                    break;
                case "5":
                    System.out.print("Enter text to search: ");
                    String text = myScanner.nextLine();
                    List<Contacts> found = manager.searchByName(text);
                    System.out.println("\n ==Search result==");
                    for(Contacts c :found){
                        System.out.println(c);
                    }
                    if(found.isEmpty()){
                        System.out.println("No match found");
                    }
                    break;
                case "0":   
                    menu= false;
                    System.out.println("==Goodbye==");
                    break;
                default:
                    System.out.println("==Invalid number==");
            }
             
        }
        myScanner.close();
    }
    
}
