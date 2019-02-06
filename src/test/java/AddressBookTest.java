import addressbook.AddressBook;
import addressbook.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

public class AddressBookTest {
    private AddressBook addressbook;

    @Test
    public void constructorTest() {
        addressbook = new AddressBook();
        assert (addressbook.getBuddy_list().isEmpty());
    }

    @Test
    public void addBuddyTest(){
        addressbook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Adnan","601-love place");
        addressbook.addbudylist(buddy);
        assert (addressbook.getBuddy_list().contains(buddy));
    }

    @Test
    public void toStringTest(){
        addressbook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Adnan","601-love place");
        addressbook.addbudylist(buddy);
        assert (addressbook.toString().equals("addressbook.addressbook{budy_list=" + addressbook.getBuddy_list() + '}' ));
    }

//    @Test
//    public void jpaTest(){
//        AddressBook addressBook = new AddressBook();
//        AddressBook addressBook2 = new AddressBook();
//
//        BuddyInfo buddy1 = new BuddyInfo("Adnan Hajar", "1380 Prince of wales");
//
//        BuddyInfo buddy2 = new BuddyInfo("Jad", "highway to heaven");
//
//        addressBook.setId(1);
//        addressBook.addbudylist(buddy1);
//        addressBook.addbudylist(buddy2);
//
//        addressBook2.setId(2);
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
//        em.persist(addressBook);
//        em.persist(addressBook2);
//
//        tx.commit();
//
//        // Querying the contents of the database using JPQL query
//        Query q = em.createQuery("SELECT a FROM addressbook a");
//
//        @SuppressWarnings("unchecked")
//        List<AddressBook> results = q.getResultList();
//
//        System.out.println("List of products\n----------------");
//
//        for (AddressBook a : results) {
//
//            System.out.println(" (id=" + a.getId() + " buddyList=" + a.getBuddy_list() + ")");
//        }
//
//        // Closing connection
//        em.close();
//
//        emf.close();
//
//    }

}