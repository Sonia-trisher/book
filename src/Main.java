
 class Main {
    public static void main(String[] args) {
        Book book1 = new Book("more-about-java","john Doe");
        System.out.println(book1.displayInfo());
        Book book2 = new Book("   ",null);
        System.out.println(book2.displayInfo());
        Book book3 = new Book();
        System.out.println(book3.displayInfo());



    }
}