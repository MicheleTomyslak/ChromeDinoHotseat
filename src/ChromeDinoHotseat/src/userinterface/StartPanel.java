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

        mainCharacter1 = new gameobject.MainCharacter();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new java.awt.GridLayout(16, 9));

        mainCharacter1.setLayout(new java.awt.BorderLayout());
        add(mainCharacter1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gameobject.MainCharacter mainCharacter1;
    // End of variables declaration//GEN-END:variables
}
