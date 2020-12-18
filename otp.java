import java.util.*;
public class otp{
int[] toBinary(int decimal){    
     int binary[] = new int[7];    
     int index = 0,j=0;    
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }   
     int bin[] = new int[binary.length]; 
     for(int i = index-1;i >= 0;i--){    
       bin[j++] = binary[i];    
     } 

     return bin;
     }   

		public static void main(String[] args) {
		
			String s,str;
			System.out.println("Enter The String:");
			Scanner scan = new Scanner(System.in);
			s = scan.nextLine();
			str = s.replaceAll("\\s", "");
	    	int len,i,j,n=0;
	    	len=str.length();
	    	int[] a =new int[len];
	    	for(i=0;i<len;i++)
	    	{
	    		a[i]=(int)str.charAt(i);
	    		
	    	}


	    	char[] key = new  char[7*len];
	    	String ke;
	    	System.out.println("Enter Key in binary:");
	    	for(i=0;i<len;i++){
	    		 ke = scan.nextLine();
	    		 for(j=0;j<ke.length();j++){
	    		 	key[n++]=ke.charAt(j);
	    		 }
	   
	    	}
	    		
	    	
	    	otp obj = new otp();
	    	int k=0;
	    	int[] b =new int[7];
	    	int[] binary = new int[7*len];
	    	for(i=0;i<len;i++)
	    	{
	    		b=obj.toBinary(a[i]);
	    		for( j=0;j<b.length;j++)
	    			{
	    				binary[k++]=b[j];
	    		 	}
	    	}		 	

	    	System.out.println("Key:");
	    	System.out.print(key);
	    	System.out.println(" ");
	    	System.out.println("Plain Text:");
	    	for(i=0;i<binary.length;i++)
	    			System.out.print(binary[i]);

	    	int[] e = new int[7*len];
	    	for(i=0;i<7*len;i++)
	    		e[i]=(int)key[i]^binary[i];
	    	int[] d = new int[7*len];
	    	for(i=0;i<7*len;i++)
	    		d[i]=e[i]^key[i];

	    	System.out.println(" ");
	    	System.out.println("Encrypted Text:");
	    	for(i=0;i<7*len;i++)
	    			System.out.print((char)e[i]);
	    	System.out.println(" ");
	    	System.out.println("Decrypted Text:");
	    	for(i=0;i<binary.length;i++)
	    			System.out.print(d[i]);
	}
}
