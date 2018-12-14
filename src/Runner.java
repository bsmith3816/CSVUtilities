public class Runner {
    public static void main(String[] args){
        CSVUtilities list = new CSVUtilities("Water_Consumption_In_The_New_York_City.csv");
        System.out.println(list.getColumnHeaders());
        System.out.println(list.getDataString(0));
        System.out.println(list.getDataInt(0));
        System.out.println(list.getDataDouble(0));
        //DOB_NOW__Build___Approved_Permits
    }
}
