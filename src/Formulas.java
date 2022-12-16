import java.util.Scanner;
import java.util.stream.DoubleStream;
public class Formulas {

    public static void main(String[] args) {
        int cycle;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Программа Формулы школьной физики");
            System.out.println("""
                    Доступно 126 формул. 10 Тем. Введите номер темы:\s
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
            } // 20
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
                        12 - Относительное удлинение
                                            
                                            
                        Памятка:
                         Y - Гравитационная постоянная. Y = 6,67*10^-11
                         u - Коэф. Трения
                         o - sigma
                         e - Epsilon
                        \s""");
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
                    System.out.printf("m*a = %f", ma);
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
                    System.out.printf("m*a = %f", ma);
                }
                if (formula == 3) {
                    System.out.println("Формула: F = -F");

                }
                if (formula == 4) {
                    System.out.println("Формула: F(грав) = Y*(m1*m2/r2)");
                    System.out.println("Введите m1: ");
                    double m1 = in.nextDouble();
                    System.out.println("Введите m2: ");
                    double m2 = in.nextDouble();
                    System.out.println("Введите r2: ");
                    double r2 = in.nextDouble();
                    double F = ((m1 * m2) / r2);
                    System.out.printf("F = Y * %f", F);

                }
                if (formula == 5) {
                    System.out.println("Формула: g = Y*(M/R^2)");
                    System.out.println("Введите M: ");
                    double M = in.nextDouble();
                    System.out.println("Введите R: ");
                    double R = Math.pow(in.nextDouble(), 2);
                    double g = (M / R);
                    System.out.printf("g = Y * %f", g);

                }
                if (formula == 6) {
                    System.out.println("Формула: F(тяж) = g*m");
                    System.out.println("Введите g: ");
                    double g = in.nextDouble();
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    double F = g * m;
                    System.out.printf("F(тяж) = %f", F);

                }
                if (formula == 7) {
                    System.out.println("Формула: F(тр) = u*N");
                    System.out.println("Введите u: ");
                    double u = in.nextDouble();
                    System.out.println("Введите N: ");
                    double N = in.nextDouble();
                    double F = u * N;
                    System.out.printf("F = %f", F);

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
                    double F = k * Math.abs(dl);
                    System.out.printf("F = %f", F);

                }
                if (formula == 10) {
                    System.out.println("Формула: o = E*e");
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите e: ");
                    double e = in.nextDouble();
                    double o = E * e;
                    System.out.printf("o = %f", o);

                }
                if (formula == 11) {
                    System.out.println(" Формула: o = F(упр)/S");
                    System.out.println("Введите F(упр): ");
                    double F = in.nextDouble();
                    System.out.println("Введите S: ");
                    double S = in.nextDouble();
                    double o = F / S;
                    System.out.printf("o = %f", o);

                }
                if (formula == 12) {
                    System.out.println("Формула: e = |dl|/l(0)");
                    System.out.println("Введите dl: ");
                    double dl = in.nextDouble();
                    System.out.println("Введите l(0): ");
                    double l = in.nextDouble();
                    double e = Math.abs(dl) / l;
                    System.out.printf("e = %f", e);

                }

            } // 12
            if (zapros == 3) {
                System.out.println("Вы выбрали Раздел: Законы сохранения");
                System.out.println("""
                        Выберите формулу: \s
                        1 - Импульс материальной точки
                        2 - Импульс системы материальных точек
                        3 - Теорема об изменении материальной точке
                        4 - Теорема об изменении импульса материальных точек
                        5 - Закон сохранения импульса
                        6 - Работа силы
                        7 - Мощность
                        8 - Мнгновенная мощность
                        9 - Механическая энергия
                        10 - Кинетическая энергия системы материальных точек
                        11 - Теорема о механической энергии
                        12 - Закон сохранения кинетической энергии
                        13 - Потенциальная энергия тяжести
                        14 - Потенциальная энергия упругости
                        15 - Закон сохранения механической энергии
                        16 - Диссипативные силы
                        17 - Работа при F(const)
                        18 - Работа консервативных сил
                        19 - Работа неконсервативных сил
                        20 - работа всех сил
                        21 - Работа при F
                        22 - Работа силы тяжести
                        23 - Работа силы упругости
                        24- Средняя по времени сила
                        \s""");
                int formula = in.nextInt();
                if (formula == 1) {
                    System.out.println("Формула: p = m*V");
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    System.out.println("Введите V:");
                    double V = in.nextDouble();
                    double p = m * V;
                    System.out.printf("p = %f", p);
                }
                if (formula == 2) {
                    System.out.println("Формула: p(system) = p0+p1+p2+...pn");
                    System.out.println("Введите кол-во p: ");
                    double p;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите F%d \n", i);
                        arr[i] = in.nextDouble();
                    }
                    p = DoubleStream.of(arr).sum();
                    System.out.printf("p = %f", p);
                }
                if (formula == 3) {
                    System.out.println("Формула: dp = sum(F)*dt");
                    System.out.println("Введите кол-во F: ");
                    double p;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите F%d \n", i);
                        arr[i] = in.nextDouble();
                    }
                    p = DoubleStream.of(arr).sum();
                    System.out.println("Введите dt: ");
                    double dt = in.nextDouble();
                    double dp = p * dt;
                    System.out.printf("dp = %f", dp);
                }
                if (formula == 4) {
                    System.out.println("Формула: dp(system) = sum(F(внеш))*dt");
                    System.out.println("Введите кол-во F(внеш): ");
                    double p;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите F%d \n", i);
                        arr[i] = in.nextDouble();
                    }
                    p = DoubleStream.of(arr).sum();
                    System.out.println("Введите dt: ");
                    double dt = in.nextDouble();
                    double dp = p * dt;
                    System.out.printf("dp(system) = %f", dp);
                }
                if (formula == 5) {
                    System.out.println("Формула: p'(system) = p''(system)");
                }
                if (formula == 6) {
                    System.out.println("Формула: A(F) = F*dr");
                    System.out.println("Введите F:");
                    double F = in.nextDouble();
                    System.out.println("Введите dr: ");
                    double dr = in.nextDouble();
                    double A = F * dr;
                    System.out.printf("A(F) = %f", A);

                }
                if (formula == 7) {
                    System.out.println("Формула: N = A/t");
                    System.out.println("Введите А: ");
                    double A = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double N = A / t;
                    System.out.printf("N = %f", N);
                }
                if (formula == 8) {
                    System.out.println("Формула: N = F*nu*cos(a) ");
                    System.out.println("Введите F: ");
                    double F = in.nextDouble();
                    System.out.println("Введите nu: ");
                    double nu = in.nextDouble();
                    System.out.println("Введите а: ");
                    double a = Math.cos(in.nextDouble());
                    double N = F * nu * a;
                    System.out.printf("N = %f", N);
                }
                if (formula == 9) {
                    System.out.println("Формула: E(мех) = E(k) + E(p)");
                    System.out.println("Введите Е(к): ");
                    double Ek = in.nextDouble();
                    System.out.println("Введите E(p): ");
                    double Ep = in.nextDouble();
                    double Em = Ek + Ep;
                    System.out.printf("E(мех) = %f", Em);
                }
                if (formula == 10) {
                    System.out.println("Формула: Е(к) = (М*nu^2)/2 ");
                    System.out.println("Введите M: ");
                    double M = in.nextDouble();
                    System.out.println("Введите nu: ");
                    double nu = Math.pow(in.nextDouble(), 2);
                    double E = (M * nu) / 2;
                    System.out.printf("E(к) = %f", E);

                }
                if (formula == 11) {
                    System.out.println("Формула: dE(мех) = A(неконс)");
                }
                if (formula == 12) {
                    System.out.println("Формула: dE(к) = A(всех сил)");
                }
                if (formula == 13) {
                    System.out.println("Формула: Ep(тяж) = m*g*h");
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    System.out.println("Введите g: ");
                    double g = in.nextDouble();
                    System.out.println("Введите h: ");
                    double h = in.nextDouble();
                    double E = m * g * h;
                    System.out.printf("Ер(тяж) = %f", E);
                }
                if (formula == 14) {
                    System.out.println("Формула: Ep(упр) = (к*dl^2)/2");
                    System.out.println("Введите к: ");
                    double k = in.nextDouble();
                    System.out.println("Введите dl: ");
                    double dl = Math.pow(in.nextDouble(), 2);
                    double E = (k * dl) / 2;
                    System.out.printf("Ep(упр) = %f", E);
                }
                if (formula == 15) {
                    System.out.println("Формула: Е'(мех) = E''(мех)");
                }
                if (formula == 16) {
                    System.out.println("Формула: Q = E'(мех) - E''(мех)");
                }
                if (formula == 17) {
                    System.out.println("Формула: А(F) = F*|dr|*cos(a)");
                    System.out.println("Введите F: ");
                    double F = in.nextDouble();
                    System.out.println("Введите dr: ");
                    double dr = Math.abs(in.nextDouble());
                    System.out.println("Введите а: ");
                    double a = Math.cos(in.nextDouble());
                    double A = F * dr * a;
                    System.out.printf("A(F) = %f", A);
                }
                if (formula == 18) {
                    System.out.println("Формула: A(конс1-2) = Ep1 - Ep2");
                    System.out.println("Введите Ep1: ");
                    double Ep1 = in.nextDouble();
                    System.out.println("Введите Ep2:");
                    double Ep2 = in.nextDouble();
                    double A = Ep1 - Ep2;
                    System.out.printf("A = %f", A);
                }
                if (formula == 19) {
                    System.out.println("Формула: А(неконс) = dE(мех) ");
                }
                if (formula == 20) {
                    System.out.println("Формула: А(всех F) = dE(к) ");
                }
                if (formula == 21) {
                    System.out.println("Формула: А(F) = +-S ");
                }
                if (formula == 22) {
                    System.out.println("Формула: A(тяж) = m*g*(dh) ");
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    System.out.println("Введите g: ");
                    double g = in.nextDouble();
                    System.out.println("Введите h1: ");
                    double h1 = in.nextDouble();
                    System.out.println("Введите h2: ");
                    double h2 = in.nextDouble();
                    double dh = h1 - h2;
                    double A = m * g * dh;
                    System.out.printf("A(тяж) = %f", A);

                }
                if (formula == 23) {
                    System.out.println("Формула: A(упр) = к/2*(dl1^2-dl2^2");
                    System.out.println("Введите к: ");
                    double k = in.nextDouble();
                    System.out.println("Введите dl1: ");
                    double l1 = Math.pow(in.nextDouble(), 2);
                    System.out.println("Введите dl2: ");
                    double l2 = Math.pow(in.nextDouble(), 2);
                    double A = (k / 2) * (l1 - l2);
                    System.out.printf("A = %f", A);
                }
                if (formula == 24) {
                    System.out.println("Формула: F(ср) = dp(сист)/dt ");
                    System.out.println("Введите dp(сист): ");
                    double dp = in.nextDouble();
                    System.out.println("Введите dt: ");
                    double dt = in.nextDouble();
                    double F = dp / dt;
                    System.out.printf("F = %f", F);
                }
            } // 24
            if (zapros == 4) {
                System.out.println("Вы выбрали Раздел: Статика");
                System.out.println("""
                        Выберите формулу: \s
                        1 - Условия равновесия
                        2 - Вращающий момент
                        3 - Вращающий момент при равновесии
                        4 - Центр масс геометрических точек на ОХ
                        5 - Центр масс геометрических точек на ОY
                        6 - Центр масс геометрических точек на ОZ
                        7 - Давление жидкости
                        8 - Плотность гидростатического давления (ИНТЕРНЕТ АААААААААА)
                        9 - Давление в определённой точке поверхности
                        10 - Давление в точке жидкости
                        11 - Давление в точках однородной покоящейся жидкости
                        12 - Архимедова сила
                        13 - Архимедова сила в однородной жидкости
                        14 - Масса вытесненной жидкости
                        15 - Сила инерции
                        \s""");
                int formula = in.nextInt();
                if (formula == 1) {
                    System.out.println("Формула: F1(внеш)+F2(внеш)+F3(внеш)+...Fn(внеш) = 0");
                }
                if (formula == 2) {
                    System.out.println("Формула: M(F) = F*d(F)");
                    System.out.println("Введите F: ");
                    double F = in.nextDouble();
                    System.out.println("Введите d(F): ");
                    double d = in.nextDouble();
                    double M = F * d;
                    System.out.printf("M(F) = %f", M);
                }
                if (formula == 3) {
                    System.out.println("Формула: M(F1(внеш))+M(F2(внеш))+M(F3(внеш))+...M(Fn(внеш)) = 0  ");
                }
                if (formula == 4) {
                    System.out.println("Формула: x(c) = (m1x1+m2x2+...+mnxn)/(m1+m2+....+m(n)");
                    System.out.println("Введите кол-во mx: ");
                    int mx = in.nextInt();
                    double[] arr = new double[mx];
                    for (int i = 0; i < mx; i++) {
                        System.out.printf("Введите m%dx%d \n", i, i);
                        arr[i] = in.nextDouble();
                    }
                    double sumx;
                    sumx = DoubleStream.of(arr).sum();

                    System.out.println("Введите кол-во m: ");
                    int m = in.nextInt();
                    double[] arr1 = new double[m];
                    for (int i = 0; i < m; i++) {
                        System.out.printf("Введите m%dx%d \n", i, i);
                        arr1[i] = in.nextDouble();
                    }
                    double summ;
                    summ = DoubleStream.of(arr1).sum();
                    double xc = sumx / summ;
                    System.out.printf("x(c) = %f", xc);
                }
                if (formula == 5) {
                    System.out.println("Формула: y(c) = (m1y1+m2y2+...+mnyn)/(m1+m2+....+m(n)");
                    System.out.println("Введите кол-во my: ");
                    int my = in.nextInt();
                    double[] arr = new double[my];
                    for (int i = 0; i < my; i++) {
                        System.out.printf("Введите m%dy%d \n", i, i);
                        arr[i] = in.nextDouble();
                    }
                    double sumy;
                    sumy = DoubleStream.of(arr).sum();

                    System.out.println("Введите кол-во m: ");
                    int m = in.nextInt();
                    double[] arr1 = new double[m];
                    for (int i = 0; i < m; i++) {
                        System.out.printf("Введите m%dx%d \n", i, i);
                        arr1[i] = in.nextDouble();
                    }
                    double summ;
                    summ = DoubleStream.of(arr1).sum();
                    double yc = sumy / summ;
                    System.out.printf("y(c) = %f", yc);
                }
                if (formula == 6) {
                    System.out.println("Формула: z(c) = (m1z1+m2z2+...+mnzn)/(m1+m2+....+m(n)");
                    System.out.println("Введите кол-во mz: ");
                    int mz = in.nextInt();
                    double[] arr = new double[mz];
                    for (int i = 0; i < mz; i++) {
                        System.out.printf("Введите m%dz%d \n", i, i);
                        arr[i] = in.nextDouble();
                    }
                    double sumz;
                    sumz = DoubleStream.of(arr).sum();

                    System.out.println("Введите кол-во m: ");
                    int m = in.nextInt();
                    double[] arr1 = new double[m];
                    for (int i = 0; i < m; i++) {
                        System.out.printf("Введите m%dz%d \n", i, i);
                        arr1[i] = in.nextDouble();
                    }
                    double summ;
                    summ = DoubleStream.of(arr1).sum();
                    double zc = sumz / summ;
                    System.out.printf("z(c) = %f", zc);
                }
                if (formula == 7) {
                    System.out.println("Формула: р = F(гидр.давл)/S ");
                    System.out.println("Введите F: ");
                    double F = in.nextDouble();
                    System.out.println("Введите S: ");
                    double S = in.nextDouble();
                    double p = F / S;
                    System.out.printf("p = %f", p);
                }
                if (formula == 8) {
                    System.out.println("Формула: P = ro*g*h");
                    System.out.println("Введите ro: ");
                    double ro = in.nextDouble();
                    System.out.println("Введите g: ");
                    double g = in.nextDouble();
                    System.out.println("Введите h: ");
                    double h = in.nextDouble();
                    double P = ro * g * h;
                    System.out.printf("Р = %f", P);
                }
                if (formula == 9) {
                    System.out.println("Формула: р = dF(гидр.давл)/dS ");
                    System.out.println("Введите dF: ");
                    double dF = in.nextDouble();
                    System.out.println("Введите dS: ");
                    double dS = in.nextDouble();
                    double p = dF / dS;
                    System.out.printf("p = %f", p);
                }
                if (formula == 10) {
                    System.out.println("Формула: p(а) = p1 = p2 = pn");
                }
                if (formula == 11) {
                    System.out.println("Формула: p1 = p2 = p3 = pn");

                }
                if (formula == 12) {
                    System.out.println("Формула: F(Арх) = m(выт)*g");
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    System.out.println("Введите g: ");
                    double g = in.nextDouble();
                    double F = m * g;
                    System.out.printf("F(Apx) = %f", F);
                }
                if (formula == 13) {
                    System.out.println("Формула: F(арх) = ro(ж)*V(погр)*g");
                    System.out.println("Введите ro: ");
                    double ro = in.nextDouble();
                    System.out.println("Введите V(погр): ");
                    double V = in.nextDouble();
                    System.out.println("Введите g: ");
                    double g = in.nextDouble();
                    double F = ro * V * g;
                    System.out.printf("F(apx) = %f", F);
                }
                if (formula == 14) {
                    System.out.println("Формула: m(выт) = p1V1+p2V2+...+pnVn ");
                    System.out.println("Введите кол-во pv: ");
                    double ma;
                    int m = in.nextInt();
                    double[] arr = new double[m];
                    for (int i = 0; i < m; i++) {
                        System.out.printf("Введите p%dv%d \n", i, i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("m(выт) = %f", ma);
                }
                if (formula == 15) {
                    System.out.println("Формула: F(ин) = -m*a");
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    System.out.println("Введите a: ");
                    double a = in.nextDouble();
                    double F = (-1 * m) * a;
                    System.out.printf("F(ин) = %f", F);
                }

            }// 15
            if (zapros == 5) {
                System.out.println("Вы выбрали Раздел: Тепловые явления");
                System.out.println("""
                        Выберите формулу: \s
                        1 - Уравнение Менделеева-Клапейрона
                        2 - Абсолютная температура
                        3 - Кол-во молекул газа
                        4 - Концентрация газа
                        5 - Плотность газа
                        6 - Закон идеального газа
                        7 - Основное уравнение МКТ
                        8 - Средняя кинетическая энергия поступательного движения молекул
                        9 - Масса 1 молекулы
                        10 - Закон Дальтона
                        11 - Газовый закон
                        12 - Изотермический процесс
                        13 - Изобарный процесс
                        14 - Изохорный процесс
                        15 - Первый закон термодинамики
                        16 - Работа газа
                        17 - Работа газа при rо - const
                        18 - Работа газа при nu - const
                        19 - Внутрення энергия
                        20 - Внутрення энергия для идеального газа
                        21 - Внутрення энергия для идеального газа в любом процессе
                        22 - Теплоёмкость тела(системы)
                        23 - Удельная теплоёмкость вещества
                        24 - Малекулярная теплоёмкость вещества
                        25 - Кол-во теплоты в адиабатическом процессе
                        26 - работа газа в адиабатическом процессе
                        27 - КПД циклического процесса
                        28 - Работа газа в цикле
                        29 - КПД идеальной тепловой машины
                        30 - Относительная влажность воздуха
                        \s""");
                double R = 8.31;
                String k = "10^-23";
                int formula = in.nextInt();
                if (formula == 1) {
                    System.out.println("Формула: rо*V = nu*R*T (R - Универсальная газовая постоянная = 8,31 Дж/(моль*к))");
                    System.out.println("Введите nu: ");
                    double nu = in.nextDouble();
                    System.out.println("Введите T: ");
                    double T = in.nextDouble();
                    double ro = R * nu * T;
                    System.out.printf("ro*V = %f", ro);
                }
                if (formula == 2) {
                    System.out.println("Формула: T = (t+273)*k , где k - Постоянная Больцмана = 1,38*10^-23 (Дж/к))");
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double T = (t + 273) * 1.38;
                    System.out.printf("T = %f * %s ", T, k);
                }
                if (formula == 3) {
                    System.out.println("Формула: nu = N/N(A) ");
                    System.out.println("Введите N: ");
                    double N = in.nextDouble();
                    System.out.println("Введите N(A): ");
                    double Na = in.nextDouble();
                    double nu = N / Na;
                    System.out.printf("nu = %f", nu);
                }
                if (formula == 4) {
                    System.out.println("Формула: n = N/V");
                    System.out.println("Введите N: ");
                    double N = in.nextDouble();
                    System.out.println("Введите V: ");
                    double V = in.nextDouble();
                    double n = N / V;
                    System.out.printf("n = %f", n);
                }
                if (formula == 5) {
                    System.out.println("Формула: rо = m/V ");
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    System.out.println("Введите V:");
                    double V = in.nextDouble();
                    double ro = m / V;
                    System.out.printf("ro = %f", ro);
                }
                if (formula == 6) {
                    System.out.println("Формула: ro = n*k*T");
                    System.out.println("Введие n: ");
                    double n = in.nextDouble();
                    System.out.println("Введите Т: ");
                    double T = in.nextDouble();
                    double ro = n * 1.38 * T;
                    System.out.printf("ro = %f * %s", ro, k);
                }
                if (formula == 7) {
                    System.out.println("Формула: ro = 1/3*n*m0*v^2");
                    System.out.println("Введите n: ");
                    double n = in.nextDouble();
                    System.out.println("Введите m0: ");
                    double m = in.nextDouble();
                    System.out.println("Введите v = ");
                    double v = Math.pow(in.nextDouble(), 2);
                    double ro = 0.3 * n * m * v;
                    System.out.printf("ro = %f", ro);
                }
                if (formula == 8) {
                    System.out.println("Формула: E(к) 3/2*k*T");
                    System.out.println("Введите T: ");
                    double T = in.nextDouble();
                    double E = 1.5 * 1.38 * T;
                    System.out.printf("E(к) = %f * %s", E, k);
                }
                if (formula == 9) {
                    System.out.println("Формула: m0 = M/N");
                    System.out.println("Введите M: ");
                    double M = in.nextDouble();
                    System.out.println("Введите N: ");
                    double N = in.nextDouble();
                    double m = M / N;
                    System.out.printf("m0 = %f", m);
                }
                if (formula == 10) {
                    System.out.println("Формула: p(смеси) = p0+p1+p2+...Fn");
                    System.out.println("Введите кол-во p: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите p%d \n", i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("p(смеси) = %f", ma);
                }
                if (formula == 11) {
                    System.out.println("Формула: p1*V1/T1 = p2*V2/T2");
                }
                if (formula == 12) {
                    System.out.println("Формула: p1*V1 = p2*V2");
                }
                if (formula == 13) {
                    System.out.println("Формула: V1/T1 = V2/T2");
                }
                if (formula == 14) {
                    System.out.println("Формула: p1/T1 = p2/T2");
                }
                if (formula == 15) {
                    System.out.println("Q = dU*A(газа)");
                    System.out.println("Введите dU: ");
                    double dU = in.nextDouble();
                    System.out.println("Введите А: ");
                    double A = in.nextDouble();
                    double Q = dU * A;
                    System.out.printf("Q = %f", Q);
                }
                if (formula == 16) {
                    System.out.println("Формула: А(газа) = -А(над газом)");
                }
                if (formula == 17) {
                    System.out.println("Формула: A(газа) = ro*dV");
                    System.out.println("Введите ro: ");
                    double ro = in.nextDouble();
                    System.out.println("Введите dV: ");
                    double V = in.nextDouble();
                    double A = ro * V;
                    System.out.printf("А = %f", A);
                }
                if (formula == 18) {
                    System.out.println("Формула: А(газа) = nu*R*dT");
                    System.out.println("Введите nu: ");
                    double nu = in.nextDouble();
                    System.out.println("Введите dT: ");
                    double T = in.nextDouble();
                    double A = nu * R * T;
                    System.out.printf("A(газа) = %f", A);
                }
                if (formula == 19) {
                    System.out.println("Формула: U = i/2*nu*R*T");
                    System.out.println("Введите i: ");
                    double i = in.nextDouble();
                    System.out.println("Введите nu: ");
                    double nu = in.nextDouble();
                    System.out.println("Введите T: ");
                    double T = in.nextDouble();
                    double U = i / 2 * nu * R * T;
                    System.out.printf("U = %f", U);
                }
                if (formula == 20) {
                    System.out.println("Формула: dU = i/2*(p2V2-p1V1)");
                    System.out.println("Введите i: ");
                    double i = in.nextDouble();
                    System.out.println("Введите p2V2: ");
                    double p2 = in.nextDouble();
                    System.out.println("Введите p1V1: ");
                    double p1 = in.nextDouble();
                    double U = i / 2 * (p2 - p1);
                    System.out.printf("dU = %f", U);
                }
                if (formula == 21) {
                    System.out.println("Формула: dU = C(mV)*nu*dT");
                    System.out.println("Введите C(mV): ");
                    double mV = in.nextDouble();
                    System.out.println("Введите nu: ");
                    double n = in.nextDouble();
                    System.out.println("Введите dT:");
                    double d = in.nextDouble();
                    double u = mV * n * d;
                    System.out.printf("dU = %f", u);
                }
                if (formula == 22) {
                    System.out.println("Формула: C = Q/dT");
                    System.out.println("Введите Q: ");
                    double Q = in.nextDouble();
                    System.out.println("Введите dT: ");
                    double d = in.nextDouble();
                    double C = Q / d;
                    System.out.printf("C = %f", C);
                }
                if (formula == 23) {
                    System.out.println("Формула: C = Q/(dT*m)");
                    System.out.println("Введите Q: ");
                    double Q = in.nextDouble();
                    System.out.println("Введите dT: ");
                    double d = in.nextDouble();
                    System.out.println("Введите m: ");
                    double m = in.nextDouble();
                    double C = Q / (d * m);
                    System.out.printf("C = %f", C);
                }
                if (formula == 24) {
                    System.out.println("Формула: C = Q/(dT*nu)");
                    System.out.println("Введите Q: ");
                    double Q = in.nextDouble();
                    System.out.println("Введите dT: ");
                    double d = in.nextDouble();
                    System.out.println("Введите nu: ");
                    double m = in.nextDouble();
                    double C = Q / (d * m);
                    System.out.printf("C = %f", C);
                }
                if (formula == 25) {
                    System.out.println("Формула: Q = 0");
                }
                if (formula == 26) {
                    System.out.println("Формула: А(газа) = -dU");
                }
                if (formula == 27) {
                    System.out.println("Формула: n(цикла) = 1-(|Q(отв)/Q(подв)) , где n - это ета ");
                    System.out.println("Введите Q(отв): ");
                    double Q = Math.abs(in.nextDouble());
                    System.out.println("Введите Q(подв): ");
                    double Q1 = in.nextDouble();
                    double n = 1 - (Q / Q1);
                    System.out.printf("n(цикла) = %f", n);
                }
                if (formula == 28) {
                    System.out.println("Формула: А(газа в цикле) = +/- S(внутри цикла) / + если цикл идёт по часовой стрелки, - если наоборот/");
                }
                if (formula == 29) {
                    System.out.println("Формула: n(идеал) = (T(наг)-T(хол))/T(наг)");
                    System.out.println("Введите T(наг): ");
                    double T = in.nextDouble();
                    System.out.println("Введите T(хол): ");
                    double T1 = in.nextDouble();
                    double n = ((T - T1) / T);
                    System.out.printf("n(идеал) = %f", n);
                }
                if (formula == 30) {
                    System.out.println("Формула: Fi = (ro(пара в воздухе)/ro(пара при данной T))*100%");
                    System.out.println("Введите ro(пара в воздухе): ");
                    double ro = in.nextDouble();
                    System.out.println("Введите ro(пара при данной T): ");
                    double ro1 = in.nextDouble();
                    double Fi = (ro / ro1) * 1;
                    System.out.printf("Fi = %f", Fi);
                }
            } // 30
            if (zapros == 6) {
                System.out.println("Вы выбрали Раздел: Электростатика");
                System.out.println("""
                        Выберите формулу: \s
                        1 - Закон Кулона
                        2 - Принцип суперпозиции
                        3 - Электрическая сила, действующая на точный заряд q со стороны эл. поля
                        4 - Работа эл. сил над зарядом q при его перемещении из точки с потенциальным Fi(1) в точку с потенциальным Fi(2)
                        5 - Напряжённость эл. поля
                        6 - Потенциал эл. поля
                        7 - Напряжённость эл. поля, созданного системой зарядов Q в т. М
                        8 - Потенциал эл. поля созданного системой зарядов Q в т. М
                        9 - Напряжённость эл. поля, созданного равномерно заряженным по поверхности шаром
                        10 - Потенциал эл. поля, созданного равномерно заряженным по поверхности шаром
                        11 - Напряжённость внутри шара
                        12 - Fi внутри шара
                        13 - Напряжённость однородного эл. поля
                        14 - Поверхностная плотность заряда
                        15 - Потенциал однородного эл. поля
                        16 - Напряжение в однородном электрическом поле
                        17 - Потенциальная энергия системы эл. зарядов
                        18 - Внешняя потенциальная энергия системы эл. зарядов
                        19 - электроёмкость
                        20 - Электроёмкость конденсатора
                        21 - Напряжение на конденсаторе
                        22 - Электроёмкость плоского конденсатора
                        23 - Энергия эл. поля конденсатора
                        24 - Общая ёмкость системы конденсаторов
                        25 - Общее напряжение системы конденсаторов
                        \s""");
                int formula = in.nextInt();
                if (formula == 1) {
                    System.out.println("Формула: F(эл) = k*(|q1|*|q2|/(e*r^2))");
                    System.out.println("Введите k: ");
                    double k = in.nextDouble();
                    System.out.println("Введите q1: ");
                    double q = Math.abs(in.nextDouble());
                    System.out.println("Введите q2: ");
                    double q1 = Math.abs(in.nextDouble());
                    System.out.println("Введите е: ");
                    double e = in.nextDouble();
                    System.out.println("Введите r: ");
                    double r = Math.pow(in.nextDouble(), 2);
                    double F = k*(q*q1/(e*r));
                    System.out.printf("F = %f" , F);

                }
                if (formula == 2) {
                    System.out.println("Формула: F на q = F на q(Q0)+F на q(Q1)+F на q(Q2) +...Fn");
                    System.out.println("Введите кол-во F на q: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите F на q(Q%d) \n", i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("F на q = %f", ma);
                }
                if (formula == 3) {
                    System.out.println("Формула: F(эл) на q = q*E ");
                    System.out.println("Введите q: ");
                    double q = in.nextDouble();
                    System.out.println("Введите Е: ");
                    double E = in.nextDouble();
                    double F = q*E;
                    System.out.printf("F(эл) на q = %f" , F);
                }
                if (formula == 4) {
                    System.out.println("Формула: A(эл над q)1-2 = q*(Fi1-Fi2) ");
                    System.out.println("Введите q: ");
                    double q = in.nextDouble();
                    System.out.println("Введите Fi1: ");
                    double Fi = in.nextDouble();
                    System.out.println("Введите Fi2: ");
                    double Fi1 = in.nextDouble();
                    double A = q*(Fi-Fi1);
                    System.out.printf("A(эл над q)1-2 = %f" , A);
                }
                if (formula == 5) {
                    System.out.println("Формула: E(m) = k*(|Q|/(E*r^2) ");
                    System.out.println("Введите k: ");
                    double k = in.nextDouble();
                    System.out.println("Введите Q: ");
                    double Q = Math.abs(in.nextDouble());
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите r: ");
                    double r = Math.pow(in.nextDouble(),2);
                    double Em = k*(Q/(E*r));
                    System.out.printf("E(m) = %f" , Em);
                }
                if (formula == 6) {
                    System.out.println("Формула: Fi(m) = k*(Q/(E*r) ");
                    System.out.println("Введите k: ");
                    double k = in.nextDouble();
                    System.out.println("Введите Q: ");
                    double Q = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите r: ");
                    double r = in.nextDouble();
                    double Em = k*(Q/(E*r));
                    System.out.printf("Fi(m) = %f" , Em);
                }
                if (formula == 7) {
                    System.out.println("Формула: E(m) = Em(Q1) + Em(Q2) + Em(Qn)");
                    System.out.println("Введите кол-во Em(Q): ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите Em(Q%d) \n" , i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("E(m) = %f" , ma);
                }
                if (formula == 8) {
                    System.out.println("Формула: Fi(m) = Fim(Q1) + Fim(Q2) + Fim(Qn)");
                    System.out.println("Введите кол-во Fim(Q): ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите Fim(Q%d) \n" , i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("Fi(m) = %f" , ma);
                }
                if (formula == 9) {
                    System.out.println("Формула: E(вне шара) = k*(|Q(шара)/(E*r^2(до центра шара)) ");
                    System.out.println("Введите k: ");
                    double k = in.nextDouble();
                    System.out.println("Введите Q(шара): ");
                    double Q = Math.abs(in.nextDouble());
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите r(до центра): ");
                    double r = Math.pow(in.nextDouble(),2);
                    double Em = k*(Q/(E*r));
                    System.out.printf("E(вне шара) = %f" , Em);
                }
                if (formula == 10) {
                    System.out.println("Формула: Fi(вне шара) = k*(Q(шара)/(E*r(до центра шара)) ");
                    System.out.println("Введите k: ");
                    double k = in.nextDouble();
                    System.out.println("Введите Q(шара): ");
                    double Q = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите r(до центра шара): ");
                    double r = in.nextDouble();
                    double Em = k*(Q/(E*r));
                    System.out.printf("Fi(вне шара) = %f" , Em);
                }
                if (formula == 11) {
                    System.out.println("Формула: E(внутри шара) = 0 ");
                }
                if (formula == 12) {
                    System.out.println("Формула: Fi(внутри шара) = Fi(поверхности шара) = k*(Q(шара)/(E*R(шара)) ");
                    System.out.println("Введите k: ");
                    double k = in.nextDouble();
                    System.out.println("Введите Q(шара): ");
                    double Q = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите R(шара)): ");
                    double r = in.nextDouble();
                    double Em = k*(Q/(E*r));
                    System.out.printf("Fi(внутри шара) = %f" , Em);
                }
                if (formula == 13) {
                    System.out.println("Формула: E(плоск) = |sigma|/(2*E0*E) ");
                    System.out.println("Введите sigma : ");
                    double s = Math.abs(in.nextDouble());
                    System.out.println("Введите E0 : ");
                    double E = in.nextDouble();
                    System.out.println("Введите E : ");
                    double E1 =in.nextDouble();
                    double E2 = s/(E*E1) ;
                    System.out.printf("E(плоск) = %f" ,E2 );
                }
                if (formula == 14) {
                    System.out.println("Формула: sigma = q/S  ");
                    System.out.println("Введите q : ");
                    double q = in.nextDouble();
                    System.out.println("Введите S: ");
                    double S = in.nextDouble();
                    double s = q/S ;
                    System.out.printf("sigma = %f" ,s );
                }
                if (formula == 15) {
                    System.out.println("Формула: dFi = E(x)*dx ");
                    System.out.println("Введите E(x): ");
                    double E = in.nextDouble();
                    System.out.println("Введите : dx ");
                    double x = in.nextDouble();
                    double f = E*x;
                    System.out.printf("dFi = %f" , f );
                }
                if (formula == 16) {
                    System.out.println("Формула: U = E*d ");
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите : ");
                    double d = in.nextDouble();
                    double U = E*d;
                    System.out.printf("U = %f" , U);
                }
                if (formula == 17) {
                    System.out.println("Формула: W(сист) = W(внеш) + W(взаим) ");
                    System.out.println("Введите W(внеш): ");
                    double W = in.nextDouble();
                    System.out.println("Введите W(взаим) : ");
                    double W1 = in.nextDouble();
                    double W2 = W+W1;
                    System.out.printf("W(сист) = %f" , W2);
                }
                if (formula == 18) {
                    System.out.println("Формула: W(внеш) = q1Fi1 + q2Fi2 + ... + qnFin ");
                    System.out.println("Введите кол-во qFi: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите q%dFi%d \n" , i, i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("W(внеш) = %f" , ma);
                }
                if (formula == 19) {
                    System.out.println("Формула: C = q/Fi ");
                    System.out.println("Введите q: ");
                    double q = in.nextDouble();
                    System.out.println("Введите Fi: ");
                    double Fi = in.nextDouble();
                    double C = q/Fi;
                    System.out.printf("C = %f" , C);
                }
                if (formula == 20) {
                    System.out.println("Формула: C(конд) = q/U");
                    System.out.println("Введите q: ");
                    double q = in.nextDouble();
                    System.out.println("Введите U: ");
                    double U = in.nextDouble();
                    double C = q/U;
                    System.out.printf("C(конд) = %f" , C);
                }
                if (formula == 21) {
                    System.out.println("Формула: U(конд) = E*d ");
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите d: ");
                    double d = in.nextDouble();
                    double U = E*d;
                    System.out.printf("U(конд) = %f" ,U);
                }
                if (formula == 22) {
                    System.out.println("Формула: C(плоск. конд) = E0*E*S/d ");
                    System.out.println("Введите E0: ");
                    double E = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E1 = in.nextDouble();
                    System.out.println("Введите S: ");
                    double S = in.nextDouble();
                    System.out.println("Введите d: ");
                    double d = in.nextDouble();
                    double C = E*E1*S/d;
                    System.out.printf("C(плоск. конд) = %f" , C);
                }
                if (formula == 23) {
                    System.out.println("Формула: W(конд) = q*U/2");
                    System.out.println("Введите q: ");
                    double q = in.nextDouble();
                    System.out.println("Введите U: ");
                    double U = in.nextDouble();
                    double W = q*U/2 ;
                    System.out.printf("W(конд) = %f" , W);
                }
                if (formula == 24) {
                    System.out.println("Формула: C(общ) = C0 + C1 + Cn");
                    System.out.println("Введите кол-во C: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите C%d \n" , i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("C(общ) = %f" , ma);
                }
                if (formula == 25) {
                    System.out.println("Формула: U(общ) = U1 = U2 = Un ");
                }
            } // 25
            if (zapros == 7) {
                System.out.println("Вы выбрали Раздел: Ток");
                System.out.println("""
                        Выберите формулу: \s
                        1 - Сила тока
                        2 - Плотность тока
                        3 - Векторная плотность тока
                        4 - Закон Ома для участка цепи, не содержащей ЭДС
                        5 - Сопротивление
                        6 - Удельное сопротивление материала
                        7 - Закон Ома для участка цепи, содержащей ЭДС
                        8 - ЭДС источника
                        9 - Закон Ома для полной цепи
                        10 - Общая Сила тока при последовательном соединении
                        11 - Общее Напряжение при последовательном соединении
                        12 - Общее Сопротивление при последовательном соединении
                        13 - Общая Сила тока при параллельном соединении
                        14 - Общее Напряжение при параллельном соединении
                        15 - Общее Сопротивление при параллельном соединении
                        16 - Работа эл. тока (для уч. не содерж. ЭДС)
                        17 - Работа эл тока (для уч. содерж. ЭДС)
                        18 - Мощность эл. тока (для уч. не содерж. ЭДС)
                        19 - Мощность эл. тока (для уч. содерж. ЭДС)
                        20 - Кол-во теплоты
                        21 - КПД эл. цепи
                        22 - Условие выделения максимальной мощности на нагрузке
                        23 - Закон Фарадея для электролиза
                        24 - Энергия, затраченная на элетролиз
                        25 - Работа сторонних сил источника
                        26 - Тепловая мощность
                        27 - Мощность сторонних сил источника
                        \s""");
                int formula = in.nextInt();
                if (formula == 1) {
                    System.out.println("Формула: I = q/t");
                    System.out.println("Введите q: ");
                    double q =in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double I = q/t;
                    System.out.printf("I = %f" , I);
                }
                if (formula == 2) {
                    System.out.println("Формула: j = I/S ");
                    System.out.println("Введите I: ");
                    double I = in.nextDouble();
                    System.out.println("Введите S: ");
                    double S = in.nextDouble();
                    double j = I/S ;
                    System.out.printf("j = %f" ,j);
                }
                if (formula == 3) {
                    System.out.println("Формула: j = q0*n*V(уп)");
                    System.out.println("Введите q0: ");
                    double q = in.nextDouble();
                    System.out.println("Введите n: ");
                    double n = in.nextDouble();
                    System.out.println("Введите V(уп): ");
                    double V = in.nextDouble();
                    double j = q*n*V;
                    System.out.printf("j = %f" ,j);
                }
                if (formula == 4) {
                    System.out.println("Формула: I = U/R ");
                    System.out.println("Введите U: ");
                    double U = in.nextDouble();
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    double I = U/R ;
                    System.out.printf("I = %f" , I );
                }
                if (formula == 5) {
                    System.out.println("Формула: R = ro*l/S");
                    System.out.println("Введите ro: ");
                    double ro = in.nextDouble();
                    System.out.println("Введите l: ");
                    double l = in.nextDouble();
                    System.out.println("Введите S: ");
                    double S = in.nextDouble();
                    double R = ro*l/S;
                    System.out.printf("R = %f" ,R );
                }
                if (formula == 6) {
                    System.out.println("Формула: ro = ro0*(1+a*t)");
                    System.out.println("Введите ro0: ");
                    double ro = in.nextDouble();
                    System.out.println("Введите a: ");
                    double a = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double ro1 = ro*(1+a*t);
                    System.out.printf("ro = %f" , ro1);
                }
                if (formula == 7) {
                    System.out.println("Формула: I*R = Fi1-Fi2 + E");
                    System.out.println("Введите Fi1: ");
                    double Fi = in.nextDouble();
                    System.out.println("Введите Fi2: ");
                    double Fi1 = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    double I = Fi-Fi1+E ;
                    System.out.printf("I*R = %f" , I);
                }
                if (formula == 8) {
                    System.out.println("Формула: E = a(стор1-2)/q");
                    System.out.println("Введите a(стор1-2): ");
                    double a = in.nextDouble();
                    System.out.println("Введите q: ");
                    double q = in.nextDouble();
                    double E = a/q ;
                    System.out.printf("E = %f" , E);
                }
                if (formula == 9) {
                    System.out.println("Формула: I = E/(R+r)");
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    System.out.println("Введите r: ");
                    double r = in.nextDouble();
                    double I = E/(R+r);
                    System.out.printf("I = %f" , I);
                }
                if (formula == 10) {
                    System.out.println("Формула: I(общ) = I1 = I2 = In");
                }
                if (formula == 11) {
                    System.out.println("Формула: U(общ) = U0+U1+U2+ .. U3");
                    System.out.println("Введите кол-во U: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите U%d) \n", i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("U(общ) = %f", ma);
                }
                if (formula == 12) {
                    System.out.println("Формула: R(общ) = R0+R1+R2+ .. R3");
                    System.out.println("Введите кол-во R: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите R%d) \n", i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("R(общ) = %f", ma);

                }
                if (formula == 13) {
                    System.out.println("Формула: I(общ) = I0+I1+I2... +In");
                    System.out.println("Введите кол-во I: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите I%d) \n", i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("I(общ) = %f", ma);
                }
                if (formula == 14) {
                    System.out.println("Формула: U(общ) = U1 = U2 = U3 = Un ");
                }
                if (formula == 15) {
                    System.out.println("Формула: 1/R(общ) = 1/R0+1/R1+1/R2+ ... 1/Rn");
                    System.out.println("Введите кол-во R: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите R%d \n", i);
                        arr[i] = 1/in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("R = %f", ma);
                }
                if (formula == 16) {
                    System.out.println("Формула: А(тока) = U^2/R*t");
                    System.out.println("Введите U: ");
                    double U = Math.pow(in.nextDouble(), 2);
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double A = U/(R*t);
                    System.out.printf("A(тока) = %f" , A);
                }
                if (formula == 17) {
                    System.out.println("Формула: A = I*U*t");
                    System.out.println("Введите I: ");
                    double I = in.nextDouble();
                    System.out.println("Введите U: ");
                    double U = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double A = I*U*t ;
                    System.out.printf("A = %f" ,A);

                }
                if (formula == 18) {
                    System.out.println("Формула: N = U^2/R");
                    System.out.println("Введите U: ");
                    double U = Math.pow(in.nextDouble(), 2);
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    double N = U/R;
                    System.out.printf("N = %f" , N);

                }
                if (formula == 19) {
                    System.out.println("Формула: N = I*U");
                    System.out.println("Введите I: ");
                    double I = in.nextDouble();
                    System.out.println("Введите U: ");
                    double U = in.nextDouble();
                    double N = I*U ;
                    System.out.printf("N = %f" ,N );

                }
                if (formula == 20) {
                    System.out.println("Формула: Q = I^2*R*t");
                    System.out.println("Введите I: ");
                    double I = Math.pow(in.nextDouble(), 2);
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double Q = I*R*t;
                    System.out.printf("Q = %f" , Q);

                }
                if (formula == 21) {
                    System.out.println("Формула: n = R/(R+r)");
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    System.out.println("Введите r: ");
                    double r = in.nextDouble();
                    double n = R/(R+r);
                    System.out.printf("n = %f" ,n );

                }
                if (formula == 22) {
                    System.out.println("Формула: R = r");
                }
                if (formula == 23) {
                    System.out.println("Формула: m = k*q");
                    System.out.println("Введите k: ");
                    double k = in.nextDouble();
                    System.out.println("Введите q: ");
                    double q = in.nextDouble();
                    double m = k*q;
                    System.out.printf("m = %f" , m);

                }
                if (formula == 24) {
                    System.out.println("Формула: I*U*t = I^2*R*t+I*E(пол)*t");
                    System.out.println("Введите I: ");
                    double I = Math.pow(in.nextDouble(),2);
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите : ");
                    double I1 = I*R*t+I*E*t;
                    System.out.printf("I*U*t = %f" , I1);

                }
                if (formula == 25) {
                    System.out.println("Формула: A(стор) = I*E*t");
                    System.out.println("Введите I: ");
                    double I = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    double A = I*E*t ;
                    System.out.printf("A(стор) = %f" , A);

                }
                if (formula == 26) {
                    System.out.println("Формула: N(тепл) = I^2*R");
                    System.out.println("Введите I: ");
                    double I = Math.pow(in.nextDouble(),2);
                    System.out.println("Введите R: ");
                    double R = in.nextDouble();
                    double N = I*R ;
                    System.out.printf("N(тепл) = %f" , N);

                }
                if (formula == 27) {
                    System.out.println("Формула: N(стор) = I*E");
                    System.out.println("Введите I: ");
                    double I = in.nextDouble();
                    System.out.println("Введите E: ");
                    double E = in.nextDouble();
                    double N = I*E ;
                    System.out.printf("N(стор) = %f" , N);

                }
            } // 27
            if (zapros == 8) { System.out.println("Вы выбрали Раздел: Магнитные явления");
                    System.out.println("""
                        Выберите формулу: \s
                        1 - Сила Лоренса
                        2 - Сила Ампера
                        3 - Радиус окружности, по которой движется частица с массой m, с зарядом u, в однородном магнитном поле индукции B
                        4 - Период обращения частит с массой m, с зарядом u, в однородном магнитном поле индукции B
                        5 - Рамка с током в магнитном поле
                        6 - Явление электромагнитной индукции
                        7 - ЭДС индукции, если Ф меняется равномерно
                        8 - ЭДС индукции
                        9 - Явление самоиндукции
                        10 - ЭДС самоиндукции, если I меняется равномерно
                        11 - ЭДС самоиндукции
                        12 - Энергия магнитного поля катушки индуктивности L, по которой течёт ток L
                        \s""");
                    int formula = in.nextInt();
                    if (formula == 1) {
                        System.out.println("Формула: F(лор) = |q|*V*B*sin(a)");
                        System.out.println("Введите q: ");
                        double q = Math.abs(in.nextDouble());
                        System.out.println("Введите V: ");
                        double V = in.nextDouble();
                        System.out.println("Введите B: ");
                        double B = in.nextDouble();
                        System.out.println("Введите a: ");
                        double a = Math.sin(in.nextDouble());
                        double F = q*V*B*a ;
                        System.out.printf("F(лор) = %f" , F);
                    }
                    if (formula == 2) {
                        System.out.println("Формула: F(a) = I*l*B*sin(a)");
                        System.out.println("Введите I: ");
                        double I = in.nextDouble();
                        System.out.println("Введите l: ");
                        double l = in.nextDouble();
                        System.out.println("Введите B: ");
                        double B = in.nextDouble();
                        System.out.println("Введите a: ");
                        double a = Math.sin(in.nextDouble());
                        double F = I*l*B*a ;
                        System.out.printf("F(лор) = %f" , F);
                    }
                    if (formula == 3) {
                        System.out.println("Формула: R = m*V/(|q|*B)");
                        System.out.println("Введите m: ");
                        double m = in.nextDouble();
                        System.out.println("Введите V: ");
                        double V = in.nextDouble();
                        System.out.println("Введите q: ");
                        double q = Math.abs(in.nextDouble());
                        System.out.println("Введите B: ");
                        double B = in.nextDouble();
                        double R = m*V/(q*B) ;
                        System.out.printf("R = %f" , R);
                    }
                    if (formula == 4) {
                        System.out.println("Формула: T = 2*pi*m/(|q|*B)");
                        System.out.println("Введите m: ");
                        double m = in.nextDouble();
                        System.out.println("Введите q: ");
                        double q = Math.abs(in.nextDouble());
                        System.out.println("Введите B: ");
                        double B = in.nextDouble();
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        double T = 2*pi*m/(q*B) ;
                        System.out.printf("T = %f" , T);
                    }
                    if (formula == 5) {
                        System.out.println("Формула: M = I*S*B*sin(a)");
                        System.out.println("Введите I: ");
                        double I = in.nextDouble();
                        System.out.println("Введите S: ");
                        double S = in.nextDouble();
                        System.out.println("Введите B: ");
                        double B = in.nextDouble();
                        System.out.println("Введите a: ");
                        double a = Math.sin(in.nextDouble());
                        double M = I*S*B*a;
                        System.out.printf("M = %f" , M);
                    }
                    if (formula == 6) {
                        System.out.println("Формула: Ф = B*S*cos(a)");
                        System.out.println("Введите B: ");
                        double B = in.nextDouble();
                        System.out.println("Введите S: ");
                        double S = in.nextDouble();
                        System.out.println("Введите a: ");
                        double a = Math.cos(in.nextDouble());
                        double F = B*S*a ;
                        System.out.printf("Ф = %f" , F);
                    }
                    if (formula == 7) {
                        System.out.println("Формула: E(i) = -(dФ/dt)");
                        System.out.println("Введите dФ: ");
                        double df = in.nextDouble();
                        System.out.println("Введите dt: ");
                        double dt = in.nextDouble();
                        double E = df/dt*(-1);
                        System.out.printf("E(i) = %f" , E);
                    }
                    if (formula == 8) {
                        System.out.println("Формула: E(i) = -Ф'(t)");
                    }
                    if (formula == 9) {
                        System.out.println("Формула: Ф(соб) = L*I");
                        System.out.println("Введите L: ");
                        double L = in.nextDouble();
                        System.out.println("Введите I: ");
                        double I = in.nextDouble();
                        double F = L*I ;
                        System.out.printf("Ф(соб) = %f" , F);
                    }
                    if (formula == 10) {
                        System.out.println("Формула: E(сам) = -L*(dI/dt)");
                        System.out.println("Введите L: ");
                        double L = in.nextDouble()*(-1);
                        System.out.println("Введите dI: ");
                        double I = in.nextDouble();
                        System.out.println("Введите dt: ");
                        double t = in.nextDouble();
                        double E = L*(I/t);
                        System.out.printf("E(сам) = %f" , E);
                    }
                    if (formula == 11) {
                        System.out.println("Формула: E(сам) = -L*I'(t)");
                        System.out.println("Введите L: ");
                        double L = in.nextDouble()*(-1);
                        System.out.println("Введите I'(t): ");
                        double I = in.nextDouble();
                        double E = L*I ;
                        System.out.printf("E(сам) = %f" , E);
                    }
                    if (formula == 12) {
                        System.out.println("Формула: W(кат) = (L*I^2)/2");
                        System.out.println("Введите L: ");
                        double L = in.nextDouble();
                        System.out.println("Введите I: ");
                        double I = Math.pow(in.nextDouble(), 2);
                        double W = L*I/2 ;
                        System.out.printf("W(кат) = %f" , W);
                    }
                    } // 12
            if (zapros == 9) { System.out.println("Вы выбрали Раздел: Колебания и волны");
                    System.out.println("""
                        Выберите формулу: \s
                        1 - Частота
                        2 - Колеблющаяся величина
                        3 - Фаза колебаний
                        4 - Циклическая частота
                        5 - Проекция скорости
                        6 - Проекция ускорения
                        7 - Дифференциальное уравнение гармоничских колебаний
                        8 - Пружинный маятник
                        9 - Математический маятник
                        10 - Маятник в лифте (при a лифта вверх)
                        11 - Маятник в лифте (при a лифта вниз)
                        12 - Колебательный контур
                        13 - Колеблющаяся величина волны
                        14 - Длина волны
                        \s""");
                    int formula = in.nextInt();
                    if (formula == 1) {
                        System.out.println("Формула: nu = 1/T");
                        System.out.println("Введите T: ");
                        double T = in.nextDouble();
                        double nu = 1/T ;
                        System.out.printf("nu = %f" , nu);
                    }
                    if (formula == 2) {
                        System.out.println("Формула: X = A*cos(w*t+Fi0)");
                        System.out.println("Введите A: ");
                        double A = in.nextDouble();
                        System.out.println("Введите w: ");
                        double w = in.nextDouble();
                        System.out.println("Введите t: ");
                        double t = in.nextDouble();
                        System.out.println("Введите Fi0: ");
                        double Fi0 = in.nextDouble();
                        double X = A*Math.cos(w*t+Fi0) ;
                        System.out.printf("X = %f" , X);
                    }
                    if (formula == 3) {
                        System.out.println("Формула: Fi = w*t+Fi0");
                        System.out.println("Введите w: ");
                        double w = in.nextDouble();
                        System.out.println("Введите t: ");
                        double t = in.nextDouble();
                        System.out.println("Введите Fi0: ");
                        double Fi0 = in.nextDouble();
                        double Fi = w*t+Fi0;
                        System.out.printf("Fi = %f" , Fi);
                    }
                    if (formula == 4) {
                        System.out.println("Формула: w = dFi/dt");
                        System.out.println("Введите dFi: ");
                        double Fi = in.nextDouble();
                        System.out.println("Введите dt: ");
                        double t = in.nextDouble();
                        double w = Fi/t;
                        System.out.printf("w = %f" , w);
                    }
                    if (formula == 5) {
                        System.out.println("Формула: V(макс) = w*A");
                        System.out.println("Введите w: ");
                        double w = in.nextDouble();
                        System.out.println("Введите A: ");
                        double A = in.nextDouble();
                        double V = w*A;
                        System.out.printf("V(макс) = %f" , V);
                    }
                    if (formula == 6) {
                        System.out.println("Формула: a(макс) = w^2*A");
                        System.out.println("Введите w: ");
                        double w = Math.pow(in.nextDouble(),2);
                        System.out.println("Введите A: ");
                        double A = in.nextDouble();
                        double V = w*A;
                        System.out.printf("a(макс) = %f" , V);
                    }
                    if (formula == 7) {
                        System.out.println("Формула: X''(t) = -(w^2*x)");
                        System.out.println("Введите w: ");
                        double w = Math.pow(in.nextDouble(),2);
                        System.out.println("Введите x: ");
                        double x = in.nextDouble();
                        double X = w*x*(-1);
                        System.out.printf("X''(t) = %f" ,X);
                    }
                    if (formula == 8) {
                        System.out.println("Формула: T = 2*pi*кореь(m/k)");
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        System.out.println("Введите m: ");
                        double m = in.nextDouble();
                        System.out.println("Введите k: ");
                        double k = in.nextDouble();
                        double T = 2*pi*Math.sqrt(m/k);
                        System.out.printf("T = %f" , T);
                    }
                    if (formula == 9) {
                        System.out.println("Формула: T = 2*pi*корень(l/g)");
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        System.out.println("Введите l: ");
                        double l = in.nextDouble();
                        System.out.println("Введите g: ");
                        double g = in.nextDouble();
                        double T = 2*pi*Math.sqrt(l/g);
                        System.out.printf("T = %f" , T);
                    }
                    if (formula == 10) {
                        System.out.println("Формула: T = 2*pi*корень(l/(g+a(лифт))");
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        System.out.println("Введите g: ");
                        double g = in.nextDouble();
                        System.out.println("Введите a(лифт): ");
                        double a = in.nextDouble();
                        System.out.println("Введите l: ");
                        double l = in.nextDouble();
                        double T = 2*pi*Math.sqrt(l/(g+a));
                        System.out.printf("T = %f" ,T );
                    }
                    if (formula == 11) {
                        System.out.println("Формула: T = 2*pi*корень(l/(g-a(лифт))");
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        System.out.println("Введите g: ");
                        double g = in.nextDouble();
                        System.out.println("Введите a(лифт): ");
                        double a = in.nextDouble();
                        System.out.println("Введите l: ");
                        double l = in.nextDouble();
                        double T = 2*pi*Math.sqrt(l/(g-a));
                        System.out.printf("T = %f" ,T);
                    }
                    if (formula == 12) {
                        System.out.println("Формула: T = 2*pi*корень(L*C)");
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        System.out.println("Введите L: ");
                        double L = in.nextDouble();
                        System.out.println("Введите C: ");
                        double C = in.nextDouble();
                        double T = 2*pi*Math.sqrt(L*C);
                        System.out.printf("T = %f" , T);
                    }
                    if (formula == 13) {
                        System.out.println("Формула: X(r,t) = a*cos(w*t-(2*pi/лямбда)*r+Fi0");
                        System.out.println("Введите a: ");
                        double a = in.nextDouble();
                        System.out.println("Введите w: ");
                        double w = in.nextDouble();
                        System.out.println("Введите t: ");
                        double t = in.nextDouble();
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        System.out.println("Введите лямбда: ");
                        double L = in.nextDouble();
                        System.out.println("Введите r: ");
                        double r = in.nextDouble();
                        System.out.println("Введите Fi0: ");
                        double Fi0 = in.nextDouble();
                        double X = a*Math.cos(w*t-(2*pi/L)*r+Fi0) ;
                        System.out.printf("X(r,t) = %f" , X);
                    }
                    if (formula == 14) {
                        System.out.println("Формула: лямбда = V(волны)*T");
                        System.out.println("Введите V(волны): ");
                        double V = in.nextDouble();
                        System.out.println("Введите T: ");
                        double T = in.nextDouble();
                        double L = V*T ;
                        System.out.printf("лямбда = %f" , L);
                    }
                    } // 14
            if (zapros == 10) { System.out.println("Вы выбрали Раздел: Оптика");
                    System.out.println("""
                        Выберите формулу: \s
                        1 - Закон отражения
                        2 - Абсолютный показатель преломления
                        3 - Угол полного внутреннего отражения
                        4 - Угол полного внутреннего отражения, если лучь входил в воздух или вакуум из среды споказателем преломления n
                        5 - Произведение показателя преломления среды на синус угла между лучем и нормалью
                        6 - Оптическая сила линзы, сфера - выпуклая
                        7 - Оптическая сила линзы, сфера - вогнутая
                        8 - Формула соберающей тонкой линзы
                        9 - Формула рассеивающей тонкой линзы
                        10 - Линейное увеличение
                        11 - Интерференция
                        12 - Условия максимума
                        13 - Условия минимума
                        14 - Период решетки
                        Памятка:
                        c - скорость света. c = 10^8*3
                        \s""");
                    int formula = in.nextInt();
                    if (formula == 1) {
                        System.out.println("Формула: alfa = betta");
                    }
                    if (formula == 2) {
                        System.out.println("Формула: n(среды) = c/V(света в среде)");
                        System.out.println("Введите V(10^8): ");
                        double V = in.nextDouble();
                        double n = 3/V ;
                        System.out.printf("n = %f" , n);

                    }
                    if (formula == 3) {
                        System.out.println("Формула: sin(a0) = n2/n1");
                        System.out.println("Введите n2: ");
                        double n2 = in.nextDouble();
                        System.out.println("Введите n1: ");
                        double n1 = in.nextDouble();
                        double a = n2/n1 ;
                        System.out.printf("sin(a0) = %f" , a);

                    }
                    if (formula == 4) {
                        System.out.println("Формула: sin(a0) = 1/n");
                        System.out.println("Введите n: ");
                        double n = in.nextDouble();
                        double a = 1/n ;
                        System.out.printf("sin(a0) = %f" , a);

                    }
                    if (formula == 5) {
                        System.out.println("Формула: n1*sin(a1) = n2*sin(a2) = n(n)*sin(a(n))");
                    }
                    if (formula == 6) {
                        System.out.println("Формула: D = (n(линзы)/n(среды)-1)*(1/R1+1/R2)");
                        System.out.println("Введите n(линзы): ");
                        double n = in.nextDouble();
                        System.out.println("Введите n(среды): ");
                        double n1 = in.nextDouble();
                        System.out.println("Введите R1: ");
                        double R1 = in.nextDouble();
                        System.out.println("Введите R2: ");
                        double R2 = in.nextDouble();
                        double D = (n/n1-1)*(1/R1+1/R2)  ;
                        System.out.printf("D = %f" , D);

                    }
                    if (formula == 7) {
                        System.out.println("Формула: D = (n(линзы)/n(среды)-1)*(1/-R1+1/-R2)");
                        System.out.println("Введите n(линзы): ");
                        double n = in.nextDouble();
                        System.out.println("Введите n(среды): ");
                        double n1 = in.nextDouble();
                        System.out.println("Введите R1: ");
                        double R1 = in.nextDouble()*(-1);
                        System.out.println("Введите R2: ");
                        double R2 = in.nextDouble()*(-1);
                        double D = (n/n1-1)*(1/R1+1/R2)  ;
                        System.out.printf("D = %f" , D);
                    }
                    if (formula == 8) {
                        System.out.println("Формула: 1/|d|+1/|f| = 1/|F|");
                        System.out.println("Введите F: ");
                        double F = Math.abs(in.nextDouble());
                        double f = 1/F ;
                        System.out.printf("1/|d|+1/|f| = %f" , f);

                    }
                    if (formula == 9) {
                        System.out.println("Формула: 1/-|d|+1/-|f| = 1/-|F|");
                        System.out.println("Введите F: ");
                        double F = Math.abs(in.nextDouble())*(-1);
                        double f = 1/F ;
                        System.out.printf("1/-|d|+1/-|f| = %f" , f);
                    }
                    if (formula == 10) {
                        System.out.println("Формула: Г = H/h");
                        System.out.println("Введите H: ");
                        double H = in.nextDouble();
                        System.out.println("Введите h: ");
                        double h = in.nextDouble();
                        double G = H/h;
                        System.out.printf("Г = %f" , G);

                    }
                    if (formula == 11) {
                        System.out.println("Формула: Fi2-Fi1 = 2*pi/лямбда(вак)*dОпт");
                        System.out.println("Введите pi: ");
                        double pi = in.nextDouble();
                        System.out.println("Введите лямбда(вак): ");
                        double L = in.nextDouble();
                        System.out.println("Введите d(Опт): ");
                        double d = in.nextDouble();
                        double F = 2*pi/L*d ;
                        System.out.printf("Fi2-Fi1 = %f" , F);

                    }
                    if (formula == 12) {
                        System.out.println("Формула: dOпт = m*лямбда(вак)");
                        System.out.println("Введите m: ");
                        double m = in.nextDouble();
                        System.out.println("Введите лямбда(вак): ");
                        double L = in.nextDouble();
                        double d = m*L ;
                        System.out.printf("dOпт = %f" , d);

                    }
                    if (formula == 13) {
                    System.out.println("Формула: dOпт = лямбда(вак)/2*(2m-1)");
                        System.out.println("Введите лямбда(вак): ");
                        double L = in.nextDouble();
                        System.out.println("Введите m: ");
                        double m = in.nextDouble();
                        double d = L/2*(2*m-1);
                        System.out.printf("dOпт = %f" , d);

                    }
                    if (formula == 14) {
                    System.out.println("Формула: d*sin(a(k)) = k*лямбда");
                        System.out.println("Введите k: ");
                        double k = in.nextDouble();
                        System.out.println("Введите лямбда: ");
                        double L = in.nextDouble();
                        double d = k*L ;
                        System.out.printf("d*sin(a(k)) = %f" , d);

                    }
                    } // 14
            System.out.print(" Вы хотите выйти? [1] - Да, [2] - Нет \n");
            cycle = in.nextInt();
            // Итог: 193/200
        }  while (cycle == 2) ;
    }
}
/*  System.out.println("Формула:  ");
                    System.out.println("Введите : ");
                    double  = in.nextDouble();
                    System.out.println("Введите : ");
                    double  = in.nextDouble();
                    System.out.println("Введите : ");
                    double  = in.nextDouble();
                    System.out.println("Введите : ");
                    double  = in.nextDouble();
                    System.out.println("Введите : ");
                    double  = ;
                    double  =  ;
                    System.out.printf(" = %f" , );




                    System.out.println("Введите кол-во F на q: ");
                    double ma;
                    int F = in.nextInt();
                    double[] arr = new double[F];
                    for (int i = 0; i < F; i++) {
                        System.out.printf("Введите F на q(Q%d) \n", i);
                        arr[i] = in.nextDouble();
                    }
                    ma = DoubleStream.of(arr).sum();
                    System.out.printf("F на q = %f", ma);
 */