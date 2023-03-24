class MakeHeart{
    public static void main(String args[]) {
            int MAX_NUMBER = 3;
            int i, j, k;
            
            for(i=0; i<MAX_NUMBER; i++) {
                for(j=MAX_NUMBER-i;j>0;j--) {
                    System.out.print(" ");
                }
                for(k=1; k<=i*2; k++) {
                    System.out.print("*");
                }
                for(j=(MAX_NUMBER*2)-(i*2);j>0;j--) {
                    System.out.print(" ");
                }
                for(k=1; k<=i*2; k++) {
                    System.out.print("*");
                }
                System.out.println();	
            }
            
            for(i=0; i<MAX_NUMBER*2; i++) {
                int count=0;
                for(j=1;j<=i;j++) {
                    System.out.print(" ");
                    count++;
                }
                for(k=0; k<(MAX_NUMBER*4)-(count*2); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
	