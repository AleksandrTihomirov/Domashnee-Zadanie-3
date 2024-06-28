public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Халявин ", "Дмитрий ", "Валерьевич ", "разнорабочий");
        Programmist programmist = new Programmist("Зеленцов ", "Александр ", "Вячеславович ", "программист");
        Jurist jurist = new Jurist("Тихомиров ", "Александр ", "Сургеевич ", "юрист");
        Buhgalter buhgalter = new Buhgalter("Выкрутасов ", "Пётр ", "Петрович ", "бухгалтер");
        SysAdmin sysAdmin = new SysAdmin("Бесстужев ", "Павел ", "Александрович ", "системный администратор");

        Worker[] professions = {worker, programmist, jurist, buhgalter, sysAdmin};
        Professions profession = new Professions(professions);
        profession.viewProfessions();
    }
}