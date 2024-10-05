// 39. Combination Sum

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        int length = candidates.length;
        int index = 0;
        solve(candidates, target, sum, length, index, list, new ArrayList<Integer>());
        return list;
    }

    void solve(int[] arr, int target, int sum, int n, int i, List<List<Integer>> list, List<Integer> answer) {
        if(sum>target || i>=n) return;
        if(sum==target) {
            list.add(new ArrayList<>(answer));
            return;
        }

        sum = sum + arr[i];
        answer.add(arr[i]);
        solve(arr, target, sum, n, i, list, answer);
        sum = sum - arr[i];
        answer.remove(answer.size()-1);
        solve(arr, target, sum, n, i+1, list, answer);
        return;
    }
}