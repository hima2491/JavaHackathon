package Assignment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q31Reverse_the_file_content {
	public static void main(String[] args) throws IOException {      
        String file= "C:\\workspace\\Java_Hackathon\\src\\Assignment\\ReadFileReverse.txt";
        String file1="C:\\workspace\\Java_Hackathon\\src\\Assignment\\WriteFile_Reverse.txt";
		FileReader fr=new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw=new FileWriter(file1);
		BufferedWriter bw=new BufferedWriter(fw);
		//write the file line by line and store each line in an array
		String[] lines=new String[10];
		String line;
		int count=0;
		while ((line= br.readLine())!=null&&count<10) {
			  lines[count]=line;
			  count++;
		}//write the lines in reverse order
		for(int i=count-1;i>=0;i--) {
			bw.write(lines[i]);
			bw.newLine();
		}
		br.close();
		bw.close();	
	}

}
