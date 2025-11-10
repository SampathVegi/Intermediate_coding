// class Solution {
//     public List<Integer> getRow(int r) {
//         List<Integer> l = new ArrayList<>();
//         r++;
//         int a [] = new int [r];

//         a[r-1]=1;
//         for(int i = r-2;i>=0;i--){
//             for(int j=i;j<r-1 ;j++)
//                 a[j]=a[j]+a[j+1];
//             }

        
//         for(int i=0;i<r;i++){l.add(a[i]);}
//         return l;
    
// }}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;       // total elements in the row
        int[] row = new int[n];
        row[0] = 1;                 // first element is always 1

        // Build the row iteratively
        for (int i = 1; i < n; i++) {
            // Update elements from right to left
            for (int j = i; j > 0; j--) {
                row[j] = row[j] + row[j - 1];
            }
        }

        // Convert array to list
        List<Integer> result = new ArrayList<>();
        for (int num : row) result.add(num);
        return result;
    }
}
