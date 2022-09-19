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
    	Cotizacion c = new Cotizacion();
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(str.trim());
        JSONObject jsonObject = (JSONObject) obj;

        c.setBanco((String) jsonObject.get("banco"));
        c.setCompra((Long)jsonObject.get("compra"));
        c.setVenta((Long)jsonObject.get("venta"));
        
        return c;
	}
}
