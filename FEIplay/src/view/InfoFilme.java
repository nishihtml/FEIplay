package view;

import controller.ControleInfoFilme;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Filme;


public class InfoFilme extends javax.swing.JFrame {
    private ControleInfoFilme c;
    
    public InfoFilme(Filme filme) {
        initComponents();
        lbl_titulo.setText((filme.getTitulo()));
        lbl_ano.setText((filme.getAno()));
        lbl_diretor.setText((filme.getDiretor()));
        lbl_genero.setText((filme.getGenero()));
        if(filme.getCurtida().equals("1")){
            lbl_curtida.setText(("♡"));
        }else{
            lbl_curtida.setText((" "));
        }
        lbl_duracao.setText((filme.getDuracao()));
        c = new ControleInfoFilme(this);
    }
    
    
    public JButton getBtn_fechar() {
        return btn_fechar;
    }

    public void setBtn_fechar(JButton btn_fechar) {
        this.btn_fechar = btn_fechar;
    }

    public JButton getBtn_playlist() {
        return btn_playlist;
    }

    public void setBtn_playlist(JButton btn_playlist) {
        this.btn_playlist = btn_playlist;
    }

    public JLabel getLbl_curtida() {
        return lbl_curtida;
    }

    public void setLbl_curtida(JLabel lbl_curtida) {
        this.lbl_curtida = lbl_curtida;
    }

    public JLabel getLbl_duracao() {
        return lbl_duracao;
    }

    public void setLbl_duracao(JLabel lbl_duracao) {
        this.lbl_duracao = lbl_duracao;
    }

    public JLabel getLbl_titulo() {
        return lbl_titulo;
    }

    public void setLbl_titulo(JLabel lbl_titulo) {
        this.lbl_titulo = lbl_titulo;
    }

    public JButton getjButton1() {
        return btn_playlist;
    }

    public void setjButton1(JButton jButton1) {
        this.btn_playlist = jButton1;
    }

    public JLabel getLbl_ano() {
        return lbl_ano;
    }

    public void setLbl_ano(JLabel lbl_ano) {
        this.lbl_ano = lbl_ano;
    }

    public JLabel getLbl_diretor() {
        return lbl_diretor;
    }

    public void setLbl_diretor(JLabel lbl_diretor) {
        this.lbl_diretor = lbl_diretor;
    }

    public JLabel getLbl_genero() {
        return lbl_genero;
    }

    public void setLbl_genero(JLabel lbl_genero) {
        this.lbl_genero = lbl_genero;
    }

    public JLabel getLbl_info1() {
        return lbl_duracao;
    }

    public void setLbl_info1(JLabel lbl_info1) {
        this.lbl_duracao = lbl_info1;
    }

    public JLabel getLbl_nome() {
        return lbl_titulo;
    }

    public void setLbl_nome(JLabel lbl_nome) {
        this.lbl_titulo = lbl_nome;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_ano = new javax.swing.JLabel();
        lbl_diretor = new javax.swing.JLabel();
        lbl_genero = new javax.swing.JLabel();
        lbl_duracao = new javax.swing.JLabel();
        btn_playlist = new javax.swing.JButton();
        lbl_curtida = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filme");

        lbl_titulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_titulo.setText("Titulo: ");

        lbl_ano.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_ano.setText("Ano: ");

        lbl_diretor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_diretor.setText("Diretor: ");

        lbl_genero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_genero.setText("Gênero: ");

        lbl_duracao.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_duracao.setText("Duração:");

        btn_playlist.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        btn_playlist.setText("Playlist");

        lbl_curtida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbl_curtida.setText("♡");

        btn_fechar.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_curtida)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_genero, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                                .addComponent(lbl_diretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_duracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(lbl_ano)
                .addGap(18, 18, 18)
                .addComponent(lbl_diretor)
                .addGap(18, 18, 18)
                .addComponent(lbl_genero)
                .addGap(18, 18, 18)
                .addComponent(lbl_duracao)
                .addGap(18, 18, 18)
                .addComponent(lbl_curtida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_playlist)
                .addGap(18, 18, 18)
                .addComponent(btn_fechar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        // TODO add your handling code here:
        c.fechar();
    }//GEN-LAST:event_btn_fecharActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
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
//        java.awt.EventQueue.invokeLater(() -> new Video().setVisible(true));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_playlist;
    private javax.swing.JLabel lbl_ano;
    private javax.swing.JLabel lbl_curtida;
    private javax.swing.JLabel lbl_diretor;
    private javax.swing.JLabel lbl_duracao;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
