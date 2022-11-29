public class course{ 
    /*construction of four attributes of the course class.*/
    private String courseID;  //private cannot be accessed on other class but by using the setter and getter we can access it into the another class.
    private String coursename;
    private String courseleader;
    private int duration; 
    /*constructing constructors that take parameter of String, String and int date type*/
    public course( String courseID, String coursename, int duration)
    { 
        this.courseID=courseID;
        this.coursename=coursename;
        this.duration=duration; 
        courseleader="";        
    } 

    public String getcourseID() //getter method for courseID
    { 
        return courseID;
    }

    public String getcoursename() //getter method for coursename
    { 
        return coursename; 
    }

    public int getduration() //getter method for duration
    { 
        return duration; 
    } 

    public String getcourseleader()//getter method for courseleader
    { 
        return courseleader; 
    }

    public void setcourseleader(String courseleader) //setter helps to modify or to set the value of courseleader
    { 
        this.courseleader=courseleader; 
    } 

    void display()//display method to display the output
    {
        System.out.println("CourseID of course is " +courseID);
        System.out.println("Coursename of course is "+coursename); 
        System.out.println("Duration is"+duration);
        if (courseleader!="")
        {
            System.out.println("Courseleader of the course is "+courseleader); 
        }
    }
}