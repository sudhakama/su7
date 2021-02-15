package seven.itest;


import java.io.InputStream;
import java.util.Hashtable;
import org.coos.messaging.InteractionHelper;
import org.coos.messaging.plugin.test.DefaultTest;
import org.coos.messaging.Exchange;
import org.coos.messaging.Message;
import org.coos.messaging.plugin.simple.SimpleProducer;
import seven.api.sevenMessageFactory;

public class sevenTest extends DefaultTest {

	public void testsevenEndpoint() {
		
        SimpleProducer producer = (SimpleProducer) getTestPlugins()[0].getEndpoint().createProducer();
        
        Exchange ex;
        System.out.println("testing by sending message to actor");
        ex=sevenMessageFactory.createExampleMethodExchange("Testing the example");
        InteractionHelper helper=new InteractionHelper(producer.getEndpoint());
        helper.send("coos://seven",ex);
        
        assertEquals(true, true);
        
	}

	@Override
	public InputStream loadTestPlugin() {
		return this.getClass().getResourceAsStream("/sePlugin.xml");
	}
    
}
