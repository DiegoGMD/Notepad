/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.notepad;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOException;
import javax.swing.*;

public class notePad extends javax.swing.JFrame {

    private File file = null;
    
    public notePad() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonNew = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonSaveAs = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemNew = new javax.swing.JMenuItem();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemLanguage = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar1.setRollover(true);

        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-archivo-16.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("properties/Bundle"); // NOI18N
        jButtonNew.setText(bundle.getString("notePad.jButtonNew.text")); // NOI18N
        jButtonNew.setFocusable(false);
        jButtonNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonNew);

        jButtonOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-carpeta-48.png"))); // NOI18N
        jButtonOpen.setText(bundle.getString("notePad.jButtonOpen.text")); // NOI18N
        jButtonOpen.setFocusable(false);
        jButtonOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonOpen);

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-guardar-16.png"))); // NOI18N
        jButtonSave.setText(bundle.getString("notePad.jButtonSave.text")); // NOI18N
        jButtonSave.setFocusable(false);
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSave);

        jButtonSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-guardar-como-16.png"))); // NOI18N
        jButtonSaveAs.setText(bundle.getString("notePad.jButtonSaveAs.text")); // NOI18N
        jButtonSaveAs.setFocusable(false);
        jButtonSaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSaveAs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveAsActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSaveAs);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu3.setText(bundle.getString("notePad.jMenu3.text")); // NOI18N

        jMenuItemNew.setText(bundle.getString("notePad.jMenuItemNew.text")); // NOI18N
        jMenuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemNew);

        jMenuItemOpen.setText(bundle.getString("notePad.jMenuItemOpen.text")); // NOI18N
        jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemOpen);

        jMenuItemSave.setText(bundle.getString("notePad.jMenuItemSave.text")); // NOI18N
        jMenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemSave);

        jMenuItemSaveAs.setText(bundle.getString("notePad.jMenuItemSaveAs.text")); // NOI18N
        jMenuItemSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveAsActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemSaveAs);
        jMenu3.add(jSeparator1);

        jMenuItemLanguage.setText(bundle.getString("notePad.jMenuItemLanguage.text")); // NOI18N
        jMenuItemLanguage.setActionCommand(bundle.getString("notePad.jMenuItemLanguage.actionCommand")); // NOI18N
        jMenu3.add(jMenuItemLanguage);
        jMenu3.add(jSeparator2);

        jMenuItemExit.setText(bundle.getString("notePad.jMenuItemExit.text")); // NOI18N
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemExit);

        jMenuBar2.add(jMenu3);

        jMenu4.setText(bundle.getString("notePad.jMenu4.text")); // NOI18N
        jMenuBar2.add(jMenu4);

        jMenu2.setText(bundle.getString("notePad.jMenu2.text")); // NOI18N
        jMenuBar2.add(jMenu2);

        jMenu1.setText(bundle.getString("notePad.jMenu1.text")); // NOI18N
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveAsActionPerformed
        load();
    }//GEN-LAST:event_jMenuItemSaveAsActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenActionPerformed
        load();
    }//GEN-LAST:event_jMenuItemOpenActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        newFile();
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenActionPerformed
        load();
    }//GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveAsActionPerformed
        try {
            saveFileAs();
        } catch (IOException ex) {
            Logger.getLogger(notePad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSaveAsActionPerformed

    private void jMenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewActionPerformed
        newFile();
    }//GEN-LAST:event_jMenuItemNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        try {
            saveFile();
        } catch (IOException ex) {
            Logger.getLogger(notePad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveActionPerformed
        try {
            saveFile();
        } catch (IOException ex) {
            Logger.getLogger(notePad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemSaveActionPerformed

    private void load(){
        JFileChooser chooser = new JFileChooser();/*
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);*/
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            setTitle(file.getName());
            try {
                openFile(file);
            } catch (IOException ex){
                System.err.println("ERROR - Can't open file");
            }
        }
    }
    
    private void openFile(File file) throws IOException {
        BufferedReader input = null;
        /*String fileTye = Files.probeContentType(Path.of(file.getAbsolutePath()));
        if (!fileTye.equals("text/plain")) {
            throw new IOException("Not a text file");
        }*/
        try{
            input = new BufferedReader(new FileReader(file));
            String line;
            String text = "";
            while ((line = input.readLine()) != null){
                text += line + "\n";
            }
            jTextArea1.setText(text);
        } finally {
            if (input != null){
                input.close();
            }
        }
    }
    
    private void saveFile() throws IOException {
        PrintWriter output = null;
        JFileChooser chooser = new JFileChooser();
        try {
            output = new PrintWriter(new FileWriter(file));
            String text = jTextArea1.getText();
            output.print(text);
        } finally {
            if (output != null){
                output.close();
            }
        }
    }
    
    private void saveFileAs() throws IOException {
        PrintWriter output = null;
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                output = new PrintWriter(new FileWriter(file));
                String text = jTextArea1.getText();
                output.print(text);
            } finally {
                if (output != null){
                    output.close();
                }
            }
        }
    }
    
    private void newFile(){
        jTextArea1.setText("");
        setTitle(" ");
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
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSaveAs;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemLanguage;
    private javax.swing.JMenuItem jMenuItemNew;
    private javax.swing.JMenuItem jMenuItemOpen;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenuItem jMenuItemSaveAs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
