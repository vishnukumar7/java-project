package studentmanagement2;

import java.util.ArrayList;
import static studentmanagement.Semester.sc;
import static studentmanagement2.TeacherDepartment.format;

public class Teacher {
    ArrayList<ArrayList<String>> teacherList=new ArrayList<>();
    public String hod,age,city;
    void teacherAdmin(String department)
    {
        String str;
        do
        {
            System.out.println("\n\n1change (or) add the head of the department\n2.Add Teacher and their subject to take\n3.Edit teacher and thier subject\n4.display teacher and their hod");
            System.out.println("\nEnter your choice");
            int choice=Integer.parseInt(sc.next());
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the new HOD");
                    sc.nextLine();
                    String hod=sc.nextLine();
                    System.out.println("Enter the HOD age");
                    String age=sc.next();
                    System.out.println("Enter the city");
                    String city=sc.next();
                    setNewHod(hod,age,city);
                    break;
                case 2:
                    System.out.println("Enter the Teacher name");
                    sc.nextLine();
                    String name=sc.next();
                    System.out.println("Enter the Teacher age");
                    age=sc.next();
                    System.out.println("Enter the city");
                    city=sc.next();
                    System.out.println("Enter the which subject to be teach");
                    String subject=sc.next();
                    addTeacher(name,city,age,subject);
                    break;
                case 3:
                    editTeacher();
                    break;
                case 4:
                    displayTeacher(department);
                    break;
                default:
                    System.out.println("invlaid data");
                    break;
            }
            System.out.println("\nexit to teacher details (y/n):  ");
            str=sc.next();
        }while(str.equalsIgnoreCase("n"));
    }
    void addTeacher(String name,String city,String age,String subject)
    {
        ArrayList<String> teacherData=new ArrayList<String>();
        teacherData.add(""+teacherList.size()+1);
        teacherData.add(name);
        teacherData.add(city);
        teacherData.add(age);
        teacherData.add(subject);
        teacherList.add(teacherData);
    }
    
    void displayTeacher(String department)
    {
       if(this.hod==null)
       {
            System.out.println("The head of the department : ");
            String head="%1$-10s%2$-10s%3$-10s\n";
            System.out.format(head,"HOD name","city","age");
            System.out.format(head,this.hod,this.city,this.age );
       }
        System.out.println("\ndisplay the teacher detail");
        System.out.println("\nDepartment of "+department.toUpperCase());
        System.out.println("Number of teacher in the List:\t"+teacherList.size());
        System.out.format(format,"roll number","teacher name","city","age","teach subject");
        for(ArrayList<String> teacherData : teacherList)
           System.out.format(format, teacherData.get(0),teacherData.get(1),teacherData.get(2),teacherData.get(3),teacherData.get(4));
    }
    
    void editTeacher()
    {
        System.out.println("\nEnter the roll number to be edited");
        int rollNo=sc.nextInt();
        sc.nextLine();
        for(ArrayList<String> teacherData : teacherList)
        {
            if(teacherData.contains(""+rollNo))
            {
                changeDetail(teacherData);
            }
        }
    }
    void setNewHod(String hodName,String age,String city)
    {
        this.hod=hodName;
        this.age=age;
        this.city=city;
    }
    void changeDetail(ArrayList<String> teacher)
    {
        System.out.println("\n\n1.change the name\n2.change the city\n3.change the age\n4.change the subject name to be taken");
        System.out.println("\nEnter your choice");
        int choice=Integer.parseInt(sc.next());
        switch(choice)
        {
            case 1:
                System.out.println("Enter the new name:");
                String newName=sc.next();
                teacher.set(1, newName);
                break;
            case 2:
                System.out.println("Enter the new City");
                String city=sc.next();
                teacher.set(2, city);
                break;
            case 3:
                System.out.println("Enter the correct age");
                String age=sc.next();
                teacher.set(3, age);
                break;
            case 4:
                System.out.println("Enter the subject name");
                String subName=sc.next();
                boolean data=false;
                do
                {
                    data=false;
                    for(ArrayList<String> teacherData : teacherList)
                    {
                        if(teacherData.contains(subName))
                        {
                            System.out.println("someone take this subject");
                            System.out.println("Enter the different subject name");
                            subName=sc.next();
                            data=true;
                            break;
                        }
                    }
                    
                }while(data);
                teacher.set(4, subName);
                break;
            default:
                System.out.println("invlaid data");
                break;
        }
    }

}
