/**
 * ProjectTest
 */
public class ProjectTest {

    public static void main(String[] args) {
        Project project = new Project();
        project.setName("Demo 01");
        project.setDescription("This is my first project!");
        project.setInitialCost(123.45);
        System.out.println(project.elevatorPitch());
        Project project2 = new Project("Demo 02", "OK, we are going up!");
        project2.setInitialCost(234.56);
        Portfolio portfolio = new Portfolio();
        portfolio.addProject(project);
        portfolio.addProject(project);
        portfolio.addProject(project2);
        portfolio.showPortfolio();
    }
}