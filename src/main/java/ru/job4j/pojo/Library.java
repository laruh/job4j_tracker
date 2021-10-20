package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 464);
        Book spiderMan = new Book("Spider man", 205);
        Book metro = new Book("Metro 2033", 448);
        Book witcher = new Book("The Witcher", 1340);
        Book[] books = {cleanCode, spiderMan, metro, witcher};

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println(System.lineSeparator() + "Replace the first and the last books.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println(System.lineSeparator() + "Show books with name \"Clean code\".");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
