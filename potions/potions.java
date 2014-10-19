import java.io.*;
import java.util.*;
import java.lang.Math;

class potions{
	public static void main(String ads[]) throws IOException{
		BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter( System.out));
		int t = Integer.parseInt(read.readLine());
		

		while(t-- > 0){		
			long i,r,g,b,m;
			String []str = read.readLine().split(" ");
				

			r = Long.parseLong(str[0]);	
			g = Long.parseLong(str[1]);		
			b = Long.parseLong(str[2]);		
			m = Long.parseLong(str[3]);		

			long max = 0;

			 str = read.readLine().split(" ");

			for(i=0;i<r;i++) {
				long k = Long.parseLong(str[(int)i]);
				if( k > max ) max = k;
			}
			r = max;
			str = read.readLine().split(" ");
			max = 0;
			for(i=0;i<g;i++) {
				long k = Long.parseLong(str[(int)i]);
				if( k > max ) max = k;
			}
			
			g = max;
			str = read.readLine().split(" ");
			max = 0;
			for(i=0;i<b;i++){
				long k = Long.parseLong(str[(int)i]);
				if( k > max) max  = k;
			}
			b = max;


			while(m-- > 0){
				if( r > g ){
					if( r > b) r >>= 1;
					else b >>= 1;
				}else{
					if( g > b) g >>= 1;
					else b >>= 1;
				}
			}


			out.write( Math.max(r,Math.max(g,b))+"\n");


		}

		out.flush();

	}


}

