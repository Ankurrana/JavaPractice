import java.io.*;
import java.util.*;
import java.lang.Math;

class dino{
	public static void main(String ads[]) throws IOException{
		BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter( System.out));
		int t = Integer.parseInt(read.readLine());
		

		while(t-- > 0){		
			String str = read.readLine();
			
			long n = Long.parseLong(str);

			long a[] = new long[(int)(n+1)];
			String s[] = read.readLine().split(" ");

			for(int i=0;i<n;i++){ 
				a[i] = Long.parseLong( s[i] );
			}

			long cost = 0;
			long diff = a[0];

			for(int i=1;i<n;i++){
				cost += Math.abs(diff);
				diff += a[i];
			}	
			 out.write(cost+"\n");


		
		}

		out.flush();

	}


}

