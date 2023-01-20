package src.main;

import java.util.ArrayList; // import the ArrayList class

public class TimesheetRecordModel {

    private ArrayList<String> headers = new ArrayList<>();
    private ArrayList<String> body = new ArrayList<>();

    public void addHeader(String newHeader){
        headers.add(newHeader);
    }

    public void addBodyElement(String element){
        body.add(element);
    }

    public String headersToString(){
        String result = "";
        var iterator = headers.iterator();
        while(iterator.hasNext()){
            var header = iterator.next();
            // if we are dealing with last element (there is no next) we will have to add end of line
            if(!iterator.hasNext()){
                result = result + header + ",\n";
            } else {
                result = result + header + ", ";
            }
        }
        return result;
    }

    public String toString(){
        return headers.get(0);
    }
}
