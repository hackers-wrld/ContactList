import java.util.Scanner;

public class Contact {
    private String person_name;
    private String person_phone_number;

    public Contact() {

    }

    public Contact(String person_name, String person_phone_number) {
        this.person_name = person_name;
        this.person_phone_number = person_phone_number;
    }

    @Override
    public String toString() {
       
        String display = "Person: " + getPerson_name() + " Person_phone_number: " + getPerson_phone_number();
        return display.toString();
    }

    public static Contact[] addContacts(Contact[] lstContacts) { 
        Contact[] list;
        String name, number;
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++ ) {
            System.out.println("Enter the name of a contact (X to quit)");
            name = myScanner.nextLine();
            name = name.toLowerCase();
            if (name.equals("X")) {
                i = 15;
            } else {
                System.out.println("Enter the number of a contact");
                number = myScanner.nextLine();
                number = number.replaceAll("\\s", "");

                lstContacts[i] = new Contact(name, number);
            }
            
        }
        myScanner.close();
        list = lstContacts;
        return list;
    }

    private String getPerson_name() {
        return this.person_name;
     }

    

    private String getPerson_phone_number() {
        return this.person_phone_number;
    }
    public void  setPersonName(String name) {
        this.person_name = name;
    }

    public Contact[] findAContact(Contact[] lstContacts) {
        
        String name;
        Boolean check = false;
        int position = -1;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the name of a contact");
        name = myScanner.nextLine();
        name = name.toLowerCase();
        for (int i  = 0; i < 15; i++){
            if (lstContacts[i].getPerson_name().equals(name)) {
                check = true;
                position =i;
            }
        }
        if (check == true) {
            System.out.println("Do you want to change the cell phone number");
        String change ;
        change = myScanner.nextLine().toLowerCase();
        if (change.equals("yes")) {
            lstContacts[position].setPersonName(name);
        }
        }
        

        myScanner.close();
        return lstContacts;

    }

}