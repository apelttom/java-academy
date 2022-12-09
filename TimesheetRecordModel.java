public class TimesheetRecordModel {

    String argumentHolder1;
    String argumentHolder2;
    String argumentHolder3;
    String argumentHolder4;

    void addHeader(String argument1, String argument2, String argument3, String argument4){
        argumentHolder1 = argument1;
        argumentHolder2 = argument2;
        argumentHolder3 = argument3;
        argumentHolder4 = argument4;
        return;
    }

    String toCharacters(){
        String result = argumentHolder1 + " ," + argumentHolder2 + " ," + argumentHolder3 + " ," + argumentHolder4 + "\n";
        return result;
    }
}
