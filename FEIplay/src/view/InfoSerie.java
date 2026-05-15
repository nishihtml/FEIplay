package view;

import controller.ControleInfoSerie;
import javax.swing.JLabel;
import model.Serie;


public class InfoSerie extends javax.swing.JFrame {
    private ControleInfoSerie c;
    
    /**
     * Creates new form Video
     * @param serie
     */
    public InfoSerie(Serie serie) {
        initComponents();
        lbl_titulo.setText(("Titulo: " + serie.getTitulo()));
        lbl_ano.setText(("Ano de lançamento: " + serie.getAno()));
        lbl_diretor.setText(("Diretor: " + serie.getDiretor()));
        lbl_genero.setText(("Genero: " + serie.getGenero()));
        if(serie.getCurtida().equals("1")){
            lbl_curtida.setText(("♡"));
        }else{
            lbl_curtida.setText((" "));
        }
        lbl_episodios.setText(("Episodios: " +serie.getEpisodios()));
        lbl_temporadas.setText(("Temporadas: " + serie.getTemporadas()));
        lbl_situacao.setText(("Situação: " + serie.exibirSituacao(serie.getSituacao())));
        c = new ControleInfoSerie(this, serie);
    }

   

    public JLabel getLbl_curtida() {
        return lbl_curtida;
    }

    public void setLbl_curtida(JLabel lbl_curtida) {
        this.lbl_curtida = lbl_curtida;
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
        return lbl_episodios;
    }

    public void setLbl_info1(JLabel lbl_info1) {
        this.lbl_episodios = lbl_info1;
    }

    public JLabel getLbl_nome() {
        return lbl_titulo;
    }

    public void setLbl_nome(JLabel lbl_nome) {
        this.lbl_titulo = lbl_nome;
    }

    public JLabel getLbl_episodios() {
        return lbl_episodios;
    }

    public void setLbl_episodios(JLabel lbl_episodios) {
        this.lbl_episodios = lbl_episodios;
    }

    public JLabel getLbl_situacao() {
        return lbl_situacao;
    }

    public void setLbl_situacao(JLabel lbl_situacao) {
        this.lbl_situacao = lbl_situacao;
    }

    public JLabel getLbl_temporadas() {
        return lbl_temporadas;
    }

    public void setLbl_temporadas(JLabel lbl_temporadas) {
        this.lbl_temporadas = lbl_temporadas;
    }

    public JLabel getLbl_titulo() {
        return lbl_titulo;
    }

    public void setLbl_titulo(JLabel lbl_titulo) {
        this.lbl_titulo = lbl_titulo;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_ano = new javax.swing.JLabel();
        lbl_diretor = new javax.swing.JLabel();
        lbl_genero = new javax.swing.JLabel();
        lbl_episodios = new javax.swing.JLabel();
        lbl_temporadas = new javax.swing.JLabel();
        lbl_situacao = new javax.swing.JLabel();
        lbl_curtida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video");

        lbl_titulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_titulo.setText("Titulo: ");

        lbl_ano.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_ano.setText("Ano: ");

        lbl_diretor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_diretor.setText("Diretor: ");

        lbl_genero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_genero.setText("Gênero: ");

        lbl_episodios.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_episodios.setText("Episodios:");

        lbl_temporadas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_temporadas.setText("Temporadas:");

        lbl_situacao.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_situacao.setText("Situação:");

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
                        .addComponent(lbl_episodios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_temporadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_situacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(lbl_ano)
                .addGap(18, 18, 18)
                .addComponent(lbl_diretor)
                .addGap(18, 18, 18)
                .addComponent(lbl_genero)
                .addGap(18, 18, 18)
                .addComponent(lbl_episodios)
                .addGap(18, 18, 18)
                .addComponent(lbl_temporadas)
                .addGap(18, 18, 18)
                .addComponent(lbl_situacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_curtida)
                .addGap(172, 172, 172))
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
    private javax.swing.JLabel lbl_episodios;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_situacao;
    private javax.swing.JLabel lbl_temporadas;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
