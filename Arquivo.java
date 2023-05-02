import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Arquivo {
    public String filePath;
    private File file;
    
    public Arquivo(String filePath) {
        this.filePath = filePath;
        file = new File(filePath);
    }


    public void contentFile() {
        try {
            FileReader fr = new FileReader(this.file);
            BufferedReader br = new BufferedReader(fr);

            StringBuilder content = new StringBuilder();
            String line;

            while((line = br.readLine()) != null) {
                content.append(line);
            }

            br.close();

            System.out.println(content);

        }catch(IOException erro) {
            System.out.println(erro);
        }
    }

    public void writerFile(String newContent) {
        try {
            FileWriter fw = new FileWriter(this.file,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.append(newContent + "\n");
            bw.close();

        }catch(IOException erro) {
            System.out.println(erro);
        }
     }
}