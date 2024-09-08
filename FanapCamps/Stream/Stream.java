package FanapCamps.Stream;

import java.io.*;

public class Stream {
    public static void main(String[] args) throws IOException {
      try {
          employee employee = new employee("SadeHamber", "nan", 52, 454778);



          FileOutputStream output = new FileOutputStream("D:\\JavaCamp\\exception1.txt");
          ObjectOutputStream outputStream = new ObjectOutputStream(output);
          outputStream.writeObject(outputStream);

          output.close();
          outputStream.close();
      } catch (Exception e){
          System.out.println("e");
      }



        try {
            FileInputStream input = new FileInputStream("D:\\JavaCamp\\exception1.txt");
            //FileReader input = new FileReader("C:\\Users\\admin\\Downloads\\JavaCamp\\NimaGhaferi\\eli.txt");
            int i = 0;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);

            }
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        //   String i = input.toString();
        //System.out.println(i);
        // input.close();
/*
        FileOutputStream output = new FileOutputStream("Downloads\\outputStream.txt");
        output.write(99);
        output.flush();
        String o = output.toString();
        output.close();
    }



        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\admin\\Downloads\\JavaCamp\\NimaGhaferi\\eli.txt");
            String s = "Welcome to javaCamps.";
            byte b[] = s.getBytes();//converting string into byte array
            output.write(b);
            output.close();
            //System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

 */
    }
}