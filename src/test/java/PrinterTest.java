import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(0, 100);
    }

    @Test
    public void noPaperInPrinter(){
        assertEquals(0, printer.numberOfSheets());
    }

    @Test
    public void canAddPaperToPrinter(){
        printer.addPaper(50);
        assertEquals(50, printer.numberOfSheets());
    }

    @Test
    public void hasEnoughPaperToPrint(){
        printer.addPaper(50);
        assertEquals("Printing Successful. You now have 46 sheets of paper left", printer.print(2,2));
    }

    @Test
    public void doesNotHaveEnoughPaperToPrint(){
        printer.addPaper(50);
        assertEquals("Sorry not enough paper", printer.print(50,2));
    }

    @Test
    public void printerHasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void tonerReducesWithPrinting(){
        printer.addPaper(50);
        printer.print(5, 2);
        assertEquals(90, printer.getToner());
    }

    @Test
    public void tonerReducesWithMorePrinting(){
        printer.addPaper(50);
        printer.print(20, 2);
        assertEquals(60, printer.getToner());
    }


}
