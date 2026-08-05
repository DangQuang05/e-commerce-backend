package com.example.e_commerce.config;

import com.example.e_commerce.entity.Book;
import com.example.e_commerce.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initData(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {
                List<Book> books = new ArrayList<>();
                books.add(new Book("9786042123451", "Dế Mèn Phiêu Lưu Ký", "Hành trình phiêu lưu đầy thú vị và bài học làm người của chú Dế Mèn.", "http://localhost:8080/images/3f4fe988-4175-4204-ace9-8d561a733f7c.jpg", LocalDate.of(1941, 1, 1), 180, 55000.0, 50));
                books.add(new Book("9786042123452", "Tắt Đèn", "Tác phẩm văn học kinh điển phản ánh đời sống cơ cực của nông dân Việt Nam.", "http://localhost:8080/images/276095b2-6eb6-49cc-85d7-7e00129bf246.jpg", LocalDate.of(1939, 5, 15), 210, 68000.0, 35));
                books.add(new Book("9786042123453", "Số Đỏ", "Tiểu thuyết trào phúng xuất sắc về xã hội thượng lưu thời Pháp thuộc.", "http://localhost:8080/images/3709fcae-a473-4872-a21a-7c71626b124c.jpg", LocalDate.of(1936, 11, 20), 250, 85000.0, 40));
                books.add(new Book("9786042123454", "Mắt Biếc", "Câu chuyện tình yêu tuổi học trò tha thiết và đượm buồn của Ngạn và Hà Lan.", "http://localhost:8080/images/ab958a60-ba75-4137-80fe-331d73f629ec.jpg", LocalDate.of(1990, 9, 1), 300, 110000.0, 100));
                books.add(new Book("9786042123455", "Tôi Thấy Hoa Vàng Trên Cỏ Xanh", "Ký ức tuổi thơ êm đềm, ngọt ngào nhưng cũng đầy trăn trở ở một vùng quê.", "http://localhost:8080/images/5dbb3475-ca2c-4886-92d9-4637acef7d59.jpg", LocalDate.of(2010, 12, 10), 378, 125000.0, 85));
                books.add(new Book("9786042123456", "Cho Tôi Xin Một Vé Đi Tuổi Thơ", "Tấm vé đưa người đọc trở về với thế giới hồn nhiên của trẻ thơ.", "http://localhost:8080/images/950a8ef9-d75b-415d-8808-882ab2e7f778.jpg", LocalDate.of(2008, 1, 1), 220, 95000.0, 60));
                books.add(new Book("9786042123457", "Tuổi Trẻ Đáng Giá Bao Nhiêu?", "Cuốn sách định hướng và truyền cảm hứng sống tích cực cho giới trẻ.", "http://localhost:8080/images/f01c3cc1-af64-4bd4-a8e0-04c9ab7185ec.jpg", LocalDate.of(2016, 10, 15), 292, 99000.0, 120));
                books.add(new Book("9786042123458", "Cà Phê Cùng Tony", "Tập hợp những bài viết tư duy, lối sống năng động cho bạn trẻ hiện đại.", "http://localhost:8080/images/940fc22d-8302-434d-b270-31d7b32a914e.jpg", LocalDate.of(2014, 8, 20), 268, 88000.0, 75));
                books.add(new Book("9786042123459", "Đời Thừa", "Sự trăn trở và bi kịch tinh thần của người trí thức nghèo trong xã hội cũ.", "http://localhost:8080/images/caa0b4c3-cd2f-472a-b4b3-9382e5ebab2e.jpg", LocalDate.of(1943, 4, 10), 150, 45000.0, 30));
                books.add(new Book("9786042123460", "Chí Phèo", "Bi kịch tha hóa và khát vọng làm người lương thiện của nhân vật Chí Phèo.", "http://localhost:8080/images/25c499a1-7fe8-414b-b504-0de6b7322622.jpg", LocalDate.of(1941, 2, 1), 160, 50000.0, 45));
                books.add(new Book("9786042123461", "Nỗi Buồn Chiến Tranh", "Góc nhìn sâu sắc, nhân văn về ký ức và những mất mát sau chiến tranh.", "http://localhost:8080/images/18c4ecd4-b8e5-45ae-b060-dc61cb413e1b.jpg", LocalDate.of(1990, 6, 30), 320, 135000.0, 25));
                books.add(new Book("9786042123462", "Cánh Đồng Bất Tận", "Tập truyện ngắn khắc họa thân phận con người trôi dạt vùng sông nước miền Tây.", "http://localhost:8080/images/94f8e0b4-56ff-417e-b86d-c326114c193a.jpg", LocalDate.of(2005, 11, 1), 214, 90000.0, 50));
                books.add(new Book("9786042123463", "Khéo Ăn Khéo Nói Sẽ Có Được Thiên Hạ", "Nghệ thuật giao tiếp và ứng xử giúp bạn thành công trong cuộc sống.", "http://localhost:8080/images/0e4ffccf-1edf-4670-8ded-15df57840f62.jpg", LocalDate.of(2018, 3, 25), 400, 140000.0, 90));
                books.add(new Book("9786042123464", "Búp Sen Xanh", "Tiểu thuyết lịch sử khắc họa thời niên thiếu của Chủ tịch Hồ Chí Minh.", "http://localhost:8080/images/6fa87471-1f9c-4a35-a229-a33a1a64b69a.jpg", LocalDate.of(1982, 5, 19), 360, 105000.0, 40));
                books.add(new Book("9786042123465", "Nhật Ký Trong Tù", "Tập thơ chữ Hán thể hiện chí khí kiên cường và tâm hồn thi sĩ.", "http://localhost:8080/images/20112df7-e8b5-407a-9263-db58ec67b513.jpg", LocalDate.of(1943, 9, 10), 180, 70000.0, 35));
                books.add(new Book("9786042123466", "Những Ngày Thơ Ấu", "Hồi ký cay đắng nhưng ấm áp tình mẫu tử của nhà văn Nguyên Hồng.", "http://localhost:8080/images/c1e7f444-1340-4b31-a819-673d93d96dd3.jpg", LocalDate.of(1938, 8, 12), 140, 48000.0, 20));
                books.add(new Book("9786042123467", "Đất Rừng Phương Nam", "Cuộc phưu lưu hoang dã và trù phú của chú bé An ở vùng đất Nam Bộ.", "http://localhost:8080/images/111c818c-f437-45b5-a4d7-58a10ee3f845.jpg", LocalDate.of(1957, 4, 30), 280, 98000.0, 65));
                books.add(new Book("9786042123468", "Lặng Lẽ Sa Pa", "Vẻ đẹp thầm lặng của những con người hăng say cống hiến cho đất nước.", "http://localhost:8080/images/87ee810e-c9a8-4abb-a265-a8c67abdcbe7.jpg", LocalDate.of(1970, 10, 5), 120, 42000.0, 30));
                books.add(new Book("9786042123469", "Vợ Nhặt", "Tình người và niềm hy vọng sống sót qua nạn đói thảm khốc năm 1945.", "http://localhost:8080/images/bb5f66e6-2e82-401a-832e-143df5126b4d.jpg", LocalDate.of(1955, 1, 15), 130, 45000.0, 40));
                books.add(new Book("9786042123470", "Chiếc Thuyền Ngoài Xa", "Cái nhìn đa chiều về cuộc sống và góc khuất của hiện thực gia đình.", "http://localhost:8080/images/a33ba067-5732-4ea6-8a92-29642d5fea79.jpg", LocalDate.of(1983, 7, 22), 160, 52000.0, 35));
                books.add(new Book("9786042123471", "Dấu Chân Người Lính", "Tiểu thuyết chiến tranh tái hiện hình ảnh quả cảm của người lính Cụ Hồ.", "http://localhost:8080/images/2dc09e2f-a7dd-4428-bdf8-4a58e87e91d0.jpg", LocalDate.of(1972, 12, 1), 450, 160000.0, 15));
                books.add(new Book("9786042123472", "Tâm Lý Học Về Tiền", "Bản dịch tiếng Việt giải thích cách tư duy và quyết định tài chính của con người.", "http://localhost:8080/images/5d6b08cd-d666-4bea-b1e6-6b6ba2b5c1e1.jpg", LocalDate.of(2021, 5, 10), 380, 189000.0, 110));
                books.add(new Book("9786042123473", "Đắc Nhân Tâm", "Bản dịch kinh điển về nghệ thuật thu phục lòng người và giao tiếp hiệu quả.", "http://localhost:8080/images/63859c03-65f0-4cf6-8ed3-945a476a2659.jpg", LocalDate.of(2015, 2, 1), 320, 120000.0, 150));
                books.add(new Book("9786042123474", "Nhà Giả Kim", "Bản dịch cuốn sách tâm linh về hành trình theo đuổi ước mơ và định mệnh.", "http://localhost:8080/images/9d3f8644-356f-40d6-9369-ca0c924a59bc.jpg", LocalDate.of(2013, 9, 20), 225, 79000.0, 200));
                books.add(new Book("9786042123475", "Hạt Giống Tâm Hồn", "Những câu chuyện ngắn đầy ý nghĩa tiếp thêm nghị lực cho cuộc sống.", "http://localhost:8080/images/f0173154-ee5c-49a5-9d9b-19d7bc29af7c.jpg", LocalDate.of(2002, 6, 1), 200, 65000.0, 80));
                bookRepository.saveAll(books);
            }
        };
    }
}
