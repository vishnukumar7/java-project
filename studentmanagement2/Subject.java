
package studentmanagement2;
import java.util.ArrayList;
import static studentmanagement.Semester.sc;

public class Subject {
    public static final String format = "%1$-20s%2$-20s%3$-15s%4$-15s%5$-15s\n";
    ArrayList<ArrayList<String>> subjectMarksList=new ArrayList<ArrayList<String>>();
    
    ArrayList<ArrayList<String>>  subject(ArrayList<ArrayList<String>> subjectDataList)
    {
        String str;
        do
        {
            System.out.println("\n\n1.delete subject\n2.Add all marks\n3.update marks\n4.list of subject nad their marks");
            System.out.println("\nEnter your Choice");
            int choice=Integer.parseInt(sc.next());
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the subject name");
                    sc.nextLine();
                    String subjectName=sc.nextLine();;
                    subjectDataList=removeSubject(subjectName,subjectDataList);
                    break;                    
                case 2:
                    subjectMarksList.clear();
                    addSubjectMarks(subjectDataList);
                    break;
                case 3:
                    System.out.println("Enter the subject name");
                    sc.nextLine();
                    subjectName=sc.nextLine();
                    updateMarks(subjectName);
                    break;
                case 4:
                    listOfMarks();
                    break;
                default:
                    System.out.println("invlaid data");
                    break;
                    
            }
            System.out.println("exits to subject details (y/n) ");
            str=sc.next();
        }while(str.equalsIgnoreCase("n"));
        return subjectDataList;
    }
    void updateMarks(String subName)
    {
       
        int flag=0;
        for(ArrayList<String> subjectData : subjectMarksList)
        {
            if(subjectData.contains(subName))
            {
                System.out.println("Enter the theory marks");
                String theory=sc.next();
                System.out.println("Enter the pratical marks");
                String pratical=sc.next();
                subjectData.set(2, theory);
                subjectData.set(3, pratical);
                subjectData.set(4, addMarks(theory,pratical));
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("no subject name in the list");
        
    }
    void addSubjectMarks(ArrayList<ArrayList<String>> subjectDataList)
    {
        int flag=0;
        
        for(ArrayList<String> subjectData : subjectDataList)
        {
            ArrayList<String> subjectData1=new ArrayList<>();
            flag=1;
            subjectData1.add(subjectData.get(0));
            subjectData1.add(subjectData.get(1));
            System.out.println("Enter the "+subjectData.get(0)+" theory Marks");
            String theoryMarks=sc.next();
            System.out.println("Enter the "+subjectData.get(0)+" pratical Marks");
            String pratical=sc.next();
            subjectData1.add(theoryMarks);
            subjectData1.add(pratical);
            subjectData1.add(addMarks(theoryMarks,pratical));
            subjectMarksList.add(subjectData1);
            System.out.println();
        }
        if(flag==0)
            System.out.println("no subject in the list");
    }
    ArrayList<ArrayList<String>> removeSubject(String subName,ArrayList<ArrayList<String>> subjectDataList)
    {
        int flag=0;
        for(ArrayList<String> studentData : subjectMarksList)
        {
            if(studentData.contains(subName))
            {
                flag=1;
                subjectMarksList.remove(studentData);
                break;
            }
        }
        for(ArrayList<String> studentData : subjectDataList)
        {
            if(studentData.contains(subName))
            {
                flag=1;
                subjectDataList.remove(studentData);
                break;
            }
        }
        if(flag==0)
            System.out.println("no subject name in the list");
        else
            System.out.println("delete successful");
        return subjectDataList;
    }
    int displayTheHigerMarkStudent()
    {
        int marks=0;
        
        for(ArrayList<String> subjectData : subjectMarksList)
        {
            marks+=Integer.parseInt(subjectData.get(4));
        }
        return marks;
    }
    String addMarks(String theory,String pratical)
    {
        return Integer.toString(Integer.parseInt(theory)+Integer.parseInt(pratical));
    }
    void listOfMarks()
    {
        if(subjectMarksList.size()!=0)
        {
            System.out.format(format,"Subject name","Subject code","theory marks","pratical marks","total marks");
            for(ArrayList<String> subjectMarks : subjectMarksList)
            {
                System.out.format(format,subjectMarks.get(0),subjectMarks.get(1),subjectMarks.get(2),subjectMarks.get(3),subjectMarks.get(4));
            }
        }
        else
            System.out.println("No subject and marks in the list");
                
    }
}
