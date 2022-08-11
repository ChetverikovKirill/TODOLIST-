import java.util.Objects;

public class Case {
    private String title;
    private String description;
    private Importance importance;
    private boolean status;

    Case(String title, String description, Importance importance, boolean status) {
        this.title = title;
        this.description = description;
        this.importance = importance;
        this.status = false;
    }

    Case() {
    }

    public Case(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Importance getImportance() {
        return this.importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        return this.title + "!" + this.description + "!" + this.importance.getName() + "!" + this.status;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Case aCase = (Case) o;
            return Objects.equals(this.title, aCase.title);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.title});
    }
}
