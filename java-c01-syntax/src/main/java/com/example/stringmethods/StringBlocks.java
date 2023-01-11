package com.example.stringmethods;

public class StringBlocks {

    public static void main(String[] args) {

        String text1 = "lorem ipsum dolor";

        String text2 = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        System.out.println(text2);



        String text3 = """
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <title>Title</title>
                    </head>
                    <body>
                    </body>
                    </html>
                """;
        System.out.println(text3);

        String text4 = "lorem khfjsdjfg \n" +
                "sdfsdfsdfsdf" +
                "asfasfadsfasfd";
    }
}
