package radiant.webapp.model;


import java.util.LinkedList;
import java.util.List;

public class Resume implements Comparable<Resume>{

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

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        if (!uuid.equals(resume.uuid)) return false;
        if (!fullName.equals(resume.fullName)) return false;
        if (!location.equals(resume.location)) return false;
        if (!homePage.equals(resume.homePage)) return false;
        if (!contacts.equals(resume.contacts)) return false;
        return sections.equals(resume.sections);
    }

    @Override
    public int hashCode() {
        int result = uuid.hashCode();
        result = 31 * result + fullName.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + homePage.hashCode();
        result = 31 * result + contacts.hashCode();
        result = 31 * result + sections.hashCode();
        return result;
    }

    @Override
    public int compareTo(Resume o) {
        return fullName.compareTo(o.fullName);
    }
}
