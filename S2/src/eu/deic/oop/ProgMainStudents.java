package eu.deic.oop;

public class ProgMainStudents {
    public static void main(String[] args) {
        int[][] sMarks = new int[][] {{5, 7, 9}, {2, 9, 8}};
        double[] sAvgM = new double[sMarks.length];
        int i = 0;
        while(i < sMarks.length) {
            sAvgM[i] = 0;
            int j = 0;
            while (j < sMarks[i].length) {
                sAvgM[i] = sAvgM[i] + sMarks[i][j];
                j++;
            } // end while cols
            sAvgM[i] /= sMarks[i].length;
            i++;
        } // end while sMarks

        int k = 0;
        while (k < sAvgM.length) {
            System.out.printf("\n for student %d the avg mark is %f \n", k, sAvgM[k]);
            k++;
        }
    } // end main method
} // end class
