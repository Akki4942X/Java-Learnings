public interface Spiral {

    int Srartrow = 0;

    public static void printmtx(int mtx[][]) {
        int Startrow = 0;
        int Endrow = mtx.length;
        int Startcol = 0;
        int Endcol = mtx[0].length;

        while (true) {
            // top
            for (int j = Startcol; j <= Endcol; j++) {
                System.out.println(mtx[Startrow][j] + " ");
            }
            // Right
            for (int i = Srartrow + 1; i < Endcol; i++) {

            }
        }
    }

    public static void main(String[] args) {
        int mtx[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    }
}
