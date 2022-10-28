class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //k = number of bananas eaten per hour
        //Applying Binary search to reduce time comp. from brute force
        //brute force : O(maxValueof(P).len(P)) ex 1: O([1,2..11]*4) = O(11*4)
        //we have to reduce maxValueOf(P) by binary search to log(maxValueof(P))
        //Binary search : O(log(max(P)).lenP)
        
        int k=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>k)
                k=piles[i];
        }
        
        int left=1;
        int right=k;
        int sum =0;
        int min =k;
        
        while(left<right){
            int mid = (left+right)/2;
            sum =0;
            for(int i=0;i<piles.length;i++){
                sum +=Math.ceil((double) piles[i]/mid);
            }
            
            if(sum<=h)
                right=mid;
            else if(sum>h)
                left=mid+1;
        }
        
        return right;
    }
}