public class Gameinheritance {
    public String name;
    public int maxnumplayer;

    public Gameinheritance(String name, int maxnumplayer) {
        this.name = name;
        this.maxnumplayer = maxnumplayer;

    }
    public String toString() {
        return "maximum number ofplayer for" + name + " is " + maxnumplayer;
    }
}
