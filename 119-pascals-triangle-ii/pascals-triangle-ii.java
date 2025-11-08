class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<>();
        rowIndex++;
        int a [] = new int [rowIndex];
        // if(rowIndex<1){
        //     l.add(1);
        //     return l;
        // }
        a[rowIndex-1]=1;
        for(int i = rowIndex-2;i>=0;i--){
            for(int j=i;j<rowIndex-1 ;j++)
                a[j]=a[j]+a[j+1];
            }
            //System.out.println(a);
        
        for(int i=0;i<rowIndex;i++){l.add(a[i]);}
        return l;
    
}}