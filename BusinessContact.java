
public class BusinessContact extends BasicContact 
{
    private String jobTitle;
    private String org;

    public BusinessContact(String fname, String lname, String addr, String ph, String email, String job, String comp) 
    {
        super(fname, lname, addr, ph, email);
        jobTitle = job;
        org = comp;
    }
    public BusinessContact()
    {
        super();
        jobTitle = "";
        org = "";
    }
    public void setJobTitle(String job)
    {
        jobTitle = job;
    }
    public String getJobTitle()
    {
        return jobTitle;
    }
public void setOrg(String comp)
    {
        org = comp;
    }
    public String getOrg()
    {
        return org;
    }
    
    
    //Override to allow BasicContact to be used along with BusinessContact variables - jobTitle and org.
    @Override
    public void printInfo() 
    {
        System.out.println("Business Contact");
        
        printBasicInfo();
        System.out.println("Job Title:  "+ jobTitle);
        System.out.println("Organization:  "+ org);

    }
}
