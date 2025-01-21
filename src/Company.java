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
    }
        public String getName() {
            return name;
        }
        @Override //данный метод переопределяет метод суперкласса.
        // Это помогает избежать ошибок, связанных с неправильным названием метода
        public String toString() {
            return "Название: " + name + ". Работников: " + workers + ". Зарплата: " + salary;
        }

}
