package id.my.hendisantika.grpcserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-gRPC
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/24
 * Time: 09:37
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
public class BooksRestController {

    private final HttpMessageConverters httpMessageConverters;
}
