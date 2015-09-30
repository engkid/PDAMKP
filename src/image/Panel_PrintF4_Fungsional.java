package image;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sleepy
 */
public class Panel_PrintF4_Fungsional extends javax.swing.JPanel {

    /**
     * Creates new form printPanel
     */
    public Panel_PrintF4_Fungsional() {
        initComponents();
    }

    public void setVal(boolean kelompok, String nama, String nipy, String unit, String unit2, String jabatan, String tmt, String bulan, String tahun) {
        TP_Header_Jabatan_Unit(kelompok, unit);
        TP_Unit_KelompokJabatan_Status_TMT(kelompok, unit, unit2, tmt, bulan, tahun);
        TP_Nama(nama);
        TP_NIPY(nipy);
        TP_Jabatan(jabatan);
        TP_Unit(unit);
        L_TMT.setText(tmt);
        TP_MenimbangA(kelompok, unit);
        TP_Kedua(unit);
    }

    private void TP_Nama(String val) {
        try {
            StyledDocument doc = TP_Nama.getStyledDocument();
            doc.remove(0, doc.getLength());
            doc.insertString(0, val, null);
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TP_NIPY(String val) {
        try {
            StyledDocument doc = TP_NIPY.getStyledDocument();
            doc.remove(0, doc.getLength());
            doc.insertString(0, val, null);
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TP_Jabatan(String val) {
        try {
            StyledDocument doc = TP_Jabatan.getStyledDocument();
            doc.remove(0, doc.getLength());
            doc.insertString(0, val, null);
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TP_Unit(String val) {
        val = val + " Al-Musaddadiyah Garut";
        try {
            StyledDocument doc = TP_Unit.getStyledDocument();
            doc.remove(0, doc.getLength());
            doc.insertString(0, val, null);
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TP_MenimbangA(boolean kelompok, String unit) {
        try {
            String jabatan;
            if (kelompok == true) {//struktural
                jabatan = "Struktural Tetap";
            } else {
                jabatan = "Fungsional Tetap";
            }
            StyledDocument doc = TP_MenimbangA.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_JUSTIFIED);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
            String text = doc.getText(0, doc.getLength());
            text = text.replace("Unit_Pendidikan", unit);
            text = text.replace("KelompokJabatan_Status", jabatan);
            doc.remove(0, doc.getLength());
            doc.insertString(0, text, null);
            TP_MenimbangA.setDocument(doc);
            TP_MenimbangA.validate();
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TP_Kedua(String unit) {
        try {
            StyledDocument doc = TP_Kedua.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_JUSTIFIED);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
            String text = doc.getText(0, doc.getLength());
            text = text.replace("Unit_Pendidikan", unit);
            doc.remove(0, doc.getLength());
            doc.insertString(0, text, null);
            TP_Kedua.setDocument(doc);
            TP_Kedua.validate();
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TP_Header_Jabatan_Unit(boolean kelompok, String unit) {
        try {
            String jabatan;
            if (kelompok == true) {//struktural
                jabatan = "STRUKTURAL TETAP";
            } else {
                jabatan = "FUNGSIONAL TETAP";
            }
            StyledDocument doc = TP_Header_Jabatan_Unit.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
            String text = doc.getText(0, doc.getLength());
            text = text.replace("Unit_Pendidikan", unit.toUpperCase());
            text = text.replace("KelompokJabatan_Status", jabatan);
            doc.remove(0, doc.getLength());
            doc.insertString(0, text, null);
            TP_Header_Jabatan_Unit.setDocument(doc);
            TP_Header_Jabatan_Unit.validate();
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TP_Unit_KelompokJabatan_Status_TMT(boolean kelompok, String unit, String unit2, String tmt, String bulan, String tahun) {
        try {
            String jabatan;
            if (kelompok == true) {//struktural
                jabatan = "Struktural Tetap";
            } else {
                jabatan = "Fungsional Tetap";
            }
            StyledDocument doc = TP_Unit_KelompokJabatan_Status_TMT.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_JUSTIFIED);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
            String text = doc.getText(0, doc.getLength());
            text = text.replace("Unit_Pendidikan", unit);
            text = text.replace("KelompokJabatan_Status", jabatan);
            text = text.replace("TMT", tmt);
            text = text.replace("NNama", unit2);
            text = text.replace("BBulan", bulan);
            text = text.replace("TTahun", tahun);
            doc.remove(0, doc.getLength());
            doc.insertString(0, text, null);
            TP_Unit_KelompokJabatan_Status_TMT.setDocument(doc);
            TP_Unit_KelompokJabatan_Status_TMT.validate();
        } catch (BadLocationException ex) {
            Logger.getLogger(Panel_PrintF4_Fungsional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void L_TMT2(String val) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        L_TMT = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea27 = new javax.swing.JTextArea();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        TP_Kedua = new javax.swing.JTextPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextArea29 = new javax.swing.JTextArea();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextArea30 = new javax.swing.JTextArea();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextPane12 = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextArea31 = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextArea32 = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextPane13 = new javax.swing.JTextPane();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextArea33 = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea34 = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextPane14 = new javax.swing.JTextPane();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea35 = new javax.swing.JTextArea();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextArea36 = new javax.swing.JTextArea();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextPane15 = new javax.swing.JTextPane();
        jScrollPane43 = new javax.swing.JScrollPane();
        TP_MenimbangA = new javax.swing.JTextPane();
        jScrollPane45 = new javax.swing.JScrollPane();
        TP_Unit_KelompokJabatan_Status_TMT = new javax.swing.JTextPane();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextArea37 = new javax.swing.JTextArea();
        jScrollPane47 = new javax.swing.JScrollPane();
        TP_Nama = new javax.swing.JTextPane();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextPane19 = new javax.swing.JTextPane();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextArea38 = new javax.swing.JTextArea();
        jScrollPane50 = new javax.swing.JScrollPane();
        TP_NIPY = new javax.swing.JTextPane();
        jScrollPane51 = new javax.swing.JScrollPane();
        TP_Jabatan = new javax.swing.JTextPane();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextArea39 = new javax.swing.JTextArea();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTextPane22 = new javax.swing.JTextPane();
        jScrollPane54 = new javax.swing.JScrollPane();
        TP_Unit = new javax.swing.JTextPane();
        jScrollPane55 = new javax.swing.JScrollPane();
        jTextArea40 = new javax.swing.JTextArea();
        jScrollPane56 = new javax.swing.JScrollPane();
        jTextPane24 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TP_Header_Jabatan_Unit = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setFocusable(false);
        mainPanel.setMaximumSize(new java.awt.Dimension(657, 1031));
        mainPanel.setMinimumSize(new java.awt.Dimension(657, 1031));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/printing/Header2.png"))); // NOI18N
        jLabel6.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("KEPUTUSAN BADAN PENGURUS");
        jLabel7.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<HTML><U>YAYASAN AL-MUSADDADIYAH GARUT</U></HTML>");
        jLabel9.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nomor : 82/YAM/Pgr./Kep./IV/2015 ");
        jLabel10.setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        jLabel45.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("MEMUTUSKAN");
        jLabel45.setFocusable(false);

        jLabel81.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel81.setText("Ditetapkan di");
        jLabel81.setFocusable(false);

        jLabel82.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel82.setText("Pada tanggal");
        jLabel82.setFocusable(false);

        jLabel83.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel83.setText(":");
        jLabel83.setFocusable(false);

        jLabel84.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel84.setText(":");
        jLabel84.setFocusable(false);

        jLabel85.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel85.setText("Garut");
        jLabel85.setFocusable(false);

        L_TMT.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        L_TMT.setText("01 Desember 2015");
        L_TMT.setFocusable(false);

        jLabel87.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Badan Pengurus,");
        jLabel87.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFocusable(false);

        jLabel89.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Sekretaris Umum,");
        jLabel89.setFocusable(false);

        jLabel91.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("<HTML><U>Prof. DR. H. M. Ali Ramdhani, STP., MT.</U></HTML>");
        jLabel91.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel89)
                .addGap(18, 62, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFocusable(false);

        jLabel88.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Ketua Umum,");
        jLabel88.setFocusable(false);

        jLabel90.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("<HTML><U>Prof. DR. Hj. Ummu Salamah, MS.</U></HTML>");
        jLabel90.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel92.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel92.setText("Tembusan dengan hormat disampaikan kepada :");
        jLabel92.setFocusable(false);

        jLabel93.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel93.setText("Kepala Kantor Dinas Pendidikan Kabupaten Garut");
        jLabel93.setFocusable(false);

        jLabel94.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel94.setText("Yang bersangkutan");
        jLabel94.setFocusable(false);

        jLabel95.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel95.setText("Pertinggal.");
        jLabel95.setFocusable(false);

        jLabel96.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel96.setText("1.");
        jLabel96.setFocusable(false);

        jLabel97.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel97.setText("2.");
        jLabel97.setFocusable(false);

        jLabel98.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel98.setText("3.");
        jLabel98.setFocusable(false);

        jScrollPane10.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setFocusable(false);

        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea10.setLineWrap(true);
        jTextArea10.setRows(5);
        jTextArea10.setText("a.");
        jTextArea10.setWrapStyleWord(true);
        jTextArea10.setFocusable(false);
        jTextArea10.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane10.setViewportView(jTextArea10);

        jScrollPane11.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setFocusable(false);

        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jTextArea11.setLineWrap(true);
        jTextArea11.setRows(5);
        jTextArea11.setText("Menimbang");
        jTextArea11.setWrapStyleWord(true);
        jTextArea11.setFocusable(false);
        jTextArea11.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane11.setViewportView(jTextArea11);

        jScrollPane12.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane12.setFocusable(false);

        jTextArea12.setColumns(20);
        jTextArea12.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea12.setLineWrap(true);
        jTextArea12.setRows(5);
        jTextArea12.setText(":");
        jTextArea12.setWrapStyleWord(true);
        jTextArea12.setFocusable(false);
        jTextArea12.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane12.setViewportView(jTextArea12);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setFocusable(false);

        jTextPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane2.setContentType("text/html"); // NOI18N
        jTextPane2.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane2.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Bahwa dalam kegiatan tersebut dipandang perlu dibuat dan ditetapkan Surat Keputusan.</div>"); // NOI18N
        jTextPane2.setFocusable(false);
        jTextPane2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane2.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane2.setViewportView(jTextPane2);

        jScrollPane13.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane13.setFocusable(false);

        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea13.setLineWrap(true);
        jTextArea13.setRows(5);
        jTextArea13.setText("b.");
        jTextArea13.setWrapStyleWord(true);
        jTextArea13.setFocusable(false);
        jTextArea13.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane13.setViewportView(jTextArea13);

        jScrollPane14.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane14.setFocusable(false);

        jTextArea14.setColumns(20);
        jTextArea14.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jTextArea14.setLineWrap(true);
        jTextArea14.setRows(5);
        jTextArea14.setText("Mengingat");
        jTextArea14.setWrapStyleWord(true);
        jTextArea14.setFocusable(false);
        jTextArea14.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane14.setViewportView(jTextArea14);

        jScrollPane15.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane15.setFocusable(false);

        jTextArea15.setColumns(20);
        jTextArea15.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea15.setLineWrap(true);
        jTextArea15.setRows(5);
        jTextArea15.setText(":");
        jTextArea15.setWrapStyleWord(true);
        jTextArea15.setFocusable(false);
        jTextArea15.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane15.setViewportView(jTextArea15);

        jScrollPane17.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane17.setFocusable(false);

        jTextArea17.setColumns(20);
        jTextArea17.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea17.setLineWrap(true);
        jTextArea17.setRows(5);
        jTextArea17.setText("1.");
        jTextArea17.setWrapStyleWord(true);
        jTextArea17.setFocusable(false);
        jTextArea17.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane17.setViewportView(jTextArea17);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setFocusable(false);

        jTextPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane3.setContentType("text/html"); // NOI18N
        jTextPane3.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane3.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Bahwa dalam kegiatan tersebut dipandang perlu dibuat dan ditetapkan Surat Keputusan.</div>"); // NOI18N
        jTextPane3.setFocusable(false);
        jTextPane3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane3.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane3.setViewportView(jTextPane3);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane5.setFocusable(false);

        jTextPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane5.setContentType("text/html"); // NOI18N
        jTextPane5.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane5.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Undang-Undang Nomor 28 tahun 2004 tentang Perubahan Undang-Undang Nomor 16 tahun 2001 tentang Yayasan;</div>"); // NOI18N
        jTextPane5.setFocusable(false);
        jTextPane5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane5.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane5.setViewportView(jTextPane5);

        jScrollPane18.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane18.setFocusable(false);

        jTextArea18.setColumns(20);
        jTextArea18.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea18.setLineWrap(true);
        jTextArea18.setRows(5);
        jTextArea18.setText("2.");
        jTextArea18.setWrapStyleWord(true);
        jTextArea18.setFocusable(false);
        jTextArea18.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane18.setViewportView(jTextArea18);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane6.setFocusable(false);

        jTextPane6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane6.setContentType("text/html"); // NOI18N
        jTextPane6.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane6.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Surat Keputusan Menteri Hukum dan Hak Asasi Manusia Nomor : C.2055-HT.01.02.TH.2007 Tentang Pengesahan Akta Pendirian Yayasan Al-Musaddadiyah;</div>"); // NOI18N
        jTextPane6.setFocusable(false);
        jTextPane6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane6.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane6.setViewportView(jTextPane6);

        jScrollPane19.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane19.setFocusable(false);

        jTextArea19.setColumns(20);
        jTextArea19.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea19.setLineWrap(true);
        jTextArea19.setRows(5);
        jTextArea19.setText("3.");
        jTextArea19.setWrapStyleWord(true);
        jTextArea19.setFocusable(false);
        jTextArea19.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane19.setViewportView(jTextArea19);

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane7.setFocusable(false);

        jTextPane7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane7.setContentType("text/html"); // NOI18N
        jTextPane7.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane7.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Surat Keputusan Menteri Hukum dan HAM RI Nomor : AHU-8478.AH.01.05. Tahun 2012 Tentang Persetujuan Perubahan Anggaran Dasar Yayasan;</div>"); // NOI18N
        jTextPane7.setFocusable(false);
        jTextPane7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane7.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane7.setViewportView(jTextPane7);

        jScrollPane20.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane20.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane20.setFocusable(false);

        jTextArea20.setColumns(20);
        jTextArea20.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea20.setLineWrap(true);
        jTextArea20.setRows(5);
        jTextArea20.setText("4.");
        jTextArea20.setWrapStyleWord(true);
        jTextArea20.setFocusable(false);
        jTextArea20.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane20.setViewportView(jTextArea20);

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane8.setFocusable(false);

        jTextPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane8.setContentType("text/html"); // NOI18N
        jTextPane8.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane8.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Surat Keputusan Ketua Yayasan tentang Struktur Organisasi dan Tata Kerja (SOTK) pada unit-unit pendidikan di lingkungan Yayasan Al-Musaddadiyah Garut Nomor : 101/YAM/P.1/III/K/2003;</div>"); // NOI18N
        jTextPane8.setFocusable(false);
        jTextPane8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane8.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane8.setViewportView(jTextPane8);

        jScrollPane21.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane21.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane21.setFocusable(false);

        jTextArea21.setColumns(20);
        jTextArea21.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea21.setLineWrap(true);
        jTextArea21.setRows(5);
        jTextArea21.setText("5.");
        jTextArea21.setWrapStyleWord(true);
        jTextArea21.setFocusable(false);
        jTextArea21.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane21.setViewportView(jTextArea21);

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane9.setFocusable(false);

        jTextPane9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane9.setContentType("text/html"); // NOI18N
        jTextPane9.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane9.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Surat Keputusan Badan Pembina Yayasan tentang Pengangkatan Badan Pengurus Yayasan periode 2012 – 2017 Nomor : 08/YAM/Pmb./Kep./VI/2012.</div>"); // NOI18N
        jTextPane9.setFocusable(false);
        jTextPane9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane9.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane9.setViewportView(jTextPane9);

        jScrollPane22.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane22.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane22.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane22.setFocusable(false);

        jTextArea22.setColumns(20);
        jTextArea22.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea22.setLineWrap(true);
        jTextArea22.setRows(5);
        jTextArea22.setText("6.");
        jTextArea22.setWrapStyleWord(true);
        jTextArea22.setFocusable(false);
        jTextArea22.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane22.setViewportView(jTextArea22);

        jScrollPane16.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setFocusable(false);

        jTextArea16.setColumns(20);
        jTextArea16.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jTextArea16.setLineWrap(true);
        jTextArea16.setRows(5);
        jTextArea16.setText("Memperhatikan");
        jTextArea16.setWrapStyleWord(true);
        jTextArea16.setFocusable(false);
        jTextArea16.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane16.setViewportView(jTextArea16);

        jScrollPane23.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane23.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane23.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane23.setFocusable(false);

        jTextArea23.setColumns(20);
        jTextArea23.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea23.setLineWrap(true);
        jTextArea23.setRows(5);
        jTextArea23.setText(":");
        jTextArea23.setWrapStyleWord(true);
        jTextArea23.setFocusable(false);
        jTextArea23.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane23.setViewportView(jTextArea23);

        jScrollPane24.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane24.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane24.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane24.setFocusable(false);

        jTextArea24.setColumns(20);
        jTextArea24.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea24.setLineWrap(true);
        jTextArea24.setRows(5);
        jTextArea24.setText("1.");
        jTextArea24.setWrapStyleWord(true);
        jTextArea24.setFocusable(false);
        jTextArea24.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane24.setViewportView(jTextArea24);

        jScrollPane25.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane25.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane25.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane25.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane25.setFocusable(false);

        jTextArea25.setColumns(20);
        jTextArea25.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jTextArea25.setLineWrap(true);
        jTextArea25.setRows(5);
        jTextArea25.setText("Menentapkan");
        jTextArea25.setWrapStyleWord(true);
        jTextArea25.setFocusable(false);
        jTextArea25.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane25.setViewportView(jTextArea25);

        jScrollPane26.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane26.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane26.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane26.setFocusable(false);

        jTextArea26.setColumns(20);
        jTextArea26.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea26.setLineWrap(true);
        jTextArea26.setRows(5);
        jTextArea26.setText(":");
        jTextArea26.setWrapStyleWord(true);
        jTextArea26.setFocusable(false);
        jTextArea26.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane26.setViewportView(jTextArea26);

        jScrollPane27.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane27.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane27.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane27.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane27.setFocusable(false);

        jTextArea27.setColumns(20);
        jTextArea27.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea27.setLineWrap(true);
        jTextArea27.setRows(5);
        jTextArea27.setText("Pertama");
        jTextArea27.setWrapStyleWord(true);
        jTextArea27.setFocusable(false);
        jTextArea27.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane27.setViewportView(jTextArea27);

        jScrollPane28.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane28.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane28.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane28.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane28.setFocusable(false);

        jTextArea28.setColumns(20);
        jTextArea28.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea28.setLineWrap(true);
        jTextArea28.setRows(5);
        jTextArea28.setText(":");
        jTextArea28.setWrapStyleWord(true);
        jTextArea28.setFocusable(false);
        jTextArea28.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane28.setViewportView(jTextArea28);

        jScrollPane29.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane29.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane29.setFocusable(false);

        jTextPane10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane10.setContentType("text/html"); // NOI18N
        jTextPane10.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane10.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Terhitung mulai tanggal ditetapkannya keputusan ini, mengangkat sebagai Pegawai Struktural Tetap kepada :</div>"); // NOI18N
        jTextPane10.setFocusable(false);
        jTextPane10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane10.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane29.setViewportView(jTextPane10);

        jScrollPane30.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane30.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane30.setFocusable(false);

        TP_Kedua.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_Kedua.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        TP_Kedua.setText("Yang bersangkutan mempertanggung jawabkan tugas pekerjaannya kepada Kepala Unit_Pendidikan Al-Musaddadiyah Garut."); // NOI18N
        TP_Kedua.setFocusable(false);
        TP_Kedua.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_Kedua.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane30.setViewportView(TP_Kedua);

        jScrollPane31.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane31.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane31.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane31.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane31.setFocusable(false);

        jTextArea29.setColumns(20);
        jTextArea29.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea29.setLineWrap(true);
        jTextArea29.setRows(5);
        jTextArea29.setText("Kedua");
        jTextArea29.setWrapStyleWord(true);
        jTextArea29.setFocusable(false);
        jTextArea29.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane31.setViewportView(jTextArea29);

        jScrollPane32.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane32.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane32.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane32.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane32.setFocusable(false);

        jTextArea30.setColumns(20);
        jTextArea30.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea30.setLineWrap(true);
        jTextArea30.setRows(5);
        jTextArea30.setText(":");
        jTextArea30.setWrapStyleWord(true);
        jTextArea30.setFocusable(false);
        jTextArea30.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane32.setViewportView(jTextArea30);

        jScrollPane33.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane33.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane33.setFocusable(false);

        jTextPane12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane12.setContentType("text/html"); // NOI18N
        jTextPane12.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane12.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Yang bersangkutan diberikan hak menerima kesejahteraan berupa honor, bonus dan insentif lainnya sesuai dengan peraturan yang berlaku.</div>"); // NOI18N
        jTextPane12.setFocusable(false);
        jTextPane12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane12.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane33.setViewportView(jTextPane12);

        jScrollPane34.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane34.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane34.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane34.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane34.setFocusable(false);

        jTextArea31.setColumns(20);
        jTextArea31.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea31.setLineWrap(true);
        jTextArea31.setRows(5);
        jTextArea31.setText("Ketiga");
        jTextArea31.setWrapStyleWord(true);
        jTextArea31.setFocusable(false);
        jTextArea31.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane34.setViewportView(jTextArea31);

        jScrollPane35.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane35.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane35.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane35.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane35.setFocusable(false);

        jTextArea32.setColumns(20);
        jTextArea32.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea32.setLineWrap(true);
        jTextArea32.setRows(5);
        jTextArea32.setText(":");
        jTextArea32.setWrapStyleWord(true);
        jTextArea32.setFocusable(false);
        jTextArea32.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane35.setViewportView(jTextArea32);

        jScrollPane36.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane36.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane36.setFocusable(false);

        jTextPane13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane13.setContentType("text/html"); // NOI18N
        jTextPane13.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane13.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Apabila dikemudian hari ternyata terdapat kekeliruan dalam keputusan ini, akan diadakan perbaikan sebagaimana mestinya.</div>"); // NOI18N
        jTextPane13.setFocusable(false);
        jTextPane13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane13.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane36.setViewportView(jTextPane13);

        jScrollPane37.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane37.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane37.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane37.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane37.setFocusable(false);

        jTextArea33.setColumns(20);
        jTextArea33.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea33.setLineWrap(true);
        jTextArea33.setRows(5);
        jTextArea33.setText("Keempat");
        jTextArea33.setWrapStyleWord(true);
        jTextArea33.setFocusable(false);
        jTextArea33.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane37.setViewportView(jTextArea33);

        jScrollPane38.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane38.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane38.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane38.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane38.setFocusable(false);

        jTextArea34.setColumns(20);
        jTextArea34.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea34.setLineWrap(true);
        jTextArea34.setRows(5);
        jTextArea34.setText(":");
        jTextArea34.setWrapStyleWord(true);
        jTextArea34.setFocusable(false);
        jTextArea34.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane38.setViewportView(jTextArea34);

        jScrollPane39.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane39.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane39.setFocusable(false);

        jTextPane14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane14.setContentType("text/html"); // NOI18N
        jTextPane14.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane14.setText("<div style=\"text-align: justify;font-family: Arial;font-size: 9.0pt;\">Keputusan ini berlaku selama satu (1) tahun sejak tanggal ditetapkan dan disampaikan kepada yang bersangkutan serta yang berkepentingan untuk diketahui dan dipergunakan sebagaimana mestinya.</div>"); // NOI18N
        jTextPane14.setFocusable(false);
        jTextPane14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane14.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane39.setViewportView(jTextPane14);

        jScrollPane40.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane40.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane40.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane40.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane40.setFocusable(false);

        jTextArea35.setColumns(20);
        jTextArea35.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea35.setLineWrap(true);
        jTextArea35.setRows(5);
        jTextArea35.setText("Kelima");
        jTextArea35.setWrapStyleWord(true);
        jTextArea35.setFocusable(false);
        jTextArea35.setMargin(new java.awt.Insets(2, 0, 0, 0));
        jScrollPane40.setViewportView(jTextArea35);

        jScrollPane41.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane41.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane41.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane41.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane41.setFocusable(false);

        jTextArea36.setColumns(20);
        jTextArea36.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea36.setLineWrap(true);
        jTextArea36.setRows(5);
        jTextArea36.setText(":");
        jTextArea36.setWrapStyleWord(true);
        jTextArea36.setFocusable(false);
        jTextArea36.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane41.setViewportView(jTextArea36);

        jScrollPane42.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane42.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane42.setFocusable(false);

        jTextPane15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane15.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane15.setText("Nama"); // NOI18N
        jTextPane15.setFocusable(false);
        jTextPane15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane15.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane42.setViewportView(jTextPane15);

        jScrollPane43.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane43.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane43.setFocusable(false);

        TP_MenimbangA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_MenimbangA.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        TP_MenimbangA.setText("Bahwa sebagai pelaksanaan dari Keputusan Menteri Negara Pendayagunaan Aparatur Negara Nomor : 19/MENPAN/1989 tanggal 30 Januari 1989, dipandang perlu untuk Mengangkat Pegawai KelompokJabatan_Status pada Unit_Pendidikan Al-Musaddadiyah Garut;"); // NOI18N
        TP_MenimbangA.setFocusable(false);
        TP_MenimbangA.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_MenimbangA.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane43.setViewportView(TP_MenimbangA);

        jScrollPane45.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane45.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane45.setFocusable(false);

        TP_Unit_KelompokJabatan_Status_TMT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_Unit_KelompokJabatan_Status_TMT.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        TP_Unit_KelompokJabatan_Status_TMT.setText("Permohonan Kepala Unit_Pendidikan Tentang Penetapan Surat Keputusan Yayasan untuk Pegawai KelompokJabatan_Status Nomor : 065/06.4./NNama/BBulan/TTahun tanggal TMT;"); // NOI18N
        TP_Unit_KelompokJabatan_Status_TMT.setFocusable(false);
        TP_Unit_KelompokJabatan_Status_TMT.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_Unit_KelompokJabatan_Status_TMT.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane45.setViewportView(TP_Unit_KelompokJabatan_Status_TMT);

        jScrollPane46.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane46.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane46.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane46.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane46.setFocusable(false);

        jTextArea37.setColumns(20);
        jTextArea37.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea37.setLineWrap(true);
        jTextArea37.setRows(5);
        jTextArea37.setText(":");
        jTextArea37.setWrapStyleWord(true);
        jTextArea37.setFocusable(false);
        jTextArea37.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane46.setViewportView(jTextArea37);

        jScrollPane47.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane47.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane47.setFocusable(false);

        TP_Nama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_Nama.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        TP_Nama.setText("Nama"); // NOI18N
        TP_Nama.setFocusable(false);
        TP_Nama.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_Nama.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane47.setViewportView(TP_Nama);

        jScrollPane48.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane48.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane48.setFocusable(false);

        jTextPane19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane19.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane19.setText("NIPY / NIP"); // NOI18N
        jTextPane19.setFocusable(false);
        jTextPane19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane19.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane48.setViewportView(jTextPane19);

        jScrollPane49.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane49.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane49.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane49.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane49.setFocusable(false);

        jTextArea38.setColumns(20);
        jTextArea38.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea38.setLineWrap(true);
        jTextArea38.setRows(5);
        jTextArea38.setText(":");
        jTextArea38.setWrapStyleWord(true);
        jTextArea38.setFocusable(false);
        jTextArea38.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane49.setViewportView(jTextArea38);

        jScrollPane50.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane50.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane50.setFocusable(false);

        TP_NIPY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_NIPY.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        TP_NIPY.setText("Nama"); // NOI18N
        TP_NIPY.setFocusable(false);
        TP_NIPY.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_NIPY.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane50.setViewportView(TP_NIPY);

        jScrollPane51.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane51.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane51.setFocusable(false);

        TP_Jabatan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_Jabatan.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        TP_Jabatan.setText("Nama"); // NOI18N
        TP_Jabatan.setFocusable(false);
        TP_Jabatan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_Jabatan.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane51.setViewportView(TP_Jabatan);

        jScrollPane52.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane52.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane52.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane52.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane52.setFocusable(false);

        jTextArea39.setColumns(20);
        jTextArea39.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea39.setLineWrap(true);
        jTextArea39.setRows(5);
        jTextArea39.setText(":");
        jTextArea39.setWrapStyleWord(true);
        jTextArea39.setFocusable(false);
        jTextArea39.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane52.setViewportView(jTextArea39);

        jScrollPane53.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane53.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane53.setFocusable(false);

        jTextPane22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane22.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane22.setText("Jabatan"); // NOI18N
        jTextPane22.setFocusable(false);
        jTextPane22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane22.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane53.setViewportView(jTextPane22);

        jScrollPane54.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane54.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane54.setFocusable(false);

        TP_Unit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_Unit.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        TP_Unit.setText("Nama"); // NOI18N
        TP_Unit.setFocusable(false);
        TP_Unit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_Unit.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane54.setViewportView(TP_Unit);

        jScrollPane55.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane55.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane55.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane55.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane55.setFocusable(false);

        jTextArea40.setColumns(20);
        jTextArea40.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextArea40.setLineWrap(true);
        jTextArea40.setRows(5);
        jTextArea40.setText(":");
        jTextArea40.setWrapStyleWord(true);
        jTextArea40.setFocusable(false);
        jTextArea40.setMargin(new java.awt.Insets(1, 0, 0, 0));
        jScrollPane55.setViewportView(jTextArea40);

        jScrollPane56.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane56.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane56.setFocusable(false);

        jTextPane24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane24.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jTextPane24.setText("Unit Pendidikan"); // NOI18N
        jTextPane24.setFocusable(false);
        jTextPane24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane24.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane56.setViewportView(jTextPane24);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane29)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane47))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_TMT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel97)
                            .addComponent(jLabel98)
                            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane50)
                    .addComponent(jScrollPane54, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel81)
                                            .addComponent(jLabel83)
                                            .addComponent(jLabel85))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel82)
                                            .addComponent(jLabel84)
                                            .addComponent(L_TMT))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                        .addComponent(jLabel87)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel92)
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel93)
                                            .addComponent(jLabel96))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel94)
                                            .addComponent(jLabel97))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel95)
                                            .addComponent(jLabel98))
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setFocusable(false);

        TP_Header_Jabatan_Unit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TP_Header_Jabatan_Unit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TP_Header_Jabatan_Unit.setText("PENGANGKATAN SEBAGAI PEGAWAI KelompokJabatan_Status\nPADA Unit_Pendidikan"); // NOI18N
        TP_Header_Jabatan_Unit.setDoubleBuffered(true);
        TP_Header_Jabatan_Unit.setFocusable(false);
        TP_Header_Jabatan_Unit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TP_Header_Jabatan_Unit.setMaximumSize(new java.awt.Dimension(73, 66));
        jScrollPane4.setViewportView(TP_Header_Jabatan_Unit);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_TMT;
    private javax.swing.JTextPane TP_Header_Jabatan_Unit;
    private javax.swing.JTextPane TP_Jabatan;
    private javax.swing.JTextPane TP_Kedua;
    private javax.swing.JTextPane TP_MenimbangA;
    private javax.swing.JTextPane TP_NIPY;
    private javax.swing.JTextPane TP_Nama;
    private javax.swing.JTextPane TP_Unit;
    private javax.swing.JTextPane TP_Unit_KelompokJabatan_Status_TMT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea28;
    private javax.swing.JTextArea jTextArea29;
    private javax.swing.JTextArea jTextArea30;
    private javax.swing.JTextArea jTextArea31;
    private javax.swing.JTextArea jTextArea32;
    private javax.swing.JTextArea jTextArea33;
    private javax.swing.JTextArea jTextArea34;
    private javax.swing.JTextArea jTextArea35;
    private javax.swing.JTextArea jTextArea36;
    private javax.swing.JTextArea jTextArea37;
    private javax.swing.JTextArea jTextArea38;
    private javax.swing.JTextArea jTextArea39;
    private javax.swing.JTextArea jTextArea40;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane12;
    private javax.swing.JTextPane jTextPane13;
    private javax.swing.JTextPane jTextPane14;
    private javax.swing.JTextPane jTextPane15;
    private javax.swing.JTextPane jTextPane19;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane22;
    private javax.swing.JTextPane jTextPane24;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
