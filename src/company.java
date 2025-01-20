public class Company {

    //поля класса
    private String name; // название компании
    private int workers; // количество рабочих
    private double salary; // общий фонд зарплаты

    // инициализируем поля
    public Company(String name, int workers, double salary) {
        this.name = name;
        this.workers = workers;
        this.salary = salary;
        // делал по примеру из учебника, а зачем это делать не совсем понял
    }

    // выводим название компании
    public String getName() {
        System.out.println("Название компании: "+ name);
    }
    // выводим количество сотрудников
    public int getWorkers() {
        System.out.println("Количество сотрудников: " + workers);
    }
    // выводим общий фонд зарплаты
    public double getSalary(){
        System.out.println("Общий фонд зарплаты: " + salary);
    }
    
}