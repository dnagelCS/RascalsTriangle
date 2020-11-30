package triangle;

public class RascalsTriangle {


    public int CalculateValue(int row, int index){
        /*
         * Formula taken from https://apfstatic.s3.ap-south-1.amazonaws.com/s3fs-public/08_comac_rascal_triangle.pdf
         * */

        //Every time you increment an index, you go up a diagonal
        //Therefore, the difference of row - index calculates the diagonal of where that number lies
        int diagonal = row - index;

        //All arrays start at 0, so you need to add one to get the value at that index
        int offSet = 1;

        /*
         * The diagonal tells us how much we have to multiply the index by to get the value of our number.
         * (since the diagonals have a pattern of (* 0 + 1), (* 1 + 1), (* 2 + 1), etc.)
         * We then add one to offset starting from 0.
         */

        int val = diagonal * index + offSet;
        return val;
    }

}