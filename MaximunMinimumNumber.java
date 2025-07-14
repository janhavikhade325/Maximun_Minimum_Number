class MaximunMinimumNumber
 {
    public static void main(String[] args) {
        int []x = {2,3,4,5,1,6,7,8,9,10};
        int min = x[a];
        int max = x[a];
        
        for(int a=0; a<x.length; a++)
      {
           if(x[a] < min)
           {
              min = x[a];
           }
           if(x[a] > max)
           {
              max = x[a];
           }
         
      }

        System.out.println(min);
        System.out.println(max);
    }
}          