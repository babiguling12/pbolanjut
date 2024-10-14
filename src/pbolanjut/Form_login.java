/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbolanjut;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Gustu
 */
public class Form_login extends javax.swing.JFrame {
    
    /**
     * Creates new form form_login
     */
    
    private Connection conn;
    
    public Form_login() {
        initComponents();
        conn = Koneksi.getConnection();
        
        ResizeImage.setImageToLabel(foto_login, "/pbolanjut/img/account.png", 174, 138);
        
        password.setText("Password");
        password.setEchoChar((char)0);
        
        foto_login.requestFocusInWindow();
        
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) { // berfungsi untuk menangani logika ketika tombol ditekan
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    button_loginActionPerformed(null);  // panggil metode login
                }
            }
        });
        
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    button_loginActionPerformed(null);  // panggil metode login
                }
            }
        });
        
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) { // keyTyped berfungsi untuk menangkap input karakter
                if (show_password.isSelected()) {
                    password.setEchoChar((char) 0);  
                } else {
                    password.setEchoChar('*');
                }
            }
        });
        
         show_password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    button_loginActionPerformed(null);
                }
            }
        });
         
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        foto_login = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        email = new java.awt.TextField();
        password = new javax.swing.JPasswordField();
        button_login = new javax.swing.JButton();
        login_title = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        show_password = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(foto_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 80, 174, 138));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbolanjut/img/cross.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 6, 26, -1));

        email.setText("Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 106, 179, 32));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 160, 179, 32));

        button_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button_login.setText("GO!!");
        button_login.setToolTipText("");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        jPanel1.add(button_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 228, 105, 36));

        login_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 34)); // NOI18N
        login_title.setForeground(new java.awt.Color(0, 204, 204));
        login_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title.setText("LOGIN");
        jPanel1.add(login_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 36, 123, 28));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbolanjut/img/minus.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 26, 30));

        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbolanjut/img/maximize.png"))); // NOI18N
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });
        jPanel1.add(maximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 4, 26, 30));

        show_password.setText("Show Password");
        show_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                show_passwordFocusGained(evt);
            }
        });
        show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(show_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Don't have an account yet?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 150, -1));

        btn_register.setBackground(new java.awt.Color(0, 153, 153));
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Register");
        btn_register.setIconTextGap(2);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    int xx, xy;
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX(); // x awal
        xy = evt.getY(); // y awal
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen(); // seberapa jauh x pindah
        int y = evt.getYOnScreen(); // seberapa jauh y pindah
        this.setLocation(x - xx, y - xy); // lokasi akhir
    }//GEN-LAST:event_formMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose(); // untuk close
    }//GEN-LAST:event_exitMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        String email_focus = email.getText();
        if(email_focus.equals("Email")) {
            email.setText("");
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        String email_lost = email.getText();
        if(email_lost.equals("")||email_lost.equals("Email")) {
            email.setText("Email");
        }
    }//GEN-LAST:event_emailFocusLost

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        
        try {
            String email_user = email.getText();
            char[] pass = password.getPassword();
            String username = null;
            String passDB = null;
            int notFound = 0;
            
            String query = "SELECT * FROM mahasiswa WHERE email = '"+email_user+"'";
            Statement st = conn.createStatement(); // Membuat Statement untuk mengeksekusi query
            ResultSet rs = st.executeQuery(query); // Menjalankan query dan menyimpan hasilnya dalam ResultSet
            
            while(rs.next()) {
                username = rs.getString("username");
                passDB = rs.getString("password");
                notFound = 1;
            }
            
            if(notFound == 1 && Arrays.equals(pass, passDB.toCharArray())){
                Menu_utama menu_utama = new Menu_utama(username);
                menu_utama.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong email or password!", "Message", JOptionPane.ERROR_MESSAGE);
                email.setText("Email");
                password.setText("Password");
                password.setEchoChar((char)0);
                
                foto_login.requestFocusInWindow();
            }
            
            st.close();
            rs.close();
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
         
    }//GEN-LAST:event_button_loginActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(Form_login.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        if(this.getExtendedState()!= Form_login.MAXIMIZED_BOTH) {
            this.setExtendedState(Form_login.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(Form_login.NORMAL);
        }
    }//GEN-LAST:event_maximizeMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        String password_focus = password.getText();
        if(password_focus.equals("Password")) {
            password.setText("");
            password.setEchoChar('*'); // saat menginput, karakter yang ditampilkan adalah "*"
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String password_lost = password.getText();
        if(password_lost.equals("") || password_lost.equals("Password")) {
            password.setText("Password");
            password.setEchoChar((char)0); // menampilkan teks biasa
        }
    }//GEN-LAST:event_passwordFocusLost

    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passwordActionPerformed
        if(show_password.isSelected()){
            password.setEchoChar((char)0);
        } else {
            password.setEchoChar('*');
        }
        
    }//GEN-LAST:event_show_passwordActionPerformed

    private void show_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_show_passwordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_show_passwordFocusGained

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        Form_register form_register = new Form_register();
        form_register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JButton button_login;
    private java.awt.TextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel foto_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_title;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show_password;
    // End of variables declaration//GEN-END:variables
}
