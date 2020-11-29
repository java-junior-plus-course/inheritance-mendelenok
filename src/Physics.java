public class Physics extends SubjectLesson {

    private String[] subject = {"Mechanics","Electrodynamics", "Optics","Thermodynamics"};

    {
        new SubjectLesson();
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    @Override
    public void acquireBasicKnowledges() {

        int iqLevel = getIqLevel();

        if ((iqLevel > 50) & (iqLevel < 75)) {

            System.out.println("The level " + iqLevel + " is quite enough to get basic knowledges");

        } else if (iqLevel > 75) {

            System.out.println("The level " + iqLevel + " is high enough to get basic knowledges");

        } else {

            System.out.println("The level " + iqLevel + " is bot enough to get basic knowledges");
        }
    }

    public void showKnowledges() {

        for (String str : subject) {

            System.out.println("Acquired knowledges are: " + str + " ");
        }


    }

}
