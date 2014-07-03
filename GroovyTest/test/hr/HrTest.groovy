package hr

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*
import javax.persistence.*

class HrTest {

    static EntityManager em;
    
    @BeforeClass
    public static void setUpClass() {
        em = Persistence.createEntityManagerFactory("GroovyTestPU").createEntityManager()
    }

    @Test
    void saveEmployee() {
        em.getTransaction().begin()
        def emp = new Employee()
        emp.name = "Hans"
        em.persist(emp)
        em.getTransaction().commit()
    }
}
