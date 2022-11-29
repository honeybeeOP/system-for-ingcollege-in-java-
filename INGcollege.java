
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class INGcollege implements ActionListener
{
    //declaring instance variables  of academic course 
    //for Jframes
    private JFrame academic_frame;

    // for panels
    private JPanel panel_1, panel_2, panel_3;

    // for JLabels
    private JLabel label_academic, label_courseid,label_duration,label_credit, label_coursename, label_noofassesment,label_level,label_courseleader,label_lecturername, label_startdate, label_completiondate;

    // for JTextFields
    private JTextField field_courseid, field_duration, field_credit, field_coursename, field_noofassesment, field_level, field_courseleader, field_lecturername;

    // for JCombobox
    private JComboBox acad_starting_year, acad_starting_month,acad_starting_day, acad_completion_year, acad_completion_month,acad_completion_day,nonacad_starting_year, nonacad_starting_month, nonacad_starting_day, nonacad_completing_year, nonacad_completing_month, nonacad_completing_day, nonacad_exam_year, nonacad_exam_month, nonacad_exam_day;

    // instance variables for registering academic course
    private String register_courseid,register_courseleader,register_lecturername,register_startingyear,register_startingmonth,register_startingday,register_startdate,register_completingyear,register_completingmonth,register_completingday,register_completiondate;

    // for JButton
    private JButton button_addacademiccourse, button_registeracad, button_display, button_clear, button_changetononacademic;

    //instance variable  for non academic course
    //for JFrame
    private JFrame frame_nonacademiccourse;

    //for Jpanels
    private JPanel panel_N1, panel_N2, panel_N3;

    //for Jlabels
    private JLabel label_nonacademic, label_cid, label_cname, label_duration1, label_prerequisite, label_cleader, label_iname, label_startingdate, label_completingdate, label_examdate;

    //for JTextField
    private JTextField field_cid, field_cname, field_duration1, field_prerequisite, field_cleader, field_iname;

    //for buttons
    private JButton button_addnonacademiccourse, button_registernonacademiccourse, button_remove, button_show, button_Clear1, button_gotoacademiccourse;

    // instance variable for registering non academic course
    private String register_cid, register_cleader, register_iname, register_nonacadstartingyear, register_nonacadstartingmonth, register_nonacadstartingday,register_nonacadstartdate,  register_nonacadcompletingyear, register_nonacadcompletingmonth, register_nonacadcompletingday,register_nonacadcompletiondate,  register_nonacadexamyear, register_nonacadexammonth, register_nonacadexamday, register_examdate;

    //color
    private Color color_1 = new Color(179, 255, 179);
    private Color color_2 = new Color(230, 153, 255);
    private Color color_3 = new Color(102, 179, 255);

    //font
    private Font font_1 = new Font("Times New Roman" , Font.PLAIN, 17);

    // for textfield font
    private Font font_2 = new Font("Quicksand" , Font.PLAIN, 15);

    // declaring the instance variable for gettext contents
    //for academic course
    private String add_Courseid, add_Coursename, add_credit, add_level, add_duration, add_noofassesments;
    private int a_duration, a_noofassesments;

    //for non academic course
    private String add_Cid, add_Cname, add_duration1, add_prerequisite;
    private int a_duration1;

    //declaring instance variable of object
    private static academic_course object_academic;

    private static non_academic_course object_nonacademic;

    private static INGcollege nc = new INGcollege();
    //Arraylist which use parent class (course)
    public ArrayList<course> clist = new ArrayList<course>();

    public void Academicform() 
    {
        academic_frame = new JFrame("Academic course");
        academic_frame.setLayout(null);

        // Jlabel of academic course 
        label_academic = new JLabel("Academic course");
        label_academic.setBounds (270, 20, 500, 50 );
        //font class for academic course
        Font font_academic = new Font("Times New Roman", Font.PLAIN, 30);
        label_academic.setFont(font_academic);
        academic_frame.add(label_academic);

        //JPanel of academic course
        panel_1 = new JPanel();
        panel_1.setBounds(43, 90, 700, 325);
        panel_1.setBackground(color_1);
        panel_1.setLayout(null);

        //JLabel of courseid 
        label_courseid = new JLabel("Course ID:");
        label_courseid.setBounds(30 , 0 , 100, 50 );
        label_courseid.setFont(font_1);
        panel_1.add(label_courseid);

        //JTextField for courseid
        field_courseid = new JTextField();
        field_courseid.setBounds(30, 40, 230, 35);
        field_courseid.setFont(font_2);
        panel_1.add(field_courseid);

        //JLabel of duration
        label_duration = new JLabel("Duration:");
        label_duration.setBounds(30 , 80 , 100, 50 );
        label_duration.setFont(font_1);
        panel_1.add(label_duration);

        //JTextField for Duration
        field_duration = new JTextField();
        field_duration.setBounds(30, 120, 230, 35);
        field_duration.setFont(font_2);
        panel_1.add(field_duration);

        //JLabel of credit
        label_credit = new JLabel("Credit:");
        label_credit.setBounds(30 , 160 , 100, 50 );
        label_credit.setFont(font_1);
        panel_1.add(label_credit);

        //JTextField for credit
        field_credit = new JTextField();
        field_credit.setBounds(30, 200, 230, 35);
        field_credit.setFont(font_2);
        panel_1.add(field_credit);

        //JLabel of coursename
        label_coursename = new JLabel("Coursename:");
        label_coursename.setBounds(400 , 0 , 100, 50 );
        label_coursename.setFont(font_1);
        panel_1.add(label_coursename);

        //JTextField for coursename
        field_coursename = new JTextField();
        field_coursename.setBounds(400, 40, 230, 35);
        field_coursename.setFont(font_2);
        panel_1.add(field_coursename);

        //JLabel of noofassesment
        label_noofassesment = new JLabel("Number of assesment:");
        label_noofassesment.setBounds(400 , 80 , 150, 50 );
        label_noofassesment.setFont(font_1);
        panel_1.add(label_noofassesment);

        //JTextField for noofassesment
        field_noofassesment = new JTextField();
        field_noofassesment.setBounds(400, 120, 230, 35);
        field_noofassesment.setFont(font_2);
        panel_1.add(field_noofassesment);

        //JLabel of level
        label_level = new JLabel("Level:");
        label_level.setBounds(400 , 160 , 100, 50 );
        label_level.setFont(font_1);
        panel_1.add(label_level);

        //JTextField for level
        field_level = new JTextField();
        field_level.setBounds(400, 200, 230, 35);
        field_level.setFont(font_2);
        panel_1.add(field_level);

        //JButton for adding academic course
        button_addacademiccourse = new JButton("Add  Academic course");
        button_addacademiccourse.setBounds(100, 255, 450, 40);
        button_addacademiccourse.setFont(font_1);
        button_addacademiccourse.addActionListener(this);
        panel_1.add(button_addacademiccourse);

        //JPanel of academic course
        panel_2 = new JPanel();
        panel_2.setBounds(43, 400, 450, 320);
        panel_2.setBackground(color_2);
        panel_2.setLayout(null);

        //Jlabel for courseleader 
        label_courseleader = new JLabel("Courseleader:");
        label_courseleader.setBounds(30 , 30 , 100, 50);
        label_courseleader.setFont(font_1);
        panel_2.add(label_courseleader);

        //JTextField  for courseleader 
        field_courseleader = new JTextField ();
        field_courseleader.setBounds(160, 40 , 230, 35);
        field_courseleader.setFont(font_2);
        panel_2.add(field_courseleader);

        //Jlabel for lecturername
        label_lecturername = new JLabel("lecturername:");
        label_lecturername.setBounds(30 , 80 , 150, 50);
        label_lecturername.setFont(font_1);
        panel_2.add(label_lecturername);

        //JTextField  for lecturername 
        field_lecturername = new JTextField ();
        field_lecturername.setBounds(160, 90 , 230, 35);
        field_lecturername.setFont(font_2);
        panel_2.add(field_lecturername);

        //Jlabel for startdate 
        label_startdate = new JLabel("Start date:");
        label_startdate.setBounds(30 , 130 , 110, 50);
        label_startdate.setFont(font_1);
        panel_2.add(label_startdate);

        //JComboBox  for startdate
        //Jcombobox for starting year
        String[] year = {"2021","2022","2023","2024"
            ,"2025","2026","2027","2028",
                "2029","2030","2031"};
        acad_starting_year = new JComboBox(year);
        acad_starting_year.setBounds(160, 140 , 70, 35);
        panel_2.add(acad_starting_year);

        //JComboBox -->  starting Months
        String[] months = {"January","February","March","April"
            ,"May","June","July","August","September",
                "Octobor","November","December"};    
        acad_starting_month = new JComboBox(months);
        acad_starting_month.setBounds(240, 140 , 85, 35);
        panel_2.add(acad_starting_month);

        //JComboBox -->  starting Days
        String[] days = {"01","02","03","04"
            ,"05","06","07","08","09", "10",
                "11","12","13","14","15","16","17",
                "18","19","20","21" ,"22", "23","24","25","26","27","28", "29","30","31","32"};
        acad_starting_day = new JComboBox(days);
        acad_starting_day.setBounds(340, 140 , 50, 35);
        panel_2.add(acad_starting_day);

        //Jlabel for completiondate 
        label_completiondate = new JLabel("Completion date :");
        label_completiondate.setBounds(30 , 180 , 150, 50);
        label_completiondate.setFont(font_1);
        panel_2.add(label_completiondate);

        //JComboBox for completion date
        //Jcombobox -----> completion_year
        acad_completion_year = new JComboBox(year);
        acad_completion_year.setBounds(160, 190 , 70, 35);
        panel_2.add(acad_completion_year);

        //JComboBox -->  completion_months
        acad_completion_month = new JComboBox(months);
        acad_completion_month.setBounds(240, 190 , 85, 35);
        panel_2.add(acad_completion_month);

        //JComboBox --> completion_days
        acad_completion_day = new JComboBox(days);
        acad_completion_day.setBounds(340, 190 , 50, 35);
        panel_2.add(acad_completion_day);

        //JButton for register
        button_registeracad = new JButton("Register");
        button_registeracad.setBounds(150, 250, 250, 40);
        button_registeracad.addActionListener(this);        
        panel_2.add(button_registeracad);

        //JPanel of academic course
        panel_3 = new JPanel();
        panel_3.setBounds(490, 400, 253, 320);
        panel_3.setBackground(color_3);
        panel_3.setLayout(null);

        //JButton for display
        button_display = new JButton("Display");
        button_display.setBounds(30, 40, 200, 60);
        button_display.addActionListener(this);
        panel_3.add(button_display);

        //JButton for clear
        button_clear = new JButton("Clear");
        button_clear.setBounds(30, 140, 200, 60);
        button_clear.setBackground(Color.red);
        button_clear.setForeground(Color.white);
        button_clear.addActionListener(this);
        panel_3.add(button_clear);

        //JButton for non academic course
        button_changetononacademic = new JButton("Go to Non academic course");
        button_changetononacademic.setBounds(30, 230, 200, 60);
        button_changetononacademic.addActionListener(this);
        panel_3.add(button_changetononacademic);

        academic_frame.add(panel_1);
        academic_frame.add(panel_2);
        academic_frame.add(panel_3);

        academic_frame.setBounds(20, 20, 800, 800);
        academic_frame.setResizable(false);
        academic_frame.setVisible(true);
    }

    public void non_Academicform()
    {
        //Jframe for non academic course 
        frame_nonacademiccourse = new JFrame("Non academic course");
        frame_nonacademiccourse.setBounds(500, 20, 800, 800);
        frame_nonacademiccourse.setLayout(null);

        // Jlabel of  Non academic course 
        label_nonacademic = new JLabel(" Non-Academic Course");
        label_nonacademic.setBounds (270, 20, 500, 50 );
        //font class for academic course
        Font font_nonacademic = new Font("Times New Roman", Font.PLAIN, 30);
        label_nonacademic.setFont(font_nonacademic);
        frame_nonacademiccourse.add(label_nonacademic);

        //JPanel of non academic course
        panel_N1 = new JPanel();
        panel_N1.setBounds(43, 90, 700, 260);
        panel_N1.setBackground(color_1);
        panel_N1.setLayout(null);

        //JLabel of courseid 
        label_cid = new JLabel("Course ID:");
        label_cid.setBounds(30 , 0 , 100, 50 );
        label_cid.setFont(font_1);
        panel_N1.add(label_cid);

        //JTextField for courseid
        field_cid = new JTextField();
        field_cid.setBounds(30, 40, 230, 35);
        field_cid.setFont(font_2);
        panel_N1.add(field_cid);

        //JLabel of duration
        label_duration1 = new JLabel("Duration:");
        label_duration1.setBounds(30 , 80 , 100, 50 );
        label_duration1.setFont(font_1);
        panel_N1.add(label_duration1);

        //JTextField for Duration
        field_duration1 = new JTextField();
        field_duration1.setBounds(30, 120, 230, 35);
        field_duration1.setFont(font_2);
        panel_N1.add(field_duration1);

        //JLabel of coursename
        label_cname = new JLabel("Coursename:");
        label_cname.setBounds(400 , 0 , 100, 50 );
        label_cname.setFont(font_1);
        panel_N1.add(label_cname);

        //JTextField for coursename
        field_cname = new JTextField();
        field_cname.setBounds(400, 40, 230, 35);
        field_cname.setFont(font_2);
        panel_N1.add(field_cname);

        //JLabel of prerequisite
        label_prerequisite = new JLabel("Pre-requisite:");
        label_prerequisite.setBounds(400 , 80 , 150, 50 );
        label_prerequisite.setFont(font_1);
        panel_N1.add(label_prerequisite);

        //JTextField for prerequisite
        field_prerequisite = new JTextField();
        field_prerequisite.setBounds(400, 120, 230, 35 );
        field_prerequisite.setFont(font_2);
        panel_N1.add(field_prerequisite);

        //JButton for adding non academic course
        button_addnonacademiccourse = new JButton("Add  Non-Academic course");
        button_addnonacademiccourse.setBounds(100, 190, 450, 40);
        button_addnonacademiccourse.addActionListener(this);
        panel_N1.add(button_addnonacademiccourse);

        //  second JPanel of non academic course
        panel_N2 = new JPanel();
        panel_N2.setBounds(43, 350, 450, 350);
        panel_N2.setBackground(color_2);
        panel_N2.setLayout(null);

        //Jlabel for courseleader 
        label_cleader = new JLabel("Courseleader:");
        label_cleader.setBounds(30 , 20 , 100, 50);
        label_cleader.setFont(font_1);
        panel_N2.add(label_cleader);

        //JTextField  for courseleader 
        field_cleader = new JTextField ();
        field_cleader.setBounds(160, 30 , 230, 35);
        field_cleader.setFont(font_2);
        panel_N2.add(field_cleader);

        //Jlabel for instructorname
        label_iname = new JLabel("Instructor Name:");
        label_iname.setBounds(30 , 70 , 150, 50);
        label_iname.setFont(font_1);
        panel_N2.add(label_iname);

        //JTextField  for instructorname 
        field_iname = new JTextField ();
        field_iname.setBounds(160, 80 , 230, 35);
        field_iname.setFont(font_2);
        panel_N2.add(field_iname);

        //Jlabel for startdate 
        label_startingdate = new JLabel("Start date:");
        label_startingdate.setBounds(30 , 120 , 110, 50);
        label_startingdate.setFont(font_1);
        panel_N2.add(label_startingdate);

        //JComboBox  for startdate of non academic course
        //Jcombobox for starting year
        String[] year = {"2021","2022","2023","2024"
            ,"2025","2026","2027","2028",
                "2029","2030","2031"};
        nonacad_starting_year = new JComboBox(year);
        nonacad_starting_year.setBounds(160, 130 , 70, 35);
        panel_N2.add(nonacad_starting_year);

        //JComboBox -->  starting Months
        String[] months = {"January","February","March","April"
            ,"May","June","July","August","September",
                "Octobor","November","December"};    
        nonacad_starting_month = new JComboBox(months);
        nonacad_starting_month.setBounds(240, 130 , 85, 35);
        panel_N2.add(nonacad_starting_month);

        //JComboBox -->  starting Days
        String[] days = {"01","02","03","04"
            ,"05","06","07","08","09", "10",
                "11","12","13","14","15","16","17",
                "18","19","20","21" ,"22", "23","24","25","26","27","28", "29","30","31","32"};
        nonacad_starting_day = new JComboBox(days);
        nonacad_starting_day.setBounds(340, 130 , 50, 35);
        panel_N2.add(nonacad_starting_day);

        //Jlabel for completiondate 
        label_completingdate = new JLabel("Completion date:");
        label_completingdate.setBounds(30 , 170 , 150, 50);
        label_completingdate.setFont(font_1);
        panel_N2.add(label_completingdate);

        //JComboBox  for completion date of non academic course
        //Jcombobox for completion year
        nonacad_completing_year = new JComboBox(year);
        nonacad_completing_year.setBounds(160, 180 , 70, 35);
        panel_N2.add(nonacad_completing_year);

        //JComboBox -->  completion Months 
        nonacad_completing_month = new JComboBox(months);
        nonacad_completing_month.setBounds(240, 180 , 85, 35);
        panel_N2.add(nonacad_completing_month);

        //JComboBox -->  completion Days
        nonacad_completing_day = new JComboBox(days);
        nonacad_completing_day.setBounds(340, 180 , 50, 35);
        panel_N2.add(nonacad_completing_day);

        //Jlabel for examdate
        label_examdate  = new JLabel("Exam date :");
        label_examdate.setBounds(30 , 220 , 150, 50);
        label_examdate.setFont(font_1);
        panel_N2.add(label_examdate);

        //JComboBox  for Exam date
        //Jcombobox for Exam date's year
        nonacad_exam_year = new JComboBox(year);
        nonacad_exam_year.setBounds(160, 230 , 70, 35);
        panel_N2.add(nonacad_exam_year);

        //JComboBox --> Exam's Months
        nonacad_exam_month = new JComboBox(months);
        nonacad_exam_month.setBounds(240, 230 , 85, 35);
        panel_N2.add(nonacad_exam_month);

        //JComboBox -->  Exam's Days
        nonacad_exam_day = new JComboBox(days);
        nonacad_exam_day.setBounds(340, 230 , 50, 35);
        panel_N2.add(nonacad_exam_day);

        //button for register
        button_registernonacademiccourse = new JButton("Register");
        button_registernonacademiccourse.setBounds(150, 285, 250, 40);
        button_registernonacademiccourse.addActionListener(this);
        panel_N2.add (button_registernonacademiccourse);

        //third JPanel of non academic course
        panel_N3 = new JPanel();
        panel_N3.setBounds(490, 350, 253, 350);
        panel_N3.setBackground(color_3);
        panel_N3.setLayout(null);

        //JButton for remove
        button_remove = new JButton("Remove");
        button_remove.setBounds(30, 30, 200, 55);
        button_remove.addActionListener(this);
        panel_N3.add(button_remove);

        //JButton for display
        button_show = new JButton("Display");
        button_show.setBounds(30, 110, 200, 55);
        button_show.addActionListener(this);
        panel_N3.add(button_show);

        //JButton for clear
        button_Clear1 = new JButton("Clear");
        button_Clear1.setBounds(30, 190, 200, 55);
        button_Clear1.setBackground(Color.red);
        button_Clear1.setForeground(Color.white);
        button_Clear1.addActionListener(this);
        panel_N3.add(button_Clear1);

        //JButton for going to academic course
        button_gotoacademiccourse = new JButton("Go to Academic course");
        button_gotoacademiccourse.setBounds(30, 270, 200, 55);
        button_gotoacademiccourse.addActionListener(this); 
        button_gotoacademiccourse.setActionCommand("back");
        panel_N3.add(button_gotoacademiccourse);

        frame_nonacademiccourse.add(panel_N1);
        frame_nonacademiccourse.add(panel_N2);
        frame_nonacademiccourse.add(panel_N3);
        frame_nonacademiccourse.setVisible(true);
        frame_nonacademiccourse.setResizable(false);
    } 

    public static void main (String[]args){
        nc.Academicform();
    }
    //overriding actionlistener
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == button_changetononacademic){
            non_Academicform();
        }
        else if (e.getSource() == button_gotoacademiccourse){
            frame_nonacademiccourse.dispose();
            academic_frame.toFront();
        }

        //for add course of academic course 
        if (e.getSource() == button_addacademiccourse){
            // try for exception 
            try{
                add_Courseid = field_courseid.getText();

                add_Coursename = field_coursename.getText();

                add_duration = field_duration.getText();
                a_duration = Integer.parseInt(add_duration);  

                add_noofassesments = field_noofassesment.getText();
                a_noofassesments = Integer.parseInt(add_noofassesments);

                add_credit = field_credit.getText(); 

                add_level = field_level.getText();

                boolean isduplicate = false;
                for (course i :clist){
                    if (i.getcourseID().equals(add_Courseid)){
                        isduplicate = true;
                        break;
                    }
                }

                if (isduplicate == false){
                    //calling the constructor of academic_course
                    object_academic = new academic_course (add_Courseid, add_Coursename, a_duration, a_noofassesments, add_credit, add_level);

                    //adding the object to the arraylist 
                    clist.add(object_academic);

                    //JOptionPane for adding academic course
                    JOptionPane.showMessageDialog(academic_frame, " The Academic course with \n" + " Course ID: " + add_Courseid + "\n Coursename : " + add_Coursename + "\n duration : " + a_duration + "\n No of Assesments : " + a_noofassesments + "\n Credit of : " + add_credit + "\n and level of : " + add_level + "\n is Successfully added.");
                }
                else if (isduplicate == true)
                {
                    JOptionPane.showMessageDialog(academic_frame, " Course ID: " + add_Courseid + " was already added. ");

                }
            }

            //closing of try block
            catch(NumberFormatException exception_1)
            {
                //for empty textfields 
                try 
                {
                    if(add_Courseid.equals("") && add_Coursename.equals("") && add_duration.equals("") && add_noofassesments.equals("") && add_credit.equals("") && add_level.equals(""))
                    {
                        JOptionPane.showMessageDialog(academic_frame, "Empty text field found!!", " Please fill the empty text fields. ",JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch(NullPointerException exception_2)
                {
                    JOptionPane.showMessageDialog(academic_frame, "Empty text field found!!", " Please fill the empty text fields. ",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        //registration of  academic course
        else if (e.getSource() == button_registeracad){  
            if(field_courseid.getText().isEmpty() && field_courseleader.getText().isEmpty() && field_lecturername.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(academic_frame,"All the fields are required");
            }
            else{
                register_courseid = field_courseid.getText();

                register_courseleader = field_courseleader.getText();

                register_lecturername = field_lecturername.getText();

                register_startingyear = (acad_starting_year.getSelectedItem()).toString();
                register_startingmonth = (acad_starting_month.getSelectedItem()).toString();
                register_startingday = (acad_starting_day.getSelectedItem()).toString();

                register_startdate = register_startingyear + register_startingmonth + register_startingday;

                register_completingyear = (acad_completion_year.getSelectedItem()).toString();
                register_completingmonth = (acad_completion_month.getSelectedItem()).toString();
                register_completingday = (acad_completion_day.getSelectedItem()).toString();

                register_completiondate = register_completingyear + register_completingmonth + register_completingday;

                boolean ac_register = false;
                for(course obj_1 : clist)
                {
                    if (obj_1.getcourseID().equals(register_courseid))
                    {
                        ac_register=true;
                        if (obj_1 instanceof academic_course){
                            object_academic = (academic_course) obj_1;
                            //if the academic course is already registered
                            if(object_academic.getisregistered() == true){
                                JOptionPane.showMessageDialog(academic_frame,"sorry, the course is already registered.");   
                                break;
                            }
                            else if (object_academic.getisregistered() == false)
                            {
                                object_academic.register(register_courseleader, register_lecturername,register_startdate, register_completiondate);
                                JOptionPane.showMessageDialog(academic_frame , "the course is registered." );
                                break;
                            }
                        }
                    }
                }
            }
        }

        //for display button of academic course
        else if (e.getSource() == button_display)
        {
            //if the academic course is not added and not registered 
            if(clist.isEmpty()){
                JOptionPane.showMessageDialog(academic_frame, "Sorry, Nothing to display! ");
            }
            else{
                for (course list: clist){
                    if(list instanceof academic_course){
                        object_academic = (academic_course) list;  //type cast
                        //calling display method from another class(academic_course class)
                        object_academic.display();
                    }
                }
            }
        }

        //for clear button of academic course 
        else if (e.getSource() == button_clear )
        {
            if(field_courseid.getText().isEmpty() && field_coursename.getText().isEmpty() && field_duration.getText().isEmpty() && field_noofassesment.getText().isEmpty() && field_credit.getText().isEmpty() && field_level.getText().isEmpty() && field_courseleader.getText().isEmpty() && field_lecturername.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(academic_frame,"Nothing to clear");
            }
            else{
                field_courseid.setText("");
                field_coursename.setText("");
                field_duration.setText("");
                field_noofassesment.setText("");
                field_credit.setText("");
                field_level.setText("");
                field_courseleader.setText("");
                field_lecturername.setText("");
                JOptionPane.showMessageDialog(academic_frame,"Cleared","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }

        //for add course for  non academic course 
        if (e.getSource() == button_addnonacademiccourse){
            // try for exception 
            try{
                add_Cid = field_cid.getText();

                add_Cname = field_cname.getText();

                add_duration1 = field_duration1.getText();
                a_duration1 = Integer.parseInt(add_duration1);

                add_prerequisite = field_prerequisite.getText(); 

                boolean isnon_acad_duplicate = false;
                for (course Nac :clist){
                    if (Nac.getcourseID().equals(add_Cid)){
                        isnon_acad_duplicate = true;
                        break;
                    }
                }

                if (isnon_acad_duplicate == false){
                    //calling the constructor of  non academic_course
                    object_nonacademic = new non_academic_course(add_Cid, add_Cname, a_duration1, add_prerequisite );

                    //adding the object to the arraylist 
                    clist.add(object_nonacademic);

                    //JOptionPane for adding non academic course
                    JOptionPane.showMessageDialog (frame_nonacademiccourse, " The Non-Academic course with \n" + " Course ID: " + add_Cid + "\n Coursename : " + add_Cname + "\n Duration : " + a_duration1 + "\n pre-requisite : " + add_prerequisite + "\n is Successfully added.");

                }
                else if (isnon_acad_duplicate == true)
                {
                    JOptionPane.showMessageDialog(frame_nonacademiccourse, " Course ID: " + add_Cid + " was already added. ");

                }
            }

            //closing of try block
            catch(NumberFormatException exception_3)
            {
                //for empty textfields 
                try 
                {
                    if(add_Cid.equals("") && add_Cname.equals("") && add_duration1.equals("") && add_prerequisite.equals(""))
                    {
                        JOptionPane.showMessageDialog(frame_nonacademiccourse, "Empty text field found!!", " Please fill the empty text fields. ",JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch(NullPointerException exception_4)
                {
                    JOptionPane.showMessageDialog(frame_nonacademiccourse, "Empty text field found!!", " Please fill the empty text fields. ",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        //registration of non academic course
        if (e.getSource() == button_registernonacademiccourse){  
            if(field_cid.getText().isEmpty() && field_cleader.getText().isEmpty() && field_iname.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame_nonacademiccourse,"All the fields are required");
            }
            else{
                register_cid = field_cid.getText();

                register_cleader = field_cleader.getText();

                register_iname = field_iname.getText();

                register_nonacadstartingyear = (nonacad_starting_year.getSelectedItem()).toString();
                register_nonacadstartingmonth = (nonacad_starting_month.getSelectedItem()).toString();
                register_nonacadstartingday = (nonacad_starting_day.getSelectedItem()).toString();

                register_nonacadstartdate = register_nonacadstartingyear + register_nonacadstartingmonth + register_nonacadstartingday;

                register_nonacadcompletingyear = (nonacad_completing_year.getSelectedItem()).toString();
                register_nonacadcompletingmonth = (nonacad_completing_month.getSelectedItem()).toString();
                register_nonacadcompletingday = (nonacad_completing_day.getSelectedItem()).toString();

                register_nonacadcompletiondate = register_nonacadcompletingyear + register_nonacadcompletingmonth + register_nonacadcompletingday;

                register_nonacadexamyear = (nonacad_exam_year.getSelectedItem()).toString();
                register_nonacadexammonth = (nonacad_exam_month.getSelectedItem()).toString();
                register_nonacadexamday = (nonacad_exam_day.getSelectedItem()).toString();

                register_examdate = register_nonacadexamyear + register_nonacadexammonth + register_nonacadexamday;

                boolean Nac_register = false;
                for(course obj_2 : clist)
                {
                    if (obj_2.getcourseID().equals(register_cid))
                    {
                        Nac_register=true;
                        if (obj_2 instanceof non_academic_course)
                        {
                            object_nonacademic = (non_academic_course) obj_2;
                            //if the non academic course is already registered
                            if(object_nonacademic.isregistered() == true){
                                JOptionPane.showMessageDialog(frame_nonacademiccourse,"Sorry,This Non academic course was already registered.");   
                                break;
                            }
                            else if (object_nonacademic.isregistered() == false)
                            {
                                object_nonacademic.register(register_cleader, register_iname,register_nonacadstartdate, register_nonacadcompletiondate, register_examdate);
                                JOptionPane.showMessageDialog(frame_nonacademiccourse , "Non academic course is registered." );
                                break;
                            }
                        }
                    }
                }
            }
        }

        //for remove
        else if (e.getSource() == button_remove){
            String remove_courseid = field_cid.getText();
            for(course r: clist)
            {
                if (r.getcourseID().equals(remove_courseid))
                {
                    if (r instanceof non_academic_course)
                    {
                        object_nonacademic = (non_academic_course)r;
                    }
                    //if course is already removed
                    if (object_nonacademic.getisremoved() == true)
                    {

                        JOptionPane.showMessageDialog(frame_nonacademiccourse,"Sorry, the course was already removed.");
                        break;
                    }
                    //if course is not removed
                    else if (object_nonacademic.getisremoved() == false)
                    {
                        object_nonacademic.remove();
                        JOptionPane.showMessageDialog(frame_nonacademiccourse , "Course is successfully removed." );
                    }
                }
            }
        }

        // for display button of  non academic course
        else if (e.getSource() == button_show)
        {
            //if the non academic course is not added and not registered 
            if(clist.isEmpty())
            {
                JOptionPane.showMessageDialog(frame_nonacademiccourse, "Sorry, Nothing to display!! ");
            }
            else{
                for (course l: clist)
                {
                    if(l instanceof non_academic_course)
                    {
                        object_nonacademic = (non_academic_course) l;  //type cast
                        //calling display method from another class(non academic_course class)
                        object_nonacademic.display();
                    }
                }
            }
        }

        //for clear button of non academic course
        else if (e.getSource() == button_Clear1)
        {
            if(field_courseid.getText().isEmpty() && field_coursename.getText().isEmpty() && field_duration.getText().isEmpty() && field_noofassesment.getText().isEmpty() && field_credit.getText().isEmpty() && field_level.getText().isEmpty() && field_courseleader.getText().isEmpty() && field_lecturername.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame_nonacademiccourse,"Nothing to clear");
            }
            else{
                field_cid.setText("");
                field_cname.setText("");
                field_duration1.setText("");
                field_prerequisite.setText("");
                field_cleader.setText("");
                field_iname.setText("");
                JOptionPane.showMessageDialog(frame_nonacademiccourse,"Cleared","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

