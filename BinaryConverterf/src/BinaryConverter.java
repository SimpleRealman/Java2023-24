import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число:");
            String number = scan.nextLine();
            System.out.println("Выберите тип данных:");
            System.out.println("byte: 1\nshort: 2\nint: 3\nlong: 4\nfloat: 5\ndouble: 6");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    int numberByte = Byte.parseByte(number);
                    String sb = "";
                    for (int i = 0; i < 8 && numberByte != 0; i++) {
                        sb += (numberByte & 1) == 1 ? "1" : "0";
                        numberByte >>= 1;
                    }

                    String str = String.format("%8s", reverseString(sb)).replace(" ", "0");

                    System.out.print(str);
                    break;

                case 2:
                    int numberInt = Integer.parseInt(number);
                    String sb2 = "";
                    for (int i = 0; i < 16 && numberInt != 0; i++) {
                        sb2 += (numberInt & 1) == 1 ? "1" : "0";
                        numberInt >>= 1;
                    }

                    String binaryString = reverseString(sb2);

                    binaryString = String.format("%16s", binaryString).replace(" ", "0");

                    String[] octets = binaryString.split("(?<=\\G.{8})");
                    binaryString = String.join(" ", octets);

                    System.out.println(binaryString);
                    break;
                case 3:

                    int numberInt3 = Integer.parseInt(number);
                    String sb3 = "";
                    for (int i = 0; i < 32 && numberInt3 != 0; i++) {
                        sb3 += (numberInt3 & 1) == 1 ? "1" : "0";
                        numberInt3 >>= 1;
                    }

                    String binaryString3 = reverseString(sb3);

                    binaryString3 = String.format("%32s", binaryString3).replace(" ", "0");

                    String[] octets3 = binaryString3.split("(?<=\\G.{8})");
                    binaryString = String.join(" ", octets3);

                    System.out.println(binaryString);
                    break;
                case 4:
                    long numberLong = Long.parseLong(number);

                    String sb4 = "";
                    for (int i = 0; i < 64 && numberLong != 0; i++) {
                        sb4 += (numberLong & 1) == 1 ? "1" : "0";
                        numberLong >>= 1;
                    }

                    String binaryString4 = reverseString(sb4);

                    binaryString = String.format("%64s", binaryString4).replace(" ", "0");

                    String[] octets4 = binaryString.split("(?<=\\G.{8})");
                    binaryString = String.join(" ", octets4);

                    System.out.println(binaryString);
                    break;
                case 5:
                    float numberFloat = Float.parseFloat(number);

                    int floatInteger = Float.floatToIntBits(numberFloat);
                    String sb5 = "";
                    for (int i = 0; i < 32 && floatInteger != 0; i++) {
                        sb5 += (floatInteger & 1) == 1 ? "1" : "0";
                        floatInteger >>= 1;
                    }

                    String binaryString5 = reverseString(sb5);

                    binaryString = String.format("%32s", binaryString5).replace(" ", "0");

                    // Разделение на знак, порядок и мантиссу
                    String[] binaryStringList = binaryString.split("");

                    String sb7 = "";
                    for (int i = 0; i < 32; i++) {
                        String str5 = binaryStringList[i];

                        sb7 += str5;
                        if (i == 0) {
                            sb7 += " ";
                        } else if (i == 8) {
                            sb7 += " ";
                        }
                    }
                    System.out.println(sb7);
                    break;
                case 6:
                    double numberDouble = Double.parseDouble(number);
                    long doubleLong = Double.doubleToLongBits(numberDouble);

                    String sb6 = "";
                    for (int i = 0; i < 64 && doubleLong != 0; i++) {
                        sb6 += (doubleLong & 1) == 1 ? "1" : "0";
                        doubleLong >>= 1;
                    }

                    String binaryString6 = reverseString(sb6);

                    binaryString = String.format("%64s", binaryString6).replace(" ", "0");

                    // Разделение на знак, порядок и мантиссу
                    String[] binaryStringList6 = binaryString.split("");

                    String sb8 = "";
                    for (int i = 0; i < 64; i++) {
                        String str6 = binaryStringList6[i];

                        sb8 += str6;
                        if (i == 0) {
                            sb8 += " ";
                        } else if (i == 11) {
                            sb8 += " ";
                        }
                    }

                    System.out.println(sb8);
                    break;
                default:
                    System.out.println("Нет такого номера типа данных");
            }
        }


        public static String convertChar(String number) {
        char character = number.charAt(0);

        int numberInt = character;

        String sb = "";
        for (int i = 0; i < 16 && numberInt != 0; i++) {
            sb += (numberInt&1) == 1 ? "1" : "0";
            numberInt >>= 1;
        }

        String binaryString = reverseString(sb);

        binaryString = String.format("%16s", binaryString).replace(" ", "0");

        String[] octets = binaryString.split("(?<=\\G.{8})");
        binaryString = String.join(" ", octets);

        return binaryString;
    }

    private static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
}
/*⠀⠈⠀⠀⠀⠈⠀⠉⢙⢍⠍⠁⠉⠍⠉⠝⠩⣯⢻⣿⡯⣿⢻⢿⡿⠉⣝⠉⠽⣉⡭⠉⢩⡹⢫⡭⢁⣟⣯⣝⢫⢻⡿⣿⣿⣿⡿⡯
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⠀⠀⠐⠄⠄⣻⣻⣷⣼⣶⣿⣿⣿⣶⣦⣓⠲⣺⠾⢿⣚⢏⢫⢻⡿⣿⢋⣚⢘⠷⢮⣊⡿⠷⣤⠒
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠁⠀⡉⠔⠀⣀⡴⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⡿⣷⣿⣲⢯⠾⣯⣿⣿⡹⣿⣿⣷⡭⢟⣖⢼⣖
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⡪⠅⢀⠜⠈⠁⠀⠀⠀⠀⠀⠈⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡘⠷⣤⣳⣿⡽⣿⣿⣿⠿⠿⢧⢾⡹⡺⠏
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢿⣿⣿⣿⣿⣿⣿⣿⡟⢛⡿⢿⡿⡯⣁⠻⣷⣗⡗⣦⣁⠐⠀
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⣿⣿⣿⣿⣿⣿⣿⣿⠅⣓⠪⣗⡩⡅⣙⡱⣿⢞⣷⣫⠋⠀
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⣶⣾⣿⣿⣿⣿⣿⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣧⣼⡳⡏⢁⣾⢋⡿⣽⣟⣗⣜⠳⣌
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣴⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣑⣷⣌⡹⢿⣽⡿⣿⣾⡧⡾⣏
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡻⣿⣷⣨⢭⣯⣷⣿⢼⠛⢍
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡽⢏⢻⣯⣿⣿⢻⡯⢂⠌⠠
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠿⣿⣿⡿⠿⠛⠁⠀⠈⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢻⣿⣿⣿⣿⣿⠵⣦⠘⣥⠄
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣽⣾⣿⣷⣦⣠⣌
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣙
        ⠀⠀⠀⠀⠀⠀⠌⠒⢰⠆⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢹
        ⠀⠀⠀⠀⢀⠁⠁⠊⠰⠁⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿
        ⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
        ⠀⠀⠀⠀⠈⠠⠀⢀⠄⠐⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣝⣻⢵⣿
        ⠀⠀⠀⠀⢀⠀⠀⠂⠄⢀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷
        ⠀⠀⠀⡢⢀⠀⠀⠈⠀⠈⣿⡇⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
        ⠀⢀⠀⠀⠋⠀⠈⠀⢠⣾⠏⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢟⣿⣿⣿⣿⣿⣿⣿⣿⣿
        ⠀⠐⠀⠀⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣬⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⣠⣾⣿⣿⣿⠟⠙⢻⣿⣿⣿
        ⠀⠀⠀⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠿⠟⠛⠉⠉⠙⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⢠⣼⣿⣿⣿⣿⠁⠀⢀⣀⣹⣿⣿
        ⠐⠂⠀⠀⣤⣾⣿⠧⠄⠀⠀⠀⠀⢀⠀⠀⠀⠀⢸⣿⡟⠀⠀⠀⠀⢀⠠⠼⠛⠋⠉⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⠟⠀⠀⠀⠀⠀⠈⠉⠛
        ⠀⠀⠀⢠⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⢦⡀⠀⠀⣸⣿⠇⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⣰⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⢀⣰⣿⣶⣦⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠋

 */