package A07Builder;

public class HtmlMainBuilder {

    public static void main(String[] args) {
//        if (args.length != 1) {
//            usage();
//            System.exit(0);
//        }

        if (false) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getTextResult();
            System.out.println("l~ result : " + result);
        } else if (true) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getHTMLResult();
            System.out.println("l~ HTML 파일 : " + filename + "이 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }

    }

    public static void usage() {
        System.out.println("Usage: java Main text 텍스트 문서 작성");
        System.out.println("Usage: java Main html HTML 파일로 문서 작성");
    }
}
