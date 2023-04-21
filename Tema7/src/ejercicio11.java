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

        Element nombrecontacto = document.createElement("nombre");
        contacto.appendChild(nombrecontacto);

        // Creamos un nodo de texto que será el valor del elemento anterior
        Text Pablo = document.createTextNode("Pablo");
        // y lo colgamos del nodo anterior --> <estudiante>Fran</estudiante>
        contacto1.appendChild(Pablo);


        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("Tema7/src/ejercicio11.java"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);
    }
}

