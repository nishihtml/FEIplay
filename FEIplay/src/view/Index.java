package view;

import controller.ControleIndex;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Usuario;

public class Index extends javax.swing.JFrame {
    private ControleIndex c;
    /**
     * Creates new form Index
     * @param usuario
     */
    public Index(Usuario usuario) {
        initComponents();
        lbl_usuario.setText((usuario.getUsuario()));
        lbl_nome.setText((usuario.getNome()));
        c = new ControleIndex(this);
    }

    public JLabel getLbl_usuario() {
        return lbl_usuario;
    }

    public void setLbl_usuario(JLabel lbl_usuario) {
        this.lbl_usuario = lbl_usuario;
    }
    
    
    public ControleIndex getC() {
        return c;
    }

    public void setC(ControleIndex c) {
        this.c = c;
    }

    public JButton getBtn_buscarFilme() {
        return btn_buscarFilme;
    }

    public void setBtn_buscarFilme(JButton btn_buscarFilme) {
        this.btn_buscarFilme = btn_buscarFilme;
    }

    public JButton getBtn_buscarSerie() {
        return btn_buscarSerie;
    }

    public void setBtn_buscarSerie(JButton btn_buscarSerie) {
        this.btn_buscarSerie = btn_buscarSerie;
    }

    public JButton getBtn_excluirPlaylist() {
        return btn_excluirPlaylist;
    }

    public void setBtn_excluirPlaylist(JButton btn_excluirPlaylist) {
        this.btn_excluirPlaylist = btn_excluirPlaylist;
    }

    public JTextField getTxt_playlist() {
        return txt_playlist;
    }

    public void setTxt_playlist(JTextField txt_playlist) {
        this.txt_playlist = txt_playlist;
    }
    
    

    public JButton getBtn_buscar() {
        return btn_buscarFilme;
    }

    public void setBtn_buscar(JButton btn_buscar) {
        this.btn_buscarFilme = btn_buscar;
    }

    public JButton getBtn_criarPlaylist() {
        return btn_criarPlaylist;
    }

    public void setBtn_criarPlaylist(JButton btn_criarPlaylist) {
        this.btn_criarPlaylist = btn_criarPlaylist;
    }

    public JButton getBtn_verPlaylist() {
        return btn_verPlaylist;
    }

    public void setBtn_verPlaylist(JButton btn_verPlaylist) {
        this.btn_verPlaylist = btn_verPlaylist;
    }

    public JLabel getLbl_nome() {
        return lbl_usuario;
    }

    public void setLbl_nome(JLabel lbl_nome) {
        this.lbl_usuario = lbl_nome;
    }

    public JTextField getTxt_busca() {
        return txt_busca;
    }

    public void setTxt_busca(JTextField txt_busca) {
        this.txt_busca = txt_busca;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_usuario = new javax.swing.JLabel();
        btn_buscarFilme = new javax.swing.JButton();
        txt_busca = new javax.swing.JTextField();
        btn_criarPlaylist = new javax.swing.JButton();
        btn_verPlaylist = new javax.swing.JButton();
        btn_buscarSerie = new javax.swing.JButton();
        btn_excluirPlaylist = new javax.swing.JButton();
        txt_playlist = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FEIplay");

        lbl_usuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuario.setText("{NOME}");
        lbl_usuario.setToolTipText("");

        btn_buscarFilme.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn_buscarFilme.setText("Buscar Filme");
        btn_buscarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarFilmeActionPerformed(evt);
            }
        });

        txt_busca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscaActionPerformed(evt);
            }
        });

        btn_criarPlaylist.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn_criarPlaylist.setText("Criar Playlist");
        btn_criarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criarPlaylistActionPerformed(evt);
            }
        });

        btn_verPlaylist.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn_verPlaylist.setText("Ver Playlist");

        btn_buscarSerie.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn_buscarSerie.setText("Buscar Serie");
        btn_buscarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarSerieActionPerformed(evt);
            }
        });

        btn_excluirPlaylist.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn_excluirPlaylist.setText("Excluir Playlist");

        txt_playlist.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_playlistActionPerformed(evt);
            }
        });

        lbl_nome.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        lbl_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nome.setText("{NOME}");
        lbl_nome.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_criarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_verPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_excluirPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(btn_buscarFilme)
                            .addGap(18, 18, 18)
                            .addComponent(btn_buscarSerie))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(txt_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lbl_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_usuario)
                .addGap(42, 42, 42)
                .addComponent(txt_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscarFilme)
                    .addComponent(btn_buscarSerie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(txt_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_criarPlaylist)
                .addGap(18, 18, 18)
                .addComponent(btn_verPlaylist)
                .addGap(18, 18, 18)
                .addComponent(btn_excluirPlaylist)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscaActionPerformed

    private void btn_buscarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarFilmeActionPerformed

        c.BuscarFilme();
    }//GEN-LAST:event_btn_buscarFilmeActionPerformed

    private void btn_buscarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarSerieActionPerformed
        c.BuscarSerie();
    }//GEN-LAST:event_btn_buscarSerieActionPerformed

    private void txt_playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_playlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_playlistActionPerformed

    private void btn_criarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criarPlaylistActionPerformed
        // TODO add your handling code here:
//        c.criarPlaylist();
        
    }//GEN-LAST:event_btn_criarPlaylistActionPerformed

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
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Index().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarFilme;
    private javax.swing.JButton btn_buscarSerie;
    private javax.swing.JButton btn_criarPlaylist;
    private javax.swing.JButton btn_excluirPlaylist;
    private javax.swing.JButton btn_verPlaylist;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_busca;
    private javax.swing.JTextField txt_playlist;
    // End of variables declaration//GEN-END:variables
}
