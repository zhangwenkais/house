package aaa.com.Entity;

public class Housing_types {
    private Integer t_id;
    private String t_name;

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    @Override
    public String toString() {
        return "Housing_types{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                '}';
    }
}
