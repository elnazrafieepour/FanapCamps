package university.entity;

import java.util.List;

public class Faculty {
    private String name;
    private List<Field> fields;

    public Faculty(String name, List<Field> fields) {
        this.name = name;
        this.fields = fields;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
