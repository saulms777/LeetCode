import java.util.ArrayList;
import java.util.List;

public class P118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i / 2 + 1; j++)
                row.add(pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j));
            for (int j = i / 2 + 1; j < i + 1; j++)
                row.add(row.get(i - j));
            pascal.add(row);
        }
        return pascal;
    }

}
