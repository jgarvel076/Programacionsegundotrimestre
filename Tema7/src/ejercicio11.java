import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ejercicio11 {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        // Creamos el documento vacío para añadirle a continuación los nodos
        // En este caso lo hago todo en una sola línea
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        // Creamos el nodo raíz
        Element Lista = document.createElement("Lista");
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(Lista);

        // Creamos el primer nodo y lo colgamos de su padre, el nodo raíz. --> <estudiante></estudiante>
        Element contacto = document.createElement("Contacto");
        Lista.appendChild(contacto);


        // Creamos un nodo de texto que será el valor del elemento anterior
        Text Pablo = document.createTextNode("Pablo");
        // y lo colgamos del nodo anterior --> <estudiante>Fran</estudiante>
        contacto.appendChild(Pablo);

        Element direccion = document.createElement("direccion");
        contacto.appendChild(direccion);

        Text direccionpablo = document.createTextNode("Juan Ramon Jimenez");
        direccion.appendChild(direccionpablo);

        Element numero = document.createElement("numero");
        contacto.appendChild(numero);

        Text numeropablo = document.createTextNode("627884659");
        numero.appendChild(numeropablo);

        Element contacto1 = document.createElement("Contacto");
        Lista.appendChild(contacto1);

        // Creamos un nodo de texto que será el valor del elemento anterior
        Text Juan = document.createTextNode("Juan");
        // y lo colgamos del nodo anterior --> <estudiante>Fran</estudiante>
        contacto1.appendChild(Juan);

        Element direccion1 = document.createElement("direccion");
        contacto1.appendChild(direccion1);

        Text direccionjuan = document.createTextNode("Pablo Torres");
        direccion1.appendChild(direccionjuan);

        Element numero1 = document.createElement("numero");
        contacto1.appendChild(numero1);

        Text numerojuan = document.createTextNode("602247931");
        numero1.appendChild(numerojuan);

        Element contacto2 = document.createElement("Contacto");
        Lista.appendChild(contacto2);

        // Creamos un nodo de texto que será el valor del elemento anterior
        Text Manuel = document.createTextNode("Manuel");
        // y lo colgamos del nodo anterior --> <estudiante>Fran</estudiante>
        contacto2.appendChild(Manuel);

        Element direccion2 = document.createElement("direccion");
        contacto2.appendChild(direccion2);

        Text direccionmanuel = document.createTextNode("Fernando Torres");
        direccion2.appendChild(direccionmanuel);

        Element numero2 = document.createElement("numero");
        contacto2.appendChild(numero2);

        Text numeromanuel = document.createTextNode("697184252");
        numero2.appendChild(numeromanuel);

        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("Tema7/src/ejercicio11.xml"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);
    }
}

