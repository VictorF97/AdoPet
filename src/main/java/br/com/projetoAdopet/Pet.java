package br.com.projetoAdopet;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
//o indentificador de versão de serialização de uma classe.
public class Pet implements Serializable {

	// pega uma instancia da nossa classe que podera ser trafegadas em redes e
	// armazenadas.
	private static final long serialVersionUID = 1L;
	
	//informamos que esse id vai ser uma chave primária
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	//Serve para informar ao usuário que não pode ser vázio e deve conter um valor min e max de caracteres.
	@NotEmpty(message = ("Campo Nome não pode ser vázio."))
	@Length(min = 3, max = 100, message = ("O nome deve ter entre 3 a 100 carácteres"))
	private String nome;
	
	@NotEmpty(message = ("Campo Peso não pode ser vázio"))
	@Length(min = 1, max = 5, message = ("O peso do pet deve ter entre 1 a 5 carácteres"))
	private String peso;
	
	@NotEmpty(message = ("Campo Aniversário não pode ser vázio"))
	@Length(min = 6, max = 8, message = ("O campo aniversário do pet deve ter entre 6 a 8 carácteres"))
	private String aniversario;

	@NotEmpty(message = ("Campo Sexo do pet não pode ser vázio"))
	@Length(min = 4, max = 6, message = ("O campo sexo do pet deve ser preenchido com no mínimo 4 e máximo 6 carácteres"))
	private String sexo;
	
	@NotEmpty(message = ("Campo Raça não pode ser vázio"))
	@Length(min = 3, max = 32, message = ("O campo raça deve ter entre 3 a 32 carácteres"))
	private String raca;
	
	@NotEmpty(message = ("Campo Descrição do pet não pode ser vázio"))
	@Length(min = 5, max = 40, message = ("A descrição do pet deve ter entre 5 a 40 carácteres"))
	private String descricao;
	
	@NotEmpty(message = ("Campo categoria não pode ser vázio"))
	@Length(min = 4, max = 32, message = ("A categoria deve ter entre 4 a 32 carácteres"))
	private String categoria;
	
	@NotEmpty(message = ("Campo adotado não pode ser vázio"))
	@Length(min = 4, max = 32, message = ("O campo adotado deve ter entre 4 a 32 carácteres"))
	private boolean adotado;
	
	@NotEmpty(message = ("Campo adotado por quem não pode ser vázio"))
	@Length(min = 4, max = 32, message = ("O campo adotado por deve ter entre 4 a 32 carácteres"))
	private String adotadoPor;
	
	@NotEmpty(message = ("Campo tags não pode ser vázio"))
	@Length(min = 4, max = 32, message = ("O campo tags deve ter entre 4 a 32 carácteres"))
	private String tags;
	
	@NotEmpty(message = ("Campo Image URL não pode ser vázio"))
	@Length(min = 4, max = 32, message = ("O campo imageUrl deve ter entre 4 a 32 carácteres"))
	private String imageUrl;
	
	@NotEmpty(message = ("Campo Author não pode ser vázio"))
	@Length(min = 4, max = 32, message = ("O campo author deve ter entre 4 a 32 carácteres"))
	@ManyToOne
	  @JoinColumn(nullable = false, name="author_id")
	  private Pet author;


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isAdotado() {
		return adotado;
	}

	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
	}

	public String getAdotadoPor() {
		return adotadoPor;
	}

	public void setAdotadoPor(String adotadoPor) {
		this.adotadoPor = adotadoPor;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Pet getAuthor() {
		return author;
	}

	public void setAuthor(Pet author) {
		this.author = author;
	}
	
	
	

	public Pet(Integer id,
			@NotEmpty(message = "Campo Nome não pode ser vázio.") @Length(min = 3, max = 100, message = "O nome deve ter entre 3 a 100 carácteres") String nome,
			@NotEmpty(message = "Campo Peso não pode ser vázio") @Length(min = 4, max = 15, message = "O nome deve ter entre 4 a 15 carácteres") String peso,
			@NotEmpty(message = "Campo Aniversário não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String aniversario,
			@NotEmpty(message = "Campo Sexo não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String sexo,
			@NotEmpty(message = "Campo Raça não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String raca,
			@NotEmpty(message = "Campo Descrição do animal não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String descricao,
			@NotEmpty(message = "Campo Categoria não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String categoria,
			@NotEmpty(message = "Campo Adotado não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") boolean adotado,
			@NotEmpty(message = "Campo Adotado por quem não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String adotadoPor,
			@NotEmpty(message = "Campo Tags não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String tags,
			@NotEmpty(message = "Campo Image URL não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") String imageUrl,
			@NotEmpty(message = "Campo Author não pode ser vázio") @Length(min = 4, max = 32, message = "A senha deve ter entre 4 a 32carácteres") Pet author) {
		
		super();
		Id = id;
		this.nome = nome;
		this.peso = peso;
		this.aniversario = aniversario;
		this.sexo = sexo;
		this.raca = raca;
		this.descricao = descricao;
		this.categoria = categoria;
		this.adotado = adotado;
		this.adotadoPor = adotadoPor;
		this.tags = tags;
		this.imageUrl = imageUrl;
		this.author = author;
	}

	public Pet(Object id2, String nome2, String peso2, String aniversario2, Object sexo2, Object raca2,
			Object descricao2, Object categoria2, boolean adotado2, Object adotadoPor2, Object tags2, Object imageUrl2,
			Pet u4) {

	}

	
}