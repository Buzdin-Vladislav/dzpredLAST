package oop6;

import java.util.ArrayList;

public class Adressbook {
    ArrayList<Phonebook> pb=new ArrayList();
    
    public void Adressbook(){
        pb.add(new Phonebook("Иванов Иван Иванович","+79547894565","спб"));        
        pb.add(new Phonebook("Иванов Иван Иванович2","+79507541234","спб2"));        
    }

    public void showAddressBook(ArrayList<Phonebook> phnbook){
        for(Phonebook i:phnbook){
                    System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
                }
    }
}
