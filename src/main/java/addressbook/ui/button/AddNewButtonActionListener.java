package addressbook.ui.button;
import addressbook.BuddyInfo;


import java.awt.event.ActionEvent;

public class AddNewButtonActionListener extends ListTableActionListener {
    public void actionPerformed(ActionEvent e) {
        BuddyInfo buddy = new BuddyInfo("Babak","In the lab");
         list.add ("buddy: " +  buddy);
        table.revalidate();
    }
}