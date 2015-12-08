
/*Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and 

produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
*/
package programlist;

public class ArraySeriesPrint {

	public static void main(String[] args) {
		String [] input={"a1","a2","a3","a4","b1","b2","b3","b4"};   //  get 1 5 2 6 3 7 4 8
        String[] newarr=new String[input.length];
        int count=0;
        for(int i=0;i<input.length/2;i++){
            newarr[count]=input[i];
            count+=2;
            newarr[count-1]=input[input.length/2+i];
        }
        for(int i=0;i<newarr.length;i++)
            System.out.print(newarr[i]+" ,");
    }

	

}
