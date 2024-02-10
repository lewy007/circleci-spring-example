package pl.lewandowski.circlecispringexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CircleciSpringExampleApplicationTests {


    @Autowired
    private VideoCourseRepository videoCourseRepository;

    @Test
    public void checkNumberOfElements() {
        VideoCourse videoCourse = new VideoCourse();
        videoCourseRepository.save(videoCourse);
        Assertions.assertEquals(1, videoCourseRepository.findAll().size());
    }

}
