
package studentmanagement2;

import studentmanagement.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import static studentmanagement.Semester.sc;

public class TeacherDepartment {
    public static final String format = "%1$-20s%2$-20s%3$-20s%4$-10s%5$-10s\n";
    TreeMap<String,ArrayList<Teacher>> departmentList=new TreeMap<>();
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
            ArrayList<Teacher> teacherList=departmentList.get(department);
            if(teacherList.isEmpty())
                teacherList.add(new Teacher());
            Teacher teacher=teacherList.get(0);
            teacher.teacherAdmin(department);
            System.out.println("Exit to department details (y/n) ");
            str=sc.next();
        }while(str.equalsIgnoreCase("n"));
    }
    
}
