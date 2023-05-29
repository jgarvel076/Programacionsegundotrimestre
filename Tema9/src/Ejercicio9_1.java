import java.awt.*;

public class Ejercicio9_1 {
        public static void main(String[] args) {
            Frame f = new Frame("Login");
            f.setBackground(Color.lightGray);
            f.setLayout(null);
            f.setSize(375,250);
            f.setVisible(true);

            Label nombre = new Label("Usuario");
            nombre.setBounds(25,65,70,25);
            TextField textoNombre = new TextField("");
            textoNombre.setBounds(125,65,200,25);

            Label pass = new Label("Password");
            pass.setBounds(25,115,70,25);
            TextField textoPass = new TextField("");
            textoPass.setBounds(125,115,200,25);

            Button cancelar = new Button("Cancelar");
            cancelar.setBounds(50,175,100,25);

            Button acceder = new Button("Acceder");
            acceder.setBounds(225,175,100,25);

            f.add(nombre);
            f.add(textoNombre);
            f.add(pass);
            f.add(textoPass);
            f.add(cancelar);
            f.add(acceder);
        }
}
