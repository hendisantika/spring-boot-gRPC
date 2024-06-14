package id.my.hendisantika.grpcserver.service;

import id.my.hendisantika.grpcserver.util.BookUtil;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

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
@GRpcService
@Slf4j
public class BookGrpcService extends BookServiceGrpc.BookServiceImplBase {

    @Override
    public void createBooks(BookList request, StreamObserver<BookList> responseObserver) {
        log.debug("Request " + request);

        BookList.Builder responseBuilder = BookList.newBuilder();

        BookUtil.assignISBN(request.getBookList()).forEach(responseBuilder::addBook);

        BookList bookListResponse = responseBuilder.build();

        log.debug("Response " + bookListResponse);

        responseObserver.onNext(bookListResponse);
        responseObserver.onCompleted();
    }

}
