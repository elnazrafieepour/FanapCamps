package ExceptionHandling.DuplicateNumber6;

import java.util.*;


public class Main2 {
    public static void main(String[] args) throws DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter the size of array: ");

        int size = scanner.nextInt();
        Set<Integer> array1= new HashSet<>(size);
        for (int i = 0; i < size; ) {
            System.out.println("Please inter the Number " + i + " of array: ");
            int input = scanner.nextInt();
            if (array1.contains(input)){
                throw new DuplicateNumberException(DuplicateNumberException.Message);
            }
            array1.add(input);
            i++;


        }
        scanner.close();
        System.out.println(Arrays.toString(array1.toArray()));
    }

}
