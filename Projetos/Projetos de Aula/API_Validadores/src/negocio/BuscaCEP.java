package negocio;
 
 import java.io.IOException;
 import java.net.SocketTimeoutException;
 
 
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BuscaCEP {
	
	public String getEndereco(String cep) throws IOException{
		
		try {
			
			Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/" + cep)
					.timeout(2000)
					.get();
			
			Elements urlPesquisa = doc.select("span[itemprop=streetAddress]");
			
			for(Element urlEndereco : urlPesquisa){
				
				return urlEndereco.text();
				
			}
			
        } catch (SocketTimeoutException e) {

        } catch (HttpStatusException w) {

        }
		
		return cep;
	}
	
	public String getBairro(String cep) throws IOException {

        //***************************************************
        try{

        Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/"+cep)
                  .timeout(120000)
                  .get();
        
        Elements urlPesquisa = doc.select("td:gt(1)");
        for (Element urlBairro : urlPesquisa) {
                return urlBairro.text();
        }

        } catch (SocketTimeoutException e) {

        } catch (HttpStatusException w) {

        }
        return cep;
    }

	
        public String getCidade(String cep) throws IOException {

        //***************************************************
        try{

        Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/"+cep)
                  .timeout(120000)
                  .get();
        
        Elements urlPesquisa = doc.select("span[itemprop=addressLocality]");
        for (Element urlCidade : urlPesquisa) {
                return urlCidade.text();
        }

        } catch (SocketTimeoutException e) {

        } catch (HttpStatusException w) {

        }
        return cep;
    }

    public String getUF(String cep) throws IOException {

        //***************************************************
        try{

        Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/"+cep)
                  .timeout(120000)
                  .get();
        
        Elements urlPesquisa = doc.select("span[itemprop=addressRegion]");
        for (Element urlUF : urlPesquisa) {
                return urlUF.text();
        }

        } catch (SocketTimeoutException e) {

        } catch (HttpStatusException w) {

        }
        return cep;
    }
}