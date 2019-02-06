import addressbook.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;

import java.util.List;

public class BuddyInfoTest {
    private BuddyInfo buddyinfo;

    @Test
    public void constructorTest() {
       buddyinfo = new BuddyInfo("Adnan","601-love place");
       assert(buddyinfo.getName().equals("Adnan"));
       assert(buddyinfo.getAddress().equals("601-love place"));
    }

    @Test
    public void toStringTest(){
        buddyinfo = new BuddyInfo("Adnan","601-love place");
        assert(buddyinfo.toString().equals(
                "addressbook.BuddyInfo{id=" + buddyinfo.getId()  +
                        ", name='" + buddyinfo.getName() + '\'' +
                        ", address='" + buddyinfo.getAddress() + '\'' +
                        '}'
        ));
    }

//    @Test
//    public void jpaTest(){
//        BuddyInfo buddy1 = new BuddyInfo("Adnan Hajar", "1380 Prince of wales");
//        BuddyInfo buddy2 = new BuddyInfo("Jad", "highway to heaven");
//
//        // Connecting to the database through EntityManagerFactory
//        // connection details loaded from persistence.xml
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
//
//        EntityManager em = emf.createEntityManager();
//
//        // Creating a new transaction
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        // Persisting the product entity objects
//        em.persist(buddy1);
//        em.persist(buddy2);
//
//        tx.commit();
//
//        // Querying the contents of the database using JPQL query
//        Query q = em.createQuery("SELECT b FROM BuddyInfo b");
//
//        @SuppressWarnings("unchecked")
//        List<BuddyInfo> results = q.getResultList();
//
//        System.out.println("List of products\n----------------");
//
//        for (BuddyInfo b : results) {
//
//            System.out.println(b.getName() + " (id=" + b.getId() + " address=" + b.getAddress() + ")");
//        }
//
//        // Closing connection
//        em.close();
//
//        emf.close();
//
//    }


}