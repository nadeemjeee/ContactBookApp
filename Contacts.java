abstract class Contacts { // SupeClass
    String name;
    String phoneNo; // if int phoneNo : it will remove satrting zero, can be long digit
    String email;
    String city;
    

    Contacts (String name,String phoneNo,String email,String city){ // constructor
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.city =city;
        
    }
    public String getName(){ //Method
        return name;
    }

    public abstract String getType(); // abstract method-SubClasses will Override 
        // and give its type

    @Override
    public String toString(){
        //return "(" + getType() + "\t" + name + "\t" + phoneNo   + "\t" + email + "\t" + city;
        return "(" + getType() + ") Name: " + name + " , PhoneNo:  " + phoneNo   + ", email:   " + email + ",    City: " + city;
        
    }


}
