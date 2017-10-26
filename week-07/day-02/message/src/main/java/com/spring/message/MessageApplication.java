import com.spring.message.service.MessageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageApplication implements CommandLineRunner {

	@Autowired
	MessageProcessor messageProcessor;

	public static void main(String[] args) {

	}

	@Override
	public void run(String... args) throws Exception {
		messageProcessor.processMessage("Testmail, adam.sequence@gmail.com");
	}