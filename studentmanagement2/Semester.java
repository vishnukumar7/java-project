
package studentmanagement2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
public class Semester {
    public TreeMap<String,ArrayList<StudentDepartment>> studentSemesterList=new TreeMap<>();
    public TreeMap<String,ArrayList<TeacherDepartment>> teacherSemesterList=new TreeMap<>();
    Semester(int flag)
    {
        if(flag==1)
        {
            studentSemesterList.put("sem1", new ArrayList<>());
            studentSemesterList.put("sem2", new ArrayList<>());
            studentSemesterList.put("sem3", new ArrayList<>());
            studentSemesterList.put("sem4", new ArrayList<>());
            studentSemesterList.put("sem5", new ArrayList<>());
            studentSemesterList.put("sem6", new ArrayList<>());
            studentSemesterList.put("sem7", new ArrayList<>());
            studentSemesterList.put("sem8", new ArrayList<>());
        }
        else
        {
            teacherSemesterList.put("sem1", new ArrayList<>());
            teacherSemesterList.put("sem2", new ArrayList<>());
            teacherSemesterList.put("sem3", new ArrayList<>());
            teacherSemesterList.put("sem4", new ArrayList<>());
            teacherSemesterList.put("sem5", new ArrayList<>());
            teacherSemesterList.put("sem6", new ArrayList<>());
            teacherSemesterList.put("sem7", new ArrayList<>());
            teacherSemesterList.put("sem8", new ArrayList<>());
        }
    }
    void studentSemester()
    {
        String str="";
        do
        {
            System.out.println("Enter the name of the semester(sem1/sem2/..../sem8)");
            String semester=sc.next();
            if(studentSemesterList.containsKey(semester))
            {
                ArrayList<StudentDepartment> studentDepartmentList=studentSemesterList.get(semester);
                if(studentDepartmentList.isEmpty())
                    studentDepartmentList.add(new StudentDepartment());
                StudentDepartment sd=studentDepartmentList.get(0);
                sd.department();
            }
            else
                System.out.println("not in the List\n");
            System.out.println("Exit to semester details (y/n) ");
            str=sc.next();
        }while(str.equalsIgnoreCase("n"));
    }
    void teacherSemester()
    {
        String str;
        do
        {
            System.out.println("Enter the name of the semester(sem1/sem2/..../sem8)");
            String semester=sc.next();
            if(studentSemesterList.containsKey(semester))
            {
                ArrayList<TeacherDepartment> teacherDepartmentList=teacherSemesterList.get(semester);
                if(teacherDepartmentList.isEmpty())
                    teacherDepartmentList.add(new TeacherDepartment());
                TeacherDepartment td=teacherDepartmentList.get(0);
                td.department();
            }
            else
                System.out.println("\nno semester in the list\n");
            System.out.println("Exit to semester details (y/n) ");
            str=sc.next();
        }while(str.equalsIgnoreCase("n"));
    }
    public static final Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        TreeMap<String,ArrayList<Semester>> main=new TreeMap<>();
        main.put("student", new ArrayList<>());
        main.put("teacher", new ArrayList<>());
        String str;
        do
        {
            System.out.println("\n\n1.student Admin\n2.teacher Admin");
            System.out.println("\nEnter your choice:");
            int choice=Integer.parseInt(sc.next());
            switch(choice)
            {
                case 1:
                    ArrayList<Semester> semester=main.get("student");
                    if(semester.isEmpty())
                        semester.add(new Semester(1));
                    Semester s=semester.get(0);
                    s.studentSemester();
                    break;
                case 2:
                    semester=main.get("teacher");
                    if(semester.isEmpty())
                        semester.add(new Semester(2));
                    s=semester.get(0);
                    s.teacherSemester();
                    break;
                default:
                    System.out.println("invlaid data");
                    break;
            }
            System.out.println("this is home menu\nDo you continue (y/n) ");
            str=sc.next();
        }while(str.equalsIgnoreCase("y"));
    }
}
