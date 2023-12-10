public class Fraction {
    private int numer = 0;
    private int denom = 1;

    public Fraction() {
        this.numer = numer;
        this.denom = denom;
    }

    public Fraction(int x, int y) {
        this.numer = x;
        this.denom = y;
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.denom = f.denom;
    }

    @Override
    public String toString() {
        return "Fraction [" + this.numer + "/" + this.denom + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction F = (Fraction) obj;
            if ((this.numer == F.numer) && (this.denom == F.denom))
                return true;
        }
        return false;
    }
}
