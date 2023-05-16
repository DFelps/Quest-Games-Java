package poo;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;
import controlador.Adm;
import controlador.Usuario;

//EXPLICAR
public class login extends javax.swing.JFrame {
    List<String> entrada = new ArrayList<>(); 
    List<String> supo = new ArrayList<>();
    List<Usuario> listaUsu = new ArrayList<>();
    
    String Senha;
    public String Usuario;
    String entrada1;
    
    public login(List<String> entrada, List<Usuario> listaUsu, List<String> supo) {
        initComponents();
        
        this.entrada = entrada;
        this.listaUsu = listaUsu;
        this.supo = supo;
        
    }
    
    public login() {
        initComponents();
        Usuario = usuario.getText();
        Senha = senha.getText();
        
        /******************************/
        listaAdm.add(adm1);
        listaUsu.add(u1);
        listaUsu.add(u2);
        listaUsu.add(u3);
        listaUsu.add(u4);
        /******************************/
    }
 List<Adm> listaAdm = new ArrayList<>();
    Adm adm1 = new Adm("adm",1, "senha","ADM");
   
    Usuario u1 = new Usuario(1,"DFelipe", "daniel123@hotmail.com", "123");
    Usuario u2 = new Usuario(2,"Vinicius", "seujose123@hotmail.com", "456");
    Usuario u3 = new Usuario(3,"Noahark", "abraao123@hotmail.com", "789");
    Usuario u4 = new Usuario(4,"Pulinho", "pulinho123@hotmail.com", "321"); 


    


    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lembrar = new javax.swing.JRadioButton();
        Ecampos = new javax.swing.JLabel();
        ptsair = new javax.swing.JLabel();
        ingsair = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        ptlogin = new javax.swing.JLabel();
        inglogin = new javax.swing.JLabel();
        minimizar = new javax.swing.JButton();
        redimensionar = new javax.swing.JButton();
        ptfechar = new javax.swing.JButton();
        ingfechar = new javax.swing.JButton();
        sim = new javax.swing.JButton();
        nao = new javax.swing.JButton();
        login = new javax.swing.JButton();
        esqueceu = new javax.swing.JButton();
        criarconta = new javax.swing.JButton();
        br = new javax.swing.JButton();
        eua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(2880, 1800));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lembrar.setBackground(new java.awt.Color(74, 74, 84));
        lembrar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        lembrar.setForeground(new java.awt.Color(153, 153, 153));
        lembrar.setFocusPainted(false);
        lembrar.setFocusable(false);
        lembrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lembrarActionPerformed(evt);
            }
        });
        getContentPane().add(lembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 20, -1));

        Ecampos.setForeground(new java.awt.Color(255, 51, 51));
        Ecampos.setText("Erro: Login invalido");
        getContentPane().add(Ecampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, -1, -1));

        ptsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ptsair.png"))); // NOI18N
        getContentPane().add(ptsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        ingsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ingsair.png"))); // NOI18N
        getContentPane().add(ingsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        senha.setBackground(new java.awt.Color(0, 0, 0));
        senha.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
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
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 378, 290, 20));

        usuario.setBackground(new java.awt.Color(0, 0, 0));
        usuario.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
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
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 290, 30));

        ptlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ptlogin.png"))); // NOI18N
        ptlogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(ptlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 680));

        inglogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inglogin.png"))); // NOI18N
        inglogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(inglogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 680));

        minimizar.setText("jButton1");
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1206, 0, 20, 20));

        redimensionar.setText("jButton1");
        redimensionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redimensionarActionPerformed(evt);
            }
        });
        getContentPane().add(redimensionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1236, 0, 12, 20));

        ptfechar.setText("jButton1");
        ptfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptfecharActionPerformed(evt);
            }
        });
        getContentPane().add(ptfechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1261, 0, 10, 20));

        ingfechar.setText("jButton1");
        ingfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingfecharActionPerformed(evt);
            }
        });
        getContentPane().add(ingfechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 0, 25, 30));

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

        login.setText("jButton1");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 310, 40));

        esqueceu.setText("jButton1");
        esqueceu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueceuActionPerformed(evt);
            }
        });
        getContentPane().add(esqueceu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 426, 100, 10));

        criarconta.setText("jButton1");
        criarconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarcontaActionPerformed(evt);
            }
        });
        getContentPane().add(criarconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 615, 150, 10));

        br.setText("jButton1");
        br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brActionPerformed(evt);
            }
        });
        getContentPane().add(br, new org.netbeans.lib.awtextra.AbsoluteConstraints(1152, 38, 50, 30));

        eua.setText("jButton1");
        eua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euaActionPerformed(evt);
            }
        });
        getContentPane().add(eua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1216, 38, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        this.setState (JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizarActionPerformed

    private void redimensionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redimensionarActionPerformed
       
    }//GEN-LAST:event_redimensionarActionPerformed

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

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void lembrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lembrarActionPerformed
        
    }//GEN-LAST:event_lembrarActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
       
    }//GEN-LAST:event_senhaActionPerformed

    private void euaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euaActionPerformed
       ingfechar.setVisible(true);
       ptfechar.setVisible(false);
       ptlogin.setVisible(false);
       inglogin.setVisible(true);
        
    }//GEN-LAST:event_euaActionPerformed

    private void ingfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingfecharActionPerformed
       ingfechar.setVisible(true);
       ingsair.setVisible(true);
       sim.setVisible(true);
       nao.setVisible(true);
        
    }//GEN-LAST:event_ingfecharActionPerformed

    private void brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brActionPerformed
       ingfechar.setVisible(false);
       ptfechar.setVisible(true);
       ptlogin.setVisible(true);
       inglogin.setVisible(false);
       sim.setVisible(true);
       nao.setVisible(true);
    }//GEN-LAST:event_brActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       String login = usuario.getText();
        String pass = senha.getText();
        for(Adm a : listaAdm){
            if((login.compareTo(a.getNomeLogin())==0) &&(pass.compareTo(a.getSenha())==0)){
                if(a.getTipoUsuario().compareTo("ADM")==0){
                 //  telaadm adm = new telaadm(listaUsu);
                    //MP.setVisible(true);
                    this.dispose();
                }
                  }
        }
                for(Usuario l : listaUsu){
            if((login.compareTo(l.getNick())== 0) && (pass.compareTo(l.getSenha())== 0)){
                
                 loja lj = new loja(listaUsu, entrada, supo);
                    lj.setVisible(true);
                    this.dispose();

                     break;
            }
            else{Ecampos.setVisible(true);}
                }
         for(String e : entrada){
            if((login.compareTo(usuario.getText())==0) && (senha.getText().compareTo(e)==0)){
                
                 loja lj = new loja(listaUsu, entrada, supo);
                    lj.setVisible(true);
                    this.dispose();
                    break;
            }
            else{Ecampos.setVisible(true);}
                }
      
      

    }//GEN-LAST:event_loginActionPerformed

    private void esqueceuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esqueceuActionPerformed

    private void criarcontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarcontaActionPerformed
         conta cn = new conta(listaUsu ,entrada,supo);
                    cn.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_criarcontaActionPerformed

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        Ecampos.setVisible(false);
    }//GEN-LAST:event_usuarioMouseClicked

    private void senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaMouseClicked
       Ecampos.setVisible(false);
    }//GEN-LAST:event_senhaMouseClicked

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        
    }//GEN-LAST:event_loginKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
ptsair.setVisible(false);
       sim.setVisible(false);
       nao.setVisible(false);
       ingfechar.setVisible(false);
       ingsair.setVisible(false);
       Ecampos.setVisible(false);
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("Usuario criado: "+entrada);
       System.out.println("Mensagem do suporte: "+supo);
       System.out.println("Usuários pré criados: "+listaUsu);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ecampos;
    private javax.swing.JButton br;
    private javax.swing.JButton criarconta;
    private javax.swing.JButton esqueceu;
    private javax.swing.JButton eua;
    private javax.swing.JButton ingfechar;
    private javax.swing.JLabel inglogin;
    private javax.swing.JLabel ingsair;
    private javax.swing.JRadioButton lembrar;
    private javax.swing.JButton login;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton nao;
    private javax.swing.JButton ptfechar;
    private javax.swing.JLabel ptlogin;
    private javax.swing.JLabel ptsair;
    private javax.swing.JButton redimensionar;
    private javax.swing.JPasswordField senha;
    private javax.swing.JButton sim;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    }
