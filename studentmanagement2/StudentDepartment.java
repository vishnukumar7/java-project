
package studentmanagement2;

import java.util.ArrayList;
import java.util.TreeMap;
import static studentmanagement.Semester.sc;

public class StudentDepartment {
        TreeMap<String,ArrayList<Student>> departmentList=new TreeMap<>();
    void department()
    {
        String str;
        do
        {
            System.out.println("Enter the department name");
            String department=sc.next();
            if(!departmentList.containsKey(department))
            {
                departmentList.put(department, new ArrayList<>());
            }
            ArrayList<Student> studentList=departmentList.get(department);
            if(studentList.isEmpty())
                studentList.add(new Student());
            Student student=studentList.get(0);
            student.studentAdmin(department);
            System.out.println("Exit to department details (y/n) ");
            str=sc.next();
        }while(str.equalsIgnoreCase("n"));
    }
    
}
