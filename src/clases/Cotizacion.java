package clases;

public class Cotizacion {
	
	private int num;
	private Vigencia vigencia;
	private Cliente cliente;
	private CondVenta condVenta;
	private Referencia ref;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Vigencia getVigencia() {
		return vigencia;
	}
	public void setVigencia(Vigencia vigencia) {
		this.vigencia = vigencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public CondVenta getCondVenta() {
		return condVenta;
	}
	public void setCondVenta(CondVenta condVenta) {
		this.condVenta = condVenta;
	}
	public Referencia getRef() {
		return ref;
	}
	public void setRef(Referencia ref) {
		this.ref = ref;
	}
	
	
	
}
