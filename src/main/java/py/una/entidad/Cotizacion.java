package py.una.entidad;

public class Cotizacion {
	private String Banco;
	private Integer Compra;
	private Integer Venta;
	
	public Cotizacion () {
		//nada
	}
	
	public Cotizacion(String Banco, Integer Compra, Integer Venta) {
		this.Banco = Banco;
		this.Compra = Compra;
		this.Venta = Venta;
	}
	
	public void setBanco(String Banco) {
		this.Banco = Banco;
	}
	public void setCompra(Integer Compra) {
		this.Compra = Compra;
	}
	public void setVenta(Integer Venta) {
		this.Venta = Venta;
	}
	public String getBanco() {
		return this.Banco;
	}
	public Integer getCompra() {
		return this.Compra;
	}
	public Integer getVenta() {
		return this.Venta;
	}
}
