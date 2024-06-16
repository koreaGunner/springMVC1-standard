package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //@Slf4j로 대체 가능
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        System.out.println("name = " + name);

        //이렇게 쓰면 안됨
        //메서드가 실행되기 전 더하기 연산을 하게됨
        //결과적으로 출력을 하지도 않는데 연산을 하므로 메모리, cpu도 잡아먹게됨
//        log.trace("trace log =" + name);

        //작성한 순서로 레벨이 설정됨
        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info(" info log = {}", name);
        log.warn(" warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}
