/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Array
**/

public class soal7
{
    public static void main(String[] args)
    {
        //One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
                thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
                sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
                ninthArray};
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1,
                twoDimensionalArray2, twoDimensionalArray3};

        //algoritma utama
        for(int i = 0; i<3 ; i++){
            System.out.print("{");
            for(int j = 0; j<3 ; j++) {
                System.out.print("{");
                for (int k = 0; k < 3; k++) {
                    System.out.print(threeDimensionalArray[i][j][k]+" ");
                }
                System.out.print("} ");
            }
            System.out.print("}");
            System.out.print("\n");
        }
    }
}
