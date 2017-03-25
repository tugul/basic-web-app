package tutorial.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tutorial.entities.BlogEntry;

/**
 * Created by tugul on 24/03/17.
 */
@Controller
public class BlogEntryController {
    @RequestMapping("/test")
    public ResponseEntity<Object> test(){
        BlogEntry entry = new BlogEntry();
        entry.setTitle("Test Blog Entry");
        return new ResponseEntity<Object>(entry, HttpStatus.OK);
    }
}
