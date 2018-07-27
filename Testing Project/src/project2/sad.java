package project2;

public class sad {
	
public static final int SIZE = 7;
    
    public static void main(String[] args){
    
        int n = (SIZE)*4 + 2;
        for(int line = 1; line<=SIZE; line++){
        	int a = 1 +(line-1)*2;
            int b = n - (SIZE + (line-1));
            for(int i = 1; i<=n; i++) {
                if(i == a || i == b){
                    for(int j = 1 ; j<=(SIZE-line+1); j++) {
                        System.out.print("$");
                        i++;
                    }
                }else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
