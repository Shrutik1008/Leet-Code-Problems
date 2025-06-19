import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // First element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            // Update row in reverse to avoid overwriting values
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // Add 1 at the end of each row
        }

        return row;
    }
}
