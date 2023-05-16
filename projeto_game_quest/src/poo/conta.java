/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;
import controlador.Usuario;




/**
 *
 * @author danie
 */
public class conta extends javax.swing.JFrame {
List<Usuario> listaUsu = new ArrayList<>(); 
ArrayList<String> entrada = new  ArrayList<>();
ArrayList<String> supo = new  ArrayList<>();
    
public conta() {
        initComponents();
    }

    public conta(List<Usuario> listaUsu, List<String> entrada, List<String> supo ) {
        initComponents();
        
        this.listaUsu = listaUsu;
        this.entrada = (ArrayList<String>) entrada;
        this.supo = (ArrayList<String>) supo;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ecampos = new javax.swing.JLabel();
        Ccriada = new javax.swing.JLabel();
        Esenha = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        redigisenha = new javax.swing.JPasswordField();
        ptsair = new javax.swing.JLabel();
        ptlogin = new javax.swing.JLabel();
        minimizar = new javax.swing.JButton();
        ptfechar = new javax.swing.JButton();
        redimensionar = new javax.swing.JButton();
        sim = new javax.swing.JButton();
        nao = new javax.swing.JButton();
        ingsair = new javax.swing.JLabel();
        inglogin = new javax.swing.JLabel();
        ingfechar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        criarcont = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ecampos.setForeground(new java.awt.Color(255, 51, 51));
        Ecampos.setText("Erro: há campos faltando");
        getContentPane().add(Ecampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, -1, -1));

        Ccriada.setForeground(new java.awt.Color(102, 255, 102));
        Ccriada.setText("Conta criada com sucesso");
        getContentPane().add(Ccriada, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, -1, -1));

        Esenha.setForeground(new java.awt.Color(255, 51, 51));
        Esenha.setText("Erro: as senhas não coincidem ");
        getContentPane().add(Esenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, -1, -1));

        usuario.setBackground(new java.awt.Color(0, 0, 0));
        usuario.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setBorder(null);
        usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        usuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        usuario.setSelectionColor(new java.awt.Color(153, 153, 153));
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 245, 304, 30));

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(255, 255, 255));
        email.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        email.setSelectionColor(new java.awt.Color(153, 153, 153));
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 317, 304, 30));

        senha.setBackground(new java.awt.Color(0, 0, 0));
        senha.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setBorder(null);
        senha.setCaretColor(new java.awt.Color(255, 255, 255));
        senha.setSelectionColor(new java.awt.Color(153, 153, 153));
        senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhaMouseClicked(evt);
            }
        });
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 396, 290, 20));

        redigisenha.setBackground(new java.awt.Color(0, 0, 0));
        redigisenha.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        redigisenha.setForeground(new java.awt.Color(255, 255, 255));
        redigisenha.setBorder(null);
        redigisenha.setCaretColor(new java.awt.Color(255, 255, 255));
        redigisenha.setSelectionColor(new java.awt.Color(153, 153, 153));
        redigisenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redigisenhaMouseClicked(evt);
            }
        });
        redigisenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigisenhaActionPerformed(evt);
            }
        });
        getContentPane().add(redigisenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 474, 290, 20));

        ptsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ptsair.png"))); // NOI18N
        getContentPane().add(ptsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        ptlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ptcriarconta.png"))); // NOI18N
        ptlogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(ptlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 680));

        minimizar.setText("jButton1");
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 20, 20));

        ptfechar.setText("jButton1");
        ptfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptfecharActionPerformed(evt);
            }
        });
        getContentPane().add(ptfechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 20, 20));

        redimensionar.setText("jButton1");
        redimensionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redimensionarActionPerformed(evt);
            }
        });
        getContentPane().add(redimensionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1233, 0, 20, 20));

        sim.setText("jButton1");
        sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simActionPerformed(evt);
            }
        });
        getContentPane().add(sim, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 40, 20));

        nao.setText("jButton1");
        nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoActionPerformed(evt);
            }
        });
        getContentPane().add(nao, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 40, 20));

        ingsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ingsair.png"))); // NOI18N
        getContentPane().add(ingsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        inglogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inglogin.png"))); // NOI18N
        inglogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(inglogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 680));

        ingfechar.setText("jButton1");
        ingfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingfecharActionPerformed(evt);
            }
        });
        getContentPane().add(ingfechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 0, 25, 20));

        voltar.setText("jButton1");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 44, 60, -1));

        criarcont.setText("jButton1");
        criarcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarcontActionPerformed(evt);
            }
        });
        getContentPane().add(criarcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 310, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingfecharActionPerformed
        ingfechar.setVisible(true);
        ingsair.setVisible(true);
        sim.setVisible(true);
        nao.setVisible(true);

    }//GEN-LAST:event_ingfecharActionPerformed

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        this.setState (JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizarActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void ptfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptfecharActionPerformed
        ptsair.setVisible(true);
        sim.setVisible(true);
        nao.setVisible(true);
    }//GEN-LAST:event_ptfecharActionPerformed

    private void simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simActionPerformed
        System.exit(0);
    }//GEN-LAST:event_simActionPerformed

    private void naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoActionPerformed
        ptsair.setVisible(false);
        ingsair.setVisible(false);
        sim.setVisible(false);
        nao.setVisible(false);
    }//GEN-LAST:event_naoActionPerformed

    private void redimensionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redimensionarActionPerformed

    }//GEN-LAST:event_redimensionarActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed

    }//GEN-LAST:event_senhaActionPerformed

    private void redigisenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigisenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redigisenhaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
    login lg = new login(entrada,listaUsu,supo);
                    lg.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void criarcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarcontActionPerformed
     
     if (usuario.getText().equals ("") || email.getText().equals ("") ){
         Ecampos.setVisible(true);
}
     else{
     if (!senha.getText().equals(redigisenha.getText())) {
         Esenha.setVisible(true);
     }
     
     if(senha.getText().equals(redigisenha.getText())){
    entrada.add(usuario.getText());
    entrada.add(email.getText());
    entrada.add(senha.getText()); 
    entrada.add(redigisenha.getText()); 
    
    

    usuario.setText("");
    email.setText("");
    senha.setText("");
    redigisenha.setText("");
    Ccriada.setVisible(true);
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("Usuario criado: "+entrada);
       System.out.println("Mensagem do suporte: "+supo);
       System.out.println("Usuários pré criados: "+listaUsu);
       
    }
     }
     
    }//GEN-LAST:event_criarcontActionPerformed

    private void senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaMouseClicked
         Esenha.setVisible(false);
          Ecampos.setVisible(false);
    }//GEN-LAST:event_senhaMouseClicked

    private void redigisenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redigisenhaMouseClicked
        Esenha.setVisible(false);
        Ecampos.setVisible(false);
    }//GEN-LAST:event_redigisenhaMouseClicked

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
       Ecampos.setVisible(false);
    }//GEN-LAST:event_usuarioMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        Ecampos.setVisible(false);
    }//GEN-LAST:event_emailMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Esenha.setVisible(false);
       ptsair.setVisible(false);
       sim.setVisible(false);
       nao.setVisible(false);
       ingfechar.setVisible(false);
       ingsair.setVisible(false);
       Ccriada.setVisible(false);
        Ecampos.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ccriada;
    private javax.swing.JLabel Ecampos;
    private javax.swing.JLabel Esenha;
    private javax.swing.JButton criarcont;
    private javax.swing.JTextField email;
    private javax.swing.JButton ingfechar;
    private javax.swing.JLabel inglogin;
    private javax.swing.JLabel ingsair;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton nao;
    private javax.swing.JButton ptfechar;
    private javax.swing.JLabel ptlogin;
    private javax.swing.JLabel ptsair;
    private javax.swing.JPasswordField redigisenha;
    private javax.swing.JButton redimensionar;
    private javax.swing.JPasswordField senha;
    private javax.swing.JButton sim;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}