import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();

        // The loop iterates from row 0 up to rowIndex.
        // 'row' in this loop represents the 1-indexed row number.
        // So, for rowIndex 'k', the loop will go up to 'k+1'.
        for (int row = 1; row <= rowIndex + 1; row++) {
            list.clear(); // Clear the list for the current row calculation
            
            long ans = 1; // Use long for intermediate calculations to prevent overflow
            list.add(1); // The first element of any row is 1

            // Calculate subsequent elements using the formula C(n, k) = C(n, k-1) * (n - k + 1) / k
            // Here, 'n' is (row - 1), and 'k' is 'col'.
            // The formula applied is: C(row-1, col) = C(row-1, col-1) * ((row-1) - col + 1) / col
            // Simplified: C(row-1, col) = C(row-1, col-1) * (row - col) / col
            for (int col = 1; col < row; col++) {
                // Ensure intermediate product uses long to avoid overflow
                ans = ans * (row - col) / col; 
                list.add((int) ans); // Add the calculated element to the list
            }
        }
        return list; // After the loop, 'list' will contain the rowIndex-th row.
    }
}