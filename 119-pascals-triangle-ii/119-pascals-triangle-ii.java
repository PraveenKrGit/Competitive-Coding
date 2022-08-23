class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = null;
        List<Integer> prevRow = null;
        
        for(int i=0;i<= rowIndex;i++){
            row = new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                row.add(j==0 || j==i ? 1: prevRow.get(j)+prevRow.get(j-1));
            }
            
            prevRow= row;
        }
        
        return row;
    }
}