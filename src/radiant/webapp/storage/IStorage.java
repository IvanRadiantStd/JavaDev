package radiant.webapp.storage;

import radiant.webapp.WebAppException;
import radiant.webapp.model.Resume;

import java.util.Collection;

public interface IStorage
{
    void clear();
    void save(Resume r) throws WebAppException;
    void update(Resume r);
    Resume load(String uuid);
    void delete(String uuid);
    Collection<Resume> getAllSorted();
    int size();

}
