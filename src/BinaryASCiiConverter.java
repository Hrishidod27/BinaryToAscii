import java.util.Scanner;

public class BinaryASCiiConverter {

    private static Scanner sc = new Scanner(System.in);

    public static void run(){
        System.out.println(
                """
                1. Text to binary\040
                2. Binary to text\040
                3. Quit\040
                Enter Choice: \s
                """
        );
        int choice = sc.nextInt();
        sc.nextLine(); //Buffer
        if(choice == 1){
            textToBinary();

        }
        else if (choice == 2){
            binaryToText();
        }
    }

    private static void binaryToText() {

        System.out.println("Enter binary; ");
        String text = sc.nextLine();
        int binaryText = 0;
        int value = 128;
        for(int i = 0; i< text.length(); i++){

            if(text.charAt(i) == ' ')continue;

            char bit = text.charAt(i);
            if (bit =='1') {
                binaryText += value;
            }

            value = value/2;

            if (value ==0){
                value = 128;
                char letter = (char) binaryText;
                System.out.print(letter);
                binaryText = 0;
            }


        }

    }

    private static void textToBinary() {
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        String binaryText = "";

        for(int i = 0; i < text.length(); i++){

            int left = 0;
            int ascii = text.charAt(i);
            if(ascii>=128)
            {
                binaryText +="1";
                left = ascii - 128;
            }
            else if (ascii<128){
                binaryText += "0";
                left = ascii;
            }

            if(left>=64){
                binaryText += "1";
                left = ascii - 64;
            }
            else if (left<64){
                binaryText += "0";

            }
            if (left >=32){
                binaryText += "1";
                left = left - 32;
            }
            else if (left < 32){
                binaryText += "0";

            }
            if (left >= 16){
                binaryText += "1";
                left = left - 16;
            }
            else if (left <16){
                binaryText += "0";

            }
            if (left >= 8){
                binaryText += "1";
                left = left - 8;
            }
            else if (left < 8){
                binaryText += "0";

            }
            if (left >= 4){
                binaryText += "1";
                left = left - 4;
            }
            else if (left < 4){
                binaryText += "0";

            }
            if (left >= 2){
                binaryText += "1";
                left = left - 2;
            }
            else if (left < 2){
                binaryText += "0";

            }
            if (left >= 1){
                binaryText += "1";
                left = left - 1;
            }
            else {
                binaryText += "0";

            }
            binaryText+= " ";


        }

        System.out.println(binaryText);
        //String.charAt()
        //int ascii = String.charAt(i);
    }


}

