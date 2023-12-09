import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Ventana principal de la aplicación
 * 
 * @author Cristian Chavez
 * @version 8.12.2023
 */
public class Graficos extends JFrame
{
    private JPanel backpanel;
    public Graficos()
    {
        super("Farmacia Ver8.12.2023");
        initVentana();
    }
    
    private void initVentana(){
        //Eliminar ventana al cerrar
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //Maximizar al abrir
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        
        //Layout
        backpanel = new JPanel(new BorderLayout());
        backpanel.setBackground(new Color(35,100,170));
        add(backpanel);
        
        //Menu Lateral
        initBarraLateral();
        //Hacer visible la ventana
        setVisible(true);
    }
    
    private void initBarraLateral(){
        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
        menu.setBackground(new Color(130,142,130));
        //Logo de la marca
        
        JLabel logo = new JLabel(new ImageIcon(Util.getImage("logo.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
        menu.add(logo);
        
        //Boton de inicio
        JButton inicio = new JButton("Inicio");
        inicio.setMaximumSize(new Dimension(Integer.MAX_VALUE,inicio.getMaximumSize().height));
        menu.add(inicio);
        
        //Pacientes
        JButton pacientes = new JButton("Pacientes");
        pacientes.setMaximumSize(new Dimension(Integer.MAX_VALUE,inicio.getMaximumSize().height));
        menu.add(pacientes);
        
        //Medicamentos
        JButton medicamentos = new JButton("Medicamentos");
        medicamentos.setMaximumSize(new Dimension(Integer.MAX_VALUE,inicio.getMaximumSize().height));
        menu.add(medicamentos);
        
        
        backpanel.add(menu,BorderLayout.WEST);
    }
    public static void main(String[] args){
        new Graficos();
    }
}
