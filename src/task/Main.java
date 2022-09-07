package task;



public class Main {


    public static void main(String[] args) {
        Author author = new Author("Александр","Пушкин");
        Book one = new Book("Евгений Онегин",author,1833);
        System.out.println(one);
    }
}
