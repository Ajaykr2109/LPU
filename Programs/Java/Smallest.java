package Java;
 
    class Smallest
    {
        
        static void printSmallest(int arr[][])
        {
            int smallest, arr_size = arr.length,j=0,i=0;
            smallest = Integer.MAX_VALUE;
            while (i < arr_size )
            {
                while(j<arr_size)
                {

                    if (arr[i][j] < smallest)
                    {
                        smallest = arr[i][j];
                    }
                    j++;

                }
                i++;     
            }
           System.out.println("The smallest element is " + smallest );
        }
     
       
        public static void main (String[] args)
        {
            int arr[][] = { { 12, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
            printSmallest(arr);
        }
    }


