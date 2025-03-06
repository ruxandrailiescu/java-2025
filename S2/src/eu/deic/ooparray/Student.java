package eu.deic.ooparray;

public class Student {
    private int[] sMarksV;
    private double sAvgMark;

    public Student(int[] sMarksV) {
        this.sMarksV = sMarksV;
    }

    public int[] getsMarksV() {
        return sMarksV;
    }

    public void setsMarksV(int[] sMarksV) {
        this.sMarksV = sMarksV;
    }

    public double getsAvgMark() {
        return sAvgMark;
    }

    public void setsAvgMark(double sAvgMark) {
        this.sAvgMark = sAvgMark;
    }

    public double getAvgMark() {
        this.sAvgMark = 0;
        int j = 0;
        while (j < this.sMarksV.length) {
            this.sAvgMark = this.sAvgMark + sMarksV[j];
            j++;
        } // end while cols
        sAvgMark /= this.sMarksV.length;
        return this.sAvgMark;
    }
}
