import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            
            int num = Integer.parseInt(br.readLine());            
            
            int count = 0;
            int temp;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < num; i++) {
            	temp = Integer.parseInt(st.nextToken());
            	
            	for (int j = 2; j < 1000; j++) {
            		if (j == temp) {
            			count++;
            			break;
            		}
            		else if (temp == 1 || temp % j == 0) {
            			break;
            		}
            		
            	}
            }
            
            
            // 출력
            bw.write(String.valueOf(count)+"\n");

            // close
            br.close();
            bw.flush();
            bw.close();
		}
		catch (IOException e) {
          System.out.println("IOException 발생");
		}	
	}
}
