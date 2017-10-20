

public class HW{

    public static void main (String[] args) {

        голова(", дай денег" );
        голова(", че как дила?");


            Square s = new Square(7);

            Rectangle r = new Rectangle(4,3);

        System.out.println("Площадь квадртата со сторонами " + s.l + " = " + area(s));


                System.out.println("Площадь прямоугольника с сторонами " + r.a +" и "+  + r.b + " = " + перимитр(r));

        }

        public static void голова (String text){

            System.out.println( "Эй, голова"+ text);
        }

            public static double перимитр(Rectangle r){

                return r.a*r.b;


            }


                    public static double area(Square s){
                        return s.l*s.l;


                    }







}

