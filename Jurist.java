import sun.invoke.empty.Empty;

public class Jurist extends Worker {
    private String profession;

    public Jurist(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public int goToWork() {
        System.out.println("работает в компании Рога и Копыта по графику 24/7, контролирует ведение хозяйственной" +
                " деятельности компании в части заключения договоров и контрактов, контролирует их исполнение," +
                " а также осуществляет претензионно-исковую работу");
        return 0;
    }

    public int goToVacation() {
        int days = 45;
        System.out.println("уходит в отпуск сроком на " + days + " календарных дней и имеет возможность взять" +
                " дополнительный отпуск в зависимости от стажа работы");
        return 0;
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String jurist) {
        profession = jurist;
    }
}