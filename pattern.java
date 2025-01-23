public class pattern {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //'1'rectangular pattern
        // int n = 4;
        // int m = 5;

        // //outer loop
        // for(int i=1 ;i<=n ;i++){
        //     for(int j=1; j<=m ;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

        //'2'hollow rectangular
        // int n =4;
        // int m = 5;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=m; j++){
        //         //cell -> (i,j)
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //'3' half pyramid or right triangle
        // int n = 4;
        // for(int i=1; i<=n; i++){
        //         //inner loop
        //      for(int j=1; j<=i; j++){
        //          System.out.print("*");
        //      }
        //      System.out.println();
        // }

        //'4' inverted half pyramid
        // int n = 4;
        // for(int i=n;i>=1; i--){
        //         //inner loop
        //      for(int j=1; j<=i; j++){
        //          System.out.print("*");
        //      }
        //      System.out.println();
        

        // int n = 4;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop -> space print
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //inner loop for star
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
       


        // int n = 5;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");

        //     }
        //     System.out.println();
        

        
        // int n = 5;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j+" ");

        //     }
        //     System.out.println();
        // }

        // int n= 5;
        // int number = 1;
        
        // ///outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=i; j++) {
        //        System.out.print(number+" ");
        //        number++;// num=num+1
        //     }
        //     System.out.println();
        // }


        int n = 5;

        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
            int sum = i+j;
            if(sum%2==0) {
                System.out.print("1");   
            }else{
                System.out.print("0");
            }
            }
            System.out.println();
        }
    }
    
}
