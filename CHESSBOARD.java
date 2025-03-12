public class CHESSBOARD {
        public static void main(String[] args) {
            int size = 8;  // Size of the chessboard (8x8)

            // Loop through each row
            for (int i = 0; i < size; i++) {
                // Loop through each column
                for (int j = 0; j < size; j++) {
                    // Print '*' if the sum of row and column indices is even, else print a space
                    if ((i + j) % 2 == 0) {
                        System.out.print("W ");
                    } else {
                        System.out.print("B ");
                    }
                }
                // Move to the next line after each row
                System.out.println();
            }
        }
    }


