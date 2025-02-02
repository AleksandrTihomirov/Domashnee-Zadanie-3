public class Buhgalter extends Worker {
    private String profession;

    public Buhgalter(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public void goToWork() {
        System.out.println("работает в компании Рога и Копыта по графику 5/2, контролирует ведение хозяйственной" +
                " деятельности компании в части финансовых расчетов с контрагентами, осуществляет своевременную" +
                " сдачу финансовой отчетности");
    }

    public void goToVacation() {
        int days = 40;
        System.out.println("уходит в отпуск сроком на " + days + " календарных дней и имеет возможность взять" +
                " дополнительный отпуск в зависимости от стажа работы");
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String buhgalter) {
        profession = buhgalter;
    }
}