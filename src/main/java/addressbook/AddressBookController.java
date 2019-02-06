package addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressBookController {

    //Autowire your CrudRepo of addressbook
    @Autowired
    AddressBookRepository repository;

    @GetMapping("/addressbook")
    public String addressbookForm(Model model) {
        model.addAttribute("addressbook", new AddressBook());
        return "addressbook";
    }

    @PostMapping("/addressbook")
    public String addressbookSubmit(@ModelAttribute AddressBook addressbook, Model model) {
        System.out.println(addressbook.toString()); //     IT WORKS - I GET DATA I TYPE
        AddressBook new_addressBook = new AddressBook();
        repository.save(new_addressBook);
        model.addAttribute("newaddressbook", new_addressBook);
        return "addressBookResult";
    }

}