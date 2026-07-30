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
                books.add(new Book("Dế Mèn Phiêu Lưu Ký", "9786042123451", "Hành trình phiêu lưu đầy thú vị và bài học làm người của chú Dế Mèn.", LocalDate.of(1941, 1, 1), 180, 55000.0, 50));
                books.add(new Book("Tắt Đèn", "9786042123452", "Tác phẩm văn học kinh điển phản ánh đời sống cơ cực của nông dân Việt Nam.", LocalDate.of(1939, 5, 15), 210, 68000.0, 35));
                books.add(new Book("Số Đỏ", "9786042123453", "Tiểu thuyết trào phúng xuất sắc về xã hội thượng lưu thời Pháp thuộc.", LocalDate.of(1936, 11, 20), 250, 85000.0, 40));
                books.add(new Book("Mắt Biếc", "9786042123454", "Câu chuyện tình yêu tuổi học trò tha thiết và đượm buồn của Ngạn và Hà Lan.", LocalDate.of(1990, 9, 1), 300, 110000.0, 100));
                books.add(new Book("Tôi Thấy Hoa Vàng Trên Cỏ Xanh", "9786042123455", "Ký ức tuổi thơ êm đềm, ngọt ngào nhưng cũng đầy trăn trở ở một vùng quê.", LocalDate.of(2010, 12, 10), 378, 125000.0, 85));
                books.add(new Book("Cho Tôi Xin Một Vé Đi Tuổi Thơ", "9786042123456", "Tấm vé đưa người đọc trở về với thế giới hồn nhiên của trẻ thơ.", LocalDate.of(2008, 1, 1), 220, 95000.0, 60));
                books.add(new Book("Tuổi Trẻ Đáng Giá Bao Nhiêu?", "9786042123457", "Cuốn sách định hướng và truyền cảm hứng sống tích cực cho giới trẻ.", LocalDate.of(2016, 10, 15), 292, 99000.0, 120));
                books.add(new Book("Cà Phê Cùng Tony", "9786042123458", "Tập hợp những bài viết tư duy, lối sống năng động cho bạn trẻ hiện đại.", LocalDate.of(2014, 8, 20), 268, 88000.0, 75));
                books.add(new Book("Đời Thừa", "9786042123459", "Sự trăn trở và bi kịch tinh thần của người trí thức nghèo trong xã hội cũ.", LocalDate.of(1943, 4, 10), 150, 45000.0, 30));
                books.add(new Book("Chí Phèo", "9786042123460", "Bi kịch tha hóa và khát vọng làm người lương thiện của nhân vật Chí Phèo.", LocalDate.of(1941, 2, 1), 160, 50000.0, 45));
                books.add(new Book("Nỗi Buồn Chiến Tranh", "9786042123461", "Góc nhìn sâu sắc, nhân văn về ký ức và những mất mát sau chiến tranh.", LocalDate.of(1990, 6, 30), 320, 135000.0, 25));
                books.add(new Book("Cánh Đồng Bất Tận", "9786042123462", "Tập truyện ngắn khắc họa thân phận con người trôi dạt vùng sông nước miền Tây.", LocalDate.of(2005, 11, 1), 214, 90000.0, 50));
                books.add(new Book("Khéo Ăn Khéo Nói Sẽ Có Được Thiên Hạ", "9786042123463", "Nghệ thuật giao tiếp và ứng xử giúp bạn thành công trong cuộc sống.", LocalDate.of(2018, 3, 25), 400, 140000.0, 90));
                books.add(new Book("Búp Sen Xanh", "9786042123464", "Tiểu thuyết lịch sử khắc họa thời niên thiếu của Chủ tịch Hồ Chí Minh.", LocalDate.of(1982, 5, 19), 360, 105000.0, 40));
                books.add(new Book("Nhật Ký Trong Tù", "9786042123465", "Tập thơ chữ Hán thể hiện chí khí kiên cường và tâm hồn thi sĩ.", LocalDate.of(1943, 9, 10), 180, 70000.0, 35));
                books.add(new Book("Những Ngày Thơ Ấu", "9786042123466", "Hồi ký cay đắng nhưng ấm áp tình mẫu tử của nhà văn Nguyên Hồng.", LocalDate.of(1938, 8, 12), 140, 48000.0, 20));
                books.add(new Book("Đất Rừng Phương Nam", "9786042123467", "Cuộc phưu lưu hoang dã và trù phú của chú bé An ở vùng đất Nam Bộ.", LocalDate.of(1957, 4, 30), 280, 98000.0, 65));
                books.add(new Book("Lặng Lẽ Sa Pa", "9786042123468", "Vẻ đẹp thầm lặng của những con người hăng say cống hiến cho đất nước.", LocalDate.of(1970, 10, 5), 120, 42000.0, 30));
                books.add(new Book("Vợ Nhặt", "9786042123469", "Tình người và niềm hy vọng sống sót qua nạn đói thảm khốc năm 1945.", LocalDate.of(1955, 1, 15), 130, 45000.0, 40));
                books.add(new Book("Chiếc Thuyền Ngoài Xa", "9786042123470", "Cái nhìn đa chiều về cuộc sống và góc khuất của hiện thực gia đình.", LocalDate.of(1983, 7, 22), 160, 52000.0, 35));
                books.add(new Book("Dấu Chân Người Lính", "9786042123471", "Tiểu thuyết chiến tranh tái hiện hình ảnh quả cảm của người lính Cụ Hồ.", LocalDate.of(1972, 12, 1), 450, 160000.0, 15));
                books.add(new Book("Tâm Lý Học Về Tiền", "9786042123472", "Bản dịch tiếng Việt giải thích cách tư duy và quyết định tài chính của con người.", LocalDate.of(2021, 5, 10), 380, 189000.0, 110));
                books.add(new Book("Đắc Nhân Tâm", "9786042123473", "Bản dịch kinh điển về nghệ thuật thu phục lòng người và giao tiếp hiệu quả.", LocalDate.of(2015, 2, 1), 320, 120000.0, 150));
                books.add(new Book("Nhà Giả Kim", "9786042123474", "Bản dịch cuốn sách tâm linh về hành trình theo đuổi ước mơ và định mệnh.", LocalDate.of(2013, 9, 20), 225, 79000.0, 200));
                books.add(new Book("Hạt Giống Tâm Hồn", "9786042123475", "Những câu chuyện ngắn đầy ý nghĩa tiếp thêm nghị lực cho cuộc sống.", LocalDate.of(2002, 6, 1), 200, 65000.0, 80));
                bookRepository.saveAll(books);
            }
        };
    }
}
