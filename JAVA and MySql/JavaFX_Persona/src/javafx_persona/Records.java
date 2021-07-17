package javafx_persona;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Records {

    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty address;
    private final StringProperty age;

    public Records() {
        id = new SimpleStringProperty(this, "id");
        name = new SimpleStringProperty(this, "name");
        address = new SimpleStringProperty(this, "address");
        age = new SimpleStringProperty(this, "age");
    }

    public StringProperty idProperty() {
        return id;
    }

    public String getId() {
        return id.get();
    }

    public void setId(String newId) {
        id.set(newId);
    }
    
    

    public StringProperty nameProperty() {
        return name;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String newName) {
        name.set(newName);
    }

    
    
    public StringProperty addressProperty() {
        return address;
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(String newAddress) {
        address.set(newAddress);
    }
    
    

    public StringProperty ageProperty() {
        return age;
    }

    public String getAge() {
        return age.get();
    }

    public void setAge(String newAge) {
        age.set(newAge);
    }

    @Override
    public String toString() {
        return String.format("%s[id = %s, name = %s, age = %s]", getId(), getName(), getAddress(), getAge());
    }

    
    
    
    
}
