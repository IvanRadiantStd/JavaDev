package radiant.webapp.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import radiant.webapp.WebAppException;
import radiant.webapp.model.Contact;
import radiant.webapp.model.ContactType;
import radiant.webapp.model.Resume;

import java.util.Arrays;

import static org.junit.Assert.*;


public class ArrayStorageTest {

    private Resume R1, R2, R3;

    private ArrayStorage storage = new ArrayStorage();

    @BeforeClass
    public static void beforeClass(){

    }

    @Before
    public void before(){
        storage.clear();

        R1 = new Resume("uuid1", "Полное имя1", "location1");
        R1.addContact(new Contact(ContactType.MAIL, "mail1@ya..ru"));
        R1.addContact(new Contact(ContactType.PHONE, "111111"));

        R2 = new Resume("uuid2", "Полное имя2", "location2");
        R2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        R2.addContact(new Contact(ContactType.PHONE, "222222"));

        R3 = new Resume("uuid3", "Полное имя3", "location3");
        R3.addContact(new Contact(ContactType.SKYPE, "skype3"));
        R3.addContact(new Contact(ContactType.PHONE, "333333"));

        storage.save(R3);
        storage.save(R1);
        storage.save(R2);
    }

    @Test
    public void clear() throws Exception {
        storage.clear();
        assertEquals(0, storage.size());
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void update() throws Exception {
        R2.setFullName("Updated N2");
        storage.update(R2);
        assertEquals(R2, storage.load(R2.getUuid()));
    }

    @Test
    public void load() throws Exception {
        assertEquals(R1, storage.load(R1.getUuid()));
        assertEquals(R2, storage.load(R2.getUuid()));
        assertEquals(R3, storage.load(R3.getUuid()));
    }

    @Test(expected = WebAppException.class)
    public void delete() throws Exception {
        storage.delete(R1.getUuid());

        Assert.assertEquals(2, storage.size());
        Assert.assertEquals(null, storage.load(R1.getUuid()));
    }

    @Test
    public void getAllSorted() throws Exception {
        Resume[] src = new Resume[]{ R1, R2, R3};
        Arrays.sort(src);
        assertArrayEquals(src, storage.getAllSorted().toArray());
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }

}