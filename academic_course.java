
public class academic_course extends course
{
    //construction of attributes of academic course
    private String lecturername;
    private String level;
    private String credit;
    private String startingdate;
    private String completiondate;
    private int numberofassesments;
    private boolean isregistered;                      
    public academic_course(String courseID, String coursename, int duration, int numberofassesments, String credit, String level )
    {//constructors donot use void because constructor returns the object it creates not void.
        super(courseID,coursename,duration);         /*call made to super class which takes the data from the parent class i.e from course class*/
        this.level=level;
        this.credit=credit;
        this.numberofassesments=numberofassesments;
        lecturername="";
        startingdate="";
        completiondate="";
        isregistered=false;                   
    }

    public String getlevel()   //accessor method for level                      
    {
        return level;
    }

    public String getcredit()//accessor method for credit
    {
        return credit;
    }

    public int getnumberofassesments()//accessor methods for numberofassesments
    {
        return numberofassesments;
    }

    public String getlecturername()//accessor method for lecturername
    {
        return lecturername;
    }

    public String getstartingdate()//accessor method for startingdate
    {
        return startingdate;
    }

    public String getcompletiondate()//accessor method for completiondate
    {
        return completiondate;
    }

    public boolean getisregistered()//accessor method for isregistered of boolean type
    {
        return isregistered;
    }

    public void setlecturename(String lecturername)//setter method for new lecturername
    {
        this.lecturername=lecturername;
    }

    public void setnumberofassesments(int assesments)//setter method for new numberofassesmemts
    {
        this.numberofassesments=assesments;
    }

    public void register(String courseleader, String lecturername, String startingdate,String completiondate)
    {
        if(isregistered == true){
            System.out.println("The Lecturer Name is " +lecturername);
            System.out.println("The Starting Date is " +startingdate);
            System.out.println("The Completion Date is " +completiondate);
        }
        else{
            super.setcourseleader(courseleader);
            this.lecturername = lecturername;
            this.startingdate = startingdate;
            this.completiondate = completiondate;
            isregistered=true;
        }
    }

    public void display(){
        super.display();
        if(isregistered == true){
            System.out.println("The Lecturer Name is " +lecturername);
            System.out.println("The Level is " +level);
            System.out.println("The Credit is " +credit);
            System.out.println("The Starting Date is " +startingdate);
            System.out.println("The Completion Date is " +completiondate);
            System.out.println("The Number of Assessments is " +numberofassesments);
        }
    }
}

