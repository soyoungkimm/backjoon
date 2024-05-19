import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int num = Integer.parseInt(br.readLine());            
            String[] arr = new String[num];
            
            for (int i = 0; i < num; i++) {
            	arr[i] = br.readLine();
            }
            
            // 정렬
            Arrays.sort(arr, new Comparator<String>() {
            	@Override
            	public int compare(String a, String b) {
            		if (a.length() == b.length()) {
            			return a.compareTo(b); // 사전 순 정렬
            		}
            		else {
            			return a.length() - b.length(); // 단어 길이 순 정렬
            		}            		
            	}
            });
            
            // 출력
            bw.write(String.valueOf(arr[0])+"\n");
            for (int i = 1; i < arr.length; i++) {
            	if (!arr[i - 1].equals(arr[i])) {
            		bw.write(String.valueOf(arr[i])+"\n");
            	}
            }

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