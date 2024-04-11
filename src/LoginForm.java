import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.*;

public class LoginForm extends JDialog {
    private JTextField tfEmail;
    private JTextField pfPassword;
    private JButton btnOK;
    private JButton btnCalncel;
    private JPanel loginPanel;

    public LoginForm(JFrame parent){
        super(parent);
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(900,600));
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

//        btnOK.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String email = tfEmail.getText();
//                String  password = String.valueOf( pfPassword.getCursor());
//
//                getAutherticatedUser(email,password);
//
//                if (user != null) {
//                    dispose();
//                }
//                else {
//                    JOptionPane.showMessageDialog(LoginForm.this,
//                            "Email or Password Inalid ,vc tá errado kkkk",
//                            "Thy agin",
//                            JOptionPane.ERROR_MESSAGE);
//
//
//                }
//
//            }
//        });

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificar as credenciais e redirecionar para outra página
                String username = tfEmail.getText();
                String password = new String(pfPassword.getText());

                // Lógica de autenticação aqui

                // Redirecionar para outra página

                new MenuForm();
                dispose(); // Fechar a janela atual
                // Código para redirecionar para outra página
            }
        });

        btnCalncel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public User user;
    private User getAutherticatedUser(String email , String Password){
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost/mystore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,Password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                user = new User();
                user.name = resultSet.getString("name");
                user.email = resultSet.getString("email");
                user.phone = resultSet.getString("phone");
                user.address = resultSet.getString("address");
                user.password = resultSet.getString("passsword");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args){
        LoginForm LoginForm = new LoginForm( null);
        User user = LoginForm.user;
        if(user !=null) {


            System.out.println("Sucessoful Authenticatina of :" + user.name);
            System.out.println("Email :" + user.email);
            System.out.println("Phone :" + user.email);
            System.out.println("Address" + user.phone);
            }
        else {
            System.out.println("Authenticator canceled");
            }


        }

    }
