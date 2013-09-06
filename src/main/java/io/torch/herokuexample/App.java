package io.torch.herokuexample;

import io.torch.Server;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
            Server server = new Server(Integer.parseInt(args[0]));
            server.getRouteManager().defineRoute("/hello", Hello.class);
            
            server.run();
    }
}
