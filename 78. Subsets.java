// 78. Subsets

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        helper(0, nums, finalList, new ArrayList<>());
        return finalList;
    }
 
    public void helper(int i, int[] arr, List<List<Integer>> finalList, List<Integer> list) {
        if(i==arr.length) {
            finalList.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[i]);
        helper(i+1, arr, finalList, list);
        list.remove(list.size()-1);
        helper(i+1, arr, finalList, list);
    }
}