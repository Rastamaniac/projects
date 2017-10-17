public class HW {


    public static void main(String[] args) {
        qwe("Братишка ");
        qwe ("сучечки ");

        int s = 5;

        System.out.println("плщдьквдрт с стороной s = " + s + "="+ area(s) );

        int a = 14;
        int b = 5;

        System.out.println("Площадь прямоугольника с сторонами a и b "+ " = " + area(a,b) );

    }



    public static void qwe (String text) {

        int q = 12;

        int w = 12;

        System.out.println("Hello, " + text + q * w);
    }
        public static int area (int s){

            return s*s;
}
                public static int area (int a, int b){
                    return a*b;
                }





}