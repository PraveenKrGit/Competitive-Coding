class Solution {
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                
                //for cases like "ebcbbececabbacecbbcbe"
                //where we have to check from which side we have to skip
                // we cant skip from one side
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;

    }


    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}   
        
        
        
        
        
//         int i=0;
//         int j=s.length()-1;
//         int count=0;
        
//         int tempi=0;
//         int tempj=0;
        
//         while(i<j){
//             if(s.charAt(i)==s.charAt(j)){
//                 i++;
//                 j--;
//             }
        
//             else if(s.charAt(i)!= s.charAt(j)){
//                 //count++;
//                 //for strigs like 'deeee' or like 'eeeed'
                
//                 //eedede
//                 if(s.charAt(i)==s.charAt(j-1)){
//                     count++;
//                     tempi=i;
//                     i++;
//                     tempj=j;
//                     j-=2;
//                 }
//                 else if(s.charAt(i+1) == s.charAt(j)){
//                     count++;
//                     tempi=i;
//                     j--;
//                     tempj=j;
//                     i+=2;
//                 }
                
//                  else{
//                      i++;
//                      j--;
//                  } 
                    
//             }
            
//         }
        
//         if(count <=1)
//             return true;
//         else 
//             return false;
  