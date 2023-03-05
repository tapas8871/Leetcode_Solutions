public class MyClass {                                  // 0 1 1 2 3 5 8 
    public static void main(String args[]) {
        System.out.print(Count_zeroes(120009876));
        
    }
    
    
    static int Count_zeroes(int n ){
       return helper(n ,0);
        
    }
    
    private static int helper (int n , int c){
          if(n ==0){
              return c;
          }
           
           int rem = n % 10;
           if(rem == 0){
               return helper(n/10,c+1);
           }
           return helper(n/10,c);
      }
    
    
  
}