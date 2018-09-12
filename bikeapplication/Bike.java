package bikeapplication;

public class Bike
{
    public static final String formatToAll="%1$#30s%2$-10s\n";
    public String company,model,licensePlate,cost,areaName,plate;
    Bike(String bikeCompany,String bikeModel,String bikeCost)
    {
        company=bikeCompany;
        model=bikeModel;
        cost=bikeCost;
        areaName="";
        plate="";
        licensePlate="";
    }
    void newLicensePlate(String state,String codeNumber,String codeName,String number)
    {
       licensePlate=state+" "+codeNumber+" "+number;
       plate=number;
       areaName=codeName;
    }
    void displayBikeDetail()
    {
            System.out.format(formatToAll,"The Bike Company Name: ",company);
            System.out.format(formatToAll,"The Bike Model Name: ",model);
            System.out.format(formatToAll,"The Bike user Cost: ",cost);
            System.out.format(formatToAll,"The Bike user Area Name: ",areaName);
            System.out.format(formatToAll,"The Bike user Lincense Plate: ",licensePlate);
            System.out.println();
    }
}