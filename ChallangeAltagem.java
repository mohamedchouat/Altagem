public class ChallangeAltagem {

    public static void main(String[] args) {
        int mIMin = 3;
        int mIMax = 48;
        intdisplayMagicalNumber(6, 35);
    }


    public static void intdisplayMagicalNumber(int pIMin, int pIMax) {
        if (pIMin < pIMax)
            for (int i = 5; i <= 35; i++) {
                String tResult = "";
                if (i % 3 == 0 || i % 5 == 0) {
                    if (i % 3 == 0)
                        tResult = "H";
                    if (i % 5 == 0)
                        tResult = tResult.isEmpty() ? tResult.concat("S") : tResult.concat(" S");
                } else
                    tResult = Integer.toString(i);

                System.out.println(tResult);


            }
    }
}