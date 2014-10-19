import java.io.*;
import java.util.*;

class chefground{
	public static void main(String ads[]) throws IOException{
		BufferedReader read = new BufferedReader( new InputStreamReader(System.in));

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter( System.out));
		int t = Integer.parseInt(read.readLine());
		

		while(t-- > 0){		
			String str[] = read.readLine().split(" ");
			


			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);

			int a[] = new int[n+1];
			String s[] = read.readLine().split(" ");
			int max = 0;

			for(int i=0;i<n;i++){ 
				a[i] = Integer.parseInt( s[i] );
				if( a[i] > max) max = a[i];
			}

			int cso = 0;

			for(int i=0;i<n;i++){
				cost = 
			}	

			if( m < required)  out.write("No\n");
			else{
				if( (m - required)%n == 0 ){
					out.write("Yes\n");
				}else{
					out.write("No\n");
				}
			}


		
		}

		out.flush();

	}


}

