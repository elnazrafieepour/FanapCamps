public class EBook extends Book {
    private String type;

    public void convertType(String type) {
        this.type = type;
    }

    public EBook(){
        this.type="ePub";
        this.title="eTitle";
    }

    @Override
    public void print() {
        System.out.println("the title of your Book is: " + title + " and the author of Book is: " + author + " and the press of Book is: " + press + " and the page count of Book is: " + pageCount + " and the release Date of Book is: " + releaseDate);
    }
}
