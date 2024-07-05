public class Worker {
    private String name;
    private String lastName;
    private String patronymic;
    private String profession;

    public Worker(String name, String lastName, String patronymic, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.profession = profession;
    }

    public void goToWork() {
        System.out.println("работает в компании Рога и Копыта на своей должности и выполняет свои профессиональные обязанности");
    }

    public void goToVacation() {
        int days = 30;
        System.out.println("уходит в отпуск на " + days + " календарных дней");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}