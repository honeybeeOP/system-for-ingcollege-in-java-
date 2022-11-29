
public class non_academic_course extends course
{
    /*construction of four attributes of the non academic course class.*/
    private String instructorname;
    private String startdate;
    private String completiondate;
    private String examdate;
    private String pre_requisite;
    private boolean isregistered;
    private boolean isremoved;
    public non_academic_course(String courseID, String coursename, int duration, String pre_requisite)
    {
        super(courseID,coursename,duration);
        this.pre_requisite=pre_requisite;
        startdate="";
        completiondate="";
        examdate="";
        isregistered=false;
        isremoved=false;
    }

    public String getpre_requisite()//getter method for pre_requisite
    {
        return pre_requisite;
    }    

    public String getstartdate()//getter method for startdate 
    {
        return startdate;
    }

    public String getcompletiondate()//getter method for completiondate
    {
        return completiondate;
    }    

    public String getexamdate()//getter method for examdate
    {
        return examdate;
    }
    
    public boolean getisremoved(){
        return isremoved;
    }
    
    public boolean isregistered(){
        return isregistered;
    }

    public void setinstructorname(String instructorname){ //setter method for new instructorname if it is not registered
        if(isregistered==false){
            this.instructorname=instructorname;
            isregistered=true;
        }
        
    }

    public void register(String courseleader,String instructorname, String startdate,String completiondate,String examdate)
    {//method to register courseleader,instructorname,startdatecompletiondate,examdate if it is not registered
        if (isregistered==false){
            //setinstructorname(instructorname);
            this.instructorname=instructorname;
            super.setcourseleader(courseleader);
            this.startdate=startdate;
            this.completiondate=completiondate;
            this.examdate=examdate;
            isregistered=true;
        }
        else {
            System.out.println("the course is already registered");
        }
    }

    public void remove(){ //method to remove courseleader,instructorname,startdate, completiondate.
        if(isremoved==true){
            System.out.println("non-academic course is already removed");
        }
        else if (isremoved==false){
            super.setcourseleader("");
            setinstructorname("");
            startdate="";
            completiondate="";
            examdate="";
            isregistered=false;
            isremoved=true;
        }
    }

    public void display(){//method to display instructorname, startdate, completiondate and examdate.
        super.display();
        if(isregistered==true){
            System.out.println("instructor name is " +instructorname);
            System.out.println("Start date is " +startdate);
            System.out.println("completiondate is " +completiondate);
            System.out.println("exam date is " +examdate);
        }
        else 
        {
            System.out.println("displayed");
        }
            
    }
}