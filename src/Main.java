import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // динамечский массив для хранения экземпляров класса company (name, workers, salary)
        List<Company> companies = new ArrayList<>();

        //добавляем компании в массив
        companies.add(new Company("Энергетический техникум", 200, 1000000.00));
        companies.add(new Company("Политехнический техникум", 100, 300000));
        companies.add(new Company("Технологический техникум", 150, 500000));

        // удаление компании из массива
        

    }
}