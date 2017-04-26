package radiant.webapp.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import radiant.webapp.model.Contact;
import radiant.webapp.model.ContactType;
import radiant.webapp.model.Resume;

import static org.junit.Assert.*;


public class ArrayStorageTest {

    private static Resume R1, R2, R3;

    private ArrayStorage storage = new ArrayStorage();

    static {
        R1 = new Resume("uuid1", "Полное имя1", "location1");
        R1.addContact(new Contact(ContactType.MAIL, "mail1@ya..ru"));
        R1.addContact(new Contact(ContactType.PHONE, "111111"));

        R2 = new Resume("uuid2", "Полное имя2", "location2");
        R2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        R2.addContact(new Contact(ContactType.PHONE, "222222"));

        R3 = new Resume("uuid3", "Полное имя3", "location3");
        R3.addContact(new Contact(ContactType.SKYPE, "skype2"));
        R3.addContact(new Contact(ContactType.PHONE, "222222"));

    }

    @BeforeClass
    public static void beforeClass(){

    }

    @Before
    public void before(){
        storage.clear();
        storage.save(R1);
        storage.save(R2);
        storage.save(R3);
    }

    @Test
    public void clear() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void load() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void getAllSorted() throws Exception {
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }

}