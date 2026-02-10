import java.util.*;

class repeated_missing {
    public static void findMissingAndRepeated(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        int[] freq = new int[N + 1]; // index 1..n^2

        // Count frequencies
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        List<Integer> missing = new ArrayList<>();
        List<Integer> repeated = new ArrayList<>();

        for (int num = 1; num <= N; num++) {
            if (freq[num] == 0) {
                missing.add(num);
            } else if (freq[num] > 1) {
                repeated.add(num);
            }
        }

        System.out.println("Missing numbers: " + missing);
        System.out.println("Repeated numbers: " + repeated);
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 2},
            {4, 5, 5},
            {7, 8, 8}
        };

        findMissingAndRepeated(grid);
    }
}

    
