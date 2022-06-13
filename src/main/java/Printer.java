public class Printer {

    private int paperInPrinter;
    private int tonerInPrinter;

    public Printer(int paperInPrinter, int tonerInPrinter){
        this.paperInPrinter = paperInPrinter;
        this.tonerInPrinter = tonerInPrinter;
    }

    public int numberOfSheets(){
        return this.paperInPrinter;
    }

    public int getToner(){
        return this.tonerInPrinter;
    }

    public void setPaperInPrinter(int paper){
        this.paperInPrinter = paper;
    }

    public void setToner(int newTonerValue){
        this.tonerInPrinter = newTonerValue;
    }

    public void addPaper(int paperToAdd){
        setPaperInPrinter(paperToAdd);
    }

    public String print(int pages, int copies){
        int value = pages * copies;
        if (this.paperInPrinter >= value){
            setPaperInPrinter(this.paperInPrinter - value);
            setToner(this.tonerInPrinter - value);
            String printMessage = "Printing Successful. You now have " + this.paperInPrinter + " sheets of paper left";
            return printMessage;
        } else{
            String errorMessage = "Sorry not enough paper";
            return errorMessage;
        }
    }


}
