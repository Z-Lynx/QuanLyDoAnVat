/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoAnVat.QuanLyDoAnVat;

import QuanLy.controllerGD;
import QuanLy.danhmuc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HoaiAnh
 */
public class GiaoDienAdmin extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienAdmin
     */
    public GiaoDienAdmin() {
        //initComponents();
        //controllerGD cgd = new controllerGD(jview);
        //cgd.setView();
        List<danhmuc> listItem = new ArrayList<>();
        listItem.add(new danhmuc("NhanVien", pnNVien_106, jbquanlynhanvien));
        listItem.add(new danhmuc("Menu", pnMenu_106, jbmenu));
        listItem.add(new danhmuc("ThongKe", pnThongKe_106, jbthongke));
        //cgd.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        pnMenu_106 = new javax.swing.JPanel();
        jbmenu = new javax.swing.JLabel();
        pnFood_106 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnNVien_106 = new javax.swing.JPanel();
        jbquanlynhanvien = new javax.swing.JLabel();
        pnThongKe_106 = new javax.swing.JPanel();
        jbthongke = new javax.swing.JLabel();
        logOut_106 = new javax.swing.JButton();
        jview = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        pnMenu_106.setBackground(new java.awt.Color(0, 153, 102));
        pnMenu_106.setForeground(new java.awt.Color(255, 255, 255));

        jbmenu.setBackground(new java.awt.Color(0, 153, 102));
        jbmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbmenu.setForeground(new java.awt.Color(254, 254, 254));
        jbmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbmenu.setText("QUẢN LÝ MENU");

        javax.swing.GroupLayout pnMenu_106Layout = new javax.swing.GroupLayout(pnMenu_106);
        pnMenu_106.setLayout(pnMenu_106Layout);
        pnMenu_106Layout.setHorizontalGroup(
            pnMenu_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnMenu_106Layout.setVerticalGroup(
            pnMenu_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        pnFood_106.setBackground(new java.awt.Color(0, 153, 102));
        pnFood_106.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BÁN ĐỒ ĂN VẶT");

        javax.swing.GroupLayout pnFood_106Layout = new javax.swing.GroupLayout(pnFood_106);
        pnFood_106.setLayout(pnFood_106Layout);
        pnFood_106Layout.setHorizontalGroup(
            pnFood_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFood_106Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnFood_106Layout.setVerticalGroup(
            pnFood_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFood_106Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnNVien_106.setBackground(new java.awt.Color(0, 153, 102));

        jbquanlynhanvien.setBackground(new java.awt.Color(0, 153, 102));
        jbquanlynhanvien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbquanlynhanvien.setForeground(new java.awt.Color(255, 255, 255));
        jbquanlynhanvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbquanlynhanvien.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout pnNVien_106Layout = new javax.swing.GroupLayout(pnNVien_106);
        pnNVien_106.setLayout(pnNVien_106Layout);
        pnNVien_106Layout.setHorizontalGroup(
            pnNVien_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbquanlynhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnNVien_106Layout.setVerticalGroup(
            pnNVien_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbquanlynhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        pnThongKe_106.setBackground(new java.awt.Color(0, 153, 102));
        pnThongKe_106.setForeground(new java.awt.Color(255, 255, 255));

        jbthongke.setBackground(new java.awt.Color(0, 153, 102));
        jbthongke.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbthongke.setForeground(new java.awt.Color(255, 250, 250));
        jbthongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbthongke.setText("THỐNG KÊ");

        javax.swing.GroupLayout pnThongKe_106Layout = new javax.swing.GroupLayout(pnThongKe_106);
        pnThongKe_106.setLayout(pnThongKe_106Layout);
        pnThongKe_106Layout.setHorizontalGroup(
            pnThongKe_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnThongKe_106Layout.setVerticalGroup(
            pnThongKe_106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbthongke, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        logOut_106.setBackground(new java.awt.Color(0, 204, 102));
        logOut_106.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logOut_106.setForeground(new java.awt.Color(0, 152, 255));
        logOut_106.setText("ĐĂNG XUẤT");
        logOut_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_106ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnFood_106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnNVien_106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnMenu_106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnThongKe_106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logOut_106, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnFood_106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnNVien_106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnMenu_106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnThongKe_106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(logOut_106, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jviewLayout = new javax.swing.GroupLayout(jview);
        jview.setLayout(jviewLayout);
        jviewLayout.setHorizontalGroup(
            jviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        jviewLayout.setVerticalGroup(
            jviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOut_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_106ActionPerformed
        // TODO add your handling code here:
        /*this.setVisible(false);
        DangNhapMenu dkmt = new DangNhapMenu();
        dkmt.setVisible(true);*/
    }//GEN-LAST:event_logOut_106ActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jbmenu;
    private javax.swing.JLabel jbquanlynhanvien;
    private javax.swing.JLabel jbthongke;
    private javax.swing.JPanel jview;
    private javax.swing.JButton logOut_106;
    private javax.swing.JPanel pnFood_106;
    private javax.swing.JPanel pnMenu_106;
    private javax.swing.JPanel pnNVien_106;
    private javax.swing.JPanel pnThongKe_106;
    // End of variables declaration//GEN-END:variables
}