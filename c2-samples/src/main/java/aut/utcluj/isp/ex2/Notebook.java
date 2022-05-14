package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Notebook extends Equipment{
    private String osVersion;
    Equipment eq;

    public Notebook(String name, String serialNumber, String osVersion) {
        super(name, serialNumber);
        this.osVersion = osVersion;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String start() {
        return "Notebook " + super.getName() + " started";
    }
}
