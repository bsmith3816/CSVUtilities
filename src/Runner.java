public class Runner {
    public static void main(String[] args){
        CSVUtilities list = new CSVUtilities("Local_Law_44_-_Unit_Income_Rent.csv");
        System.out.println(list.getColumnHeaders());
        System.out.println(list.getDataString(0));
        System.out.println(list.getDataInt(0));
        System.out.println(list.getDataDouble(0));
        //DOB_NOW__Build___Approved_Permits
    }
}
