package studentmanagement2;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import static studentmanagement.Semester.sc;
public class Student {
    TreeMap<Integer,ArrayList<Subject>> studentList=new TreeMap<>();
    ArrayList<ArrayList<String>> studentAllData=new ArrayList<>();
    ArrayList<ArrayList<String>> subjectDataList=new ArrayList<ArrayList<String>>();
    public int rollNo;
    public String rep;
    void studentAdmin(String department)
    {
        String str;
        do
        {
            System.out.println("\n1.Add Student\n2.Edit Student\n3.Display Student"
                    + "\n4.Student (Add/Update) marks and (delete)subject\n5.display the student rep\n6.Add subject\n7.list of subject");
            System.out.println("\nEnter your choice");
            int choice=Integer.parseInt(sc.next());
            switch(choice)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    displayStudent(department);
                    break;
                case 4:
                    studentSubjectAndMarks();
                    break;
                case 5:
                    displayStudentRep();
                    break;
                case 6:
                    System.out.println("Enter the subject name");
                    String subName=sc.next();
                    System.out.println("Enter the subject Code");
                    String subCode=sc.next();
                    addSubject(subName,subCode);
                    break;
                case 7:
                    listOfSubject();
                    break;
                default:
                    System.out.println("invlaid data");
                    break;
            }
            System.out.println("\nexit to student details (y/n):  ");
            str=sc.next();
        }while(str.equalsIgnoreCase("n"));
    }
    void addStudent()
    {
            ArrayList<String> studentAdd=new ArrayList<>();
            System.out.println("Enter the student name");
            sc.nextLine();
            String name=sc.nextLine();
            studentAdd.add(name);
            System.out.println("Enter the student age");
            String age=sc.next();
            studentAdd.add(age);
            System.out.println("Enter the city");
            String city=sc.next();
            studentAdd.add(city);
            studentAllData.add(studentAdd);
            studentList.put(studentAllData.size(), new ArrayList<>());
    }
    void editStudent()
    {
        System.out.println("\nEnter the roll number");
        int number=sc.nextInt();
        sc.nextLine();
        if(number>=0 && number<=studentAllData.size())
            changeDetail(studentAllData.get(number-1));
        else
            System.out.println("No roll number in the list");
    }
    void displayStudent(String department)
    {
        String format = "%1$-20s%2$-20s%3$-10s%4$-10s\n";
        System.out.println("\ndisplay the student detail");
        System.out.println("\ndepartment of "+department.toUpperCase());
        System.out.println("Number of student in the List:\t"+studentList.size());
        System.out.format(format,"roll number","student_name","age","city");
        for(int index=0;index<studentAllData.size();index++)
        {
            ArrayList<String> studentList=studentAllData.get(index);
            System.out.format(format,index+1,studentList.get(0),studentList.get(1),studentList.get(2));
        }
    }
    void studentSubjectAndMarks()
    {
        System.out.println("\nEnter the Student roll number:");
        int number=sc.nextInt();
        sc.nextLine();
        if(studentList.containsKey(number))
        {
            ArrayList<Subject> subjectList=studentList.get(number);
            if(subjectList.isEmpty())
                subjectList.add(new Subject());
            Subject subject=subjectList.get(0);
            subjectDataList=subject.subject(subjectDataList);
        }
        else
            System.out.println("no roll number in the list");

    }
    void displayStudentRep()
    {
        int max=Integer.MIN_VALUE;
        int index=1;
        for(ArrayList<String> studentData : studentAllData)
        {
            ArrayList<Subject> subjectList=studentList.get(index);
            Subject subject=subjectList.get(0);
            int marks=subject.displayTheHigerMarkStudent();
            if(max<marks)
            {
                max=marks;
                this.rep=studentData.get(0);
            }
            index++;
        }
        System.out.println("The name of the student rep is :  "+this.rep);
    }
    void changeDetail(ArrayList<String> studentList)
    {
        System.out.println("\n\n1.change the name\n2.change the city\n3.change the age");
        System.out.println("\nEnter your choice");
        int choice=Integer.parseInt(sc.next());
        switch(choice)
        {
            case 1:
                System.out.println("Enter the new name:");
                sc.nextLine();
                String newName=sc.nextLine();
                studentList.set(0, newName);
                break;
            case 2:
                System.out.println("Enter the new City");
                String city=sc.next();
                studentList.set(2, city);
                break;
            case 3:
                System.out.println("Enter the correct age");
                String age=sc.next();
                studentList.set(1, age);
                break;
            default:
                System.out.println("invlaid data");
                break;     
        }
    }
    void addSubject(String name,String code)
    {
        ArrayList<String> subjectData=new ArrayList<String>();
        subjectData.add(name);
        subjectData.add(code);
        subjectDataList.add(subjectData);
    }
    void listOfSubject()
    {
        System.out.println("list of subject");
        String format="%1$-20s%2$-20s\n";
        System.out.format(format,"Subject name","Subject code");
        for(ArrayList<String> subjectData : subjectDataList)
            System.out.format(format,subjectData.get(0),subjectData.get(1));
    }
}
