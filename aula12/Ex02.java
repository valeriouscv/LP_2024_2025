public class Ex02 {
    public static void main(String[] args) {
        //conversão implicita
        byte numB = 12;
        short numS = numB;
        System.out.println(numS);
        float n1 = 12f;
        double n2 = n1;

        //não posso converter
        //short ottuNumShort = 12;
        //byte ottuNumByte = ottuNumShort;

        //conversão explicita
        double a1 = 3.9876543;
        float a2 = (float) a1;
        int a3 = (int) a1;
        System.out.println("conversao explicita: "+a2);
        System.out.println("conversao explicita: "+a3);

        //Classe Wrapper (String -> outros tipos de dados)
        String b = "6";
        int b1 = Integer.parseInt(b);
        /*float b2 = Float.parseFloat(b);
        byte b3 = Byte.parseByte(b);
        short b4 = Short.parseShort(b);
        double b5 = Double.parseDouble(b);*/
    }
}
