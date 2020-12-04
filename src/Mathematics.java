public class Mathematics extends SubjectLesson {

    private String[] subject = {"Geometry", "Algebra"};

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

        int iqLevel = super.getIqLevel();

        if ((iqLevel > 50) & (iqLevel < 75)) {

            System.out.println("The level " + iqLevel + " is quite enough to get basic knowledges");

        } else if (iqLevel > 75) {

            System.out.println("The level " + iqLevel + " is high enough to get basic knowledges");

        } else {

            System.out.println("The level " + iqLevel + " is bot enough to get basic knowledges");
        }
    }

    public void showKnowledges() {


        for (String str : getSubject()) {

            System.out.println("Acquired knowledges are: " + str + " ");
        }


    }

}
