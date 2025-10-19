package LW5.Q1;



public class Main {
    public static void main(String[] args) {
        Library FCTlibrary=new Library();
        Book book1=new Book("Seena Maragatham","Sujatha Thilaka","9789553023975",true);
        Book book2=new Book("Nuramakadya Bauthika Nuladanayakshanamaala","Seynamasasekaka","9789553548721",true);
        Book book3=new Book("Island of a Thousand Mirrors","Nayomi Munaweera","9781616953623",true);


        FCTlibrary.addLibraryItem(book1);
        FCTlibrary.addLibraryItem(book2);
        FCTlibrary.addLibraryItem(book3);

        FCTlibrary.displayLibraryinfo();
        FCTlibrary.listAvailableitems();
        FCTlibrary.checkoutitem("Island of a Thousand Mirrors");


        FCTlibrary.checkoutitem("babe");











    }
}
