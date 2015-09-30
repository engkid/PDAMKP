package image;

import classpdam.Class_Printer;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sleepy
 */
public class UI_PrintFormF4 extends javax.swing.JFrame {

    /**
     * Creates new form printForm
     */
    public UI_PrintFormF4() {
        initComponents();
        mainPanel.setSize(new Dimension(657, 1032));
        mainPanel.setLayout(new FlowLayout());
    }

    private void tombolPrint(){
                int index = LS_NamaPegawai.getSelectedIndex();
        Class_dt_fungsional dt_fung = new Class_dt_fungsional(Integer.parseInt(S_Tahun.getValue().toString()), unit);
        Class_dt_pribadi dt_pri = new Class_dt_pribadi();
        Class_vr_unit unit = new Class_vr_unit();
        Class_vr_jabfung jabfung = new Class_vr_jabfung();
        if (index > -1) {
            if (!LS_NamaPegawai.getSelectedValue().toString().equals("--Tidak ada--")) {
                String nipy = dt_fung.getNIPY(index);
                UI_PrintFormF4 yourComponent = new UI_PrintFormF4();
                Panel_PrintF4_Fungsional lastPanel = new Panel_PrintF4_Fungsional();
                String sUnit = unit.getNama(dt_fung.getUnit(index));
                String sUnit2 = unit.getNama2(dt_fung.getUnit(index));
                String sNama = dt_pri.getNama(nipy);
                String sJabatan = jabfung.getNama(dt_fung.getJabatan(index));
                String sTMT = DateFormat.format(dt_fung.getTMT(index));
                String sBulan = String.valueOf(dt_fung.getTMT(index).getMonth());
                String sTahun = String.valueOf(dt_fung.getTMT(index).getYear());
                System.err.println("Bulan : " + sBulan);
                System.err.println("Tahun : " + sTahun);
                lastPanel.setVal(status, sNama, nipy, sUnit, sUnit2, sJabatan, sTMT, sBulan, sTahun);
                yourComponent.mainPanel.add(lastPanel);
                yourComponent.mainPanel.repaint();
                yourComponent.mainPanel.validate();
                yourComponent.setVisible(true);
                PrinterJob pj = PrinterJob.getPrinterJob();
                if (pj.printDialog()) {
                    PageFormat pf = pj.defaultPage();
                    Paper paper = pf.getPaper();
                    double width = 8.27d * 72d;
                    double height = 12.99d * 72d;
                    double margin = 0;
                    paper.setSize(width, height);
                    paper.setImageableArea(
                            margin,
                            margin,
                            width - (margin * 2),
                            height - (margin * 2));
                    pf.setOrientation(PageFormat.PORTRAIT);
                    pf.setPaper(paper);

                    pj.setPrintable(new Class_Printer(lastPanel), pf);

                    try {
                        pj.print();
                    } catch (PrinterException ex) {
                        ex.printStackTrace();
                    } finally {
                        yourComponent.dispose();
                    }
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(657, 1031));
        mainPanel.setMinimumSize(new java.awt.Dimension(657, 1031));
        mainPanel.setPreferredSize(new java.awt.Dimension(657, 1031));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_PrintFormF4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UI_PrintFormF4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}