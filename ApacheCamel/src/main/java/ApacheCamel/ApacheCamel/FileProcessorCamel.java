package ApacheCamel.ApacheCamel;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileProcessorCamel {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		
		try
		{
			context.addRoutes(new RouteBuilder(){

				
				public void configure()throws Exception
				{
					from("file:input_dir?noop=true")
					//.process(new FileProcessor())
					.to("file:output_dir");
				}
				
			});
			while(true)
			{
				context.start();
			}
		}
		catch(Exception e)
		{
			context.stop();
			e.printStackTrace();
		}
	}

}
