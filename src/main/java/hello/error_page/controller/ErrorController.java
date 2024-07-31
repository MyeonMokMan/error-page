package hello.error_page.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.http.HttpResponse;

@Controller
public class ErrorController {

    @GetMapping("/400-error")
    public String error1(HttpServletResponse response) throws IOException {

        response.sendError(400, "에러 메세지");

        return "view/page";
    }

    /*
    * 4xx 에러 공통 처리
    * */
    @GetMapping("/4xx-error")
    public String error2(HttpServletResponse response) throws IOException {

        response.sendError(401, "에러 메세지");

        return "view/page";
    }
}
