public class PersonalContact extends Contacts { // SubClass 1
    

    PersonalContact(String name,String phoneNo,String email,String city){
       super(name, phoneNo, email, city);
        
    }
    @Override
    public String getType(){
        return "Personal";
    }
    @Override
    public String toString(){
        return super.toString() ;
    }
}
