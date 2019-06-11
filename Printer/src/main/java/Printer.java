public class Printer {
    private Integer paper;
    private Integer toner;
    private int paperRequired;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;

    }



    public boolean isTherePaper(){
        if (this.paper > 0){
            return true;
        } else return false;
    }

    public boolean enoughPaperChecker(int paper, int copies){
        this.paperRequired = paper * copies;
        if(this.paperRequired <= this.paper){
            return true;
        } else return false;
    }

    public void print(int paper, int copies) {
        this.paperRequired = paper * copies;
        if (this.enoughPaperChecker(paper,copies) == true){
            this.paper -= this.paperRequired;
            this.toner -= this.paperRequired;
        }
    }
    public int getPaper() {
        return this.paper;
    }
    public int getToner() {
        return this.toner;
    }
}
