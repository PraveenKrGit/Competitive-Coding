class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //use two pointers.. one from front and another from back
        int i=0;
        int j=numbers.length-1;
        int[] res = new int[2];
        
        while(i<j){
            if(numbers[i]+numbers[j]<target)
                i++;
            else if(numbers[i]+numbers[j]>target)
                j--;
            else{
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
        }
        return res;
    }
}