package file_;

import java.io.*;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        /*
        1️⃣ Создание и запись в файл
        📌 Задача: Напиши программу, которая создаёт файл output.txt, записывает в него строку "Привет, файл!",
         а затем закрывает файл.
        🔹 Подсказка: Используй FileWriter.


        String nameFile = "resources\\file_\\output.txt";
        File file = new File(nameFile);

        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("Привет, файл!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /*
        2️⃣ Чтение из файла и вывод в консоль
        📌 Задача: Создай файл input.txt вручную и запиши туда несколько строк текста.
         Напиши программу, которая прочитает этот файл и выведет его содержимое в консоль.

        🔹 Подсказка: Используй FileReader или BufferedReader.

        String nameFile = "input.txt";
        File file = new File(nameFile);
        String date;

        if (!file.exists()) {
            System.out.println("Файл не найден: " + file.getAbsolutePath());
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                date = fileScanner.nextLine();
                System.out.println(date);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        /*
        3️⃣ Подсчёт количества строк в файле
        📌 Задача: Напиши программу, которая подсчитывает, сколько строк в файле data.txt.

        🔹 Подсказка: Читай файл построчно с помощью BufferedReader.readLine() и считай количество строк.
         */

    }
}
