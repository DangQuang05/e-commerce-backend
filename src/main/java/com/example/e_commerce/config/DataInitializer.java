package com.example.e_commerce.config;

import com.example.e_commerce.entity.Book;
import com.example.e_commerce.entity.Genre;
import com.example.e_commerce.repository.BookRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initData(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {
                Genre fantasy = new Genre("Giả tưởng");
                Genre scifi = new Genre("Khoa học viễn tưởng");
                Genre mystery = new Genre("Huyền bí");
                Genre romance = new Genre("Lãng mạn");
                Genre historicalFiction = new Genre("Tiểu thuyết lịch sử");
                Genre horror = new Genre("Kinh dị");
                Genre literaryFiction = new Genre("Văn học nghệ thuật");
                Genre youngAdult = new Genre("Thanh thiếu niên");
                List<Book> books = new ArrayList<>();
                books.add(new Book(
                    "Dế Mèn Phiêu Lưu Ký", 
                    "Tác phẩm văn học kinh điển dành cho thiếu nhi của nhà văn Tô Hoài, kể về cuộc phiêu lưu tự do và đầy bài học nhân văn của chú Dế Mèn dũng cảm.", 
                    "http://localhost:8080/images/3f4fe988-4175-4204-ace9-8d561a733f7c.jpg", 
                    75000.0, 
                    120, 
                    Set.of(fantasy, youngAdult, literaryFiction)
                ));

                books.add(new Book(
                    "Mắt Biếc", 
                    "Chuyện tình đơn phương da diết và đượm buồn của Ngạn dành cho Hà Lan, cô bạn từ thời thơ ấu sở hữu đôi mắt biếc vạn người mê.", 
                    "http://localhost:8080/images/ab958a60-ba75-4137-80fe-331d73f629ec.jpg", 
                    110000.0, 
                    85, 
                    Set.of(romance, youngAdult, literaryFiction)
                ));

                books.add(new Book(
                    "Số Đỏ", 
                    "Kiệt tác trào phúng nổi tiếng của Vũ Trọng Phụng kể về cuộc đời ngẫu nhiên vươn lên tầng lớp thượng lưu của Xuân Tóc Đỏ.", 
                    "http://localhost:8080/images/3709fcae-a473-4872-a21a-7c71626b124c.jpg", 
                    95000.0, 
                    60, 
                    Set.of(literaryFiction, historicalFiction)
                ));

                books.add(new Book(
                    "Tôi Thấy Hoa Vàng Trên Cỏ Xanh", 
                    "Nhật ký tuổi thơ ngọt ngào và cay đắng của Thiều tại một làng quê nghèo miền Trung, đan xen những rung động đầu đời chân thành.", 
                    "http://localhost:8080/images/5dbb3475-ca2c-4886-92d9-4637acef7d59.jpg", 
                    125000.0, 
                    150, 
                    Set.of(youngAdult, literaryFiction)
                ));

                books.add(new Book(
                    "Tắt Đèn", 
                    "Bức tranh chân thực và u tối về cuộc sống khốn cùng của nông dân Việt Nam dưới thời kỳ sưu thuế phong kiến khắt nghiệt.", 
                    "http://localhost:8080/images/276095b2-6eb6-49cc-85d7-7e00129bf246.jpg", 
                    68000.0, 
                    40, 
                    Set.of(literaryFiction, historicalFiction)
                ));

                books.add(new Book(
                    "Chúa Tể Những Chiếc Nhẫn - Đoàn Hộ Nhẫn", 
                    "Hành trình đầy hiểm nguy của Frodo Baggins cùng những người bạn trong sứ mệnh tiêu hủy Chiếc Nhẫn Quyền Năng cứu vớt Trung Địa.", 
                    "http://localhost:8080/images/2395f298-b51c-4b2c-8d4f-72447782ff68.jpg", 
                    210000.0, 
                    90, 
                    Set.of(fantasy, youngAdult)
                ));

                books.add(new Book(
                    "Hai Vạn Dặm Dưới Đáy Biển", 
                    "Cuộc phiêu lưu khoa học viễn tưởng tuyệt vời cùng Thuyền trưởng Nemo trên con tàu ngầm Nautilus khám phá những bí ẩn đại dương.", 
                    "http://localhost:8080/images/de0f3429-99dc-4af6-a67d-ffc4f6d904ab.jpg", 
                    135000.0, 
                    70, 
                    Set.of(scifi, fantasy)
                ));

                books.add(new Book(
                    "Mật Mã Da Vinci", 
                    "Hành trình phá án nghẹt thở của biểu tượng học Robert Langdon đi tìm sự thật ẩn giấu đằng sau các kiệt tác nghệ thuật thời Phục Hưng.", 
                    "http://localhost:8080/images/4134fe84-aa26-4e2a-8021-8e2565ca1b8e.jpg", 
                    175000.0, 
                    110, 
                    Set.of(mystery, historicalFiction)
                ));

                books.add(new Book(
                    "Án Mạng Trên Chuyến Tàu Tốc Hành Phương Đông", 
                    "Thám tử lừng danh Hercule Poirot đương đầu với vụ án mạng ly kỳ diễn ra trên chuyến tàu bị kẹt giữa bão tuyết.", 
                    "http://localhost:8080/images/0312fa36-e48f-48d4-9e0d-cc06d342dc65.jpg", 
                    105000.0, 
                    65, 
                    Set.of(mystery)
                ));

                books.add(new Book(
                    "Rừng Na Uy", 
                    "Cuộc sống, tình yêu và nỗi cô đơn vô tận của những thanh niên trẻ tuổi ở Tokyo thập niên 1960 qua góc nhìn của Toru Watanabe.", 
                    "http://localhost:8080/images/2101067e-2edb-45b5-8dae-4ec6a719875b.jpg", 
        140000.0, 
                    100, 
                    Set.of(romance, literaryFiction)
                ));

                books.add(new Book(
                    "Frankenstein", 
                    "Câu chuyện kinh điển về tham vọng sáng tạo sự sống của nhà khoa học Victor Frankenstein và hậu quả kinh hoàng mà ông phải gánh chịu.", 
                    "http://localhost:8080/images/537bd62d-186a-480e-820d-ff845c167e7e.jpg", 
                    98000.0, 
                    45, 
                    Set.of(horror, scifi)
                ));

                books.add(new Book(
                    "Tiếng Gọi Của Cthulhu", 
                    "Tập truyện kinh dị viễn tưởng mở ra vũ trụ huyền bí về những cổ thần hùng mạnh và bóng tối cổ xưa ngoài trái đất.", 
                    "http://localhost:8080/images/037757fe-64ff-437c-801e-af513a82abc6.jpg", 
                    115000.0, 
                    50, 
                    Set.of(horror, mystery, fantasy)
                ));

                books.add(new Book(
                    "Hoàng Tử Bé", 
                    "Câu chuyện triết lý nhẹ nhàng nhưng sâu sắc về tình bạn, tình yêu và góc nhìn ngây thơ của trẻ nhỏ trước thế giới người lớn.", 
                    "http://localhost:8080/images/eb4b5ed6-d1a5-49dd-8a3a-be85e6fb4fe3.jpg", 
                    80000.0, 
                    200, 
                    Set.of(fantasy, literaryFiction, youngAdult)
                ));

                books.add(new Book(
                    "Chuyện Con Mèo Dạy Hải Âu Bay", 
                    "Hành trình đầy xúc động về tình yêu thương không biên giới giữa chú mèo mập Zorba và chú hải âu nhỏ nhút nhát.", 
                    "http://localhost:8080/images/ce83e767-0484-4ce5-9f79-6bb9dc777d93.jpg", 
                    70000.0, 
                    130, 
                    Set.of(literaryFiction, youngAdult)
                ));

                books.add(new Book(
                    "Đồi Gió Hú", 
                    "Tiểu thuyết tình yêu u uất, cuồng nhiệt và ám ảnh đầy hận thù trên vùng đầm lầy hoang vu của nước Anh thế kỷ 19.", 
                    "http://localhost:8080/images/5b34b004-4e1b-46ff-9b41-1913dabceaae.jpg", 
                    130000.0, 
                    55, 
                    Set.of(romance, horror, literaryFiction)
                ));

                books.add(new Book(
                    "Người Truyền Ký Ức", 
                    "Jonas sống trong một xã hội hoàn hảo không có chiến tranh nhưng khi nhận nhiệm vụ đặc biệt, cậu phát hiện ra bí mật đen tối đằng sau sự bình yên đó.", 
                    "http://localhost:8080/images/b28c98f0-dff0-4f25-a400-c82b9aeeedd7.jpg", 
                    108000.0, 
                    80, 
                    Set.of(scifi, youngAdult)
                ));

                books.add(new Book(
                    "Tình Yêu Thời Cholera", 
                    "Mối tình dẻo dai kéo dài hơn nửa thế kỷ giữa Florentino Ariza và Fermina Daza kinh qua vô vàn thử thách của thời gian.", 
                    "http://localhost:8080/images/611b8ddb-a966-4a49-821b-dc14206b2357.jpg", 
                    165000.0, 
                    40, 
                    Set.of(romance, historicalFiction)
                ));

                books.add(new Book(
                    "Kẻ Trộm Sách", 
                    "Liesell Meminger tìm thấy sự sống và hy vọng qua những cuốn sách đánh cắp trong bối cảnh u uất của Đức Quốc Xã thời Thế chiến II.", 
                    "http://localhost:8080/images/e2ec303c-9adc-47ab-b669-6ec429fd7e4b.jpg", 
                    150000.0, 
                    75, 
                    Set.of(historicalFiction, youngAdult, literaryFiction)
                ));

                books.add(new Book(
                    "Cuộc Đời Của Pi", 
                    "Hành trình sống sót phi thường trên đại dương lênh đênh của cậu bé Pi cùng một con hổ Bengal dữ tợn sau tai nạn đắm tàu.", 
                    "http://localhost:8080/images/392ba5f3-53d9-4d9f-b031-a0c228d5fa1a.jpg", 
                    145000.0, 
                    95, 
                    Set.of(fantasy, literaryFiction)
                ));

                books.add(new Book(
                    "Những Người Khốn Khổ", 
                    "Chặng đường hoàn lương gian nan của Jean Valjean và bức tranh xã hội Pháp thế kỷ 19 tràn ngập lòng vị tha và tình thương yêu.", 
                    "http://localhost:8080/images/48a9e19e-ebb6-41e2-a8d0-d4c6a0f79f05.jpg", 
                    250000.0, 
                    60, 
                    Set.of(historicalFiction, literaryFiction)
                ));

                books.add(new Book(
                    "Vũ Trụ Trong Vỏ Hạt Dẻ", 
                    "Khám phá các lý thuyết vật lý hiện đại về vũ trụ, lỗ đen và lý thuyết dây qua cách diễn đạt dễ hiểu của Stephen Hawking.", 
                    "http://localhost:8080/images/28450753-5abe-4e04-b10b-90e0b6ca0c70.jpg", 
                    180000.0, 
                    50, 
                    Set.of(scifi, literaryFiction)
                ));

                books.add(new Book(
                    "Tam Quốc Diễn Nghĩa", 
                    "Bộ tiểu thuyết lịch sử hoành tráng tái hiện thời kỳ tranh giành quyền lực nảy lửa giữa ba phe Ngụy - Thục - Ngô.", 
                    "http://localhost:8080/images/b291acc1-ba75-4cdf-80bb-aa671f0643a8.jpg", 
                    320000.0, 
                    35, 
                    Set.of(historicalFiction)
                ));

                books.add(new Book(
                    "Sự Im Lặng Của Bầy Cừu", 
                    "Trò chơi trí tuệ kịch tính giữa thực tập sinh FBI Clarice Starling và bác sĩ tâm thần ăn thịt người khôn ngoan Hannibal Lecter.", 
                    "http://localhost:8080/images/71195fd9-da7f-44d8-9210-d203c9cfad25.jpg", 
                    138000.0, 
                    70, 
                    Set.of(mystery, horror)
                ));

                books.add(new Book(
                    "Thám Tử Lừng Danh Sherlock Holmes", 
                    "Tập hợp các vụ án ly kỳ và tư duy phá án sắc bén độc nhất vô nhị của thám tử thiên tài Sherlock Holmes tại London.", 
                    "http://localhost:8080/images/3642a58a-246c-429a-bb2e-08de48937ec4.jpg", 
                    195000.0, 
                    115, 
                    Set.of(mystery, historicalFiction)
                ));

                books.add(new Book(
                    "Hành Trình Về Phương Đông", 
                    "Chuyến ghi chép huyền bí của đoàn khoa học Anh khám phá triết học, yoga và các chân lý tâm linh sâu sắc tại Ấn Độ.", 
                    "http://localhost:8080/images/039817a8-5f73-45a4-8aa3-27e0666c4de8.jpg", 
                    118000.0, 
                    105, 
                    Set.of(fantasy, literaryFiction)
                ));
                bookRepository.saveAll(books);
            }
        };
    }
}
