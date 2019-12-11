package ApacheCamel.ApacheCamel;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopyCamel {

	public static void main(String[] args) {
		
		//creating an intance for camel context
		CamelContext context = new DefaultCamelContext();
		
		//creating an instance for router
		FileCopyRouter router = new FileCopyRouter();
		
		try
		{
			//adding router to context
			context.addRoutes(router);
			
			//starting the camel context
			context.start();
			
			//Producer Template
			ProducerTemplate producerTemplate = context.createProducerTemplate();
			producerTemplate.sendBody("direct:start","This is send by producer");
			
			
			//Consumer Template
			ConsumerTemplate consumerTemplate = context.createConsumerTemplate();
			String message = consumerTemplate.receiveBody("seda:end",String.class);
			
			System.out.println(message);
			//stoping the camel context
			context.stop();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
