import java.io.FileWriter;

public class TimesheetApp {
    
    public static void main(String inputArguments[]) throws Exception {
        String fileName = "timesheet.csv";
        System.out.println("==================================");
        System.out.println("Welcome to KPMG Timesheet Program!");
        System.out.println("==================================");

        TimesheetRecordModel recordModel = new TimesheetRecordModel();
        var headers = recordModel.addHeader("Activity");
        //recordModel.addHeader("Activity", "workedTime", "units", "project");
        // recordModel.addData("Development", 8, "hours", "CEZ");

        FileWriter writer = new FileWriter(fileName, true);
        writer.append(recordModel.toString());
        writer.close();

        //--------------OLD CODE-------------------------------
        
        // String[] dataHeader = new String[4];

        // dataHeader[0] = "Activity ,";
        // dataHeader[1] = "workedTime ,";
        // dataHeader[2] = "units ,";
        // dataHeader[3] = "project\n";

        // String[] dataRow = new String[4];
        
        // dataRow[0] = "Development ,";
        // dataRow[1] = "8 ,";
        // dataRow[2] = "hours ,";
        // dataRow[3] = "CEZ\n";

        // //System.out.println("Input argument number 1: " + inputArguments[0]);
        // //System.out.println("Input argument number 2: " + inputArguments[1]);
        // //System.out.println("Input argument number 3: " + inputArguments[2]);

        // //System.out.println("We will now log 8 hours of work today on CEZ project into file: " + fileName);
        // try{
        //         FileWriter writer = new FileWriter(fileName, true);
        //         for(int index = 0; index < 4; index = index + 1){
        //             writer.append(dataHeader[index]);
        //             //writer.append(" ");
        //             //writer.append(",");
        //         }

        //         for(int index = 0; index < 4; index = index + 1){
        //             writer.append(dataRow[index]);
        //             //writer.append(" ");
        //             //writer.append(",");
        //         }
        //         writer.close();
        // } catch (Exception e) {
        //         e.printStackTrace();
        // }

        System.out.println("Program finished. Press any key...");
        System.in.read();
    }
}
