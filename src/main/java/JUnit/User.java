package JUnit;

import com.sun.tools.javac.code.Attribute;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Gender gender;

    public User(Integer id, String name, Integer age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
