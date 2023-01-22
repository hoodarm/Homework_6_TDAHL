public class Main {
    public static void main(String[] args) {
        final int N = 16;
        int[][] A = new int[N][N];
        if (N%2==0)
            evenSpiralFiller(0,N-1,N-1,0, N, A, 1);
        else
            oddSpiralFiller(0,N-1,N-1,0, N, A, 1);
    }

    static void evenSpiralFiller(int TOP, int BOTTOM, int RIGHT, int LEFT, int N, int[][] A, int currN) {
        if (BOTTOM-TOP<1){
            for (int i = 0; i<N; i++){
                for (int j = 0; j<N; j++){
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }
        for (int i = LEFT; i <= RIGHT; i++) {
            A[TOP][i] = currN;
            currN++;
        }
        TOP++;
        for (int i = TOP; i <= BOTTOM; i++) {
            A[i][RIGHT] = currN;
            currN++;
        }
        RIGHT--;
        for (int i = RIGHT; i >= LEFT; i--) {
            A[BOTTOM][i] = currN;
            currN++;
        }
        BOTTOM--;
        for (int i = BOTTOM; i >= TOP; i--) {
            A[i][LEFT] = currN;
            currN++;
        }
        LEFT++;
        evenSpiralFiller(TOP, BOTTOM, RIGHT, LEFT, N, A, currN);
    }

    static void oddSpiralFiller(int TOP, int BOTTOM, int RIGHT, int LEFT, int N, int[][] A, int currN) {
        A[N/2][N/2] = currN;
        if (BOTTOM-TOP<=1){
            for (int i = 0; i<N; i++){
                for (int j = 0; j<N; j++){
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }
        for (int i = LEFT; i <= RIGHT; i++) {
            A[TOP][i] = currN;
            currN++;
        }
        TOP++;
        for (int i = TOP; i <= BOTTOM; i++) {
            A[i][RIGHT] = currN;
            currN++;
        }
        RIGHT--;
        for (int i = RIGHT; i >= LEFT; i--) {
            A[BOTTOM][i] = currN;
            currN++;
        }
        BOTTOM--;
        for (int i = BOTTOM; i >= TOP; i--) {
            A[i][LEFT] = currN;
            currN++;
        }
        LEFT++;
        oddSpiralFiller(TOP, BOTTOM, RIGHT, LEFT, N, A, currN);
    }
}