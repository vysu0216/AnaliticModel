/**
 * Created by vysu0216 on 15.05.2019.
 */
public class Module {

    private static final double BETTA = 1000.0; //параметр экспон ф-ции распред-я длит восстановления узла
    private static final double L01 = 10.0; //интенсивность потока в систему S1 (микропроцессор)
    private static final double L02 = 10000.0; //интенсивность потока в в систему S2 (приемо-передатчик)
    private static final double L0 = L01 + L02; // общая интенсивность поступления требований в узел
    private static final double MU11 = 200000;  //интенсивность обслуживания требований класса 1 в системе S1
    private static final double MU12 = 400000;//  интенсивность обслуживания требований класса 2 в системе S1
    private static final double MU2 = 25000;//  интенсивность обслуживания требований классов 1 и 2 в системе S2

    private double p1[], p2[], p3[] = new double[20];
    private double s01, s02 = 0.0;
    private double s,p = 0.0;

    //Вычисляем характеристики для для 1-й СМО
    private double calcS1Characteristics(){


        return 0.0;
    }


    public static void main(String[] args) {

    }

}
