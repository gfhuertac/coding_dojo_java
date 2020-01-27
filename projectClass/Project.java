/**
 * Project
 */
public class Project {

    private String name;
    private String description;
    private double initialCost;

    public Project() {
        this(null, null);
    }

    public Project(String name) {
        this(name, null);
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the initialCost
     */
    public double getInitialCost() {
        return initialCost;
    }

    /**
     * @param initialCost the initialCost to set
     */
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return String.format("%s ($%.2f): %s", name, initialCost, description);
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (!(obj instanceof Project)))
            return false;
        Project another = (Project)obj;
        if (name == null && another.getName() == null)
            return true;
        else if (name == null && another.getName() != null)
            return false;
        return name.equals(another.name);
    }

    @Override
    public int hashCode() {
        if (name == null)
            return -1;
        return name.hashCode();
    }
}