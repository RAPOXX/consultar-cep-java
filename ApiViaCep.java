import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ApiViaCep {
    private String urlEndr = "https://viacep.com.br/ws/";
    BufferedReader br;

    public String consultarCep(String cep) {
        try {
            urlEndr += cep + "/json/";

            URL url = new URL(urlEndr);
            
            URLConnection con = url.openConnection();

            InputStreamReader inputStream = new InputStreamReader(con.getInputStream());

            br = new BufferedReader(inputStream);

            StringBuilder content = new StringBuilder();
            String line;

            while((line = br.readLine()) != null) {
                content.append(line);
            }

            return content.toString();

        }catch(MalformedURLException erro) {
            return erro.toString();
        }catch(IOException erro) {
            return erro.toString();
        } 
    }

}   
