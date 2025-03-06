package eu.deic.ooparray;

public class ProgMainStudentsOop {
    public static void main(String[] args) {
        int[][] sMarks = new int[][] {{5, 7, 9}, {2, 9, 8}};
        double[] sAvgM = new double[sMarks.length];
        Student[] g1073 = new Student[sMarks.length];
        int i = 0;
        while (i < g1073.length) {
            g1073[i] = new Student(sMarks[i]);
            sAvgM[i] = g1073[i].getAvgMark();
            i++;
        } // end while orange

        for(int k = 0; k < sAvgM.length; k++) {
            System.out.printf("\n For student %d the avg mark is %f \n", k, sAvgM[k]);

        }
    } // end main
} // end class
