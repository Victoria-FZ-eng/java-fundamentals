import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello from lab03");


        //lab03 part 2
        Path path = Paths.get("gates.js");
        ArrayList<String> linesArr = new ArrayList<String>();
        ArrayList<String> linesAll = new ArrayList<String>();
        try{
            BufferedReader reader= Files.newBufferedReader(path);
            String line = reader.readLine();
            linesAll.add(line);
            if (line != null){
                if(!(line.isEmpty()) ){
                    if(!(String.valueOf(line.charAt(line.length() - 1)).matches("\\{"))){
                        if(!(String.valueOf(line.charAt(line.length() - 1)).matches("\\}"))){
                            if(!(String.valueOf(line.charAt(line.length() - 1)).matches(";"))){
                                if(!(line.contains("if"))){
                                    if(!(line.contains("else"))){
                                        linesArr.add(line);
                                    }

                                }
                            }
                        }
                    }
                }
            }
            while(line != null){
                line = reader.readLine();
                linesAll.add(line);
                if (line != null){
                    if(!(line.isEmpty()) ){
                        if(!(String.valueOf(line.charAt(line.length() - 1)).matches("\\{"))){
                            if(!(String.valueOf(line.charAt(line.length() - 1)).matches("\\}"))){
                                if(!(String.valueOf(line.charAt(line.length() - 1)).matches(";"))){
                                    if(!(line.contains("if"))){
                                        if(!(line.contains("else"))){
                                            linesArr.add(line);
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

       //System.out.println(linesArr);
       // System.out.println(linesAll);
        HashSet<String> errorsArr = new HashSet<String>();
        for (String i : linesAll){
            int l = linesAll.indexOf(i)+1;
            for (String j : linesArr){
                if (i == j){
                    errorsArr.add("Line "+l+": Missing semicolon.");
                }
            }
        }
        System.out.println(errorsArr);
    }


}