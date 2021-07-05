package collections;

public class Produto {
	
	private int id;
	private String descricao;
	
	public Produto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id + ", " + descricao;
	}

}
