import java.util.ArrayList;
import java.util.List;

public class P119_PascalsTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        row.add(1);
        long prev = 1;
        for (int i = 1; i < rowIndex / 2 + 1; i++) {
            long n = prev * (rowIndex + 1 - i) / i;
            prev = n;
            row.add((int) n);
        }
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++)
            row.add(row.get(rowIndex - i));
        return row;
    }

}
