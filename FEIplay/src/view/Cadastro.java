package view;

import controller.ControleCadastro;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Cadastro extends javax.swing.JFrame {
    private ControleCadastro c;

    
    public Cadastro() {
        initComponents();
        c = new ControleCadastro(this);
    }

    public JButton getBtn_cadastrar() {
        return btn_cadastrar;
    }

    public void setBtn_cadastrar(JButton btn_cadastrar) {
        this.btn_cadastrar = btn_cadastrar;
    }

    public JLabel getIbl_nome() {
        return lbl_nome;
    }

    public void setIbl_nome(JLabel ibl_nome) {
        this.lbl_nome = ibl_nome;
    }

    public JLabel getIbl_senha() {
        return lbl_senha;
    }

    public void setIbl_senha(JLabel ibl_senha) {
        this.lbl_senha = ibl_senha;
    }

    public JLabel getIbl_titulo() {
        return lbl_titulo;
    }

    public void setIbl_titulo(JLabel ibl_titulo) {
        this.lbl_titulo = ibl_titulo;
    }

    public JLabel getIbl_usuario() {
        return lbl_usuario;
    }

    public void setIbl_usuario(JLabel ibl_usuario) {
        this.lbl_usuario = ibl_usuario;
    }

    public TextField getTxt_nome() {
        return txt_nome;
    }

    public void setTxt_nome(TextField txt_nome) {
        this.txt_nome = txt_nome;
    }

    public TextField getTxt_senha() {
        return txt_senha;
    }

    public void setTxt_senha(TextField txt_senha) {
        this.txt_senha = txt_senha;
    }

    public TextField getTxt_usuario() {
        return txt_usuario;
    }

    public void setTxt_usuario(TextField txt_usuario) {
        this.txt_usuario = txt_usuario;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new java.awt.TextField();
        lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new java.awt.TextField();
        btn_cadastrar = new javax.swing.JButton();
        lbl_senha = new javax.swing.JLabel();
        txt_senha = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lbl_titulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        lbl_titulo.setText("FEIplay");

        lbl_nome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_nome.setText("Nome");

        txt_nome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_nome.addActionListener(this::txt_nomeActionPerformed);

        lbl_usuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_usuario.setText("Usuário");

        txt_usuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_usuario.addActionListener(this::txt_usuarioActionPerformed);

        btn_cadastrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(this::btn_cadastrarActionPerformed);

        lbl_senha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_senha.setText("Senha");

        txt_senha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_senha.addActionListener(this::txt_senhaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_senha)
                    .addComponent(lbl_usuario)
                    .addComponent(lbl_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lbl_titulo)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_senha)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btn_cadastrar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        c.cadastrarUsuario();
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
//            logger.log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> new Cadastro().setVisible(true));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_usuario;
    private java.awt.TextField txt_nome;
    private java.awt.TextField txt_senha;
    private java.awt.TextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
