public class Professions {
    private Worker[] professions;

    public Professions(Worker[] professions) {
        this.professions = professions;
    }

    public void viewProfessions() {

        for (int a = 0; a < professions.length; a++) {
            System.out.println("**************");
            Worker profession = professions[a];
            System.out.println(profession.getName() + profession.getLastName() + profession.getPatronymic() + profession.getProfession());
            profession.goToWork();
            profession.goToVacation();
            System.out.println("**************");
        }
    }

    public Worker[] getWorker() {
        return professions;
    }

    public void setWorker(Worker[] professions) {
        this.professions = professions;
    }
}