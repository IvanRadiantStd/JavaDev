package radiant.webapp.model;


import java.util.List;

public class Resume {

    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private List<Contact> contacts;
    private List<Section> sections;

    public Resume(String uuid, String fullName, String location, String homePage, List<Contact> contacts, List<Section> sections) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.location = location;
        this.homePage = homePage;
        this.contacts = contacts;
        this.sections = sections;
    }
}
