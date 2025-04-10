 public class Book {
    private String title;
    private String author;
     public Book() {
         this.title = "unknown";
         this.author = "Anonymous";
     }

    public Book(String title, String author) {
        if (title==null||title.trim().isEmpty()){
            this.title = "unknown";
        }else{
            this.title = title;
        }
        if(author==null|| author.trim().isEmpty()){
            this.author = "Anonymous";
        }else{
            this.author = author;
        }

    };



     public String displayInfo(){
        return "title: " + title + " , author: " + author;
    }

//     public void displayInfo() {
//         System.out.println("Title: " + title);
//     }

}
