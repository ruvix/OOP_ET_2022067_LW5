package LW5.Q1;



import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> borrowableitemslist;

    public Library(){
        borrowableitemslist= new ArrayList<>();
    }

    //method to add new items to the list
    public void addLibraryItem(Book item){
        borrowableitemslist.add(item);

    }
    //method to check out items for the list
    public void checkoutitem(String title){
        for(Book book:borrowableitemslist){
            if(book.getTitle().equals(title)&& book.isAvailable()) {
                //System.out.println("-----------------------------------");
                System.out.println("the book you want is available.");
                System.out.println("checking out: " + book.getTitle());
                book.setAvailable(false);
                System.out.println("-----------------------------------");
            }
            //else {
            //  System.out.println("book not found");


            // }
        }
    }

    public void listAvailableitems(){
        // System.out.println("-----------------------------------");
        System.out.println("Available items: ");
        for(Book book:borrowableitemslist){
            if(book.isAvailable()){
                System.out.println(book.getTitle());

            }
        }
        System.out.println("-----------------------------------");
    }

    //method to display infor about library
    public void displayLibraryinfo(){
        int bookCount=0;
        for(Book book:borrowableitemslist){
            if(book.isAvailable()){
                bookCount++;

            }
        }
        System.out.println("-----------------------------------");
        System.out.println("num of book available: "+bookCount);
        System.out.println("-----------------------------------");

    }











}

