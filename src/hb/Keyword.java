package hb;

public class Keyword {

    protected int    id_;
    protected String name_;

    /**
     * Default constructor
     */
    public Keyword() {
        id_          = -1;
        name_        = null;
    }

    /**
     */
    public Keyword( int id, String name) {
        id_          = id;
        name_        = name;
    }

    /**
     * Get the Id value.
     * @return the Id value.
     */
    public int getId() {
        return id_;
    }

    /**
     * Set the Id value.
     * @param newId The new Id value.
     */
    public void setId(int newId) {
        this.id_ = newId;
    }

    /**
     * Get the Name value.
     * @return the Name value.
     */
    public String getName() {
        return name_;
    }

    /**
     * Set the Name value.
     * @param newName The new Name value.
     */
    public void setName(String newName) {
        this.name_ = newName;
    }
}
