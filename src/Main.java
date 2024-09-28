//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] nums, int k) {
            int p1 = 0, p2 = 0;
            int sum = 0;
            int counter = 0;
            while(p2 < nums.length){
                sum += nums[p2];
                if(sum == k) counter++;
                if(sum >= k || (p2 == nums.length - 1 && sum < k)){
                    sum = 0;
                    p1++;
                    p2 = p1;
                    continue;
                }
                p2++;
            }

            return counter;
        }
}