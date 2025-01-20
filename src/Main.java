import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // динамечский массив для хранения экземпляров класса company (name, workers, salary)
        List<Company> companies = new ArrayList<>();

        //добавляем компании в массив
        // в скобках - элементы массива внутри которого есть название компании, колво сотрудников и зарплата
        companies.add(new Company("Энергетический техникум", 200, 1000000.00));
        companies.add(new Company("Политехнический техникум", 100, 300000));
        companies.add(new Company("Технологический техникум", 150, 500000));

        // удаление компании из массива
        Scanner s = new Scanner(System.in);
        System.out.println("Введите название компании, которое нужно удалить: ");
        String deleteName = s.nextLine();
        companies.remove(deleteName);

        // Вывод информации о всех компаниях
        System.out.println("Все компании: ");
        for (Company company : companies) {
            
        }
    }
}