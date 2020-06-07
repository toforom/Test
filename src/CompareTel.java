import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompareTel {
    public static void printNum() {
        System.out.println(getSum(100));
    }

    public static int getSum(int num){
        if (num==1){
            return 1;
        }else {
            return num+getSum(num-1);
        }
    }

    public static void main(String[] args) {
    printNum();
    }

    public void getFile(String fileName){
        try {
            FileInputStream in = new FileInputStream(fileName);
            FileReader fileReader = new FileReader(fileName);
            char [] chars =new char[128];
            int i = fileReader.read(chars);
            while (i!=-1){

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
