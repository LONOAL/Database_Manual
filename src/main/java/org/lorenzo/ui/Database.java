/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.lorenzo.ui;
import org.lorenzo.conection.Conection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author PC-LORENZO
 */
public class Database extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    Statement st = null;
    ResultSet rs = null;
    Connection con2 = null;
    String[] title;

    /**
     * Creates new form DatabaseUi
     */
    public Database() {
        initComponents();
        emptyTable(new String[]{"id", "sofifaid", "short_name", "long_name", "player_position", "overall", "potential", "value_eur", "wage_eur", "age", "height_cm", "weight_kg", "club_team_id", "club_jersey_number", "club_loaned_from", "club_joined", "contract_valid_until", "preferred_foot", "nation_id", "weak_foot", "skill_moves", "international_reputation", "release_clause_eur", "player_traits", "pace", "shooting", "passing", "dribbling", "defending","physyc",  "goalkeeper_diving", "goalkeeping_handling", "goalkeeping_kicking", "goalkeeping_positioning", "goalkeeping_reflexes"});
        seeData("player");
    }
    public void emptyTable(String[]title) {
        this.title = title;
        model = new DefaultTableModel(null,title);
        jTable1.setModel(model);
    }

    public void seeData(String name){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
            Conection conect1 = new Conection();
            con1 = conect1.getConnection();
            String dts[] = new String[title.length];
            String sql = "select * from "+name;
            java.sql.Statement st = con1.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                for (int i = 1; i <= dts.length; i++){
                    dts[i-1] = rs.getString(i);
                }
                miModelo.addRow(dts);
            }
            jTable1.setModel(miModelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nationB = new javax.swing.JButton();
        playerB = new javax.swing.JButton();
        teamB = new javax.swing.JButton();
        leagueB = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        nationB.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        nationB.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\nation.png")); // NOI18N
        nationB.setText("NATION");
        nationB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationBActionPerformed(evt);
            }
        });

        playerB.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        playerB.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\player.png")); // NOI18N
        playerB.setText("PLAYER");
        playerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerBActionPerformed(evt);
            }
        });

        teamB.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        teamB.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\team.png")); // NOI18N
        teamB.setText("TEAM");
        teamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamBActionPerformed(evt);
            }
        });

        leagueB.setFont(new java.awt.Font("EA Font v1.5 by Ghettoshark", 0, 18)); // NOI18N
        leagueB.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\Boletines\\DatabaseMan\\src\\iconos\\league.png")); // NOI18N
        leagueB.setText("LEAGUE");
        leagueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leagueBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(playerB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(teamB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(leagueB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nationB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leagueB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nationBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationBActionPerformed
        // TODO add your handling code here:
        emptyTable(new String[]{"id", "nation_name","nartion_id"});
        seeData("nation");
    }//GEN-LAST:event_nationBActionPerformed

    private void playerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerBActionPerformed
        // TODO add your handling code here:
        emptyTable(new String[]{"id", "sofifaid", "short_name", "long_name", "player_position", "overall", "potential", "value_eur", "wage_eur", "age", "height_cm", "weight_kg", "club_team_id", "club_jersey_number", "club_loaned_from", "club_joined", "contract_valid_until", "preferred_foot", "nation_id", "weak_foot", "skill_moves", "international_reputation", "release_clause_eur", "player_traits", "pace", "shooting", "passing", "dribbling", "defending", "physic", "goalkeeping_handling", "goalkeeping_handling", "goalkeeping_kicking", "goalkeeping_positioning", "goalkeeping_reflexes"});
        seeData("player");
    }//GEN-LAST:event_playerBActionPerformed

    private void teamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBActionPerformed
        // TODO add your handling code here:
        emptyTable(new String[]{"id", "club_id","club_name","league_id"});
        seeData("team");
    }//GEN-LAST:event_teamBActionPerformed

    private void leagueBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leagueBActionPerformed
        // TODO add your handling code here:
        emptyTable(new String[]{"league_id", "league_name"});
        seeData("league");
    }//GEN-LAST:event_leagueBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton leagueB;
    private javax.swing.JButton nationB;
    private javax.swing.JButton playerB;
    private javax.swing.JButton teamB;
    // End of variables declaration//GEN-END:variables
}
