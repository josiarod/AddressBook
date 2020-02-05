public class Main {
    public static void main(String[] args){
        Addressbook book = new Addressbook();
        book.setAddress("Georgia ave.");
        book.setCity("Silver Spring");
        book.setName("Josia");
        book.setState("MD");
        book.setZip("14141");
        book.setEmail("josia@gmail.com");
        book.setPhone("(202)354-4565");

        System.out.println(book.getAddress());
        System.out.println(book.getEmail());
        System.out.println(book.getPhone());
        System.out.println(book.getCity());

    }
}
