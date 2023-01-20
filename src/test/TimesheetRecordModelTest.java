package src.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.TimesheetRecordModel;

public class TimesheetRecordModelTest {

    @Test
    public void testHeadersToString(){
        String itShouldLookLikeThis = "TestHeader1, TestHeader2,\n";
        TimesheetRecordModel model = new TimesheetRecordModel();
        model.addHeader("TestHeader1");
        model.addHeader("TestHeader2");
        var csv = model.headersToString();
        System.out.printf("Testing whether these are same:\n%s%s",itShouldLookLikeThis,csv);
        Assertions.assertTrue(itShouldLookLikeThis.equals(csv));
    }
}
