
import java.util.Scanner;

public class Sorting {
    public static void main(String args[]){
        int n,i,j,k;
        String[] S = new String[100];
        String[] S2= new String[100];
        
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        for(i=1; i<=n; i++){
                S[i]=s.next();
        }
               k=0;
        for(i=1; i<=n; i++){
            boolean isDistinct= false;
            for(j=1; j<i; j++ ){
               if(S[i].equals(S[j])){
                   isDistinct=true;
                   break;
               } 
            }
               if(!isDistinct){
                   k++;
                  S2[k]=S[i];          
               }
        }
        for(i=1; i<=k; i++){
            for(j=i+1; j<=k; j++){
         if(S2[i].compareTo(S2[j])>=0)
         {
             String temp= S2[j];
             S2[j]= S2[i]; 
             S2[i]=temp;
         }
     }
            }
        for(i=1; i<=k; i++){
            System.out.println(S2[i]);
        }
        
    }
}
