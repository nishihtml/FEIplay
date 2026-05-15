package view;

import controller.ControleInfoFilme;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Filme;

public class InfoFilme extends javax.swing.JFrame {
    private ControleInfoFilme c;
    
    public InfoFilme(Filme filme) {
        initComponents();
        lbl_titulo.setText(("Titulo: " + filme.getTitulo()));
        lbl_ano.setText(("Ano de lançamento: " + filme.getAno()));
        lbl_diretor.setText(("Diretor: " + filme.getDiretor()));
        lbl_genero.setText(("Gênero: " + filme.getGenero()));
        if(filme.getCurtida().equals("1")){
            lbl_curtida.setText(("♡"));
        }else{
            lbl_curtida.setText((" "));
        }
        lbl_duracao.setText(("Duração: " + filme.getDuracao()));
        c = new ControleInfoFilme(this, filme);
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
        lbl_curtida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        lbl_curtida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbl_curtida.setText("♡");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_curtida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_genero, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                        .addComponent(lbl_diretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_duracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private javax.swing.JLabel lbl_ano;
    private javax.swing.JLabel lbl_curtida;
    private javax.swing.JLabel lbl_diretor;
    private javax.swing.JLabel lbl_duracao;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
