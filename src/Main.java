import java.util.Scanner;
import java.util.stream.DoubleStream;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Программа Формулы школьной физики");
        System.out.println("""
                Доступно ?? формул. 10 Тем. Введите номер темы:\s
                1 - Кинематика
                 2 - Динамика
                 3 - Законы сохранения
                 4 - Статика
                 5 - Тепловые явления
                 6 - Элетростатика
                 7 - Ток
                 8 - Магнитные явления
                 9 - Колебания и волны
                 10 - Оптика
                \s""");
        int zapros = in.nextInt();
        if (zapros == 1) {
            System.out.println("Вы выбрали Раздел: Кинематика");
            System.out.println("""
                    Выбери формулу:\s
                    1 - Скорость точки\s
                    2 - Ускорение точки\s
                    3 - Срендее ускорение
                    4 - Средний вектор скорости
                    5 - Средний модуль скорости
                    6 - Закон сложения скоростей
                    7 - Закон сложения ускорений
                    8 - Нормальное ускорение
                    9 - Тангенциальное ускорение
                    10 - Равномерное движение
                    11 - Угловая скорость\s
                    12 - Частота вращения\s
                    13 - Период вращения\s
                    14 - Проекция скорости в момент t\s
                    15 - Изменение координат\s
                    16 - Гармоническое движение\s
                    17 - Максимальная скорость\s
                    18 - Максимальное ускорение\s
                    19 - Равноускоренное движение\s
                    20 - Равнозамедленное движение\s
                    """);
            int formula = in.nextInt();
            if (formula == 1) {
                System.out.println("Формула: V = dr/dt (Если V = const) \n");
                System.out.println("Введите dr: \n");
                double dr = in.nextDouble();
                System.out.println("Введите dt: \n");
                double dt = in.nextDouble();
                double V = dr / dt;
                System.out.printf("V = %f", V);

            }
            if (formula == 2) {
                System.out.println("Формула: a = dV/dt (Если а - const");
                System.out.println("Введите dV: ");
                double dV = in.nextDouble();
                System.out.println("Введите dt: ");
                double dt = in.nextDouble();
                double a = dV / dt;
                System.out.printf("a = %f", a);
            }
            if (formula == 3) {
                System.out.println("Формула: a(cp) = dV/dt");
                System.out.println("Введите dV: ");
                double dV = in.nextDouble();
                System.out.println("Введите dt: ");
                double dt = in.nextDouble();
                double a = dV / dt;
                System.out.printf("a(cp) = %f", a);
            }
            if (formula == 4) {
                System.out.println("Формула: V(cp)= dr/dt \n");
                System.out.println("Введите dr: \n");
                double dr = in.nextDouble();
                System.out.println("Введите dt: \n");
                double dt = in.nextDouble();
                double V = dr / dt;
                System.out.printf("V(cp) = %f", V);
            }
            if (formula == 5) {
                System.out.println("Формула: V = S/t \n");
                System.out.println("Введите S: \n");
                double S = in.nextDouble();
                System.out.println("Введите t: \n");
                double t = in.nextDouble();
                double V = S / t;
                System.out.printf("V = %f", V);
            }
            if (formula == 6) {
                System.out.println("Формула: V(m/нсо) = V(m/псо) + V(псо/нсо)");
                System.out.println("Введите V(m/псо): ");
                double V1 = in.nextDouble();
                System.out.println("Введите V(псо/нсо): ");
                double V2 = in.nextDouble();
                double V = V1 + V2;
                System.out.printf("V(m/нсо) = %f", V);

            }
            if (formula == 7) {
                System.out.println("Формула: a(m/нсо) = a(m/псо) + a(псо/нсо)");
                System.out.println("Введите a(m/псо): ");
                double a1 = in.nextDouble();
                System.out.println("Введите a(псо/нсо): ");
                double a2 = in.nextDouble();
                double a = a1 + a2;
                System.out.printf("a(m/нсо) = %f", a);
            }
            if (formula == 8) {
                System.out.println("Формула: a(n) = v^2/r");
                System.out.println("Введите V: ");
                double v = Math.pow(in.nextDouble(), 2);
                System.out.println("Введите r: ");
                double r = in.nextDouble();
                double a = v / r;
                System.out.printf("a(n) = %f", a);
            }
            if (formula == 9) {
                System.out.println("Формула: a = |dV/dt| \n");
                System.out.println("Введите dV: ");
                double V = in.nextDouble();
                System.out.println("Введите dt: ");
                double t = in.nextDouble();
                double a = Math.abs(V / t);
                System.out.printf("a = %f", a);
            }
            if (formula == 10) {
                System.out.println("Формула: S = V*t");
                System.out.println("Ввеедите V: ");
                double V = in.nextDouble();
                System.out.println("Введите t: ");
                double t = in.nextDouble();
                double S = V * t;
                System.out.printf("S = %f", S);
            }
            if (formula == 11) {
                System.out.println("Формула: Omega = dFi/dt");
                System.out.println("Введите dFi: ");
                double dFi = in.nextDouble();
                System.out.println("Введите: dt");
                double dt = in.nextDouble();
                double Omega = dFi / dt;
                System.out.printf("Omega = %f", Omega);
            }
            if (formula == 12) {
                System.out.println("Формула: nu = 1/T");
                System.out.println("Введите T");
                double T = in.nextDouble();
                double nu = 1 / T;
                System.out.printf("nu = %f", nu);
            }
            if (formula == 13) {
                System.out.println("T = t/N ");
                System.out.println("Введите t: ");
                double t = in.nextDouble();
                System.out.println("Введите N: ");
                double N = in.nextDouble();
                double T = t / N;
                System.out.printf("T = %f ", T);
            }
            if (formula == 14) {
                System.out.println("V(x) = v(0x)+a(x)*t");
                System.out.println("Введите v(0x): ");
                double v0 = in.nextDouble();
                System.out.println("Введите a(x): ");
                double a = in.nextDouble();
                System.out.println("Введите t:");
                double t = in.nextDouble();
                double V = v0 + a * t;
                System.out.printf("V(x) = %f", V);

            }
            if (formula == 15) {
                System.out.println("Формула: dx = ((V(x)+V(0x))/2)*t ");
                System.out.println("Введите V(x): ");
                double Vx = in.nextDouble();
                System.out.println("Введите V(0x): ");
                double V0x = in.nextDouble();
                System.out.println("Введите t: ");
                double t = in.nextDouble();
                double dx = ((Vx + V0x) / 2) * t;
                System.out.printf("dx = %f", dx);
            }
            if (formula == 16) {
                System.out.println("Формула: X = a*cos(omega(t)+Fi(0))");
                System.out.println("Введите omega(t):");
                double omega = in.nextDouble();
                System.out.println("Введите Fi(0): ");
                double Fi = in.nextDouble();
                System.out.println("Введите a: ");
                double a = in.nextDouble();
                double X = a * Math.cos(omega + Fi);
                System.out.printf("X = %f", X);

            }
            if (formula == 17) {
                System.out.println("Формула: V(max) = A*omega");
                System.out.println("Введите А:");
                double A = in.nextDouble();
                System.out.println("Введите omega: ");
                double omega = in.nextDouble();
                double V = A * omega;
                System.out.printf("V(max) = %f", V);

            }
            if (formula == 18) {
                System.out.println("Формула: a(max) = A*omega^2");
                System.out.println("Введите А:");
                double A = in.nextDouble();
                System.out.println("Введите omega: ");
                double omega = in.nextDouble();
                double a = A * Math.pow(omega, 2);
                System.out.printf("a(max) = %f", a);
            }
            if (formula == 19) {
                System.out.println("Формула: V = v(0) + a*t");
                System.out.println("Введите v(0): ");
                double v0 = in.nextDouble();
                System.out.println("Введите a: ");
                double a = in.nextDouble();
                System.out.println("Введите t: ");
                double t = in.nextDouble();
                double V = v0 + a * t;
                System.out.printf("V = %f", V);
            }
            if (formula == 20) {
                System.out.println("Формула: V = v(0) - a*t");
                System.out.println("Введите v(0): ");
                double v0 = in.nextDouble();
                System.out.println("Введите a: ");
                double a = in.nextDouble();
                System.out.println("Введите t: ");
                double t = in.nextDouble();
                double V = v0 - a * t;
                System.out.printf("V = %f", V);
            }
        }
        if (zapros == 2) {
            System.out.println("Вы выбрали Раздел: Динамика");
            System.out.println("""
                    Выберите формулу: \s
                    1 - 2 Закон Ньютона
                    2 - Теорема о движении центра масс
                    3 - 3 Закон Ньютона
                    4 - Гравитационная сила
                    5 - Ускорение свободного падения
                    6 - Сила тяжести
                    7 - Сила трения при скольжении
                    8 - Сила трения без скольжения
                    9 - Сила упругости
                    10 - Закон Гука
                    11 - Механическое напряжение
                    12- Относительное удлинение
                    
                    
                    Памятка:
                     Y - Гравитационная постоянная. Y = 6,67*10^-11
                     u - Коэф. Трения
                     o - sigma
                     e - Epsilon
                    \s""");
            final double Y = 6.67*Math.pow(10, -11);
            int formula = in.nextInt();
            if (formula == 1) {
                System.out.println("Формула: m*a = F0+F1+F2+...Fn");
                System.out.println("Введите кол-во F: ");
                double ma;
                int F = in.nextInt();
                double[] arr = new double[F];
                for (int i = 0; i < F; i++) {
                    System.out.printf("Введите F%d \n", i);
                    arr[i] = in.nextDouble();
                }
                ma = DoubleStream.of(arr).sum();
                System.out.printf("m*a = %f" , ma);
               /* for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                */
            }
            if (formula == 2) {
                System.out.println("Формула: m*a = F0(внешн)+F1(внешн)+F2(внешн)+...Fn");
                System.out.println("Введите кол-во F(внешн): ");
                double ma;
                int F = in.nextInt();
                double[] arr = new double[F];
                for (int i = 0; i < F; i++) {
                    System.out.printf("Введите F%d \n", i);
                    arr[i] = in.nextDouble();
                }
                ma = DoubleStream.of(arr).sum();
                System.out.printf("m*a = %f" , ma);
            }
            if (formula == 3) {
                System.out.println("Формула: F = -F");

            }
            if (formula == 4) {
                System.out.println("Формула: F(грав) = Y*(m1*m2/r2)");
                System.out.println("Y - Гравитационная постоянная. Y = 6,67*10^-11");
                System.out.println("Введите m1: ");
                double m1 = in.nextDouble();
                System.out.println("Введите m2: ");
                double m2 = in.nextDouble();
                System.out.println("Введите r2: ");
                double r2 = in.nextDouble();
                double F = Y*(m1*m2/r2);
                System.out.printf("F = %f" , F);

            }
            if (formula == 5) {
                System.out.println("Формула: g = Y*(M/R^2)");
                System.out.println("Введите M: ");
                double M = in.nextDouble();
                System.out.println("Введите R: ");
                double R = Math.pow(in.nextDouble(), 2);
                double g = Y*(M/R);
                System.out.printf("g = %f" , g);

            }
            if (formula == 6) {
                System.out.println("Формула: F(тяж) = g*m");
                System.out.println("Введите g: ");
                double g = in.nextDouble();
                System.out.println("Введите m: ");
                double m = in.nextDouble();
                double F = g*m;
                System.out.printf("F(тяж) = %f" , F);

            }
            if (formula == 7) {
                System.out.println("Формула: F(тр) = u*N");
                System.out.println("Введите u: ");
                double u = in.nextDouble();
                System.out.println("Введите N: ");
                double N = in.nextDouble();
                double F = u*N;
                System.out.printf("F = %f" , F);

            }
            if (formula == 8) {
                System.out.println("Формула: F(тр) <= u*N");
                System.out.println("Введите u: ");
                double u = in.nextDouble();
                System.out.println("Введите N: ");
                double N = in.nextDouble();
                double F = u * N;
                System.out.printf("F <= %f", F);
            }
            if (formula == 9) {
                System.out.println("Формула: F(упр) = k*|dl|");
                System.out.println("Введите k: ");
                double k = in.nextDouble();
                System.out.println("Введите dl: ");
                double dl = in.nextDouble();
                double F = k*Math.abs(dl);
                System.out.printf("F = %f" , F);

            }
            if (formula == 10) {
                System.out.println("Формула: o = E*e");
                System.out.println("Введите E: ");
                double E = in.nextDouble();
                System.out.println("Введите e: ");
                double e = in.nextDouble();
                double o = E*e;
                System.out.printf("o = %f" , o);

            }
            if (formula == 11) {
                System.out.println(" Формула: o = F(упр)/S");
                System.out.println("Введите F(упр): ");
                double F = in.nextDouble();
                System.out.println("Введите S: ");
                double S = in.nextDouble();
                double o = F/S;
                System.out.printf("o = %f" , o);

            }
            if (formula == 12) {
                System.out.println("Формула: e = |dl/l(0)|");
                System.out.println("Введите dl: ");
                double dl = in.nextDouble();
                System.out.println("Введите l(0): ");
                double l = in.nextDouble();
                double e = dl/Math.abs(l);
                System.out.printf("e = %f" , e);

            }

        }
    }
}

