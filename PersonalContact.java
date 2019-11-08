
class PersonalContact extends BasicContact 
{
    private String dateBirth;
    
    public PersonalContact(String fname, String lname, String addr, String ph, String email, String dob) 
    {
        super(fname, lname, addr, ph, email);
        dateBirth = dob;
    }
    public PersonalContact()
    {
        super();
        dateBirth = "";
    }
    
    public void setDateBirth(String dob)
    {
        dateBirth = dob;
    }
    public String getDateBirth()
    {
        return dateBirth;
    }
    
    //Override to allow BasicContact to be used along with PersonalContact variable - dateBirth.
    @Override
    public void printInfo() 
    {
        System.out.println("Personal Contact");
        printBasicInfo();
        System.out.println("Date of Birth:  "+ dateBirth);
    }
}
