import java.util.ArrayList;
import java.util.List;

/**
 * Portfolio
 */
public class Portfolio {

    private List<Project> projects;

    public Portfolio() {
        projects = new ArrayList<>();
    }

    /**
     * @return the projects
     */
    public List<Project> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    /**
     * @param project the project to add
     */
    public void addProject(Project project) {
        if (!projects.contains(project))
            projects.add(project);
    }

    public double getPortfolioCost() {
        double sum = 0.0;
        for (Project project : projects) {
            sum += project.getInitialCost();
        }
        return sum;
    }

    public void showPortfolio() {
        for (Project project : projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.println(String.format("Total cost: $%.2f", getPortfolioCost()));
    }
}