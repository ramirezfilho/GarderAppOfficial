package dados;

import java.util.Calendar;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "contatoService")
@ApplicationScoped
public class Contato {

	  private Long id;
	  private String nome;
	  private String email;
	  private String endereco;
	  private String telefone;

	  // m�todos get e set para id, nome, email, endere�o e dataNascimento

	  public String getNome() {
	    return this.nome;
	  }
	  public void setNome(String novo) {
	    this.nome = novo;
	  }

	  public String getEmail() {
	    return this.email;
	  }
	  public void setEmail(String novo) {
	    this.email = novo;
	  }

	  public String getEndereco() {
	    return this.endereco;
	  }
	  public void setEndereco(String novo) {
	    this.endereco = novo;
	  }

	  public Long getId() {
	    return this.id;
	  }
	  public void setId(Long novo) {
	    this.id = novo;
	  }

	  public String getTelefone() {
	    return this.telefone;
	  }
	  public void setTelefone(String telefone) {
	    this.telefone = telefone;
	  }

    public void setId(int bunda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	}