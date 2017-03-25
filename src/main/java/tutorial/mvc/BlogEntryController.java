package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tutorial.entities.BlogEntry;

/**
 * Created by tugul on 24/03/17.
 */
@Controller
public class BlogEntryController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody BlogEntry test(){
        BlogEntry entry = new BlogEntry();
        entry.setTitle("Test Blog Entry");
        return entry;
    }

    @RequestMapping(value="/test", method = RequestMethod.POST)
    public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry){
        return entry;
    }

//    @RequestMapping("/test")
//    public ResponseEntity<Object> test(){
//        BlogEntry entry = new BlogEntry();
//        entry.setTitle("Test Blog Entry");
//        return new ResponseEntity<Object>(entry, HttpStatus.OK);
//    }
}
