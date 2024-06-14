package id.my.hendisantika.grpcserver.rest;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-gRPC
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/24
 * Time: 09:29
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
public class Book {
    private String ISBN;

    private String author;
    private String title;
    private int page;
    private List<String> keyword;
    private BookType bookType;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public enum BookType {COMIC_BOOK}
}
