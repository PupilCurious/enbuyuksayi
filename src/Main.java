public class Main {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 232;
        int number3 = 33;
        int enBuyuk = number1;

        if(enBuyuk<number2){
            enBuyuk = number2;
        }
        if(enBuyuk<number3){
            enBuyuk = number3;
        }
        System.out.println("en buyuk sayi : " + enBuyuk);

      /*  if(number1>number2){
            if(number1>number3){
                System.out.println("en buyuk sayı : " + number1);
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("en buyuk sayi : " + number2);
            }
        }
        if(number3>number1){
            if (number3>number2){
                System.out.println("en buyuk sayi : " + number3);
            }
        }*/
    }
}