public class Geometry extends Mathematics {

    private String[] subject = {"Angles","Figures"};

    @Override
    public String[] getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public void showAdditionalKnowledges() {


        for (String str : subject) {

            System.out.println("Acquired additional knowledges are: " + str + " ");
        }


    }
}
