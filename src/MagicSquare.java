import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {

        // ch1: ex 14
        Scanner input = new Scanner(System.in);
        List<List<Integer>> matrix = new ArrayList<>();

        while (true) {

            String str1 = input.nextLine();

            if (str1.length() > 0) {
                String[] numbers = str1.trim().split("\\s+");
                List<Integer> arr = new ArrayList<>();

                for(int i = 0; i < numbers.length; i++)
                    arr.add(Integer.parseInt(numbers[i]));

                matrix.add(arr);
            }
            else
                break;
        }
        System.out.println("It's a magic square? " + isMagicSquare(matrix));
    }

    public static boolean isMagicSquare(List<List<Integer>> mat) {

        for (int k = 0; k < mat.size(); k++) {

            if (mat.get(k).size() == mat.size()) {
                int sumOfDiagonal1 = 0, sumOfDiagonal2 = 0;

                for (int i = 0; i < mat.size(); i++) {
                    sumOfDiagonal1 += mat.get(i).get(i);
                    sumOfDiagonal2 += mat.get(i).get(mat.size() - 1 - i);
                }

                if (sumOfDiagonal1 != sumOfDiagonal2)
                    return false;

                for (int i = 0; i < mat.size(); i++) {
                    int sumOfRows = 0, sumOfColumns = 0;

                    for (int j = 0; j < mat.size(); j++) {
                        sumOfRows += mat.get(i).get(j);
                        sumOfColumns += mat.get(j).get(i);
                    }

                    if ((sumOfRows != sumOfColumns) || (sumOfColumns != sumOfDiagonal1))
                        return false;
                }
            }
            else {
                System.out.println("It's not Square");
                return false;
            }
        }
        return true;
    }

}
