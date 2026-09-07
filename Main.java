import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(10, 10, 100, 25);
        frame.add(labelNombre);

        JTextField textNombre = new JTextField();
        textNombre.setBounds(120, 10, 250, 25);
        frame.add(textNombre);

        JLabel labelCorreo = new JLabel("Correo:");
        labelCorreo.setBounds(10, 40, 100, 25);
        frame.add(labelCorreo);

        JTextField textCorreo = new JTextField();
        textCorreo.setBounds(120, 40, 250, 25);
        frame.add(textCorreo);

        JLabel labelSemestre = new JLabel("Semestre:");
        labelSemestre.setBounds(10, 70, 100, 25);
        frame.add(labelSemestre);

        JTextField textSemestre = new JTextField();
        textSemestre.setBounds(120, 70, 250, 25);
        frame.add(textSemestre);

        JLabel labelCarrera = new JLabel("Carrera:");
        labelCarrera.setBounds(10, 100, 100, 25);
        frame.add(labelCarrera);

        String[] carreras = {"Derecho", "Ingeniería en Sistemas", "Fisica", "Matemáticas Aplicadas", "Mercadotecnia"};
        JComboBox<String> comboCarrera = new JComboBox<>(carreras);
        comboCarrera.setBounds(120, 100, 250, 25);
        frame.add(comboCarrera);

        JLabel labelMateria1 = new JLabel("Materia 1:");
        labelMateria1.setBounds(10, 130, 100, 25);
        frame.add(labelMateria1);

        JTextField textMateria1 = new JTextField();
        textMateria1.setBounds(120, 130, 250, 25);
        frame.add(textMateria1);

        JLabel labelMateria2 = new JLabel("Materia 2:");
        labelMateria2.setBounds(10, 160, 100, 25);
        frame.add(labelMateria2);

        JTextField textMateria2 = new JTextField();
        textMateria2.setBounds(120, 160, 250, 25);
        frame.add(textMateria2);

        JLabel labelMateria3 = new JLabel("Materia 3:");
        labelMateria3.setBounds(10, 190, 100, 25);
        frame.add(labelMateria3);

        JTextField textMateria3 = new JTextField();
        textMateria3.setBounds(120, 190, 250, 25);
        frame.add(textMateria3);

        JLabel labelMateria4 = new JLabel("Materia 4:");
        labelMateria4.setBounds(10, 220, 100, 25);
        frame.add(labelMateria4);

        JTextField textMateria4 = new JTextField();
        textMateria4.setBounds(120, 220, 250, 25);
        frame.add(textMateria4);

        JLabel labelMateria5 = new JLabel("Materia 5:");
        labelMateria5.setBounds(10, 250, 100, 25);
        frame.add(labelMateria5);

        JTextField textMateria5 = new JTextField();
        textMateria5.setBounds(120, 250, 250, 25);
        frame.add(textMateria5);

        JButton buttonEnviar = new JButton("Enviar Datos");
        buttonEnviar.setBounds(120, 280, 150, 30);
        frame.add(buttonEnviar);

        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textNombre.getText();
                String correo = textCorreo.getText();
                String carrera = (String) comboCarrera.getSelectedItem();
                String semestre = textSemestre.getText();

                try {
                    double materia1 = Double.parseDouble(textMateria1.getText());
                    double materia2 = Double.parseDouble(textMateria2.getText());
                    double materia3 = Double.parseDouble(textMateria3.getText());
                    double materia4 = Double.parseDouble(textMateria4.getText());
                    double materia5 = Double.parseDouble(textMateria5.getText());
                    double promedio = (materia1 + materia2 + materia3 + materia4 + materia5) / 5;

                    JFrame perfilFrame = new JFrame("Perfil");
                    perfilFrame.setSize(300, 250);
                    perfilFrame.setLayout(null);

                    JLabel labelPerfilNombre = new JLabel("Nombre: " + nombre);
                    labelPerfilNombre.setBounds(10, 10, 250, 25);
                    perfilFrame.add(labelPerfilNombre);

                    JLabel labelPerfilCorreo = new JLabel("Correo: " + correo);
                    labelPerfilCorreo.setBounds(10, 40, 250, 25);
                    perfilFrame.add(labelPerfilCorreo);

                    JLabel labelPerfilCarrera = new JLabel("Carrera: " + carrera);
                    labelPerfilCarrera.setBounds(10, 70, 250, 25);
                    perfilFrame.add(labelPerfilCarrera);

                    JLabel labelPerfilSemestre = new JLabel("Semestre: " + semestre);
                    labelPerfilSemestre.setBounds(10, 100, 250, 25);
                    perfilFrame.add(labelPerfilSemestre);

                    JLabel labelPerfilPromedio = new JLabel(String.format("Promedio: %.2f", promedio));
                    labelPerfilPromedio.setBounds(10, 130, 250, 25);
                    perfilFrame.add(labelPerfilPromedio);

                    perfilFrame.setVisible(true);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Ingrese valores válidos para las calificaciones.");
                }
            }
        });

        frame.setVisible(true);
    }
}
