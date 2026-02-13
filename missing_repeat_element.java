 
 class missing_repeat_element {
    

    public static int[] findMissingAndRepeated(int[][] grid) {
        int n = grid.length;
        int N = n * n;   // numbers are from 1 to n^2

        long sumActual = 0;
        long sumSqActual = 0;

        // Traverse the 2D grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                sumActual += val;
                sumSqActual += (long) val * val;
            }
        }

        // Expected sums for 1..n^2
        long sumExpected = (long) N * (N + 1) / 2;
        long sumSqExpected = (long) N * (N + 1) * (2L * N + 1) / 6;

        long deltaS = sumActual - sumExpected;      // y - x
        long deltaQ = sumSqActual - sumSqExpected;  // y^2 - x^2

        long sumYX = deltaQ / deltaS;               // y + x

        int repeated = (int) ((deltaS + sumYX) / 2);
        int missing  = (int) (sumYX - repeated);

        return new int[]{missing, repeated};
    }

    // Example usage
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 5, 9}
        };

        int[] result = findMissingAndRepeated(grid);
        System.out.println("Missing: " + result[0]);
        System.out.println("Repeated: " + result[1]);
    }
}


