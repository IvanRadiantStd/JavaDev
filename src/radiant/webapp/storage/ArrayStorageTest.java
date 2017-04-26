package radiant.webapp.storage;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Neostat on 26.04.2017.
 */
@RunWith(Arquillian.class)
public class ArrayStorageTest {
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
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ArrayStorage.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
