/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadget_nepal;

import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sherc
 */
public class IndexPage extends javax.swing.JFrame {
    ArrayList al;
    DefaultTableModel rowData,searchRowData;

    /**
     * Creates new form IndexPage
     */
    public IndexPage() {
        setUndecorated(true);
        initComponents();
        jPanel5.setVisible(false);
        jPanel7.setVisible(false);
        jPanel13.setVisible(false);
         jPanel24.setVisible(false);
        
       
        

      
        Date date = new Date();
         SimpleDateFormat ft = new SimpleDateFormat ("MMM d, yyyy");
      
            Datelabel.setText(ft.format(date));
              Datelabel1.setText(ft.format(date));
                Datelabel2.setText(ft.format(date));
                Datelabel3.setText(ft.format(date));
                 
    
        try{

        Font Font_Path =createFont("nim.ttf");
        jLabel1.setFont(Font_Path);
        Home_Lable.setFont(Font_Path);
        } 
        catch(FontFormatException | IOException e){}
        try{

        Font Font_PathNav =createFontNav("nim1.ttf");
        Home_Lable.setFont(Font_PathNav);
        Search_Lable.setFont(Font_PathNav);
        Support_Lable.setFont(Font_PathNav);
        Generate_Lable.setFont(Font_PathNav);
        Generate_Lable1.setFont(Font_PathNav);
        Exit_Lable.setFont(Font_PathNav);
        } 
        catch(FontFormatException | IOException e){}
        
        try{

        Font Font_Pathme =createFontmenu("nim33.ttf");
        jMenu3.setFont(Font_Pathme);
        jMenu4.setFont(Font_Pathme);
        jMenu1.setFont(Font_Pathme);
        jMenu2.setFont(Font_Pathme);
        jMenuBar2.setFont(Font_Pathme);
        jMenuItem1.setFont(Font_Pathme);
        jMenuItem3.setFont(Font_Pathme);
        jMenuItem4.setFont(Font_Pathme);
      
        jMenuItem6.setFont(Font_Pathme);
        } 
        catch(FontFormatException | IOException e){}
        try{

        Font Font_PathHeading =createFontNav("nim2.ttf");
        Heading_MainPannel.setFont(Font_PathHeading);
        Heading_MainPannel1.setFont(Font_PathHeading);       
        Search_Heading.setFont(Font_PathHeading);
        Search_Heading1.setFont(Font_PathHeading);
        Profile_Lable.setFont(Font_PathHeading);
        User_Name.setFont(Font_PathHeading);
        jLabel21.setFont(Font_PathHeading);
        jlabel22.setFont(Font_PathHeading);
        jLabel23.setFont(Font_PathHeading);
        Friends.setFont(Font_PathHeading);
        Event.setFont(Font_PathHeading);
        Event2.setFont(Font_PathHeading);
        Event3.setFont(Font_PathHeading);
        Event1.setFont(Font_PathHeading);
        Datelabel.setFont(Font_PathHeading);
        Datelabel1.setFont(Font_PathHeading);
        Datelabel2.setFont(Font_PathHeading);
        Datelabel3.setFont(Font_PathHeading);
        addButton.setFont(Font_PathHeading);
        addButton1.setFont(Font_PathHeading);
        clearButton.setFont(Font_PathHeading);
        clearButton1.setFont(Font_PathHeading);
        searchBtn.setFont(Font_PathHeading);
        searchBtn1.setFont(Font_PathHeading);
        DeleteButn.setFont(Font_PathHeading);
        Add_Lable2.setFont(Font_PathHeading);
        clearSearchBtn.setFont(Font_PathHeading);
        } 
        catch(FontFormatException | IOException e){}
        try{

        Font Font_PathSub =createFontNav("nim3.ttf");
        User_Role.setFont(Font_PathSub);
        } 
        catch(FontFormatException | IOException e){}
        try{

        Font Font_Path01 =createFontTextfield("nim4.ttf");
        idTextField.setFont(Font_Path01);
        nameTextField.setFont(Font_Path01);
        priceTextField.setFont(Font_Path01);
        
        idTextField1.setFont(Font_Path01);
        nameTextField1.setFont(Font_Path01);
        priceTextField1.setFont(Font_Path01);
        searchTextField.setFont(Font_Path01);
        jTextField7.setFont(Font_Path01);
        jTextField3.setFont(Font_Path01);
        jTextArea1.setFont(Font_Path01);
        categoryComboBox.setFont(Font_Path01);
        categoryComboBox1.setFont(Font_Path01);
        categoryComboBox2.setFont(Font_Path01);
        
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(new Color(44,54,99));
        jTable1.getTableHeader().setBackground(new Color(239,236,250));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setForeground(new Color(44,54,99));
        jTable2.getTableHeader().setBackground(new Color(239,236,250));
          
          SearchTable.getTableHeader().setOpaque(false);
       
       SearchTable.getTableHeader().setForeground(new Color(44,54,99));
          SearchTable.getTableHeader().setBackground(new Color(239,236,250));
          jTable1.getTableHeader().setFont(Font_Path01);
          
          jTable2.getTableHeader().setFont(Font_Path01);
          SearchTable.getTableHeader().setFont(Font_Path01);
        
        } 
        catch(FontFormatException | IOException e){}
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new RoundedPanel(40);
        jLabel1 = new javax.swing.JLabel();
        Home_Pannel = new RoundedPanel(25);
        Home_Lable = new javax.swing.JLabel();
        Home_Logo = new javax.swing.JLabel();
        Search_Pannel = new RoundedPanel(25);
        Search_Lable = new javax.swing.JLabel();
        Search_logo = new javax.swing.JLabel();
        Support_Pannel = new RoundedPanel(25);
        Support_Lable = new javax.swing.JLabel();
        Support_logo = new javax.swing.JLabel();
        Generate_Reports = new RoundedPanel(25);
        Generate_Lable = new javax.swing.JLabel();
        Download_Logo = new javax.swing.JLabel();
        Exit_Pannel = new RoundedPanel(25);
        Exit_Lable = new javax.swing.JLabel();
        Exit_Logo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Home_Hover = new javax.swing.JPanel();
        Search_Hover = new javax.swing.JPanel();
        Download_Hover = new javax.swing.JPanel();
        Exit_Hover = new javax.swing.JPanel();
        Support_Hover = new javax.swing.JPanel();
        Generate_Reports2 = new RoundedPanel(25);
        Generate_Lable1 = new javax.swing.JLabel();
        Download_Logo2 = new javax.swing.JLabel();
        Download_Hover1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new RoundedPanel(20);
        priceTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        categoryComboBox = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();
        nameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel11 = new RoundedPanel(20);
        Add_Pannel = new RoundedPanel(20);
        addButton = new javax.swing.JLabel();
        Clear_Pannel = new RoundedPanel(20);
        clearButton = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        Datelabel = new javax.swing.JLabel();
        jPanel8 = new RoundedPanel(10);
        jLabel21 = new javax.swing.JLabel();
        Heading_MainPannel = new javax.swing.JLabel();
        jPanel9 = new RoundedPanel(20);
        jLabel22 = new javax.swing.JLabel();
        Event = new javax.swing.JLabel();
        jPanel13 = new RoundedPanel(20);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel15 = new RoundedPanel(10);
        jlabel22 = new javax.swing.JLabel();
        jPanel14 = new RoundedPanel(20);
        jLabel25 = new javax.swing.JLabel();
        Datelabel1 = new javax.swing.JLabel();
        Search_Heading = new javax.swing.JLabel();
        Event1 = new javax.swing.JLabel();
        jPanel18 = new RoundedPanel(20);
        searchTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        categoryComboBox2 = new javax.swing.JComboBox<>();
        Add_Pannel4 = new RoundedPanel(20);
        searchBtn1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel19 = new RoundedPanel(20);
        Add_Pannel1 = new RoundedPanel(20);
        searchBtn = new javax.swing.JLabel();
        Clear_Pannel1 = new RoundedPanel(20);
        clearSearchBtn = new javax.swing.JLabel();
        jPanel12 = new RoundedPanel(20);
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchTable = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        Datelabel3 = new javax.swing.JLabel();
        jPanel26 = new RoundedPanel(10);
        jLabel23 = new javax.swing.JLabel();
        Heading_MainPannel1 = new javax.swing.JLabel();
        jPanel27 = new RoundedPanel(20);
        jLabel24 = new javax.swing.JLabel();
        Event3 = new javax.swing.JLabel();
        jPanel28 = new RoundedPanel(20);
        priceTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        categoryComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton5 = new javax.swing.JRadioButton();
        nameTextField1 = new javax.swing.JTextField();
        idTextField1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        Add_Pannel3 = new RoundedPanel(20);
        addButton1 = new javax.swing.JLabel();
        jPanel29 = new RoundedPanel(20);
        Clear_Pannel2 = new RoundedPanel(20);
        clearButton1 = new javax.swing.JLabel();
        Clear_Pannel3 = new RoundedPanel(20);
        DeleteButn = new javax.swing.JLabel();
        jPanel30 = new RoundedPanel(20);
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel22 = new RoundedPanel(20);
        jLabel26 = new javax.swing.JLabel();
        Datelabel2 = new javax.swing.JLabel();
        Search_Heading1 = new javax.swing.JLabel();
        Event2 = new javax.swing.JLabel();
        jPanel23 = new RoundedPanel(20);
        jLabel27 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        Add_Pannel2 = new RoundedPanel(20);
        Add_Lable2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Profile_Lable = new javax.swing.JLabel();
        TickLogo = new javax.swing.JLabel();
        User_Name = new javax.swing.JLabel();
        User_Role = new javax.swing.JLabel();
        Friends = new javax.swing.JLabel();
        Profile_PP = new RoundedPanel(40);
        jLabel2 = new javax.swing.JLabel();
        Profile_PP1 = new RoundedPanel(40);
        jLabel3 = new javax.swing.JLabel();
        Profile_PP2 = new RoundedPanel(40);
        jLabel5 = new javax.swing.JLabel();
        Profile_PP3 = new RoundedPanel(40);
        jLabel6 = new javax.swing.JLabel();
        Profile_PP4 = new RoundedPanel(40);
        jLabel4 = new javax.swing.JLabel();
        Profile_PP5 = new RoundedPanel(40);
        jLabel10 = new javax.swing.JLabel();
        Profile_PP6 = new RoundedPanel(40);
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(91, 72, 181));

        jPanel4.setBackground(new java.awt.Color(91, 72, 181));
        jPanel4.setForeground(new java.awt.Color(104, 81, 216));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 235, 250));
        jLabel1.setText("Gadget Nepal");

        Home_Pannel.setBackground(new java.awt.Color(104, 81, 216));
        Home_Pannel.setForeground(new java.awt.Color(255, 255, 255));
        Home_Pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_PannelMouseClicked(evt);
            }
        });

        Home_Lable.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        Home_Lable.setForeground(new java.awt.Color(104, 81, 216));
        Home_Lable.setText("HOME");
        Home_Lable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_LableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Home_LableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Home_LableMouseExited(evt);
            }
        });

        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_5.png"))); // NOI18N
        Home_Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_LogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Home_PannelLayout = new javax.swing.GroupLayout(Home_Pannel);
        Home_Pannel.setLayout(Home_PannelLayout);
        Home_PannelLayout.setHorizontalGroup(
            Home_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_PannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Home_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        Home_PannelLayout.setVerticalGroup(
            Home_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Home_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home_Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        Search_Pannel.setBackground(new java.awt.Color(104, 81, 216));
        Search_Pannel.setForeground(new java.awt.Color(104, 81, 216));
        Search_Pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_PannelMouseClicked(evt);
            }
        });

        Search_Lable.setForeground(new java.awt.Color(255, 255, 255));
        Search_Lable.setText("Search");
        Search_Lable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_LableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_LableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_LableMouseExited(evt);
            }
        });

        Search_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SerachWhite.png"))); // NOI18N

        javax.swing.GroupLayout Search_PannelLayout = new javax.swing.GroupLayout(Search_Pannel);
        Search_Pannel.setLayout(Search_PannelLayout);
        Search_PannelLayout.setHorizontalGroup(
            Search_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Search_PannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Search_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        Search_PannelLayout.setVerticalGroup(
            Search_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Search_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Search_Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Support_Pannel.setBackground(new java.awt.Color(104, 81, 216));
        Support_Pannel.setForeground(new java.awt.Color(104, 81, 216));

        Support_Lable.setForeground(new java.awt.Color(255, 255, 255));
        Support_Lable.setText("Support Pannel");
        Support_Lable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Support_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Support_LableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Support_LableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Support_LableMouseExited(evt);
            }
        });

        Support_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupportWhite.png"))); // NOI18N

        javax.swing.GroupLayout Support_PannelLayout = new javax.swing.GroupLayout(Support_Pannel);
        Support_Pannel.setLayout(Support_PannelLayout);
        Support_PannelLayout.setHorizontalGroup(
            Support_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Support_PannelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Support_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Support_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Support_PannelLayout.setVerticalGroup(
            Support_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Support_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Support_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Support_Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Support_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        Generate_Reports.setBackground(new java.awt.Color(104, 81, 216));
        Generate_Reports.setForeground(new java.awt.Color(104, 81, 216));
        Generate_Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Generate_ReportsMouseClicked(evt);
            }
        });

        Generate_Lable.setForeground(new java.awt.Color(255, 255, 255));
        Generate_Lable.setText("Generate Reports");
        Generate_Lable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Generate_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Generate_LableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Generate_LableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Generate_LableMouseExited(evt);
            }
        });

        Download_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DownloadWhite.png"))); // NOI18N

        javax.swing.GroupLayout Generate_ReportsLayout = new javax.swing.GroupLayout(Generate_Reports);
        Generate_Reports.setLayout(Generate_ReportsLayout);
        Generate_ReportsLayout.setHorizontalGroup(
            Generate_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Generate_ReportsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Download_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Generate_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        Generate_ReportsLayout.setVerticalGroup(
            Generate_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Generate_ReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Generate_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Generate_Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Download_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        Exit_Pannel.setBackground(new java.awt.Color(104, 81, 216));
        Exit_Pannel.setForeground(new java.awt.Color(104, 81, 216));

        Exit_Lable.setForeground(new java.awt.Color(255, 255, 255));
        Exit_Lable.setText("EXIT");
        Exit_Lable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit_LableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Exit_LableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Exit_LableMouseExited(evt);
            }
        });

        Exit_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitWhite.png"))); // NOI18N

        javax.swing.GroupLayout Exit_PannelLayout = new javax.swing.GroupLayout(Exit_Pannel);
        Exit_Pannel.setLayout(Exit_PannelLayout);
        Exit_PannelLayout.setHorizontalGroup(
            Exit_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Exit_PannelLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(Exit_Logo)
                .addGap(12, 12, 12)
                .addComponent(Exit_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        Exit_PannelLayout.setVerticalGroup(
            Exit_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Exit_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Exit_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit_Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_multiple_devices_45px.png"))); // NOI18N

        Home_Hover.setBackground(new java.awt.Color(104, 81, 216));
        Home_Hover.setForeground(new java.awt.Color(104, 81, 216));
        Home_Hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Home_HoverMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout Home_HoverLayout = new javax.swing.GroupLayout(Home_Hover);
        Home_Hover.setLayout(Home_HoverLayout);
        Home_HoverLayout.setHorizontalGroup(
            Home_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        Home_HoverLayout.setVerticalGroup(
            Home_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        Search_Hover.setBackground(new java.awt.Color(104, 81, 216));
        Search_Hover.setForeground(new java.awt.Color(104, 81, 216));

        javax.swing.GroupLayout Search_HoverLayout = new javax.swing.GroupLayout(Search_Hover);
        Search_Hover.setLayout(Search_HoverLayout);
        Search_HoverLayout.setHorizontalGroup(
            Search_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Search_HoverLayout.setVerticalGroup(
            Search_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        Download_Hover.setBackground(new java.awt.Color(104, 81, 216));
        Download_Hover.setForeground(new java.awt.Color(104, 81, 216));

        javax.swing.GroupLayout Download_HoverLayout = new javax.swing.GroupLayout(Download_Hover);
        Download_Hover.setLayout(Download_HoverLayout);
        Download_HoverLayout.setHorizontalGroup(
            Download_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        Download_HoverLayout.setVerticalGroup(
            Download_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        Exit_Hover.setBackground(new java.awt.Color(104, 81, 216));
        Exit_Hover.setForeground(new java.awt.Color(104, 81, 216));

        javax.swing.GroupLayout Exit_HoverLayout = new javax.swing.GroupLayout(Exit_Hover);
        Exit_Hover.setLayout(Exit_HoverLayout);
        Exit_HoverLayout.setHorizontalGroup(
            Exit_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        Exit_HoverLayout.setVerticalGroup(
            Exit_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        Support_Hover.setBackground(new java.awt.Color(104, 81, 216));
        Support_Hover.setForeground(new java.awt.Color(104, 81, 216));

        javax.swing.GroupLayout Support_HoverLayout = new javax.swing.GroupLayout(Support_Hover);
        Support_Hover.setLayout(Support_HoverLayout);
        Support_HoverLayout.setHorizontalGroup(
            Support_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        Support_HoverLayout.setVerticalGroup(
            Support_HoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        Generate_Reports2.setBackground(new java.awt.Color(104, 81, 216));
        Generate_Reports2.setForeground(new java.awt.Color(104, 81, 216));
        Generate_Reports2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Generate_Reports2MouseClicked(evt);
            }
        });

        Generate_Lable1.setForeground(new java.awt.Color(255, 255, 255));
        Generate_Lable1.setText("Update");
        Generate_Lable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Generate_Lable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Generate_Lable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Generate_Lable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Generate_Lable1MouseExited(evt);
            }
        });

        Download_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_update_25px_4.png"))); // NOI18N

        Download_Hover1.setBackground(new java.awt.Color(104, 81, 216));
        Download_Hover1.setForeground(new java.awt.Color(104, 81, 216));

        javax.swing.GroupLayout Download_Hover1Layout = new javax.swing.GroupLayout(Download_Hover1);
        Download_Hover1.setLayout(Download_Hover1Layout);
        Download_Hover1Layout.setHorizontalGroup(
            Download_Hover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        Download_Hover1Layout.setVerticalGroup(
            Download_Hover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Generate_Reports2Layout = new javax.swing.GroupLayout(Generate_Reports2);
        Generate_Reports2.setLayout(Generate_Reports2Layout);
        Generate_Reports2Layout.setHorizontalGroup(
            Generate_Reports2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Generate_Reports2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(Download_Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Generate_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Download_Hover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Generate_Reports2Layout.setVerticalGroup(
            Generate_Reports2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Generate_Reports2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Generate_Reports2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Generate_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Download_Logo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Generate_Reports2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Download_Hover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Generate_Reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(Download_Hover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Home_Pannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search_Pannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Support_Pannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Generate_Reports2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Support_Hover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Home_Hover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search_Hover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Logo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Exit_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Exit_Hover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home_Hover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Hover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(Generate_Reports2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Support_Hover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Support_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Download_Hover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generate_Reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_Hover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(245, 245, 251));

        priceTextField.setBackground(new java.awt.Color(245, 245, 251));
        priceTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setText("Category");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setText("Range");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Product Name");

        jRadioButton3.setBackground(new java.awt.Color(245, 245, 251));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton3.setText("High");

        categoryComboBox.setBackground(new java.awt.Color(245, 245, 251));
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Laptops", "Desktops", "Mobiles", "Gaming Consoles", "Oven", "Microwave", "Refrigerators", "Headphones", "Speakers", "Air Conditioners", "Toaster", "Washing Machine", "Fan", "Generator", "Inverter" }));

        jRadioButton2.setBackground(new java.awt.Color(245, 245, 251));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton2.setText("Mid");

        nameTextField.setBackground(new java.awt.Color(245, 245, 251));
        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        idTextField.setBackground(new java.awt.Color(245, 245, 251));
        idTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Price");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Product ID ");

        jRadioButton1.setBackground(new java.awt.Color(245, 245, 251));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton1.setText("Low");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setForeground(new java.awt.Color(245, 245, 251));

        Add_Pannel.setBackground(new java.awt.Color(245, 245, 251));
        Add_Pannel.setForeground(new java.awt.Color(204, 204, 255));
        Add_Pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_PannelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_PannelMouseExited(evt);
            }
        });

        addButton.setForeground(new java.awt.Color(44, 54, 99));
        addButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Add_PannelLayout = new javax.swing.GroupLayout(Add_Pannel);
        Add_Pannel.setLayout(Add_PannelLayout);
        Add_PannelLayout.setHorizontalGroup(
            Add_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Add_PannelLayout.setVerticalGroup(
            Add_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Clear_Pannel.setBackground(new java.awt.Color(255, 255, 255));
        Clear_Pannel.setForeground(new java.awt.Color(104, 81, 216));
        Clear_Pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Clear_PannelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Clear_PannelMouseExited(evt);
            }
        });

        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearButton.setText("Clear");
        clearButton.setMaximumSize(new java.awt.Dimension(19, 14));
        clearButton.setMinimumSize(new java.awt.Dimension(19, 14));
        clearButton.setPreferredSize(new java.awt.Dimension(19, 14));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Clear_PannelLayout = new javax.swing.GroupLayout(Clear_Pannel);
        Clear_Pannel.setLayout(Clear_PannelLayout);
        Clear_PannelLayout.setHorizontalGroup(
            Clear_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Clear_PannelLayout.setVerticalGroup(
            Clear_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_PannelLayout.createSequentialGroup()
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Add_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Clear_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));

        Datelabel.setForeground(new java.awt.Color(173, 173, 176));
        Datelabel.setText("1 Jan 2020");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(104, 81, 216)));
        jPanel8.setForeground(new java.awt.Color(239, 236, 250));

        jLabel21.setForeground(new java.awt.Color(44, 54, 99));
        jLabel21.setText("Total Items : ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Heading_MainPannel.setForeground(new java.awt.Color(104, 81, 216));
        Heading_MainPannel.setText("Dashboard");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(239, 236, 250));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_plus_20px.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        Event.setForeground(new java.awt.Color(47, 57, 102));
        Event.setText("Event");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(Heading_MainPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                        .addComponent(Event, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(Heading_MainPannel)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Event, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setForeground(new java.awt.Color(245, 245, 251));

        jScrollPane1.setBorder(null);

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Category", "Product Name", "Range", "Price"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(27);
        jTable1.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addGap(15, 15, 15))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel3, "card2");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(104, 81, 216)));
        jPanel15.setForeground(new java.awt.Color(239, 236, 250));

        jlabel22.setForeground(new java.awt.Color(44, 54, 99));
        jlabel22.setText("Total Items : ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setForeground(new java.awt.Color(239, 236, 250));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_plus_20px.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        Datelabel1.setForeground(new java.awt.Color(173, 173, 176));
        Datelabel1.setText("1 Jan 2020");

        Search_Heading.setForeground(new java.awt.Color(104, 81, 216));
        Search_Heading.setText("Search");

        Event1.setForeground(new java.awt.Color(47, 57, 102));
        Event1.setText("Event");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Search_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Event1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Datelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Datelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Search_Heading)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Event1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setForeground(new java.awt.Color(245, 245, 251));
        jPanel18.setPreferredSize(new java.awt.Dimension(655, 227));

        searchTextField.setBackground(new java.awt.Color(245, 245, 251));
        searchTextField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchTextField.setText("Search From Price"); // NOI18N
        searchTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        searchTextField.setName(""); // NOI18N
        searchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextFieldMouseClicked(evt);
            }
        });
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setText("Search");

        categoryComboBox2.setBackground(new java.awt.Color(245, 245, 251));
        categoryComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Laptops", "Desktops", "Mobiles", "Gaming Consoles", "Oven", "Microwave", "Refrigerators", "Headphones", "Speakers", "Air Conditioners", "Toaster", "Washing Machine", "Fan", "Generator", "Inverter" }));

        Add_Pannel4.setBackground(new java.awt.Color(245, 245, 251));
        Add_Pannel4.setForeground(new java.awt.Color(204, 204, 255));
        Add_Pannel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Pannel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Pannel4MouseExited(evt);
            }
        });

        searchBtn1.setForeground(new java.awt.Color(44, 54, 99));
        searchBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchBtn1.setText("Search Category");
        searchBtn1.setMaximumSize(new java.awt.Dimension(19, 14));
        searchBtn1.setMinimumSize(new java.awt.Dimension(19, 14));
        searchBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtn1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Add_Pannel4Layout = new javax.swing.GroupLayout(Add_Pannel4);
        Add_Pannel4.setLayout(Add_Pannel4Layout);
        Add_Pannel4Layout.setHorizontalGroup(
            Add_Pannel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        );
        Add_Pannel4Layout.setVerticalGroup(
            Add_Pannel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel34.setText("Search");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(Add_Pannel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add_Pannel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setForeground(new java.awt.Color(245, 245, 251));
        jPanel19.setPreferredSize(new java.awt.Dimension(234, 227));

        Add_Pannel1.setBackground(new java.awt.Color(245, 245, 251));
        Add_Pannel1.setForeground(new java.awt.Color(204, 204, 255));
        Add_Pannel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Pannel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Pannel1MouseExited(evt);
            }
        });

        searchBtn.setForeground(new java.awt.Color(44, 54, 99));
        searchBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchBtn.setText("Search");
        searchBtn.setMaximumSize(new java.awt.Dimension(19, 14));
        searchBtn.setMinimumSize(new java.awt.Dimension(19, 14));
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Add_Pannel1Layout = new javax.swing.GroupLayout(Add_Pannel1);
        Add_Pannel1.setLayout(Add_Pannel1Layout);
        Add_Pannel1Layout.setHorizontalGroup(
            Add_Pannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        Add_Pannel1Layout.setVerticalGroup(
            Add_Pannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Clear_Pannel1.setBackground(new java.awt.Color(255, 255, 255));
        Clear_Pannel1.setForeground(new java.awt.Color(104, 81, 216));
        Clear_Pannel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Clear_Pannel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Clear_Pannel1MouseExited(evt);
            }
        });

        clearSearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearSearchBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearSearchBtn.setText("Clear");
        clearSearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearSearchBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearSearchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearSearchBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Clear_Pannel1Layout = new javax.swing.GroupLayout(Clear_Pannel1);
        Clear_Pannel1.setLayout(Clear_Pannel1Layout);
        Clear_Pannel1Layout.setHorizontalGroup(
            Clear_Pannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_Pannel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Clear_Pannel1Layout.setVerticalGroup(
            Clear_Pannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_Pannel1Layout.createSequentialGroup()
                .addComponent(clearSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add_Pannel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear_Pannel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Add_Pannel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Clear_Pannel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setForeground(new java.awt.Color(245, 245, 251));

        SearchTable.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        SearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Category", "Product Name", "Price", "Range"
            }
        ));
        SearchTable.setRowHeight(27);
        SearchTable.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(SearchTable);
        if (SearchTable.getColumnModel().getColumnCount() > 0) {
            SearchTable.getColumnModel().getColumn(0).setResizable(false);
            SearchTable.getColumnModel().getColumn(1).setResizable(false);
            SearchTable.getColumnModel().getColumn(2).setResizable(false);
            SearchTable.getColumnModel().getColumn(3).setResizable(false);
            SearchTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel5, "card3");

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setForeground(new java.awt.Color(255, 255, 255));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setForeground(new java.awt.Color(255, 255, 255));

        Datelabel3.setForeground(new java.awt.Color(173, 173, 176));
        Datelabel3.setText("1 Jan 2020");

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(104, 81, 216)));
        jPanel26.setForeground(new java.awt.Color(239, 236, 250));

        jLabel23.setForeground(new java.awt.Color(44, 54, 99));
        jLabel23.setText("Total Items : ");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Heading_MainPannel1.setForeground(new java.awt.Color(104, 81, 216));
        Heading_MainPannel1.setText("Dashboard");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setForeground(new java.awt.Color(239, 236, 250));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_plus_20px.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        Event3.setForeground(new java.awt.Color(47, 57, 102));
        Event3.setText("Event");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(Heading_MainPannel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                        .addComponent(Event3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Datelabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Datelabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(Heading_MainPannel1)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Event3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setForeground(new java.awt.Color(245, 245, 251));
        jPanel28.setPreferredSize(new java.awt.Dimension(658, 227));

        priceTextField1.setBackground(new java.awt.Color(245, 245, 251));
        priceTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        priceTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextField1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setText("Category");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setText("Range");

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel31.setText("Product Name");

        jRadioButton4.setBackground(new java.awt.Color(245, 245, 251));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton4.setText("High");

        categoryComboBox1.setBackground(new java.awt.Color(245, 245, 251));
        categoryComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Laptops", "Desktops", "Mobiles", "Gaming Consoles", "Oven", "Microwave", "Refrigerators", "Headphones", "Speakers", "Air Conditioners", "Toaster", "Washing Machine", "Fan", "Generator", "Inverter" }));

        jRadioButton5.setBackground(new java.awt.Color(245, 245, 251));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton5.setText("Mid");

        nameTextField1.setBackground(new java.awt.Color(245, 245, 251));
        nameTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        nameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextField1ActionPerformed(evt);
            }
        });

        idTextField1.setBackground(new java.awt.Color(245, 245, 251));
        idTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        idTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextField1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel32.setText("Price");

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel33.setText("Product ID ");

        jRadioButton6.setBackground(new java.awt.Color(245, 245, 251));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton6.setText("Low");

        Add_Pannel3.setBackground(new java.awt.Color(245, 245, 251));
        Add_Pannel3.setForeground(new java.awt.Color(204, 204, 255));
        Add_Pannel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Pannel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Pannel3MouseExited(evt);
            }
        });

        addButton1.setForeground(new java.awt.Color(44, 54, 99));
        addButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addButton1.setText("Search");
        addButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButton1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Add_Pannel3Layout = new javax.swing.GroupLayout(Add_Pannel3);
        Add_Pannel3.setLayout(Add_Pannel3Layout);
        Add_Pannel3Layout.setHorizontalGroup(
            Add_Pannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Add_Pannel3Layout.setVerticalGroup(
            Add_Pannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(categoryComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Add_Pannel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel28Layout.createSequentialGroup()
                                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categoryComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Add_Pannel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setForeground(new java.awt.Color(245, 245, 251));

        Clear_Pannel2.setBackground(new java.awt.Color(255, 255, 255));
        Clear_Pannel2.setForeground(new java.awt.Color(104, 81, 216));
        Clear_Pannel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Clear_Pannel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Clear_Pannel2MouseExited(evt);
            }
        });

        clearButton1.setForeground(new java.awt.Color(255, 255, 255));
        clearButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearButton1.setText("Update");
        clearButton1.setMaximumSize(new java.awt.Dimension(19, 14));
        clearButton1.setMinimumSize(new java.awt.Dimension(19, 14));
        clearButton1.setPreferredSize(new java.awt.Dimension(19, 14));
        clearButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearButton1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Clear_Pannel2Layout = new javax.swing.GroupLayout(Clear_Pannel2);
        Clear_Pannel2.setLayout(Clear_Pannel2Layout);
        Clear_Pannel2Layout.setHorizontalGroup(
            Clear_Pannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_Pannel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Clear_Pannel2Layout.setVerticalGroup(
            Clear_Pannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_Pannel2Layout.createSequentialGroup()
                .addComponent(clearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Clear_Pannel3.setBackground(new java.awt.Color(245, 245, 251));
        Clear_Pannel3.setForeground(new java.awt.Color(204, 204, 255));
        Clear_Pannel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Clear_Pannel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Clear_Pannel3MouseExited(evt);
            }
        });

        DeleteButn.setForeground(new java.awt.Color(44, 54, 99));
        DeleteButn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteButn.setText("Delete");
        DeleteButn.setMaximumSize(new java.awt.Dimension(19, 14));
        DeleteButn.setMinimumSize(new java.awt.Dimension(19, 14));
        DeleteButn.setPreferredSize(new java.awt.Dimension(19, 14));
        DeleteButn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Clear_Pannel3Layout = new javax.swing.GroupLayout(Clear_Pannel3);
        Clear_Pannel3.setLayout(Clear_Pannel3Layout);
        Clear_Pannel3Layout.setHorizontalGroup(
            Clear_Pannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_Pannel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteButn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Clear_Pannel3Layout.setVerticalGroup(
            Clear_Pannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clear_Pannel3Layout.createSequentialGroup()
                .addComponent(DeleteButn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear_Pannel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear_Pannel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Clear_Pannel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Clear_Pannel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setForeground(new java.awt.Color(245, 245, 251));

        jScrollPane4.setBorder(null);

        jTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Category", "Product Name", "Range", "Price"
            }
        ));
        jTable2.setEnabled(false);
        jTable2.setRequestFocusEnabled(false);
        jTable2.setRowHeight(27);
        jTable2.setShowHorizontalLines(false);
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4)
                .addGap(15, 15, 15))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel24, "card5");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setForeground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setForeground(new java.awt.Color(239, 236, 250));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_plus_20px.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        Datelabel2.setForeground(new java.awt.Color(173, 173, 176));
        Datelabel2.setText("1 Jan 2020");

        Search_Heading1.setForeground(new java.awt.Color(104, 81, 216));
        Search_Heading1.setText("Support");

        Event2.setForeground(new java.awt.Color(47, 57, 102));
        Event2.setText("Event");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_Heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Event2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Datelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Datelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(Search_Heading1)
                        .addGap(41, 41, 41)
                        .addComponent(Event2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setForeground(new java.awt.Color(245, 245, 251));

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel27.setText("Subject");

        jTextField7.setBackground(new java.awt.Color(245, 245, 251));
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setText("Message");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setText("Email ");

        jScrollPane3.setBackground(new java.awt.Color(245, 245, 251));
        jScrollPane3.setForeground(new java.awt.Color(245, 245, 251));

        jTextArea1.setBackground(new java.awt.Color(245, 245, 251));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel21.setBackground(new java.awt.Color(245, 245, 251));
        jPanel21.setForeground(new java.awt.Color(245, 245, 251));

        Add_Pannel2.setBackground(new java.awt.Color(245, 245, 251));
        Add_Pannel2.setForeground(new java.awt.Color(204, 204, 255));
        Add_Pannel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Pannel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Pannel2MouseExited(evt);
            }
        });

        Add_Lable2.setForeground(new java.awt.Color(44, 54, 99));
        Add_Lable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_Lable2.setText("Send");
        Add_Lable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_Lable2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Lable2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Lable2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Add_Pannel2Layout = new javax.swing.GroupLayout(Add_Pannel2);
        Add_Pannel2.setLayout(Add_Pannel2Layout);
        Add_Pannel2Layout.setHorizontalGroup(
            Add_Pannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add_Lable2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        Add_Pannel2Layout.setVerticalGroup(
            Add_Pannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Pannel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add_Lable2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Add_Pannel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(Add_Pannel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextField3.setBackground(new java.awt.Color(245, 245, 251));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(jTextField7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(252, 252, 252))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel7, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 959, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 336, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
        );

        jPanel6.setBackground(new java.awt.Color(245, 245, 251));
        jPanel6.setForeground(new java.awt.Color(245, 245, 251));

        Profile_Lable.setForeground(new java.awt.Color(44, 54, 99));
        Profile_Lable.setText("Profile");

        TickLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_checked_30px.png"))); // NOI18N
        TickLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        User_Name.setForeground(new java.awt.Color(44, 54, 99));
        User_Name.setText("Gadget_Nepal");

        User_Role.setForeground(new java.awt.Color(156, 156, 159));
        User_Role.setText("Admin");

        Friends.setForeground(new java.awt.Color(44, 54, 99));
        Friends.setText("Staffs");

        Profile_PP.setBackground(new java.awt.Color(153, 153, 153));
        Profile_PP.setBorder(BorderFactory.createLineBorder(Color.gray));
        Profile_PP.setForeground(new java.awt.Color(245, 245, 251));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_system_administrator_male_120px.png"))); // NOI18N

        javax.swing.GroupLayout Profile_PPLayout = new javax.swing.GroupLayout(Profile_PP);
        Profile_PP.setLayout(Profile_PPLayout);
        Profile_PPLayout.setHorizontalGroup(
            Profile_PPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Profile_PPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        Profile_PPLayout.setVerticalGroup(
            Profile_PPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Profile_PPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        Profile_PP1.setBackground(new java.awt.Color(245, 245, 251));
        Profile_PP1.setBorder(null);
        Profile_PP1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 54, 99));
        jLabel3.setText(" A B");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout Profile_PP1Layout = new javax.swing.GroupLayout(Profile_PP1);
        Profile_PP1.setLayout(Profile_PP1Layout);
        Profile_PP1Layout.setHorizontalGroup(
            Profile_PP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Profile_PP1Layout.setVerticalGroup(
            Profile_PP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        Profile_PP2.setBackground(new java.awt.Color(245, 245, 251));
        Profile_PP2.setForeground(new java.awt.Color(92, 92, 155));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 54, 99));
        jLabel5.setText(" H K");

        javax.swing.GroupLayout Profile_PP2Layout = new javax.swing.GroupLayout(Profile_PP2);
        Profile_PP2.setLayout(Profile_PP2Layout);
        Profile_PP2Layout.setHorizontalGroup(
            Profile_PP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Profile_PP2Layout.setVerticalGroup(
            Profile_PP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        Profile_PP3.setBackground(new java.awt.Color(245, 245, 251));
        Profile_PP3.setForeground(new java.awt.Color(92, 92, 155));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 54, 99));
        jLabel6.setText(" U G");

        javax.swing.GroupLayout Profile_PP3Layout = new javax.swing.GroupLayout(Profile_PP3);
        Profile_PP3.setLayout(Profile_PP3Layout);
        Profile_PP3Layout.setHorizontalGroup(
            Profile_PP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Profile_PP3Layout.setVerticalGroup(
            Profile_PP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        Profile_PP4.setBackground(new java.awt.Color(245, 245, 251));
        Profile_PP4.setForeground(new java.awt.Color(254, 193, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 54, 99));
        jLabel4.setText(" P K");

        javax.swing.GroupLayout Profile_PP4Layout = new javax.swing.GroupLayout(Profile_PP4);
        Profile_PP4.setLayout(Profile_PP4Layout);
        Profile_PP4Layout.setHorizontalGroup(
            Profile_PP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Profile_PP4Layout.setVerticalGroup(
            Profile_PP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Profile_PP4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        Profile_PP5.setBackground(new java.awt.Color(245, 245, 251));
        Profile_PP5.setForeground(new java.awt.Color(204, 204, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(44, 54, 99));
        jLabel10.setText(" B C");

        javax.swing.GroupLayout Profile_PP5Layout = new javax.swing.GroupLayout(Profile_PP5);
        Profile_PP5.setLayout(Profile_PP5Layout);
        Profile_PP5Layout.setHorizontalGroup(
            Profile_PP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );
        Profile_PP5Layout.setVerticalGroup(
            Profile_PP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Profile_PP5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        Profile_PP6.setBackground(new java.awt.Color(245, 245, 251));
        Profile_PP6.setForeground(new java.awt.Color(254, 193, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 54, 99));
        jLabel7.setText("ING ");

        javax.swing.GroupLayout Profile_PP6Layout = new javax.swing.GroupLayout(Profile_PP6);
        Profile_PP6.setLayout(Profile_PP6Layout);
        Profile_PP6Layout.setHorizontalGroup(
            Profile_PP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Profile_PP6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Profile_PP6Layout.setVerticalGroup(
            Profile_PP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile_PP6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitBlue.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(44, 54, 99));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(44, 54, 99));
        jLabel13.setText("-");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(User_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(User_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profile_PP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TickLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Friends, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Profile_PP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Profile_PP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Profile_PP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Profile_PP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Profile_PP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Profile_PP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Profile_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(Profile_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Profile_PP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(User_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Profile_PP5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(Friends, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Profile_PP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Profile_PP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Profile_PP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addComponent(Profile_PP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Profile_PP6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(170, 170, 170)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(TickLogo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setForeground(new java.awt.Color(44, 54, 99));
        jMenuBar2.setPreferredSize(new java.awt.Dimension(68, 25));

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setForeground(new java.awt.Color(44, 54, 99));
        jMenu3.setText("File");

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(44, 54, 99));
        jMenu1.setText("Import Data");

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setForeground(new java.awt.Color(44, 54, 99));
        jMenuItem4.setText("Import CSV");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenu3.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(44, 54, 99));
        jMenu2.setText("Export Data");

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setForeground(new java.awt.Color(44, 54, 99));
        jMenuItem6.setText("Export to txt");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setForeground(new java.awt.Color(44, 54, 99));
        jMenuItem1.setText("Export to CSV");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu3.add(jMenu2);

        jMenuItem2.setText("New");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Help");

        jMenuItem3.setText("User Manual");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void Search_LableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_LableMouseClicked
        // TODO add your handling code here:
        //Active
        
        jPanel3.setVisible(false);
        jPanel5.setVisible(true);
        jPanel7.setVisible(false);
         jPanel24.setVisible(false);
        Search_Lable.setForeground(new Color(104,81,216));
        Search_Pannel.setForeground(new Color(255,255,255));
        Search_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchBlue.png")));
        //Inactive
        Download_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_update_25px_4.png")));
        Home_Pannel.setForeground(new Color(104,81,216));
        Home_Lable.setForeground(new Color(255,255,255));
        Support_Pannel.setForeground(new Color(104,81,216));
        Support_Lable.setForeground(new Color(255,255,255));
        Generate_Reports2.setForeground(new Color(104,81,216));
        Generate_Lable1.setForeground(new Color(255,255,255));
        Exit_Pannel.setForeground(new Color(104,81,216));
        Exit_Lable.setForeground(new Color(255,255,255));
        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_6.png")));
        Support_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupportWhite.png")));
        Download_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DownloadWhite.png")));
        Exit_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitWhite.png")));
    }//GEN-LAST:event_Search_LableMouseClicked

    private void Home_LableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_LableMouseClicked
        // TODO add your handling code here:
        //Active
        jPanel3.setVisible(true);
        jPanel5.setVisible(false);
        jPanel7.setVisible(false);
        jPanel24.setVisible(false);
        Home_Pannel.setForeground(new Color(255,255,255));
        Home_Lable.setForeground(new Color(104,81,216));
        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_5.png")));
        //Inactive
        Download_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_update_25px_4.png")));
        Search_Pannel.setForeground(new Color(104,81,216));
        Search_Lable.setForeground(new Color(255,255,255));
        Search_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SerachWhite.png")));
        Support_Pannel.setForeground(new Color(104,81,216));
        Support_Lable.setForeground(new Color(255,255,255));
        Generate_Reports2.setForeground(new Color(104,81,216));
        Generate_Lable1.setForeground(new Color(255,255,255));
        Exit_Pannel.setForeground(new Color(104,81,216));
        Exit_Lable.setForeground(new Color(255,255,255));
        Support_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupportWhite.png")));
        Download_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DownloadWhite.png")));
        Exit_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitWhite.png")));
        
    }//GEN-LAST:event_Home_LableMouseClicked

    private void Support_LableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Support_LableMouseClicked
        // TODO add your handling code here:
        //Active
        jPanel3.setVisible(false);
        jPanel5.setVisible(false);
        jPanel7.setVisible(true);
         jPanel24.setVisible(false);
        Support_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupportBlue.png")));
        Support_Pannel.setForeground(new Color(255,255,255));
        Support_Lable.setForeground(new Color(104,81,216));
        //Inactive
        Search_Pannel.setForeground(new Color(104,81,216));
        Search_Lable.setForeground(new Color(255,255,255));
        Home_Pannel.setForeground(new Color(104,81,216));
        Home_Lable.setForeground(new Color(255,255,255));
        Generate_Reports2.setForeground(new Color(104,81,216));
        Generate_Lable1.setForeground(new Color(255,255,255));
        Exit_Pannel.setForeground(new Color(104,81,216));
        Exit_Lable.setForeground(new Color(255,255,255));
        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_6.png")));
        Search_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SerachWhite.png")));
        Download_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DownloadWhite.png")));
        Download_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_update_25px_4.png")));
        Exit_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitWhite.png")));
    }//GEN-LAST:event_Support_LableMouseClicked

    private void Generate_LableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_LableMouseClicked
        // TODO add your handling code here:
        //Active
         jPanel24.setVisible(false);
        jPanel3.setVisible(true);
        jPanel5.setVisible(false);
        jPanel7.setVisible(false);
        FileExportCSV();

        //Inactive
        Search_Pannel.setForeground(new Color(104,81,216));
        Search_Lable.setForeground(new Color(255,255,255));
        Home_Pannel.setForeground(new Color(104,81,216));
        Home_Lable.setForeground(new Color(255,255,255));
        Support_Pannel.setForeground(new Color(104,81,216));
        Support_Lable.setForeground(new Color(255,255,255));
        Exit_Pannel.setForeground(new Color(104,81,216));
        Exit_Lable.setForeground(new Color(255,255,255));
        Exit_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitWhite.png")));
        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_6.png")));
        Search_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SerachWhite.png")));
        Support_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupportWhite.png")));
    }//GEN-LAST:event_Generate_LableMouseClicked

    private void Exit_LableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_LableMouseClicked
        // TODO add your handling code here:
        //Active
        System.exit(0);
        Exit_Pannel.setForeground(new Color(255,255,255));
        Exit_Lable.setForeground(new Color(104,81,216));
        Exit_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitBlue.png")));
        //Inactive
        Search_Pannel.setForeground(new Color(104,81,216));
        Search_Lable.setForeground(new Color(255,255,255));
        Search_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SerachWhite.png")));
        Home_Pannel.setForeground(new Color(104,81,216));
        Home_Lable.setForeground(new Color(255,255,255));
        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_6.png")));
        Support_Pannel.setForeground(new Color(104,81,216));
        Support_Lable.setForeground(new Color(255,255,255));
        Support_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupportWhite.png")));
        Generate_Reports.setForeground(new Color(104,81,216));
        Generate_Lable.setForeground(new Color(255,255,255));
        Download_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DownloadWhite.png")));
        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_6.png")));
    }//GEN-LAST:event_Exit_LableMouseClicked

    private void Home_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_LogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_LogoMouseClicked

    private void Search_LableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_LableMouseEntered
        // TODO add your handling code here:
        Search_Hover.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_Search_LableMouseEntered

    private void Search_LableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_LableMouseExited
        // TODO add your handling code here:
        Search_Hover.setBackground(new Color(104,81,216));
    }//GEN-LAST:event_Search_LableMouseExited

    private void Support_LableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Support_LableMouseEntered
        // TODO add your handling code here
        Support_Hover.setBackground(Color.WHITE);
    }//GEN-LAST:event_Support_LableMouseEntered

    private void Support_LableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Support_LableMouseExited
        // TODO add your handling code here:
        Support_Hover.setBackground(new Color (104,81,216));
    }//GEN-LAST:event_Support_LableMouseExited

    private void Generate_LableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_LableMouseEntered
        // TODO add your handling code here:
        Download_Hover.setBackground(Color.WHITE);
    }//GEN-LAST:event_Generate_LableMouseEntered

    private void Generate_LableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_LableMouseExited
        // TODO add your handling code here:
        Download_Hover.setBackground(new Color (104,81,216));
    }//GEN-LAST:event_Generate_LableMouseExited

    private void Exit_LableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_LableMouseEntered
        // TODO add your handling code here: 
        Exit_Hover.setBackground(Color.WHITE);
    }//GEN-LAST:event_Exit_LableMouseEntered

    private void Exit_LableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_LableMouseExited
        // TODO add your handling code here:
        
        Exit_Hover.setBackground(new Color (104,81,216));
    }//GEN-LAST:event_Exit_LableMouseExited

    private void Home_LableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_LableMouseEntered
        // TODO add your handling code here:
        Home_Hover.setBackground(Color.WHITE);
        //Home_Pannel.setForeground(new Color(255,255,255));
        //Home_Lable.setForeground(new Color(104,81,216));
        //Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_5.png")));
    }//GEN-LAST:event_Home_LableMouseEntered

    private void Home_LableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_LableMouseExited
        // TODO add your handling code here:
        Home_Hover.setBackground(new Color (104,81,216));
    }//GEN-LAST:event_Home_LableMouseExited

    private void Search_PannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_PannelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Search_PannelMouseClicked

    private void Home_HoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_HoverMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_HoverMouseEntered

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void Home_PannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_PannelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_PannelMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void Add_PannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_PannelMouseEntered
        // TODO add your handling code here:
        Add_Pannel.setForeground(new Color(104,81,216));
        Clear_Pannel.setForeground(new Color(204,204,255));
        addButton.setForeground(new Color(255,255,255));
        clearButton.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_Add_PannelMouseEntered

    private void Add_PannelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_PannelMouseExited
        // TODO add your handling code here:
        
        Add_Pannel.setForeground(new Color(204,204,255));
        Clear_Pannel.setForeground(new Color(104,81,216));
        
        addButton.setForeground(new Color(44,54,99));
        clearButton.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Add_PannelMouseExited

    private void Clear_PannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_PannelMouseEntered
        // TODO add your handling code here:
        
        Add_Pannel.setForeground(new Color(104,81,216));
        Clear_Pannel.setForeground(new Color(204,204,255));
    }//GEN-LAST:event_Clear_PannelMouseEntered

    private void Clear_PannelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_PannelMouseExited
        // TODO add your handling code here:
        
        Add_Pannel.setForeground(new Color(204,204,255));
        Clear_Pannel.setForeground(new Color(104,81,216));
    }//GEN-LAST:event_Clear_PannelMouseExited

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        // TODO add your handling code here:
        
        Add_Pannel.setForeground(new Color(104,81,216));
        Clear_Pannel.setForeground(new Color(204,204,255));
        addButton.setForeground(new Color(255,255,255));
        clearButton.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        // TODO add your handling code here:
        Add_Pannel.setForeground(new Color(204,204,255));
        Clear_Pannel.setForeground(new Color(104,81,216));
        addButton.setForeground(new Color(44,54,99));
        clearButton.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_addButtonMouseExited

    private void clearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseEntered
        // TODO add your handling code here:
        
        Add_Pannel.setForeground(new Color(104,81,216));
        Clear_Pannel.setForeground(new Color(204,204,255));
        addButton.setForeground(new Color(255,255,255));
        clearButton.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_clearButtonMouseEntered

    private void clearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseExited
        // TODO add your handling code here:
        Add_Pannel.setForeground(new Color(204,204,255));
        Clear_Pannel.setForeground(new Color(104,81,216));
        addButton.setForeground(new Color(44,54,99));
        clearButton.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_clearButtonMouseExited

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextFieldMouseClicked
        // TODO add your handling code here:
        searchTextField.setText("");
    }//GEN-LAST:event_searchTextFieldMouseClicked

    private void searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseEntered
        // TODO add your handling code here:
        
        Add_Pannel1.setForeground(new Color(104,81,216));
        Clear_Pannel1.setForeground(new Color(204,204,255));
        searchBtn.setForeground(new Color(255,255,255));
        clearSearchBtn.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_searchBtnMouseEntered

    private void searchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseExited
        // TODO add your handling code here:
        Add_Pannel1.setForeground(new Color(204,204,255));
        Clear_Pannel1.setForeground(new Color(104,81,216));
        
        searchBtn.setForeground(new Color(44,54,99));
        clearSearchBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_searchBtnMouseExited

    private void Add_Pannel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Pannel1MouseEntered

    private void Add_Pannel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Pannel1MouseExited

    private void clearSearchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSearchBtnMouseEntered
        // TODO add your handling code here:
        Add_Pannel1.setForeground(new Color(104,81,216));
        Clear_Pannel1.setForeground(new Color(204,204,255));
        searchBtn.setForeground(new Color(255,255,255));
        clearSearchBtn.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_clearSearchBtnMouseEntered

    private void clearSearchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSearchBtnMouseExited
        // TODO add your handling code here
        
        Add_Pannel1.setForeground(new Color(204,204,255));
        Clear_Pannel1.setForeground(new Color(104,81,216));
        searchBtn.setForeground(new Color(44,54,99));
        clearSearchBtn.setForeground(new Color(255,255,255));
        
        
    }//GEN-LAST:event_clearSearchBtnMouseExited

    private void Clear_Pannel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_Pannel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_Pannel1MouseEntered

    private void Clear_Pannel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_Pannel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_Pannel1MouseExited

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void Add_Lable2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Lable2MouseEntered
        // TODO add your handling code here:
        Add_Pannel2.setForeground(new Color(104,81,216));
        Add_Lable2.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Add_Lable2MouseEntered

    private void Add_Lable2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Lable2MouseExited
        // TODO add your handling code here:
        Add_Pannel2.setForeground(new Color(204,204,255));
        Add_Lable2.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_Add_Lable2MouseExited

    private void Add_Pannel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Pannel2MouseEntered

    private void Add_Pannel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Pannel2MouseExited

    private void Add_Lable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Lable2MouseClicked
        // TODO add your handling code here:
        if(jTextField3.getText().trim().isEmpty() ||  jTextField7.getText().trim().isEmpty()  || jTextArea1.getText().trim().isEmpty()){
            
            new NoticeWindow(NoticeType.WARNING_NOTIFICATION,"Please filled all the field",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
        }
        else{
        String email = jTextField7.getText();
        if (email.contains("@")) {
         new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Your message is Submitted",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT); 
        }else{
        new NoticeWindow(NoticeType.WARNING_NOTIFICATION,"Please provide valid email address.",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT); 
        }
       jTextField3.setText("");
       jTextField7.setText("");
       jTextArea1.setText("");
     }
    }//GEN-LAST:event_Add_Lable2MouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        String id = idTextField.getText();
        String category = (String) categoryComboBox.getSelectedItem();
        String price = priceTextField.getText();
        int rangeSelector = 0;
        String range = "";
        if (jRadioButton1.isSelected() == true){
            rangeSelector = 1;
        }else if(jRadioButton2.isSelected() == true){
            rangeSelector = 2;
        }else if(jRadioButton3.isSelected() == true){
            rangeSelector = 3;
        }
        
        switch(rangeSelector){
            case 1:
                range = "low";
                break;
            case 2:
                range = "medium";
                break;
            case 3:
                range = "high";
                break;
            default:
                break;
        }
        
        if(idTextField.getText().trim().isEmpty() || category == "SELECT" || nameTextField.getText().trim().isEmpty() || rangeSelector == 0 || priceTextField.getText().trim().isEmpty()){
            System.out.println("Error");
            new NoticeWindow(NoticeType.WARNING_NOTIFICATION,"Details invalid! Try adding valid details.",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
        }else{
            boolean isNumeric = numberVerification(id);
            boolean priceNumericCheck = priceVerification(price);
            if(isNumeric == true && priceNumericCheck == true){
                boolean repeated = repeatCheck();
                if(repeated){
                    new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"ProductID repeated!",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                }else{
                    totalItem();
                    Object[] row = {idTextField.getText(), category, nameTextField.getText(), range, priceTextField.getText()};
                    rowData = (DefaultTableModel) jTable1.getModel();
                    DefaultTableModel rowData1 = (DefaultTableModel) jTable2.getModel();
                    rowData.addRow(row);
                    rowData1.addRow(row);
                    jPanel13.setVisible(true);
                    new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Product Details Added!",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                }
            }else{
                System.out.println("String data added in numeric text field!");
                new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"String data added in numeric text field! Enter numeric data in price and product ID.",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            }
        } 
        clear();
    }//GEN-LAST:event_addButtonMouseClicked

    public void totalItem(){
        jLabel21.setText("Total Items : " + (jTable1.getRowCount()+1));
        jlabel22.setText("Total Items : " + (jTable1.getRowCount()+1));
    }
     public void importedTotalItem(){
        jLabel21.setText("Total Items : " + (jTable1.getRowCount()));
        jlabel22.setText("Total Items : " + (jTable1.getRowCount()));
         jLabel23.setText("Total Items : " + (jTable1.getRowCount()));
    }
    
    
    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        clear();
    }//GEN-LAST:event_clearButtonMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        String searchPrice = searchTextField.getText();
        Boolean isNumeric = numberVerification(searchPrice);
        ArrayList sortedArray;
        
        if(isNumeric == true){
            int rowCount = jTable1.getRowCount();
            int colCount = jTable1.getColumnCount();

            al = new ArrayList();
            for(int i = 0; i<rowCount; i++){
                ArrayList tempAl = new ArrayList();
                for(int j = 0; j < colCount; j++){
                    tempAl.add(jTable1.getValueAt(i,j));
                }
                al.add(tempAl);
            }

            sort();
            System.out.println(al.toString());

            sortedArray = new ArrayList();

            for(int i = 0; i<al.size();i++){
                ArrayList tempal = (ArrayList) al.get(i);
                sortedArray.add(tempal.get(4));
            }
            System.out.println(sortedArray.toString());

            int find = Integer.parseInt(searchTextField.getText());
            int low = 0;
            int high = sortedArray.size()-1;
            int index = binarySearch(sortedArray,low,high,find);

            if(index == -1){
                System.out.println("ERROR NO SEARCH RESULTS");
                searchTextField.setText("");
                new NoticeWindow(NoticeType.WARNING_NOTIFICATION,"No search result found!",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            }else{
                System.out.println(al.get(index).toString());
                ArrayList searchedArray = (ArrayList) al.get(index);
                String idLabel = searchedArray.get(0).toString();
                String categoryLabel = searchedArray.get(1).toString();
                String nameLabel = searchedArray.get(2).toString();
                String rangeLabel = searchedArray.get(3).toString();
                String priceLabel = searchedArray.get(4).toString();
                String[] row1 = {idLabel, categoryLabel, nameLabel, rangeLabel, priceLabel};
                    DefaultTableModel tblModel=(DefaultTableModel) SearchTable.getModel();
                     while(tblModel.getRowCount() > 0)
        {
            tblModel.removeRow(0);
        }
                    tblModel.addRow(row1);
                     jPanel12.setVisible(true);
                     searchTextField.setText("");
                      new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"The searched price is "+priceLabel+" and items is "+nameLabel,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            }
        }else{
            System.out.println("Error! The provided datatype isn't numeric.");
            new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Error! The provided datatype isn't numeric.",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
        }
    }//GEN-LAST:event_searchBtnMouseClicked

    private void clearSearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSearchBtnMouseClicked
        searchTextField.setText("");
    }//GEN-LAST:event_clearSearchBtnMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Export_Data();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Import_DataCSV();
       importedTotalItem();
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FileExportCSV();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        DelTableInfo();
        clear();
        jPanel13.setVisible(false);
        jLabel21.setText("Total Items : ");
        searchTextField.setText("");
        DelTablese();
        jlabel22.setText("Total Items : ");
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
         //DelTablese();
        //searchTextField.setText("");
        //jPanel12.setVisible(false);
        //Sjlabel22.setText("Total Items : ");
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        
         jTextArea1.setText("");
         jTextField3.setText("");
         jTextField7.setText("");
         
        
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:        
        DelTableInfo();
        clear();
        jPanel13.setVisible(false);
        jLabel21.setText("Total Items : ");
        searchTextField.setText("");
        DelTablese();
        jlabel22.setText("Total Items : ");
    }//GEN-LAST:event_jLabel24MouseClicked

    private void priceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextField1ActionPerformed

    private void nameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextField1ActionPerformed

    private void idTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextField1ActionPerformed

    //Searching For id
    private int Search_Id(){
        int Row = -1;
        try {
            int Product_Id = Integer.parseInt(idTextField1.getText());
            for(int i = 0; i < jTable1.getRowCount();i++){
                if(Product_Id==Integer. parseInt(jTable1.getValueAt(i, 0).toString())){
                    Row = i;
                    i = jTable1.getRowCount();
                }
            }
            
        } catch (Exception e) {
        }
        return Row;
    }
 
    private void UpdateTabele(int row){
        try {
            int RowUpdate = row;
            String[] Values = new String[jTable1.getColumnCount()]; 
            for(int i = 0; i < jTable1.getColumnCount();i++){
                Values[i] = jTable1.getValueAt(RowUpdate, i).toString();
            }
            for(int i = 0; i < jTable1.getColumnCount(); i++){
                if(0 == i){
                    idTextField1.setText(Values[i]);
                }
                if (i == 1) {
                    for(int j = 0; j < 16; j++){
                        if(categoryComboBox1.getItemAt(j).equals(Values[i]) ){
                            categoryComboBox1.setSelectedIndex(j);
                        }
                    }
                }
                if (i == 2) {
                    nameTextField1.setText(Values[i]);
                }
                if (i == 3) {
                    if(Values[i].equals("low")){
                        jRadioButton6.setSelected(true);
                    }
                    if(Values[i].equals("medium")){
                        jRadioButton5.setSelected(true);
                    }
                    if(Values[i].equals("high")){
                        jRadioButton4.setSelected(true);
                    }
                }
                if (i == 4){
                    priceTextField1.setText(Values[i]);
                }
            }
        } catch (Exception e) {
        }
        
    }
        
    private void addButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButton1MouseClicked
        // TODO add your handling code here:
         int row = -1;
        row = Search_Id();
        if (row > -1) { 
            System.out.println(row);
            UpdateTabele(row);
               new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Record Found",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
               jLabel31.setEnabled(true);
        
        }else{
            new NoticeWindow(NoticeType.WARNING_NOTIFICATION,"No record Found ",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            clear();
        }
        
        
    }//GEN-LAST:event_addButton1MouseClicked

    private void addButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButton1MouseEntered
        // TODO add your handling code here:
                // TODO add your handling code here:
        Add_Pannel3.setForeground(new Color(104,81,216));
        Clear_Pannel2.setForeground(new Color(204,204,255));
        addButton1.setForeground(new Color(255,255,255));
        clearButton1.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_addButton1MouseEntered

    private void addButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButton1MouseExited
        // TODO add your handling code here:
        Add_Pannel3.setForeground(new Color(204,204,255));
        Clear_Pannel2.setForeground(new Color(104,81,216));
        addButton1.setForeground(new Color(44,54,99));
        clearButton1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_addButton1MouseExited

    private void Add_Pannel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Pannel3MouseEntered

    private void Add_Pannel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Pannel3MouseExited

    private void FinalUpdate(int RowUpdate){
        try {
            String iD = idTextField1.getText().trim();
            String price = priceTextField1.getText().trim();
            String name = nameTextField1.getText().trim();
            String range ="";
            String category = (String) categoryComboBox1.getSelectedItem();
            if (jRadioButton6.isSelected()) {
                range = "low";
            }
            if (jRadioButton5.isSelected()) {
                range = "medium";
            }
            if (jRadioButton4.isSelected()) {
                range = "high";
            }
            if (idTextField1.getText().trim().isEmpty()) {
                 new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"First Enter and search valid Product ID",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            }
            else{
            String [] Values = {iD,category,name,range,price};
            for(int i = 0; i < jTable2.getColumnCount();i++){
                jTable2.setValueAt(Values[i], RowUpdate, i);
            }
            for(int i = 0; i < jTable1.getColumnCount();i++){
                jTable1.setValueAt(Values[i], RowUpdate, i);
            }
             new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Updated Details Successfully",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            
            }
        } catch (Exception e) {
        }
    }
        
    private void clearButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton1MouseClicked
        // TODO add your handling code here:
        int row = Search_Id();
        FinalUpdate(row);
        
        clear();
    }//GEN-LAST:event_clearButton1MouseClicked

    private void clearButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton1MouseEntered
        // TODO add your handling code here
        Add_Pannel3.setForeground(new Color(104,81,216));
        Clear_Pannel2.setForeground(new Color(204,204,255));
        addButton1.setForeground(new Color(255,255,255));
        clearButton1.setForeground(new Color(44,54,99));
    }//GEN-LAST:event_clearButton1MouseEntered

    private void clearButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton1MouseExited
        // TODO add your handling code here:
        Add_Pannel3.setForeground(new Color(204,204,255));
        Clear_Pannel2.setForeground(new Color(104,81,216));
        addButton1.setForeground(new Color(44,54,99));
        clearButton1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_clearButton1MouseExited

    private void Clear_Pannel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_Pannel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_Pannel2MouseEntered

    private void Clear_Pannel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_Pannel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_Pannel2MouseExited

    private void DeleteButnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButnMouseClicked
        // TODO add your handling code here:
        int row = Search_Id();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.removeRow(row);
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        model1.removeRow(row);
        clear();
    }//GEN-LAST:event_DeleteButnMouseClicked

    private void DeleteButnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButnMouseEntered

    private void DeleteButnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButnMouseExited

    private void Clear_Pannel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_Pannel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_Pannel3MouseEntered

    private void Clear_Pannel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_Pannel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_Pannel3MouseExited

    private void Generate_ReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_ReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Generate_ReportsMouseClicked

    private void Generate_Lable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_Lable1MouseClicked
        // TODO add your handling code here:
         
        Generate_Reports2.setForeground(new Color(255,255,255));
        Generate_Lable1.setForeground(new Color(104,81,216));
        Download_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_update_25px_6.png")));
        //Inactive
        Search_Pannel.setForeground(new Color(104,81,216));
        Search_Lable.setForeground(new Color(255,255,255));
        Home_Pannel.setForeground(new Color(104,81,216));
        Home_Lable.setForeground(new Color(255,255,255));
        Support_Pannel.setForeground(new Color(104,81,216));
        Support_Lable.setForeground(new Color(255,255,255));
        Exit_Pannel.setForeground(new Color(104,81,216));
        Exit_Lable.setForeground(new Color(255,255,255));
        Exit_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitWhite.png")));
        Home_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_30px_6.png")));
        Search_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SerachWhite.png")));
        Support_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupportWhite.png")));
        //Pannels
        jPanel24.setVisible(true);
        jPanel3.setVisible(false);
        jPanel5.setVisible(false);
        jPanel7.setVisible(false);
    }//GEN-LAST:event_Generate_Lable1MouseClicked

    private void Generate_Lable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_Lable1MouseEntered
        // TODO add your handling code here:
        
        Download_Hover1.setBackground(Color.WHITE);
    }//GEN-LAST:event_Generate_Lable1MouseEntered

    private void Generate_Lable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_Lable1MouseExited
        // TODO add your handling code here:
        
        Download_Hover1.setBackground(new Color (104,81,216));
    }//GEN-LAST:event_Generate_Lable1MouseExited

    private void Generate_Reports2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generate_Reports2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Generate_Reports2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DelTableInfo();
        clear();
        jPanel13.setVisible(false);
        jLabel21.setText("Total Items : ");
        searchTextField.setText("");
        DelTablese();
        jlabel22.setText("Total Items : ");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void searchBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtn1MouseClicked
        // TODO add your handling code here:
        try {
            
       
           int count = 0; 
        DefaultTableModel dm = (DefaultTableModel)SearchTable.getModel();
        while(dm.getRowCount() > 0)
        {
            dm.removeRow(0);
        }
        String searchingCategory = (String) categoryComboBox2.getSelectedItem();
        for(int i = 0; i < jTable1.getRowCount(); i++){
            String tableCategory = (String) jTable1.getValueAt(i,1);
            if(searchingCategory.equals(tableCategory)){
             count=count+1;
                Object[] row = {jTable1.getValueAt(i,0),jTable1.getValueAt(i,1),jTable1.getValueAt(i,2),jTable1.getValueAt(i,3),jTable1.getValueAt(i,4)};
                searchRowData = (DefaultTableModel) SearchTable.getModel();
                searchRowData.addRow(row);

            }
          
        }
       // new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Data not found"+count,NoticeWindow.LONG_DELAY,NPosition.BOTTOM_RIGHT);
         ArrayList tempArray= new ArrayList();
        for(int j=0; j<SearchTable.getRowCount();j++){
                  
                tempArray.add(SearchTable.getValueAt(j, 2));
               
        }
        String data = "";
        for(int i = 0; i < tempArray.size();i++){
            
            if(1 == tempArray.size()){
                data = data + tempArray.get(i);
                
            }else if(i == tempArray.size()-1){
                data = data + "and " + tempArray.get(i).toString();
            }else if (i == tempArray.size()-2){
                data = data + tempArray.get(i) + " ";
            }else{
                data = data + tempArray.get(i) + ", ";
            }
            
             
        }
        
        if (data.isEmpty()) {
                System.out.println("hii");
                 new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Data not found",NoticeWindow.LONG_DELAY,NPosition.BOTTOM_RIGHT); 
            }
        else{
            new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Total number of items in selected category is : "+count+" and the item is "+ data,NoticeWindow.LONG_DELAY,NPosition.BOTTOM_RIGHT);
        }
        System.out.println("Total number of items in selected category is :"+count);
       
          } catch (Exception e) {
               new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Data not found",NoticeWindow.LONG_DELAY,NPosition.BOTTOM_RIGHT);
        
        }
    }//GEN-LAST:event_searchBtn1MouseClicked

    private void searchBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtn1MouseEntered
        // TODO add your handling code here:
          Add_Pannel4.setForeground(new Color(104,81,216));
       
        searchBtn1.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_searchBtn1MouseEntered

    private void searchBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtn1MouseExited

    private void Add_Pannel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Pannel4MouseEntered

    private void Add_Pannel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Pannel4MouseExited
        // TODO add your handling code here:
        
        Add_Pannel4.setForeground(new Color(204,204,255));
        
        searchBtn1.setForeground(new Color(44,54,99));
        
    }//GEN-LAST:event_Add_Pannel4MouseExited

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    
    private boolean numberVerification(String id){
        try{
            int i = Integer.parseInt(id);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
    private boolean priceVerification(String price){
        try{
            int i = Integer.parseInt(price);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
    private void clear(){
        idTextField.setText("");
        categoryComboBox.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        nameTextField.setText("");
        priceTextField.setText("");
        idTextField1.setText("");
        categoryComboBox1.setSelectedIndex(0);
        nameTextField1.setText("");
        priceTextField1.setText("");
    }
    
    private boolean repeatCheck(){
        int tableRowCount = jTable1.getRowCount();
        int currentId = Integer.parseInt(idTextField.getText());
        if(tableRowCount == 0){
            System.out.println("No previous values");
        }else{
            for(int nextRow = 0; nextRow < tableRowCount; nextRow++){
                String prevIdStr = jTable1.getValueAt(nextRow,0).toString();
                int prevId = Integer.parseInt(prevIdStr);
                if(currentId == prevId){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public void sort(){
        for(int i = 0; i <al.size(); i++){
            int minPosition = minPositionFinder(al, i);
            swap(al, minPosition, i);
        }
    }
    public int minPositionFinder(ArrayList al, int from) {
        int m = from;
        ArrayList tempa = (ArrayList) al.get(from);
        for(int i = from+1; i<al.size();i++){
            ArrayList tempal = (ArrayList) al.get(i);
            if(Integer.parseInt((String) tempa.get(4)) > Integer.parseInt((String) tempal.get(4))){
                tempa = tempal;
                m = i;
            }
        }
        return m;
    }
    
    public void swap(ArrayList al, int minPos, int from){
        ArrayList swapList = (ArrayList) al.get(minPos);
        al.set(minPos, al.get(from));
        al.set(from, swapList);
    }
    
    public static int binarySearch(ArrayList a, int low, int high, int find){
        if(low<=high){
            int mid = (low+high)/2;
            if(Integer.parseInt(a.get(mid).toString()) == find){
                return mid;
            }else if(Integer.parseInt(a.get(mid).toString()) < find){
                return binarySearch(a, mid + 1, high, find);
            }else if(Integer.parseInt(a.get(mid).toString()) > find){
                return binarySearch(a, low, mid - 1, find);
            }
        }else{
            return -1;
        }
        return 0;
    }
    
    //Method for deleting Values from table 
    public void DelTableInfo(){
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
            dm.removeRow(i);
            
        }
          DefaultTableModel dm1 = (DefaultTableModel) jTable2.getModel();
        for (int i = jTable2.getRowCount() - 1; i >= 0; i--) {
            dm1.removeRow(i);
        }
    }
     public void DelTablese(){
         
        DefaultTableModel dm2 = (DefaultTableModel) jTable2.getModel();
        for (int i = jTable2.getRowCount() - 1; i >= 0; i--) {
            dm2.removeRow(i);
        }
        DefaultTableModel dm = (DefaultTableModel) SearchTable.getModel();
        for (int i = SearchTable.getRowCount() - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
    //Export Data to CSV file
    private void FileExportCSV(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to Save");
        int userSelection = fileChooser.showSaveDialog(this);
        fileChooser.addChoosableFileFilter((new  FileNameExtensionFilter("Txt",".txt")));
        
        if(userSelection == fileChooser.APPROVE_OPTION){
            File filetosave = fileChooser.getSelectedFile();
            try {
                FileWriter fw = new  FileWriter(filetosave);
                BufferedWriter bw = new  BufferedWriter(fw);
                for(int i = 0; i < jTable1.getRowCount();i++){
                    for(int j = 0; j < jTable1.getColumnCount();j++){
                        bw.write(jTable1.getValueAt(i, j).toString()+",");
                    }
                    bw.newLine();
                }
               

                bw.close();
                fw.close();
                new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Export Sucessflly",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            } catch (Exception e) {
                
            }
            
        }
    }
    
    //Import CSV DATA
    public void Import_DataCSV(){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to Open");
            
            int userSelection = fileChooser.showDialog(this, "Open");
            if(userSelection == fileChooser.APPROVE_OPTION){
                File filetosave = fileChooser.getSelectedFile();
            try {
                FileReader fr = new FileReader(filetosave);
                BufferedReader br = new BufferedReader(fr);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                DefaultTableModel model1 = (DefaultTableModel)jTable2.getModel();
                Object[] lines = br.lines().toArray();
                DelTableInfo();
                 jPanel13.setVisible(true);
                for(int i = 0; i<lines.length;i++){
                    String[] row = lines[i].toString().split(",");
                    model.addRow(row);
                }
                for(int i = 0; i<lines.length;i++){
                    String[] row = lines[i].toString().split(",");
                    model1.addRow(row);
                }
            } catch (Exception e) {
            }
        }
    }
    
    //Import Data to TXT
    public void Import_Data(){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to Open");
            int userSelection = fileChooser.showDialog(this, "Open");
            if(userSelection == fileChooser.APPROVE_OPTION){
                File filetosave = fileChooser.getSelectedFile();
            try {
                FileReader fr = new FileReader(filetosave);
                BufferedReader br = new BufferedReader(fr);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                Object[] lines = br.lines().toArray();
                DelTableInfo();
                jPanel13.setVisible(true);
                for(int i = 0; i<lines.length;i++){
                    String[] row = lines[i].toString().split(" ");
                    model.addRow(row);
                }
            } catch (Exception e) {
            }
        }
    }
    
    //Export Data to TXT
    public void Export_Data(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to Save");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == fileChooser.APPROVE_OPTION){
            File filetosave = fileChooser.getSelectedFile();
            try {
                FileWriter fw = new  FileWriter(filetosave);
                BufferedWriter bw = new  BufferedWriter(fw);
                for(int i = 0; i < jTable1.getRowCount();i++){
                    for(int j = 0; j < jTable1.getColumnCount();j++){
                        bw.write(jTable1.getValueAt(i, j).toString()+" ");
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Loaded Sucessfully","Sucess", JOptionPane.INFORMATION_MESSAGE);

                bw.close();
                fw.close();
            } catch (Exception e) {
                
            }
        
    }
    }
    
    public static final String Font_Path="fonts/Roboto-Medium.ttf";
    private static Font createFont(String url) throws FontFormatException, IOException{


        return Font.createFont(Font.TRUETYPE_FONT,IndexPage.class.getClassLoader().getResourceAsStream(Font_Path))
                .deriveFont(80,26f);


    }
    
     public static final String Font_menu="fonts/Roboto-Medium.ttf";
    private static Font createFontmenu(String url) throws FontFormatException, IOException{


        return Font.createFont(Font.TRUETYPE_FONT,IndexPage.class.getClassLoader().getResourceAsStream(Font_menu))
                .deriveFont(80,12f);
    }
    
    public static final String Font_PathNav="fonts/Roboto-Medium.ttf";
    private static Font createFontNav(String url) throws FontFormatException, IOException{


        return Font.createFont(Font.TRUETYPE_FONT,IndexPage.class.getClassLoader().getResourceAsStream(Font_PathNav))
                .deriveFont(80,16f);

        
    }
    public static final String Font_PathHeading="fonts/Roboto-Medium.ttf";
    private static Font createFontHeading(String url) throws FontFormatException, IOException{


        return Font.createFont(Font.TRUETYPE_FONT,IndexPage.class.getClassLoader().getResourceAsStream(Font_PathHeading))
                .deriveFont(80,20f);


    } 
    public static final String Font_PathSub="fonts/Roboto-Medium.ttf";
    private static Font createFontHeadingSub(String url) throws FontFormatException, IOException{


        return Font.createFont(Font.TRUETYPE_FONT,IndexPage.class.getClassLoader().getResourceAsStream(Font_PathSub))
                .deriveFont(50,1f);


    }
    public static final String Font_Path01="fonts/Roboto-Medium.ttf";
    private static Font createFontTextfield(String url) throws FontFormatException, IOException{


        return Font.createFont(Font.TRUETYPE_FONT,IndexPage.class.getClassLoader().getResourceAsStream(Font_Path01))
                .deriveFont(80,18f);


    }
      public static final String Font_Pathtabhe="fonts/Roboto-Medium.ttf";
    private static Font createFonttabhea(String url) throws FontFormatException, IOException{


        return Font.createFont(Font.TRUETYPE_FONT,IndexPage.class.getClassLoader().getResourceAsStream(Font_Pathtabhe))
                .deriveFont(80,16f);


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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexPage().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Lable2;
    private javax.swing.JPanel Add_Pannel;
    private javax.swing.JPanel Add_Pannel1;
    private javax.swing.JPanel Add_Pannel2;
    private javax.swing.JPanel Add_Pannel3;
    private javax.swing.JPanel Add_Pannel4;
    private javax.swing.JPanel Clear_Pannel;
    private javax.swing.JPanel Clear_Pannel1;
    private javax.swing.JPanel Clear_Pannel2;
    private javax.swing.JPanel Clear_Pannel3;
    private javax.swing.JLabel Datelabel;
    private javax.swing.JLabel Datelabel1;
    private javax.swing.JLabel Datelabel2;
    private javax.swing.JLabel Datelabel3;
    private javax.swing.JLabel DeleteButn;
    private javax.swing.JPanel Download_Hover;
    private javax.swing.JPanel Download_Hover1;
    private javax.swing.JLabel Download_Logo;
    private javax.swing.JLabel Download_Logo2;
    private javax.swing.JLabel Event;
    private javax.swing.JLabel Event1;
    private javax.swing.JLabel Event2;
    private javax.swing.JLabel Event3;
    private javax.swing.JPanel Exit_Hover;
    private javax.swing.JLabel Exit_Lable;
    private javax.swing.JLabel Exit_Logo;
    private javax.swing.JPanel Exit_Pannel;
    private javax.swing.JLabel Friends;
    private javax.swing.JLabel Generate_Lable;
    private javax.swing.JLabel Generate_Lable1;
    private javax.swing.JPanel Generate_Reports;
    private javax.swing.JPanel Generate_Reports2;
    private javax.swing.JLabel Heading_MainPannel;
    private javax.swing.JLabel Heading_MainPannel1;
    private javax.swing.JPanel Home_Hover;
    private javax.swing.JLabel Home_Lable;
    private javax.swing.JLabel Home_Logo;
    private javax.swing.JPanel Home_Pannel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Profile_Lable;
    private javax.swing.JPanel Profile_PP;
    private javax.swing.JPanel Profile_PP1;
    private javax.swing.JPanel Profile_PP2;
    private javax.swing.JPanel Profile_PP3;
    private javax.swing.JPanel Profile_PP4;
    private javax.swing.JPanel Profile_PP5;
    private javax.swing.JPanel Profile_PP6;
    private javax.swing.JTable SearchTable;
    private javax.swing.JLabel Search_Heading;
    private javax.swing.JLabel Search_Heading1;
    private javax.swing.JPanel Search_Hover;
    private javax.swing.JLabel Search_Lable;
    private javax.swing.JPanel Search_Pannel;
    private javax.swing.JLabel Search_logo;
    private javax.swing.JPanel Support_Hover;
    private javax.swing.JLabel Support_Lable;
    private javax.swing.JPanel Support_Pannel;
    private javax.swing.JLabel Support_logo;
    private javax.swing.JLabel TickLogo;
    private javax.swing.JLabel User_Name;
    private javax.swing.JLabel User_Role;
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel addButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JComboBox<String> categoryComboBox1;
    private javax.swing.JComboBox<String> categoryComboBox2;
    private javax.swing.JLabel clearButton;
    private javax.swing.JLabel clearButton1;
    private javax.swing.JLabel clearSearchBtn;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField idTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel jlabel22;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField priceTextField1;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JLabel searchBtn1;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
    class RoundedPanel extends JPanel
    {

        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.

            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background

//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//
        }
    }
}

