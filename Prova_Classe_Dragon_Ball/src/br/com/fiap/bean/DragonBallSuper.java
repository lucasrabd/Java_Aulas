package br.com.fiap.bean;
/**Classe para objetos do tipo DragonBallSuper
 * @author Lucas Bob - RM550519
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DragonBallSuper implements IDBSuper {

	private String nome;
	private int ki;
	private int tecnicas; 
	private int velocidade;
	private int transformacoes;
	
	public DragonBallSuper() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getKi() {
		return ki;
	}

	public void setKi(int ki) {
		this.ki = ki;
	}

	public int getTecnicas() {
		return tecnicas;
	}

	public void setTecnicas(int tecnicas) {
		this.tecnicas = tecnicas;
	}

	public int getValocidade() {
		return velocidade;
	}

	public void setValocidade(int valocidade) {
		this.velocidade = valocidade;
	}

	public int getTransformacoes() {
		return transformacoes;
	}

	public void setTransformacoes(int transformacoes) {
		this.transformacoes = transformacoes;
	}
	
	public DragonBallSuper ler (String path){
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(path + "/" + nome  + ".txt"));
			nome = br.readLine();
			ki = Integer.parseInt(br.readLine());
			tecnicas = Integer.parseInt(br.readLine());
			velocidade = Integer.parseInt(br.readLine());
			transformacoes = Integer.parseInt(br.readLine());
			br.close();
			return this;
		} catch (IOException e) {
			return null;
		}
		/**Método para ler os dados de um personagem de um arquivo texto.
		 * @author Lucas Carabolad Bob RM550519
		 * @param path - recebe o caminho do arquivo como parâmetro.
		 * @return String e Integer - devolve os dados do personagem.
		 */
	}
	public String gravar(String path) {
		try {
			File dir = new File (path);
			if (!dir.exists()) {
				dir.mkdir();
			}
			PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt" );
			pw.println(nome);
			pw.println(ki);
			pw.println(tecnicas);
			pw.println(velocidade);
			pw.println(transformacoes);
			pw.flush();
			pw.close();
			return "Arquivo gravado com sucesso";
		} catch (IOException e) {
			return "Falha ao gravar arquivo: " + e.getMessage() ;
		}
		/** Método para gravar os dados de um personagem em um arquivo texto.
		 * @author Lucas Carabolad Bob.
		 * @param path - recebe o caminho do arquivo como parâmetro.
		 * @return String e Integer - grava os dados do personagem. 
		 */
	}
	
	
}
