package py.una.entidad;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CotizacionJSON {
	public static String objetoString(Cotizacion c) {	
    	
		JSONObject obj = new JSONObject();
        obj.put("banco", c.getBanco());
        obj.put("compra", c.getCompra());
        obj.put("venta", c.getVenta());

        return obj.toJSONString();
    }
    
    
    public static Cotizacion stringObjeto(String str) throws Exception {
    	Cotizacion p = new Cotizacion();
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(str.trim());
        JSONObject jsonObject = (JSONObject) obj;

        p.setBanco((String) jsonObject.get("banco"));
        p.setCompra((Integer)jsonObject.get("compra"));
        p.setVenta((Integer)jsonObject.get("venta"));
        
        return p;
	}
}
