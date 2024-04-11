import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame {

    private JPanel panel1;

    public MenuForm() {
        setTitle("Formulário com Menu");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria a barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Cria um menu
        JMenu fileMenu = new JMenu("Arquivo");
        JMenu helpMenu = new JMenu("Ajuda");

        // Cria itens para o menu Arquivo
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Salvar");
        JMenuItem exitItem = new JMenuItem("Sair");

        // Adiciona ações para o item Sair
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha a aplicação
            }
        });

        // Adiciona itens ao menu Arquivo
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adiciona um separador
        fileMenu.add(exitItem);

        // Adiciona menus à barra de menu
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // Adiciona a barra de menu ao JFrame
        setJMenuBar(menuBar);

        // Configura o painel e adiciona componentes como antes
        JLabel label = new JLabel("OLÁ MUNDO");
        JPanel panel = new JPanel();
        panel.add(label);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Cria e exibe o formulário
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuForm();
            }
        });
    }
}
