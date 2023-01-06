import java.util.ArrayList; // import the ArrayList class

public class TimesheetRecordModel {

    private ArrayList<String> headers = new ArrayList<String>();

    public boolean addHeader(String newHeader){
        headers.add(newHeader);
        return true;
    }

    private String getHeaders(){
        // String result = argumentHolder1 + " ," + argumentHolder2 + " ," + argumentHolder3 + " ," + argumentHolder4 + "\n";
        String result = "";
        return result;
    }

    public String toString(){
        return headers.get(0);
    }
}
