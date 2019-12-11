package ApacheCamel.ApacheCamel;

import org.apache.camel.builder.RouteBuilder;

public class FileCopyRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		//from("file:d:\\Softwares\\WORKSPACE_JEE7_WEB\\cookie\\src\\cookie\\servletContext.java?noop=true")
		//.to("file:d:\\Softwares\\log\\file.txt");
		
		from("direct:start").to("seda:end");
		System.out.println("File is saved");
	}
	

}
