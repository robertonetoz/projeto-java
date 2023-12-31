/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.views.administrativo;

import br.edu.imepac.views.atendente.AtendenteMain;
import br.edu.imepac.views.atendente.LoginA;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class CadastroAtendente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAtendente
     */
    public CadastroAtendente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabelNome_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelCPF_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelEndereco_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelNumero_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelBairro_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelNascimento_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelCEP_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelCidade_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelTelefone_FormularioRecepcionista = new javax.swing.JLabel();
        jTextFieldNome_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldCPF_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldEndereco_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldNumero_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldBairro_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldCEP_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldNascimento_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldTelefone_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldCidade_FormularioRecepcionista = new javax.swing.JTextField();
        jLabelEstado_FormularioRecepcionista = new javax.swing.JLabel();
        jComboBoxEstado_FormularioRecepcionista = new javax.swing.JComboBox<>();
        jLabelSexo_FormularioRecepcionista = new javax.swing.JLabel();
        jComboBoxSexo_FormularioRecepcionista = new javax.swing.JComboBox<>();
        jButtonSalvar_FormularioRecepcionista = new javax.swing.JButton();
        jButtonCancelar_FormularioRecepcionista = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro do Atendente");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Cadastro Atendente");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfil-de-usuario (1).png"))); // NOI18N

        jLabelNome_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNome_FormularioRecepcionista.setText("Nome:");

        jLabelCPF_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCPF_FormularioRecepcionista.setText("CPF:");

        jLabelEndereco_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEndereco_FormularioRecepcionista.setText("Endereço:");

        jLabelNumero_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNumero_FormularioRecepcionista.setText("Nº");

        jLabelBairro_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBairro_FormularioRecepcionista.setText("Bairro:");

        jLabelNascimento_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNascimento_FormularioRecepcionista.setText("Nascimento:");

        jLabelCEP_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCEP_FormularioRecepcionista.setText("CEP:");

        jLabelCidade_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCidade_FormularioRecepcionista.setText("Cidade:");

        jLabelTelefone_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefone_FormularioRecepcionista.setText("Telefone:");

        jTextFieldNome_FormularioRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNome_FormularioRecepcionistaActionPerformed(evt);
            }
        });

        jLabelEstado_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEstado_FormularioRecepcionista.setText("Estado:");

        jComboBoxEstado_FormularioRecepcionista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));

        jLabelSexo_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSexo_FormularioRecepcionista.setText("Sexo:");

        jComboBoxSexo_FormularioRecepcionista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               ", "Masculino", "Feminino", "Outro" }));

        jButtonSalvar_FormularioRecepcionista.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalvar_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSalvar_FormularioRecepcionista.setText("Salvar");
        jButtonSalvar_FormularioRecepcionista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalvar_FormularioRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar_FormularioRecepcionistaActionPerformed(evt);
            }
        });

        jButtonCancelar_FormularioRecepcionista.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCancelar_FormularioRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCancelar_FormularioRecepcionista.setText("Cancelar");
        jButtonCancelar_FormularioRecepcionista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancelar_FormularioRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar_FormularioRecepcionistaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Já possui conta?");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNome_FormularioRecepcionista)
                    .addComponent(jLabelCPF_FormularioRecepcionista)
                    .addComponent(jLabelBairro_FormularioRecepcionista)
                    .addComponent(jLabelCidade_FormularioRecepcionista)
                    .addComponent(jLabelNascimento_FormularioRecepcionista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCPF_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelEndereco_FormularioRecepcionista))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldBairro_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelNumero_FormularioRecepcionista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCEP_FormularioRecepcionista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCEP_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldEndereco_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldNascimento_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTelefone_FormularioRecepcionista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefone_FormularioRecepcionista))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldCidade_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEstado_FormularioRecepcionista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSexo_FormularioRecepcionista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSexo_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldNome_FormularioRecepcionista))
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jButtonSalvar_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar_FormularioRecepcionista)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome_FormularioRecepcionista))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCPF_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF_FormularioRecepcionista)
                            .addComponent(jLabelEndereco_FormularioRecepcionista))
                        .addGap(8, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBairro_FormularioRecepcionista)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBairro_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNumero_FormularioRecepcionista)
                        .addComponent(jTextFieldNumero_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCEP_FormularioRecepcionista)
                        .addComponent(jTextFieldCEP_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade_FormularioRecepcionista)
                    .addComponent(jTextFieldCidade_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado_FormularioRecepcionista)
                    .addComponent(jComboBoxEstado_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexo_FormularioRecepcionista)
                    .addComponent(jComboBoxSexo_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNascimento_FormularioRecepcionista)
                    .addComponent(jTextFieldNascimento_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone_FormularioRecepcionista)
                    .addComponent(jTextFieldTelefone_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar_FormularioRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginA().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCancelar_FormularioRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar_FormularioRecepcionistaActionPerformed
        MainAdm.main(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar_FormularioRecepcionistaActionPerformed

    private void jButtonSalvar_FormularioRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_FormularioRecepcionistaActionPerformed
        if (jTextFieldNome_FormularioRecepcionista.getText().equals("Roberto Campos Neto") && jTextFieldCPF_FormularioRecepcionista.getText().equals("10101010") && jTextFieldBairro_FormularioRecepcionista.getText().equals("Bosque") && jTextFieldEndereco_FormularioRecepcionista.getText().equals("Avenida Brasil") && jTextFieldNumero_FormularioRecepcionista.getText().equals("777") && jTextFieldCEP_FormularioRecepcionista.getText().equals("123456") && jTextFieldCidade_FormularioRecepcionista.getText().equals("Araguari") && jTextFieldNascimento_FormularioRecepcionista.getText().equals("10/10/2002") && jTextFieldTelefone_FormularioRecepcionista.getText().equals("1011121314")) {

            JOptionPane.showMessageDialog(null, "Cadastrado");
            new LoginA().setVisible(true);
            dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro Inválido");
        }// TODO add your han        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvar_FormularioRecepcionistaActionPerformed

    private void jTextFieldNome_FormularioRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNome_FormularioRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNome_FormularioRecepcionistaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar_FormularioRecepcionista;
    private javax.swing.JButton jButtonSalvar_FormularioRecepcionista;
    private javax.swing.JComboBox<String> jComboBoxEstado_FormularioRecepcionista;
    private javax.swing.JComboBox<String> jComboBoxSexo_FormularioRecepcionista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBairro_FormularioRecepcionista;
    private javax.swing.JLabel jLabelCEP_FormularioRecepcionista;
    private javax.swing.JLabel jLabelCPF_FormularioRecepcionista;
    private javax.swing.JLabel jLabelCidade_FormularioRecepcionista;
    private javax.swing.JLabel jLabelEndereco_FormularioRecepcionista;
    private javax.swing.JLabel jLabelEstado_FormularioRecepcionista;
    private javax.swing.JLabel jLabelNascimento_FormularioRecepcionista;
    private javax.swing.JLabel jLabelNome_FormularioRecepcionista;
    private javax.swing.JLabel jLabelNumero_FormularioRecepcionista;
    private javax.swing.JLabel jLabelSexo_FormularioRecepcionista;
    private javax.swing.JLabel jLabelTelefone_FormularioRecepcionista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldBairro_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldCEP_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldCPF_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldCidade_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldEndereco_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldNascimento_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldNome_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldNumero_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldTelefone_FormularioRecepcionista;
    // End of variables declaration//GEN-END:variables
}
