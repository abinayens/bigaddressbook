package addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BuddyInfoController {

    //Autowire your CrudRepo of addressbook
    @Autowired
    BuddyInfoRepository repository;
    //AddressBookRepository addressbook_repository;


    @GetMapping("/buddyinfo")
    public String buddyinfoForm(Model model) {
        model.addAttribute("buddyinfo", new BuddyInfo());
        return "buddyinfo";
    }

    @PostMapping("/buddyinfo")
    public String buddyinfoSubmit(@ModelAttribute BuddyInfo buddyinfo , Model model) {

        System.out.println(buddyinfo.toString()); //     input received
        BuddyInfo new_buddyinfo = new BuddyInfo(buddyinfo.getName(), buddyinfo.getAddress());
        /* System.out.println(addressbook_repository.findById(buddyinfo.getAddressBookRef())); //
        if (addressbook_repository.findById(buddyinfo.getAddressBookRef())!= null) {
            System.out.println("Found an address Book!");
            AddressBook address_book = addressbook_repository.findById(buddyinfo.getAddressBookRef());
            new_buddyinfo.setAddressBook(address_book);
        }
        */
        repository.save(new_buddyinfo);
        model.addAttribute("newbuddyinfo", new_buddyinfo);
        return "buddyinfoResult";
    }

}