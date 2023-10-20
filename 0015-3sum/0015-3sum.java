class Solution {
public List<List<Integer>> threeSum(int[] nums) {
Arrays.sort(nums);
List<List<Integer>> al = new ArrayList<>();
for(int i = 0 ; i < nums.length-2 ; i++){
while(i != 0 && nums[i] == nums[i-1] && i != nums.length-1){
i++;
}
int low = i+1;
int high = nums.length-1;
while(low<high){
while(low != i+1 && nums[low] == nums[low-1] && low != nums.length-1){
low++;
}
while(high != nums.length-1 && nums[high] == nums[high+1] && high != 0){
high--;
}
if(low < high && nums[i] + nums[low] + nums[high] == 0){
List<Integer> al1 = new ArrayList<>();
al1.add(nums[i]);
al1.add(nums[low]);
al1.add(nums[high]);
al.add(al1);
low++;
high--;
} else if(nums[i] + nums[low] + nums[high] < 0){
low++;
} else{
high--;
}
}
}
return al;
}
}
