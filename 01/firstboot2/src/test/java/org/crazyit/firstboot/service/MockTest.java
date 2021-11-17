//package org.crazyit.firstboot.service;
//
//import org.crazyit.firstboot.dao.BookDao;
//import org.crazyit.firstboot.domain.Book;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.BDDMockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.List;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
//public class MockTest {
//    @Autowired
//    private BookService bookService;
//    @MockBean
//    private BookDao bookDao;
//    @Test
//    public void testGetAllBooks() {
//        BDDMockito.given(this.bookDao.findAll()).willReturn(List.of(new Book("测试1", "李刚", 89.9), new Book("测试2", "yeeku", 99.9)));
//        List<Book> result = bookService.getAllBooks();
//        Assertions.assertEquals(result.get(0).getTitle(), "测试1");
//        Assertions.assertEquals(result.get(0).getAuthor(), "李刚");
//        Assertions.assertEquals(result.get(1).getTitle(), "测试2");
//        Assertions.assertEquals(result.get(1).getAuthor(), "yeeku");
//    }
//}
