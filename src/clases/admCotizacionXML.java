package clases;

import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class admCotizacionXML {

static final String ARCHIVO = "Cotizacion.xml";
	
	private ArrayList<Cotizacion> cotizaciones = new ArrayList<Cotizacion>();
	
	public void leerXML(){
					
		// Para leer un documento necesito un BuilderFactory
		// Defines a factory API that enables applications to obtain
		// a parser that produces DOM object trees from XML documents
		// Permite crear y obtener documentos de tipo XML
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			// Crea instancia de DocumentBuilderFactory
			// Es lo que permite obtener instancias de un objeto
			// de tipo XML. Solo se puede obtener de una instancia
			// del BuilderFactory por lo cual, debe declararse anteriormente
			DocumentBuilder builder = factory.newDocumentBuilder();

			// obtiene objeto DocumentBuilder. Obtiene el documento XML
			// ya armado.
			// Obtiene los datos del archivo especifico
			Document doc = builder.parse(ARCHIVO);

			// Obtengo el nodo RAIZ
			Element node = doc.getDocumentElement();

			// Obtengo los hijos de la RAIZ
			// NodeList lista = node.getChildNodes();

			// Obtengo los objetos por los que esta conformado la raiz
			// Cambio. Cambio esta formado por varios objetos Moneda
			// por lo tanto, voy a buscar todos los objetos Moneda

			NodeList lista = node.getElementsByTagName("Cotizacion");

			Cotizacion c = new Cotizacion();
			
			c.setNum(Integer.parseInt(node.getAttributeNode("numero").getTextContent()));
			
			NodeList lista1 = node.getElementsByTagName("Vigencia");
			
			// Recorro los hijos de la RAIZ
			for (int i = 0; i < lista1.getLength(); i++) {
				
				// A nivel performance convendria tener un
				// hashtable en donde a traves de un valor acceder a
				// los distintos atributos de esa tabla.
				// Es una tabla clave-valor (diccionario multiple)

				// Si quiero hacerlo de forma generica tendria hacer
				// Obtengo el nombre del nodo (nombre de la etiqueta)
				// Element elemento = (Element) lista.item(i).getNodeName();
				// Y con el nombre de la etiqueta obtengo el valor que hay entre
				// medio de ambas etiquetas (apertura-cierre)
				// m.setNombre(elemento.getNodeValue().trim(elemento));

				// Tomo un elemento que debo castear
				Element elemento = (Element) lista1.item(i);
				
				System.out.println(c.getNum());

			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		System.out.println();
		
	}

	
}
