package com.company.firstQuestion;

public class algoritmaSorusu {

    public class Main {

        public static void main(String[] args) {
            int reversedNumber = 0;
            int total = 0;
            int totalReversed = 0;
            int totalTotal = 0;
            int totalTotalReversed = 0;
            boolean isPalindrome = false;
            for (int number = 10; number <= 100; number++) {
                int j = number % 10;
                int b = number / 10;
                reversedNumber = (j * 10) + b;
                total = number + reversedNumber;
                int x = total % 10;
                int c = total / 10;
                totalReversed = (x * 10) + c; //burda reverse etti.
            }
            if (total == totalReversed) { //burda palindrome u buldu.
                isPalindrome = true;
                //System.out.println();
            }
            if (total != totalReversed) { // burda palindrome değil ise;
                totalTotal = total + totalReversed; //burda total ve tersini topladı
                int y = totalTotal % 10;
                int d = totalTotal / 10;
                if (totalTotal / 100 == 0) { //burda total üç basamaklı ise
                    totalTotalReversed = (y * 10) + d; //burda totaltotali çevirdi.

                }
                else if (totalTotal / 100 != 0) { // burda total iki basamaklı ise
                    int z = d % 10;
                    int e = d / 10;
                    int reversedDivision = (z * 10) + e;
                    totalTotalReversed = (y * 100) + reversedDivision; //burda sayıyı çevirdi
                    if (totalTotalReversed == totalTotal) {
                        System.out.println(totalReversed);
                    }
                    if (totalTotalReversed == totalTotal) { //burda yine eşitliği kontrol etti
                        System.out.println(totalTotal);
                    }
                }


            }
        }
    }


}
