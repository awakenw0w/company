public class company {

    //поля класса
    private String name; // название компании
    private int workers; // количество рабочих
    private double salary; // общий фонд зарплаты

    // инициализируем поля
    public company(String name, int workers, double salary) {
        this.name = name;
        this.workers = workers;
        this.salary = salary;
        // ????? делал по примеру из учебника, а зачем это делать не совсем понял

    }
    @Override //данный метод переопределяет метод суперкласса.
    // Это помогает избежать ошибок, связанных с неправильным названием метода
    public String toString() {
        return "Название: " + name + ". Работников: " + workers + ". Зарплата: " + salary;
    }
}
