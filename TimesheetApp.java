import java.io.FileWriter;

public class TimesheetApp {
    public static void main(String inputArguments[]) throws Exception {
        String fileName = "timesheet.csv";
        System.out.println("==================================");
        System.out.println("Welcome to KPMG Timesheet Program!");
        System.out.println("==================================");
        
        String[] dataRow = new String[4];
        
        dataRow[0] = "Development";
        dataRow[1] = "8";
        dataRow[2] = "hours";
        dataRow[3] = "CEZ";
        
        System.in.read();

        //System.out.println("Input argument number 1: " + inputArguments[0]);
        //System.out.println("Input argument number 2: " + inputArguments[1]);
        //System.out.println("Input argument number 3: " + inputArguments[2]);



        //System.out.println("We will now log 8 hours of work today on CEZ project into file: " + fileName);
        //try{
        //        FileWriter writer = new FileWriter(fileName, true);
        //        writer.append("Working 8 hours CEZ project.\n");
        //        writer.close();
        //} catch (Exception e) {
        //        e.printStackTrace();
        //}
    }
}
