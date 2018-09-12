package bikeapplication;
import java.util.*;

public class Main {
    public static final String formatToAll="%1$-30s%2$-10s\n";
    HashMap<String,Long> rtoIncomeRegister=new HashMap<String,Long>();
    HashMap<String,ArrayList<Bike>> userBike=new HashMap<String,ArrayList<Bike>>();
    TreeSet<Integer> plateNumber=new TreeSet<Integer>();
    HashMap<String,String> areaCode=new HashMap<String,String>();
    public int i;
    Main()
    {
        areaCode.put("tam", "41");
        areaCode.put("vela", "55");
        areaCode.put("egmore","65");
        areaCode.put("man","78");
        areaCode.put("peru","56");
        areaCode.put("chrom","77");
    }
    
    void personDetail(String name,String company,String model,String cost)
    {
        if(!userBike.containsKey(name))
           userBike.put(name, new ArrayList<Bike>());
           ArrayList<Bike> bikeList=userBike.get(name);
           Bike newBike=new Bike(company,model,cost);
           bikeList.add(newBike);
    }
    
    void registerBike(String name,String state,String CodeName,String number)
    {
        ArrayList<Bike> bikeList=userBike.get(name);
        int lastBike=bikeList.size()-1;
        Bike newBikeRegister=bikeList.get(lastBike);
        String codeNumber=districtCode(CodeName);
        newBikeRegister.newLicensePlate(state,codeNumber , CodeName, number);      
    }
    
    void display()
    {
       for(Map.Entry mapKey:userBike.entrySet())
       {
           System.out.format(formatToAll,"The bike person name:",mapKey.getKey());
           ArrayList<Bike> bikeList=userBike.get(mapKey.getKey());
           System.out.format(formatToAll,"The number of bike:",bikeList.size());
           System.out.println();
           int count=1;
           for(Bike bike : bikeList)
           {
               System.out.println("The Bike "+count+" details");
               bike.displayBikeDetail();
               count++;
           }
               
       }
    }
    void rtoIncomeRegister(String name,long newIncome)
    {   
        if(rtoIncomeRegister.containsKey(name))
        {
            long oldIncome=rtoIncomeRegister.get(name);
            newIncome+=oldIncome;
        }
        rtoIncomeRegister.put(name, newIncome);
    }
    void displayByAllRtoIncome()
    {
         for(Map.Entry mapKey:rtoIncomeRegister.entrySet())
         {
            System.out.format(formatToAll,"\nRTO AREA name:",mapKey.getKey());
            System.out.format(formatToAll,"RTO Income :",mapKey.getValue());
         }
    }
    void findByLicensePlateNumber(String number)
    {
        for(Map.Entry mapKey:userBike.entrySet())
        {
            ArrayList<Bike> bike=userBike.get(mapKey.getKey());
            for(Bike b : bike)
            {
                if(b.plate.equals(number))
                {
                    System.out.format(formatToAll,"The person Name:",mapKey.getKey());
                    b.displayBikeDetail();
                }
            }
        }
    }
    void findByName(String name)
    {
        ArrayList<Bike> bike=userBike.get(name);
        int count=1;
            for(Bike b : bike)
           {
               System.out.println("The Bike "+count+" details");
               b.displayBikeDetail();
               count++;
           }
    }
    boolean isPlateNumberCheck(int number)
    {
       if(plateNumber.contains(number))
                return true;
        plateNumber.add(number);
        return false;
    }
    String districtCode(String codeName)
    {
        return areaCode.get(codeName);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        Main m=new Main();
        long rtoIncome=0;
        String str;
        do
        {
            System.out.println("\n1.buying bike and registration\n2.display the bike details\n3.RTO_income\n4.Find the Person\n5.Find the bike detail");
            System.out.println("\nEnter Your choice:\t");
            int choice =Integer.parseInt(sc.next());
            switch(choice)
            {
                case 1:
                    System.out.println("\nEnter the person name:\t");
                    String personName=sc.next();
                    System.out.println("Enter the bike company:\t");
                    String bikeCompany=sc.next();
                    System.out.println("Enter the bike model:\t");
                    String bikeModel=sc.next();
                    System.out.println("Enter the buy cost:\t");
                    String cost=sc.next();
                    m.personDetail(personName, bikeCompany, bikeModel,cost);
                    System.out.println("\nThe Bike Registration:");
                    System.out.print("Enter the state and district(TAM/vela/peru/man/chrom/egmore):\t");
                    String name=sc.next();
                    
                    System.out.print("is it any special number (y/n):\t");
                    String secret=sc.next();
                    String number="";
                    if(secret.equalsIgnoreCase("y"))
                    {
                        boolean data=false;
                        do
                        {   System.out.println("\nEnter the Special number:");
                            number =sc.next();
                            if(Integer.parseInt(number)>=1 && Integer.parseInt(number)<=9999 && number.length()<=4)
                            {
                                if(!m.isPlateNumberCheck(Integer.parseInt(number)))
                                {
                                    System.out.println("The number is Registrated");
                                    rtoIncome=1000;
                                    data=false;
                                }
                                else
                                {
                                    System.out.println("The number is already Registrated");
                                    data=true;
                                }
                            }
                            else
                            {
                                System.out.println("the number is invalid:\t");
                                data=true;
                            }
                        }
                        while(data);
                    }
                    else
                    {
                        boolean data=false;
                        do
                        {
                            int num=(int)(Math.random()*9999+1);
                            data=m.isPlateNumberCheck(num);
                            number=String.valueOf(num);
                        }while(data);
                        rtoIncome=500;
                        System.out.println("The number is Registrated");
                    }
                    m.registerBike(personName,"TN", name,number);
                    m.rtoIncomeRegister(name,rtoIncome);
                    break;
                case 2:
                    m.display();
                    break;
                case 3:
                    m.displayByAllRtoIncome();
                    break;
                case 4:
                    System.out.println("Enter the license plate last three (or)  four digit :");
                    String plate=sc.next();
                    m.findByLicensePlateNumber(plate);
                    break;
                case 5:
                    System.out.println("Enter the person name and display the details");
                    name=sc.next();
                    m.findByName(name);
                    break;
                    
            }
            System.out.println("\ncontinue (y/n):\t");
            str=sc.next();
            System.out.println("\n");
        }while(str.equalsIgnoreCase("y"));
    }
}
