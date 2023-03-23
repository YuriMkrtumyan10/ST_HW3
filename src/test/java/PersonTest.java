import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//Used TDD technique from the scratch, but the process was taking long, so then I switch to the traditional
// first-class then test method ))


public class PersonTest {

    @Test
    public void testConstructor() {
        Person person = new Person("Yuri Mkrtumyan1", 21);
        assertTrue(person.getName().equals("Yuri Mkrtumyan1"));
        assertTrue(person.getAge() == 21);
    }

    @Test
    public void testCanHaveDriverLicense() {
        Person teenager = new Person("Yuri Mkrtumyan2", 18);
        assertTrue(teenager.canHaveDriverLicense());

        Person adult = new Person("Yuri Mkrtumyan2", 11);
        assertFalse(adult.canHaveDriverLicense());
    }

    @Test
    public void testGetAgeCategory() {
        Person child = new Person("Yuri Mkrtumyan3", 5);
        assertTrue(child.getStatus().equals("Child"));

        Person teen = new Person("Yuri Mkrtumyan10", 19);
        assertTrue(teen.getStatus().equals("Teenager"));

        Person adult = new Person("Yuri Mkrtumyan4", 28);
        assertTrue(adult.getStatus().equals("Adult"));

        Person senior = new Person("Yuri Mkrtumyan5", 100);
        assertTrue(senior.getStatus().equals("Senior"));
    }

    @Test
    public void testCanVote() {
        Person canVote = new Person("Yuri Mkrtumyan6", 18);
        assertTrue(canVote.canVote());

        Person cannotVote = new Person("Yuri Mkrtumyan7", 17);
        assertFalse(cannotVote.canVote());
    }


    @Test
    public void testIsRetired() {
        Person retired = new Person("Yuri Mkrtumyan8", 65);
        assertTrue(retired.isRetired());

        Person nonRetired = new Person("Yuri Mkrtumyan9", 45);
        assertFalse(nonRetired.isRetired());
    }

    @Test
    public void testIsMarried() {
        Person married = new Person("Mr. Yuri Mkrtumyan", 40);
        assertTrue(married.isMarried());

        Person single = new Person("Yuri Mkrtumyan", 40);
        assertFalse(single.isMarried());
    }
}
