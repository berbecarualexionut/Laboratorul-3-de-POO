/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.server.config;
import java.io.*;
import java.lang.Exception.*;
import static java.lang.Integer.parseInt;
import java.util.Properties;
import static seriac.poo.server.config.ServerConfig.*;
import seriac.poo.server.exceptions.*;
/**
 *
 * @author student
 */
public class Main {
     
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try{
        ServerConfig server = new ServerConfig();
        System.out.println(server.getTcpPort());
        System.out.println(server.getMaxClients());}
        
        catch (IOException | MissingKeyException | UnknownKeyException | InvalidFormatException e) {
            e.printStackTrace();
        }
        
    }
}