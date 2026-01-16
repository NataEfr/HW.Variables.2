//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 //Задача 1

 int iNt = 10;
 byte bYTe = 2;
 short sHort = 328;
 long lONg = 2000000;
 float fLOat = 2.56f;
 double dOUBle = 3.785963d;

 System.out.println("Значение переменной iNt с типом int равно: " +iNt);
 System.out.println("Значение переменной bYTe с типом byte равно: " +bYTe);
 System.out.println("Значение переменной sHort с типом short равно: " +sHort);
 System.out.println("Значение переменной lONg с типом long равно: " +lONg);
 System.out.println("Значение переменной fLOat  с типом float равно: " +fLOat);
 System.out.println("Значение переменной dOUBle с типом double равно: " +dOUBle);


 //Задача 2

  // float f2 = 27.12f;
  // long l2 = 987678965549L;
  // float f3 = 2.786F;
  // int i2 = 569;
  // int i3 = -159;
  // short s2 = 27897;
  // byte b2 = 67;


//Задача 3

   byte ludPav = 23;
   byte annSerg = 27;
    byte ekatAndr = 30;
    int pepper = 480;
    int students = ludPav+annSerg+ekatAndr;
    int everySudPaper = pepper/students;
System.out.println("На каждого ученика рассчитано "+everySudPaper+" листов бумаги.");


//Задача 4

       byte min_Efficiency = 16/2;
       int Efficiency_20_min = min_Efficiency*20;
       int Efficiency_1_Day = min_Efficiency*60*24;
       int Efficiency_3_Days = Efficiency_1_Day*3;
       int Efficiency_1_Month = Efficiency_1_Day*30;

       System.out.println("За 20 минут машина произвела "+ Efficiency_20_min+ " штук бутылок");
       System.out.println("За сутки машина произвела "+ Efficiency_1_Day + " штук бутылок");
       System.out.println("За 3 дня машина произвела "+ Efficiency_3_Days+ " штук бутылок");
       System.out.println("За месяц машина произвела "+ Efficiency_1_Month+ " штук бутылок");

//Задача 5

        byte whiteColor = 2;
        byte brownColor = 4;
        int colorPot = 120;

        int classRoom = colorPot/(whiteColor+brownColor);
        int allWhiteColor = classRoom*whiteColor;
        int allBrownColor = classRoom*brownColor;
         System.out.println("В школе, где "+classRoom+" классов, нужно "+allWhiteColor+ " банок белой краски и "+ allBrownColor+
                 " банок коричневой краски");
 // Задача 6

       int bananasWeight = 80*5;
       int milkWeight = 2*105;
       int iceWeight = 200;
       int eggWeight = 4*70;

       int breakfastWeight_in_gr = bananasWeight+milkWeight+iceWeight+eggWeight;
       double breakfastWeight_in_kg = breakfastWeight_in_gr/ 1000d;

       System.out.println("Вес спортзавтрака составляет " + breakfastWeight_in_gr+ " грамм или "+breakfastWeight_in_kg+ " кг.");


    }
    }
