package LW3.Q5;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Borrowableitems> borrowableitemslist;

    public Library(){
        borrowableitemslist= new ArrayList<>();
    }

    public void addLibraryItem(Borrowableitems item){
        borrowableitemslist.add(item);

    }

    public void checkoutitem(String title){
        for(Borrowableitems item:borrowableitemslist){
            if(item instanceof Book){
                Book book =(Book)item;
                if(book.getTitle().equalsIgnoreCase(title)&&book.isAvailable()){
                    book.setAvailable(false);
                    System.out.println("Book-"+title+"- has check out..");
                    return;
                }
            }
        }
        System.out.println("Book-"+title+"-Not found");
    }


    public void listAvailableitems(){
        System.out.println("Available items: ");


    }
}
