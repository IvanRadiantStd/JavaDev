package radiant.webapp.model;


import java.util.LinkedList;
import java.util.List;

public class Resume {

    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private List<Contact> contacts = new LinkedList<Contact>();
    private List<Section> sections = new LinkedList<Section>();;

    public Resume(String uuid, String fullName, String location) {

        this.uuid = uuid;
        this.fullName = fullName;
        this.location = location;

    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getHomePage() {
        return homePage;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Section> getSections() {
        return sections;
    }


    public void addSection(Section section){
        sections.add(section);
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }


}
