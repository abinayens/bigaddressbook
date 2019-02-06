package addressbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @OneToMany(mappedBy = "addressBook")
    private List<BuddyInfo> buddy_list;

    public List<BuddyInfo> getBuddy_list() {
        return buddy_list;
    }

    public void setBuddy_list(List<BuddyInfo> buddy_list) {
        this.buddy_list = buddy_list;
    }


    public AddressBook() {
        this.buddy_list = new ArrayList<BuddyInfo>();
    }


    public void addbudylist(BuddyInfo buddy){
        this.buddy_list.add(buddy);
    }

    @Override
    public String toString() {
        return "addressbook.addressbook{" +
                "budy_list=" + buddy_list +
                '}';
    }
//
//    public static void main (String args[]){
//        addressbook.addressbook addressBook = new addressbook.addressbook();
//        addressbook.BuddyInfo buddy = new addressbook.BuddyInfo("Adnan","401 - walkly DR");
//        addressbook.BuddyInfo buddy_2 = new addressbook.BuddyInfo("Hajar","wally DR");
//        addressBook.addbudylist(buddy);
//        addressBook.addbudylist(buddy_2);
//        System.out.println(addressBook.toString());
//    }
        public static void main(String[] args) {
            Launcher launcher = new Launcher();
            launcher.launch();
        }

}
