package milka.milka.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates reply based on random selection from the initial list of replies
 *
 * @author Anna Khasanova
 */
public class DefaultReplyGenerator implements ReplyGenerator {
    
    private List<String> answers = new ArrayList<String>();
    
    public DefaultReplyGenerator() {
        answers.add("Of course!");
        answers.add("Hmm... you can try....");
        answers.add("I would not advise it, but it's for you to decide.");
        answers.add("You can, but veeeery carefully");
        answers.add("Forget!");
        answers.add("Your question has been sent to the FBI. Wait please.");
    }
    
    @Override
    public String generate() {
        Random random = new Random();
        int selected = random.nextInt(answers.size());
        return answers.get(selected);
    }
}
