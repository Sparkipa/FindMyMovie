/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import findmymovie.FindMyMovie;
import classes.Film;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author marco.visalli
 */
public class SelectPathFolder extends javax.swing.JFrame {

    /**
     * Creates new form SelectPathFolder
     */
    public SelectPathFolder() {
        initComponents();
        txtPathFilms.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    search();
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

        pnlBrowse = new javax.swing.JPanel();
        txtPathFilms = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBrowse.setBackground(new java.awt.Color(19, 19, 19));

        txtPathFilms.setBackground(new java.awt.Color(50, 50, 50));
        txtPathFilms.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        txtPathFilms.setForeground(new java.awt.Color(255, 255, 255));
        txtPathFilms.setBorder(null);
        txtPathFilms.setCaretColor(new java.awt.Color(70, 70, 70));

        btnBrowse.setBackground(new java.awt.Color(255, 78, 0));
        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowse.setText("SELECT");
        btnBrowse.setBorder(null);
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/top.png"))); // NOI18N

        btnGO.setBackground(new java.awt.Color(255, 78, 0));
        btnGO.setFont(new java.awt.Font("Raleway", 1, 36)); // NOI18N
        btnGO.setForeground(new java.awt.Color(255, 255, 255));
        btnGO.setText("GO !");
        btnGO.setBorderPainted(false);
        btnGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGOActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(25, 25, 25));
        jLabel2.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selectionnez votre dossier contenant les films");

        javax.swing.GroupLayout pnlBrowseLayout = new javax.swing.GroupLayout(pnlBrowse);
        pnlBrowse.setLayout(pnlBrowseLayout);
        pnlBrowseLayout.setHorizontalGroup(
            pnlBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBrowseLayout.createSequentialGroup()
                .addGroup(pnlBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlBrowseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPathFilms)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlBrowseLayout.createSequentialGroup()
                .addGroup(pnlBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBrowseLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2))
                    .addGroup(pnlBrowseLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnGO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBrowseLayout.setVerticalGroup(
            pnlBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBrowseLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(pnlBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPathFilms, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setDialogTitle("Selectionner le dossier");
        List<String> extensions = Arrays.asList(configs.Config.getExtensions().split(","));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            extensions.get(0) + " - " + extensions.get(1) + " - " + extensions.get(2), extensions.get(0), extensions.get(1), extensions.get(2));

        chooser.setDialogTitle("Open schedule file");
        // set selected filter
        chooser.setFileFilter(filter);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            String filename=f.getAbsolutePath();
            txtPathFilms.setText(filename);
            System.out.println("getSelectedDirectory() : " + chooser.getSelectedFile());

        } else {
            System.out.println("No Selection");
        }
        txtPathFilms.requestFocus();
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnGOActionPerformed(java.awt.event.ActionEvent evt){
        search();
    }
    
    private void search(){
       Path directory = Paths.get(txtPathFilms.getText());
        List<Film> filmTitles = new ArrayList<Film>();
        List<Film> films = new ArrayList<Film>();
        List<String> failFilms = new ArrayList<String>();
        try {
            filmTitles = addTree(directory, filmTitles);
            for (Film title : filmTitles){
                String json = FindMyMovie.getConnexion(title.getTitle());
                Film film = FindMyMovie.generateFilm(json, title.getTitle());
//                film.setPath(title.getPath());
                if (film==null){
                    failFilms.add(title.getPath());
                } else {
                    films.add(film);
                }
            }
            for (String filmFail : failFilms){
                System.out.println("Fail film :"+filmFail);
            }
            this.setVisible(false);
            CriteriaFrame criteriaFrame = new CriteriaFrame(films, failFilms);
            criteriaFrame.setVisible(true);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } 
    }
        
    
    static List<Film> addTree(Path directory, List<Film> films) throws IOException {
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(directory)) {
            for (Path child : ds) {
                if (!Files.isDirectory(child)) {
                    String tempFileName = child.getFileName().toString();
                    String extension = tempFileName.substring(tempFileName.lastIndexOf(".")+1);
                    List<String> extensions = Arrays.asList(configs.Config.getExtensions().split(","));
                    if (extensions.contains(extension)){
                        String filmName = FindMyMovie.extractFilmTitle(tempFileName.substring(0, tempFileName.lastIndexOf(".")));
                        films.add(new Film(filmName, child.getParent().toString()+"\\"+child.getFileName()));
                    }
                } else {
                    addTree(child, films);
                }
            }
            return films;
        } catch (Exception e){
            System.out.println("Error while getting films from the path "+directory);
            System.out.println("Error message : "+e.getMessage());
            return new ArrayList<>();
        }
    }
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
            java.util.logging.Logger.getLogger(SelectPathFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectPathFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectPathFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectPathFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectPathFolder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlBrowse;
    private javax.swing.JTextField txtPathFilms;
    // End of variables declaration//GEN-END:variables
}
