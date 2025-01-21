import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // сканер для ввода
        Scanner s = new Scanner(System.in);

        // динамечский массив для хранения экземпляров класса company (name, workers, salary)
        List<company> companies = new ArrayList<>();

        //добавляем компании в массив
        // в скобках - элементы массива внутри которого есть название компании, колво сотрудников и зарплата
        companies.add(new company("Энергетический техникум", 200, 1000000.00));
        companies.add(new company("Политехнический техникум", 100, 300000));
        companies.add(new company("Технологический техникум", 150, 500000));

        // выводим информацию о всех компаниях:
        for(company company : companies) {
            System.out.println(company);
        }
        // удаление компании из массива
        System.out.println("Введите название компании, которое нужно удалить: ");
        String deleteName = s.nextLine(); // пользователь вводит название компании которую хочет удалить
        companies.remove(deleteName); // компания удаляется из динамического массива

        for(company company : companies) {
            System.out.println(company);
        }
    }
}