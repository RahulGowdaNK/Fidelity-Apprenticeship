import java.util.SplittableRandom;

public class Gmaewithtimelimit extends Gameinheritance {
    public int timelimit;
    public Gmaewithtimelimit(String name ,int maxnumplayer, int timelimit) {
        super(name,maxnumplayer);
        this.timelimit = timelimit;

    }
    public String toString() {
        return super.toString()+" with time limit"+timelimit+ "minutes";


    }
}
