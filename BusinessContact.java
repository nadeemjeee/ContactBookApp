public class BusinessContact extends Contacts { // SubClass 2
    String company;

    BusinessContact(String name,String phoneNo,String email,
    String city,String company){
        super(name, phoneNo, email, city);
        this.company = company;
    }
    @Override
    public String getType(){
        return "Business";
    }
    @Override
    public String toString(){
        //return super.toString() + "\t" + company;
        return super.toString() + ", Company: " + company;
    }
    
}
