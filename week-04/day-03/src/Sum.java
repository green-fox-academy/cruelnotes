import java.util.ArrayList;

public class Sum {

      ArrayList<Integer> nums;

    public Sum(int numbers) {
        this.nums = new ArrayList<>();
    }

    public void addNum(int num) {
        nums.add(num);
    }

    public int addingUp(ArrayList<Integer> nums) {
        try {
            int total = 0;
            for (int i = 0; i < nums.size()-1; i++) {
               total += nums.get(i);
        }
            return total;
        } catch (NullPointerException ex) {
            return 0;
        }
    }
}
