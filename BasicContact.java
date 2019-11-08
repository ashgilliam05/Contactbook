
abstract class BasicContact 
{
    //Protecting basiccontact variables so that only itself and subclasses can use.
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNum;
    private String emailAddy;

    public void setFirstName(String fname)
    {
        firstName = fname;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lname)
    {
        lastName = lname;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setAddress(String addr)
    {
        address = addr;
    }
    public String getAddress()
    {
        return address;
    }
    public void setPhoneNum(String ph)
    {
        phoneNum = ph;
    }
    public String getPhoneNum()
    {
        return phoneNum;
    }
    public void setEmailAddy(String email)
    {
        emailAddy = email;
    }
    public String getEmailAddy()
    {
        return emailAddy;
    }
    public BasicContact()
    {
        firstName = "";
        lastName = "";
        address = "";
        phoneNum = "";
        emailAddy = "";
    }
    public BasicContact(String fname, String lname, String addr, String ph, String email)
    {
        firstName = fname;
        lastName = lname;
        address = addr;
        phoneNum = ph;
        emailAddy = email;
    }
    
    public void printLastNameFirstName()
    {
        System.out.println(lastName +", " + firstName );
    }
    
    //Will override in subclasses - BusinessContact and PersonalContact.
    public abstract void printInfo();
    
    //This should ONLY be reachable by the children - protected
    protected final void printBasicInfo()
    {
        printLastNameFirstName();
        System.out.println("Address: " + address);
        System.out.println("Phone Number:  " + phoneNum);
        System.out.println("Email Address:  "+ emailAddy);
    }
}