public class Programmist extends Worker {

    private String profession;

    public Programmist(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public void goToWork() {
        System.out.println("работает в компании Рога и Копыта по графику 2/2 по 12 часов, занимается написанием и " +
                "редактированием рабочих программ");
    }

    public void goToVacation() {
        int days = 30;
        System.out.println("уходит в отпуск сроком на " + days + " календарных дней и имеет возможность взять " +
                "дополнительный отпуск сроком до 10 календарных дней");
    }

    public String getprofession() {
        return profession;
    }

    public void setProgrammist(String programmist) {
        profession = programmist;
    }
}