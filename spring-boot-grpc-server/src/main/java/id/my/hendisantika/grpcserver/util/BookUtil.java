package id.my.hendisantika.grpcserver.util;

import id.my.hendisantika.grpcserver.rest.Book;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-gRPC
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/24
 * Time: 09:35
 * To change this template use File | Settings | File Templates.
 */
public class BookUtil {
    public static List<Book> assignISBN(List<Book> books) {
        List<Book> result = new LinkedList<>();
        for (Book book : books) {
            Book bookWithISBN = Book.newBuilder(book)
                    .setISBN(generateISBN())
                    .build();

            result.add(bookWithISBN);
        }

        return result;
    }

    public static String generateISBN() {
        return UUID.randomUUID().toString().replaceAll("/", "").substring(0, 12);
    }
}
