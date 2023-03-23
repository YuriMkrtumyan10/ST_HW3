import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;
    List<String> marriedPrefixes = Arrays.asList("mr.", "mrs.", "ms.");

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean canHaveDriverLicense() {
        return age >= 18;
    }

    public String getStatus() {
        if (age < 13)
            return "Child";
        else if (age < 20)
            return "Teenager";
        else if (age < 60)
            return "Adult";
        else
            return "Senior";
    }

    public boolean canVote() {
        return age >= 18;
    }
    public boolean isRetired() {
        return age >= 60;
    }

    public boolean isMarried() {
        for (String prefix : marriedPrefixes) {
            if (name.toLowerCase().startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}
