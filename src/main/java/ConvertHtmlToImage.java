import com.google.common.io.Files;
import gui.ava.html.image.generator.HtmlImageGenerator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ConvertHtmlToImage {

    public static void main(String[] args) {
        HtmlImageGenerator hig = new HtmlImageGenerator();
        hig.loadHtml(getHtmlForSingleBirthday());
        hig.saveAsImage(new File("test.png"));

    }

    private static String getHtmlForSingleBirthday() {

        String html = "<!doctype html>\n" +
                "<head>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            background-position: center center;\n" +
                "            background-image: url('EmployeeBirthday.png');\n" +
                "            background-size: 100% 100%;\n" +
                "            border: 1px solid red;\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "        }\n" +
                "        .center {\n" +
                "            display: block;\n" +
                "            margin-left: auto;\n" +
                "            margin-right: auto;\n" +
                "            border-radius:50% 50% 50% 50%;\n" +
                "            width:300px;\n" +
                "            height:300px;\n" +
                "            border: 5px solid #fff;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body lang=PT-BR style='tab-interval:35.4pt'>\n" +
                "<h1>Happy Birthday Dear </h1>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<img    class=\"center\"\n" +
                "        src=\"D:\\ideaProjects\\ConvertHtmlToImage\\src\\main\\resources\\xyz.jpg\">\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<p>we all wish you a wonderful day</p>\n" +
                "</body>\n" +
                "\n" +
                "</html>";

        return html;
    }
}
