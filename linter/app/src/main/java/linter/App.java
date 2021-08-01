/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package linter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {
    public String getGreeting() {
        return "Hello from lab03!";
    }

    public static void main(String[] args)
    {
        System.out.println(new App().getGreeting());
        System.out.println(javaScriptLinter("resources/gates.js"));
        //javaScriptLinter("resources/oneErr.js");
    }

    public static HashSet<String> javaScriptLinter(String stP){

        //lab03 part 2
        Path path = Paths.get(stP); //Hana's way

        ArrayList<String> linesErr = new ArrayList<String>();
        ArrayList<String> linesAll = new ArrayList<String>();
        HashMap<String, String> linesNumLine = new HashMap<String, String>();

        HashSet<String> errorsArr = new HashSet<String>();

        try{
            BufferedReader reader= Files.newBufferedReader(path);
            String line = reader.readLine();
            linesAll.add(line);
            while(line != null) {
                line = reader.readLine();
                linesAll.add(line);
            }
            int l =1;
            for (String s : linesAll) {
                String lineNum = "Line "+l ;
                linesNumLine.put(lineNum,s);
                l++;
            }

            for (Map.Entry<String,String> entry : linesNumLine.entrySet()) {
               String  xs = String.valueOf(entry.getValue());
                   if (!(xs.length()==0)) {
                       if (!(String.valueOf(xs.charAt(xs.length() - 1)).matches("\\{"))) {
                           if (!(String.valueOf(xs.charAt(xs.length() - 1)).matches("\\}"))) {
                               if (!(String.valueOf(xs.charAt(xs.length() - 1)).matches(";"))) {
                                   if (!(xs.contains("if"))) {
                                       if (!(xs.contains("else"))) {
                                           if (!(String.valueOf(xs.charAt(0)).matches("/"))) {
                                               String x = String.valueOf(entry.getKey()) + ": Missing semicolon.";
                                               if(xs != "null"){
                                                   errorsArr.add(x);
                                                   System.out.println(entry.getKey()+ xs);
                                               }

                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }


        }catch (IOException e){
            e.printStackTrace();
        } //finally {
        //reader.close();
        //}
        return errorsArr;
    }

}
