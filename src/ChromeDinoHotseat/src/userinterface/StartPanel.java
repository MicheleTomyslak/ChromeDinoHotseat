/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

/**
 *
 * @author michele.tomyslak
 */
public class StartPanel extends javax.swing.JPanel {

    /**
     * Creates new form StartPanel
     */
    public StartPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        characterChooser1 = new userinterface.CharacterChooser();
        characterChooser2 = new userinterface.CharacterChooser();
        characterChooser3 = new userinterface.CharacterChooser();
        characterChooser4 = new userinterface.CharacterChooser();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(characterChooser1);
        add(characterChooser2);
        add(characterChooser3);
        add(characterChooser4);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private userinterface.CharacterChooser characterChooser1;
    private userinterface.CharacterChooser characterChooser2;
    private userinterface.CharacterChooser characterChooser3;
    private userinterface.CharacterChooser characterChooser4;
    // End of variables declaration//GEN-END:variables
}