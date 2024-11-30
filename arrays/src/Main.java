import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println();

//  1) Найдите и выведите количество положительных и отрицательных чисел в массиве.
        {
            int[] arr = new int[]{1, -2, 3, 4, -5};
            int polojitelnoe = 0;
            int otricatelnoe = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    polojitelnoe++;
                }
                if (arr[i] < 0) {
                    otricatelnoe++;
                }
            }
            System.out.println("Количество положительных: " + polojitelnoe);
            System.out.println("Количество отрицательных: " + otricatelnoe);
            System.out.println();
        }
//  2) Подсчет нулей: Создайте массив из 20 чисел, заполните его случайными числами, и подсчитайте, сколько в нем нулей.
        {
            int[] arr = new int[20];
            int count = 0;
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(51);
                if (arr[i] == 0) {
                    count++;
                }
            }
            System.out.println("Нулей: " + count);
        }
//  3) Поиск элементов, равных индексу: Найдите все элементы массива, значения которых равны их индексам.
        System.out.print("Поиск элементов, равных индексу: ");
        {
            int[] arr = new int[]{9, 1, 10, 3, 8, 4, 6, 7};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == i) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
//  4) Удаление элементов: Создайте массив из 15 чисел, замените все отрицательные числа на нули.
        System.out.print("Удаление элементов: ");
        {
            int[] arr = {1, 2, -3, 4, 5, 6, 7, 8, -9, 10, 11, 12, -13, 14, 15};
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    arr[i] = count;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  5) Дублирование массива: Создайте массив из 15 чисел,а потом каждый элемент удвойти.
        System.out.print("Дублирование массива: ");
        {
            int[] arr = new int[]{18, 20, 3, 14, 55, 6, 7, 48, 90, 10, 11, 12, 103, 14, 25};
            int dublir = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
//  6) Подсчет элементов, больших предыдущих: Определите количество элементов массива, которые больше предыдущего элемента.
        {
            int[] arr = new int[]{1, 20, 300, 4, 50, 6, 7, 800, 9, 10};
            int bolse = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    bolse++;
                }
            }
            System.out.println("Количество элементов, которые больше предыдущего: " + bolse);
        }
//  7) Произведение элементов: Найдите произведение всех элементов массива, кроме нулевых.
        System.out.print("Произведение элементов: ");
        {
            int[] arr = {1, 2, 0, 4, 5, 6, 7, 8, 0, 10};
            int proiz = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    proiz = proiz * arr[i];
                }
            }
            System.out.print(proiz + " ");
            System.out.println();
            System.out.println();
        }
//  8) Сравнение крайних элементов: Определите, больше ли сумма первых пяти элементов массива, чем сумма последних пяти.
        {
            int[] arr = {100, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//            if (arr.length < 10);
            int sum = 0;
            int sum2 = 0;
            for (int i = 0; i < 5; i++) {
//                sum += arr[i];
                sum = sum + arr[i];
            }
            for (int j = arr.length - 5; j < arr.length; j++) {
//                sum2 += arr[i];
                sum2 = sum2 + arr[j];
            }
            if (sum > sum2) {
                System.out.println("Сумма первых пяти элементов больше суммы последних пяти.");
            } else if (sum < sum2) {
                System.out.println("Сумма первых пяти элементов меньше суммы последних пяти.");
            } else {
                System.out.println("Суммы первых пяти и последних пяти элементов равны.");
            }
            System.out.println("Сумма первых пяти элементов: " + sum);
            System.out.println("Сумма последних пяти элементов: " + sum2);
            System.out.println();
        }
//  9) Поиск двух наименьших элементов: Найдите два наименьших элемента в массиве из 10 чисел.
        {
            int[] arr = {14,25,13,-4,51,6,70,108,38,124};
            int min1 = arr[0];
            int min2 = arr[1];
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] < min1) {
                    min2 = min1;
                    min1 = arr[i];
                } else if (arr[i] < min2) {
                    min2 = arr[i];
                }
            }
            if (min1 == min2) {
                System.out.println("Недостаточно уникальных элементов");
            } else {
                System.out.println("Первый наименьший элемент: " + min1);
                System.out.println("Второй наименьший элемент: " + min2);
            }
            System.out.println();
        }
//  10) Проверка на упорядоченность: Определите, отсортирован ли массив по возрастанию.
        System.out.print("Отсортирован ли массив по возрастанию? ");
        {
            int[] arr = {1, 5, 3, 47, 976, 86, 7, 8, 91, 10};
            boolean sorting = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    sorting = false;
                    break;
                }
            }
            if (sorting) {
                System.out.println("Массив отсортирован по возрастанию");
            } else {
                System.out.println("Массив не отсортирован");
            }
        }
//  11) Проверка на упорядоченность: Определите, отсортирован ли массив по убыванию.
        System.out.print("Отсортирован ли массив по убыванию? ");
        {
            int[] arr = {10,9,8,7,6,5,4,3,2,1};
            boolean sorting = true;
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    sorting = false;
                    break;
                }
            }
            if (sorting) {
                System.out.println("Массив отсортирован по убыванию");
            } else {
                System.out.println("Массив не отсортирован");
            }
            System.out.println();
        }
//  12) Частота элементов: Подсчитайте, сколько раз каждое число встречается в массиве.
        {
            int[] arr = {5, 3, 1, 4, 2, 1, 5, 4, 2, 1};
            for (int i = 0; i < arr.length; i++) {
                boolean kolichistvo = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        kolichistvo = true;
                        break;
                    }
                }
                if (kolichistvo) {
                    continue;
                }
                int count = 1;
                for (int d = i + 1; d < arr.length; d++) {
                    if (arr[i] == arr[d]) {
                        count++;
                    }
                }
                System.out.println("Число " + arr[i] + " встречается " + count + " раз(а)");
            }
            System.out.println();
        }
//  13) Инвертирование знаков: Замените все положительные числа в массиве на отрицательные, и наоборот.
        System.out.print("Инвертирование знаков: ");
        {
            int[] arr = {1, -2, 0, 4, -5, 6, 7, 8, 0, -10};
            for (int i = 0; i < arr.length; i++) {
                arr[i] = -arr[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  14) Замена элементов на чётные индексы: Замените все элементы на чётных индексах на их квадрат.
        System.out.print("Замена элементов на чётные индексы: ");
        {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] = arr[i] * arr[i];
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  15) Сумма элементов на чётных индексах: Найдите сумму элементов, расположенных на чётных индексах массива.
        {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int cet = 1;
            for (int i = 0; i < cet; i++) {
                arr[i] = i;
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0)
                    sum += arr[i];
            }
            System.out.print("Сумма элементов на чётных индексах: " + sum);
            System.out.println();
        }
//  16) Замена минимального элемента на 100: Замените минимальный элемент из массива.
        System.out.print("Замена минимального элемента на 100: ");
        {
            int[] arr = {5, 7, 8, 3, 1, 2, 9, 4};
            int chislo = 100;
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    arr[i] = chislo;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  17) Обратный порядок массива: Распечатайте массив наоборот
        System.out.print("Обратный порядок массива: ");
        {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  18) Замена элементов на индекс: Замените все элементы массива на их индекс.
        System.out.print("Замена элементов на индекс: ");
        {
            int[] arr = {10, 12, 31, 46, 15, 6, 78, 8, 91, 10};
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  19) Сумма положительных элементов: Найдите сумму всех положительных элементов массива.
        {
            int[] arr = {1, -2, 3, 4, -5, 6, 7, 8, -9, 10};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    sum = sum + arr[i];
                }
            }
            System.out.print("Сумма положительных элементов: " + sum);
            System.out.println();
        }
//  20) Поиск последнего отрицательного элемента: Найдите последний отрицательный элемент в массиве и замените его на 0.
        System.out.print("Поиск последнего отрицательного элемента: ");
        {
            int[] arr = {15,97,-85,7,-25,5,44,3,-65,1};
            int last = 0;
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] < 0) {
                    arr[i] = last;
                    break;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  21) Удвоение элементов на нечётных индексах: Умножьте все элементы на нечётных индексах на 2.
        System.out.print("Удвоение элементов на нечётных индексах: ");
        {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arr[i] = arr[i] * 2;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  22) Замена максимального элемента на минимальный: Найдите максимальный элемент массива и замените его на минимальный.
        {
            int[] arr = {5, 1, 8, 3, 7, 2, 9, 4};
            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    arr[i] = min;
                    break;
                }
            }
            System.out.print("Замена максимального элемента на минимальный: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  23) Замена элементов, делящихся на 2 и 3: Замените в массива все элементы, которые делятся на 2 и на 3 на число 100.
        System.out.print("Замена элементов, делящихся на 2 и 3: ");
        {
            int[] arr = {1, 6, 12, 15, 24, 30, 7, 38, 45, 81};
            int delitsa = 100;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
//                if (arr[i] % 2 == 0 || arr[i] % 3 == 0) {
                    arr[i] = delitsa;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//  24) Количество элементов, больших среднего арифметического: Подсчитайте количество элементов, которые больше среднего арифметического массива.
        {
            int[] arr = {14, 21, 46, 78, 34, 67, 19, 8, 36, 101};
            int sum = 0;
            int sum2 = arr.length;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                sum2 = sum / arr.length;
            }
            int x = 0;
            for (int d = 0; d < arr.length; d++) {
                if (arr[d] > sum2) {
                    x++;
                }
            }
            System.out.println("Количество элементов, больше среднего арифметического: " + x);
        }
//  25) Нахождение индекса максимального элемента: Найдите индекс максимального элемента в массиве.
        {
            int[] arr = {15, 40, 19, 89, 31};
            int max = arr[0];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (max < element) {
                    max = element;
                    index = i;
                }
            }
            System.out.print("Индекс максимального элемента: " + index);
            System.out.println();
        }
    }
}