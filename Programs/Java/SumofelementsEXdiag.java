package Java;

public class SumofelementsEXdiag {
 
static int sumOfParts(int[][] arr, int N)
{
    int sum_part1 = 0, sum_part2 = 0,
        sum_part3 = 0, sum_part4 = 0;
    int totalsum = 0;
  
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
  
            
            if (i + j < N - 1) {
  
               
                if (i < j && i != j && i + j > 0)
                    sum_part1 += arr[i][j];
  
                
                else if (i != j)
                    sum_part2 += arr[i][j];
            }
            else {
  
               
                if (i > j && i + j != N - 1)
                    sum_part3 += arr[i][j];
  
            
                else {
                    if (i + j != N - 1 && i != j)
                        sum_part4 += arr[i][j];
                }
            }
        }
    }
  
  
    totalsum = sum_part1 + sum_part2
               + sum_part3 + sum_part4;
    return totalsum;
}
  

public static void main(String[] args)
{
    int N = 4;
    int arr[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
  
    System.out.print(sumOfParts(arr, N));
}
}
 

