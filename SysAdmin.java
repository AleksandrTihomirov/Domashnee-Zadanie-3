public class SysAdmin extends Worker {
    private String profession;

    public SysAdmin(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public void goToWork() {
        System.out.println("работает в компании Рога и Копыта по графику 5/2, занимается администрированием" +
                " локальной компьютерной сети компании, осуществляет настройку рабочих мест и правильную работу" +
                " всех компонентов сети");
    }

    public void goToVacation() {
        int days = 28;
        System.out.println("уходит в отпуск сроком на " + days + " календарных дней");
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String sysAdmin) {
        profession = sysAdmin;
    }
}