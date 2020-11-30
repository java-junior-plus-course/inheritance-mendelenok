public class Main {

    public static void main(String[] args) {
	// write your code here

        SubjectLesson subjectLesson = new SubjectLesson();
        subjectLesson.setIqLevel(78);
        subjectLesson.acquireBasicKnowledges();

        Physics physics = new Physics();
        physics.setIqLevel(55);
        physics.acquireBasicKnowledges();
        physics.showKnowledges();

        Mechanics mechanics = new Mechanics();
        mechanics.setIqLevel(45);
        mechanics.acquireBasicKnowledges();
        mechanics.showKnowledges();
        mechanics.showAdditionalKnowledges();

        Mathematics mathematics = new Mathematics();
        mathematics.setIqLevel(55);
        mathematics.acquireBasicKnowledges();
        mathematics.showKnowledges();

        Geometry geometry = new Geometry();
        geometry.setIqLevel(45);
        geometry.acquireBasicKnowledges();
        geometry.showKnowledges();
        geometry.showAdditionalKnowledges();


    }
}
