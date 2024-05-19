import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuffer sb;
            List<String> results = new ArrayList<>();
            
            while (true) {
            	sb = new StringBuffer(br.readLine());
            	
            	if (sb.toString().equals("0")) {
            		break;
            	}
            	
            	if (sb.toString().equals(sb.reverse().toString())) {
            		results.add("yes");
            	}
             	else {
            		results.add("no");
            	}
            }
            
            for (String result : results) {
            	bw.write(result + "\n");
            }
            
            // close
            br.close();
            bw.flush();
            bw.close();
      }
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}