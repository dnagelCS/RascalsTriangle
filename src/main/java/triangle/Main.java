package triangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File myFile = new File("sample_rascal_input.txt");
            Scanner myReader = new Scanner(myFile);
            RascalsTriangle rascalsTriangle = new RascalsTriangle();
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] input = data.split(" ");
                if(input.length < 2) {
                    continue;
                }
                int triNum = Integer.parseInt(input[0]);
                int row = Integer.parseInt(input[1]);
                int index = Integer.parseInt(input[2]);
                int val = rascalsTriangle.CalculateValue(row,index);
                System.out.println(triNum + " " + val);

            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}