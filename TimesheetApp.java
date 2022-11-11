import java.io.FileWriter;

public class TimesheetApp {
    public static void main(String args[]) {
	try{
		FileWriter writer = new FileWriter("timeLog.txt", true);
		writer.append("Working 8 hours CEZ project.\n");
		writer.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

}
