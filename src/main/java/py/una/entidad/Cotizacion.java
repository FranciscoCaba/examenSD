package py.una.entidad;

public class Cotizacion {
	private String Banco;
	private Long Compra;
	private Long Venta;
	
	public Cotizacion () {
		//nada
	}
	
	public Cotizacion(String Banco, Long Compra, Long Venta) {
		this.Banco = Banco;
		this.Compra = Compra;
		this.Venta = Venta;
	}
	
	public void setBanco(String Banco) {
		this.Banco = Banco;
	}
	public void setCompra(Long Compra) {
		this.Compra = Compra;
	}
	public void setVenta(Long Venta) {
		this.Venta = Venta;
	}
	public String getBanco() {
		return this.Banco;
	}
	public Long getCompra() {
		return this.Compra;
	}
	public Long getVenta() {
		return this.Venta;
	}
}
