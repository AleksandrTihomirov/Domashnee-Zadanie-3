public class Professions {
    private Worker[] professions;

    public Professions(Worker[] professions) {
        this.professions = professions;
    }

    public void viewProfessions() {
        Worker profession;
        for (int a = 0; a < professions.length; a++) {
            profession = professions[a];
            System.out.println(profession.getName() + profession.getLastName() + profession.getPatronymic() + profession.getProfession());
            System.out.println(profession.goToWork() + profession.goToVacation());
        }
    }

    public Worker[] getWorker() {
        return professions;
    }

    public void setWorker(Worker[] professions) {
        this.professions = professions;
    }
}