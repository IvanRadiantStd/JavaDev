package radiant.webapp.model;


public enum SectionType {
    OBJECTIVE("Позиция"),
    ACHIVEMENT("Достижения"),
    QUALIFICATIONS("Квалификация"),
    EXPIRIENCE("Опыт работы"),
    EDUCATION("Образование");

    private String title;

    public String getTitle(){
        return title;
    }

    SectionType(String title){
        this.title = title;
    }
}
