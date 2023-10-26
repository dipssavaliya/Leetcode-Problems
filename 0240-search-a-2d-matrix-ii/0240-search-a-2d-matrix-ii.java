class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row=0; int col=matrix[0].length-1;
    while(row<matrix.length && col>=0)
    {
      if(matrix[row][col]==target)
      {
       // System.out.println("found key at ( "+row +" " + col +")");
        return true;
      }
      //left
      else if(target<matrix[row][col])
      {
        col--;
      }
      //bottom
      else 
      {
        row++;
      }
    }
  //  System.out.println("key not found!");
    return false;
  }
}
