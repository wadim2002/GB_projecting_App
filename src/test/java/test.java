import com.example.gb_projecting_app.Book;
import com.example.gb_projecting_app.process_rules.Process_rule_extract_size;
import com.example.gb_projecting_app.process_rules.Processing_rule;

public class test {
    public static void main(String[] args) {
        Book book = new Book("Азбука","Иванов", 1,"Роспечать", "c:file.pdf");
        System.out.println(book.getImage());

        Process_rule_extract_size rule = new Process_rule_extract_size();
        book = (Book) rule.Process();
    }
}
