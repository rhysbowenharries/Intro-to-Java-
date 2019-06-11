import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
       printer = new Printer(10, 5);
    }

    @Test
    public void canCheckForPaper(){
        assertEquals(true, printer.isTherePaper());

    }

    @Test
    public void canCheckForPaperEmpty(){
        printer = new Printer(0,5);
        assertEquals(false, printer.isTherePaper());

    }

    @Test
    public void canCalculateEnoughPaperNotEnough(){
        printer = new Printer(9,5);
        assertEquals(false, printer.enoughPaperChecker(5,2));
    }

    @Test
    public void canCalculateEnoughPaperEnough(){
        printer = new Printer(10,5);
        assertEquals(true, printer.enoughPaperChecker(5,2));
    }

    @Test
    public void isPaperDeductedCorrectly(){
        printer = new Printer(10,5);
        printer.print(4,2);
        assertEquals(2, printer.getPaper());
    }

    @Test
    public void isPaperDeductedCorrectlyNotEnoughPaper(){
        printer = new Printer(7,5);
        printer.print(4,2);
        assertEquals(7, printer.getPaper());
    }

    @Test
    public void isTonerDeductedCorrectly(){
        printer = new Printer(10,10);
        printer.print(4,2);
        assertEquals(2, printer.getToner());
    }

    @Test
    public void isTonerDeductedCorrectlyNotEnoughPaper(){
        printer = new Printer(10,10);
        printer.print(4,3);
        assertEquals(10, printer.getToner());
    }
}
