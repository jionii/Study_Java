package lecture.book;

public class Book {

    // author, title, pageCount, coverType
    // 필드
    String author;
    String title;
    String coverType;
    int pageCount;

    // 생성자
    // 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다 (대/소문자까지)
    // 생성자 메소드는 반환형을 작성하지 않는다. (작성하게되면 일반 메소드로 인식한다)

    // 기본생성자 (매개변수가 없는 생성자)
    // -> 매개변수 있는 생성자가 하나라도 있으면 Compiler가 자동으로 기본생성자를 만들어주지 않는다.
    public Book() {
        System.out.println("기본 생성자 호출함 ......");
    }

    // 매개변수를 author랑 title만 받는 생성자

    // 오버로딩
    // -> 같은 이름의 메소드나 생성자를 매개변수의 갯수나 타입에 따라 여러 개 선언하는 것
    public Book(String author, String title) {
        System.out.println("매개변수를 author랑 title만 받는 생성자 호출됨...");
        this.author = author;
        this.title = title;
    }

    // 모든 필드를 매개변수로 받는 생성자
    public Book(String author, String title, String coverType, int pageCount) {
        System.out.println("모든 필드를 매개변수로 받는 생성자 호출됨...");
        this.author = author;
        this.title = title;
        this.coverType = coverType;
        this.pageCount = pageCount;
    }

    // 메소드 (cmd + n)
    public String getTitle() {

        System.out.println(title + "책의 작가는 " + author + "입니다.");
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", coverType='" + coverType + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
