import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.io.*;

class paints{
	public static void main(String ads[]) throws IOException{
		BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter( System.out));
	





		int t = Integer.parseInt( read.readLine() );
		long mod = 1000000009;



		while(t-- > 0){		
			String [] str = read.readLine().split(" ");
			// int n = Reader.nextInt();
			// int m = Reader.nextInt();
			int n = Integer.parseInt( str[0] );
			int m = Integer.parseInt( str[1] );

			// node a[] = new node[m+1];

			// List< node > a = new ArrayList< node >();

			int min_index = n+1;
			int max_index = 0;

			String fre[] = new String[1000001];


			for(int i=0;i<m;i++){
				str = read.readLine().split(" ");
				String ch = str[0];
				int k = Integer.parseInt( str[1] );
				fre[k] = ch;
				if( k < min_index ) min_index = k;
				if( k > max_index ) max_index = k; 

			}

			long ans = 1;
			int last = min_index;

			for(int i=min_index+1;i<=max_index;i++){
				if( fre[i]!=null && (fre[i].equals(fre[last]) == false) ) {

					// System.out.println("This ran for " + i + " " + last + "  " + (fre[i].equals(fre[last]) == false)+" " + fre[i] + " " + fre[last] );

					ans = ans * (i - last);
					if( ans > mod ) ans = ans%mod;
					last = i;
				}
				if( fre[i]!=null )
					last = i;

				// fre[i] = null;

			}

			fre[min_index] = null;

			out.write(ans+"\n");
			// System.out.println(ans);
		}

		out.flush();

	}
}

