public class SubjectLesson {

    private int iqLevel;

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public void acquireBasicKnowledges(){

        int iqLevel = getIqLevel();
        if (iqLevel < 50) {

            System.out.println("The level " + iqLevel + " is not enough to get basic knowledges");
        } else {

            System.out.println("The level " + iqLevel + " is enough to get basic knowledges");
        }
    };
}
