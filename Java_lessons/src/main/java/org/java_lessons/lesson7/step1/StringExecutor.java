package ru.lessons.lesson7.step1;

import java.util.Arrays;

public class StringExecutor {
    public static void main(String[] args) {
        final String str = "Hello World";
        final var str1 =  new String("Hello World");
        final var str2 = " and Java";

        System.out.println(str == str1); // false
        System.out.println(str.equals(str1)); // true

        // Методы строк:
        // 1. Длина length()
        System.out.println(String.format("Длина строки s = %d символов", str.length()));
        System.out.println("---------------------------------------------");
        // 2. Объединение строк (`concat`)
        final var result = str.concat(str2);
        System.out.println(result); // Hello World and Java

        // 3. Вставка подстроки (`substring`)
        final var substring = str.substring(0, 5);
        System.out.println(substring); // Hello

        // 4. Преобразование регистра (`toLowerCase`, `toUpperCase`)
        final String java = "I love Java";
        System.out.println(java.toUpperCase()); // I LOVE JAVA
        System.out.println(java.toLowerCase()); // i love java

        // 5. Поиск подстроки (`indexOf`, `lastIndexOf`)
        System.out.println(str.indexOf("o")); // 4
        System.out.println(str.lastIndexOf("o")); // 7

        // 6. Проверка наличия подстроки (`contains`)
        System.out.println(java.contains("Ja")); //true

        // 7. Замена символов или подстрок (`replace`, `replaceAll`)
        String banan = "banana";
        String replaced = banan.replace('a', '@'); // заменяет все 'a' на '@'
        System.out.println(replaced); // b@nb@na

        // 8. Разделение строки (`split`)
        String s = "apple,orange,banana";
        String[] fruits = s.split(",");
        System.out.println(Arrays.toString(fruits)); // [apple, orange, banana]

        // 9. Преобразование строки в массив символов (`toCharArray`)
        char[] chars = "Java".toCharArray();
        System.out.println(Arrays.toString(chars)); // [J, a, v, a]

        // 10. Преобразование строки в число (`Integer.parseInt`, `Double.parseDouble`)
        String numberStr = "1234";
        int number = Integer.parseInt(numberStr);
        System.out.println(number); // 1234

        // 11. Проверка, является ли строка пустой
        System.out.println(s.isEmpty());  // false
        System.out.println("  ".isBlank()); // true

        // 12. trim() — удаляет пробелы по краям строки
        System.out.println("   java     ".trim()); // java

    }
}
