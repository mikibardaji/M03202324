package exercici1;

import java.io.Serializable;




public class Module implements Serializable {
    private String Short_name;
    private String name;
    private String type;
    private int hours;
    
    public Module(String id, String name, String type, int hours) {
        this.Short_name = id;
        this.name = name;
        this.type = type;
        this.hours = hours;
    }

    public Module(String id) {
        this.Short_name = id;
    }
    
    public Module(Module other) {
        this.Short_name = other.Short_name;
        this.name = other.name;
        this.hours = other.hours;

    }   

    public String getShort() {
        return Short_name;
    }

    public void setShort(String id) {
        this.Short_name = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int gethours() {
        return hours;
    }

    public void sethours(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Module)) {
            return false;
        }
        final Module other = (Module) obj;
        return this.Short_name == other.Short_name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact=> ");
        sb.append("id=").append(Short_name);
        sb.append(", name=").append(name);
        sb.append(", hours=").append(hours);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
    
}
