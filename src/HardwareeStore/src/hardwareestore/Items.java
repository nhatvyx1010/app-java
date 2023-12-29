
package hardwareestore;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nguyễn Phạm Nhật Vỹ
 */
public class Items extends javax.swing.JFrame {
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;  
    public Items() {
        initComponents();
        DisplayItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ItemsBtn = new javax.swing.JLabel();
        SellersBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ItPriceTb = new javax.swing.JTextField();
        ItNameTb = new javax.swing.JTextField();
        ItQtyTb = new javax.swing.JTextField();
        ItPictureLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ItCatCb = new javax.swing.JComboBox<>();
        BrowseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Downloadsduphong\\8-Bit Dinosaur Sticker by Animoia (2).png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HARDWARE STRORE");

        ItemsBtn.setBackground(new java.awt.Color(255, 255, 255));
        ItemsBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ItemsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ItemsBtn.setText("ITEMS");
        ItemsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsBtnMouseClicked(evt);
            }
        });

        SellersBtn.setBackground(new java.awt.Color(255, 255, 255));
        SellersBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SellersBtn.setForeground(new java.awt.Color(255, 255, 255));
        SellersBtn.setText("SELLERS");
        SellersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellersBtnMouseClicked(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setText("LOGOUT");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ItemsBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SellersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoutBtn)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(79, 79, 79)
                .addComponent(SellersBtn)
                .addGap(18, 18, 18)
                .addComponent(ItemsBtn)
                .addGap(18, 18, 18)
                .addComponent(LogoutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setText("ITEMS STOCK");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("NAME");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("QUANTITY");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("PRICE");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("PHOTO");

        ItPictureLbl.setText("                Image");

        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ItemsTable.setRowHeight(25);
        ItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemsTable);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel12.setText("MANAGER ITEMS");

        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(51, 204, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(51, 204, 255));
        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(51, 204, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("CATEGORIES");

        ItCatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plumbing", "Electrical" }));

        BrowseBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BrowseBtn.setForeground(new java.awt.Color(51, 204, 255));
        BrowseBtn.setText("BROWSE");
        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel10))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(AddBtn)
                                .addGap(18, 18, 18)
                                .addComponent(EditBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ItCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItPictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BrowseBtn)
                                .addGap(46, 46, 46))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(721, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(EditBtn)
                            .addComponent(DeleteBtn))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ItPictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(BrowseBtn))
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel12)
                    .addContainerGap(637, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void DisplayItems(){
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hardwaredb", "root", "");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from ItemsTbl");
        ItemsTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
    
    }
}
    private void Clear(){
        ItNameTb.setText("");
        ItQtyTb.setText("");
        ItPriceTb.setText("");
        ItPictureLbl.setIcon(null);
    }
    int ItemId;
Statement St1 = null;
ResultSet Rs1 = null;
private void CountItems(){
    try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select Max(ItId) from itemstbl");
        Rs1.next();
        ItemId = Rs1.getInt(1)+1;
    }catch(Exception Ex) {}
}
    // Thêm thiết bị
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ItNameTb.getText().isEmpty() || ItQtyTb.getText().isEmpty() || ItPriceTb.getText().isEmpty() || ItCatCb.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,"Không có thông tin để thêm");
        }else {
            try{
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hardwaredb", "root", "");
                PreparedStatement Save = Con.prepareStatement("Insert into ItemsTbl Values(?,?,?,?,?,?)");
                Save.setInt(1, ItemId);
                Save.setString(2,ItNameTb.getText());
                Save.setInt(3, Integer.valueOf(ItQtyTb.getText()));
                Save.setInt(4, Integer.valueOf(ItPriceTb.getText()));
                Save.setString(5, ItCatCb.getSelectedItem().toString());
                InputStream img  = new  FileInputStream(imgPath);
                Save.setBlob(6, img);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                Con.close();
                DisplayItems();
                Clear();
            }catch(Exception Ex)
            {
                JOptionPane.showMessageDialog(this, Ex);
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked
    // Chỉnh kích thước ảnh
    public ImageIcon ResizePhoto(String ImagePath, byte[] pic){
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
            MyImage = new ImageIcon(ImagePath);
        }else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage .getImage(); // lấy mã đối tượng ảnh
        Image newImg = img.getScaledInstance(ItPictureLbl.getWidth(), ItPictureLbl.getHeight(), Image.SCALE_SMOOTH); // giúp chuyển đổi ảnh mượt hơn
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    String imgPath;
    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home"))); // được sử dụng để lấy đường dẫn đến thư mục gốc của người dùng. và gán đối tượng File bằng đường dẫn hiện tại
            FileNameExtensionFilter filter = new  FileNameExtensionFilter("*.Image", "jpg", "gif", "png" );
            file.addChoosableFileFilter(filter);
            int result = file.showSaveDialog(file); // trả về 1 đường dẫn đến file img
            if(result == JFileChooser.APPROVE_OPTION)
            {
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                ItPictureLbl.setIcon(ResizePhoto(path,null));
                   imgPath = path;
            }else if(result == JFileChooser.CANCEL_OPTION)
            {
                JOptionPane.showMessageDialog(this, "Không có file nào được chọn!");
                
            }
    }//GEN-LAST:event_BrowseBtnMouseClicked
    private void GetItemPhoto(){
        String Query = "Select  ItPhoto from itemstbl where ItId="+Key;
        Statement St;
        ResultSet Rs;
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hardwaredb", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next()){
                ItPictureLbl.setIcon(ResizePhoto(null, Rs.getBytes("itPhoto"))); // dữ liệu ảnh dưới dạng mảng byte và chuyển nó thành một biểu tượng hình ảnh
            }
        }catch(Exception Ex){}
    }
    
    int Key = 0; //  giá trị khóa chính của hàng được chọn. 
    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ItemsTable.getModel(); // lấy mô hình cấu trúc bảng
        int MyIndex = ItemsTable.getSelectedRow(); // // lấy mô hình cấu trúc bảng
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        // hiển thị dữ liệu vào các ô tương ứng
        ItNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        ItQtyTb.setText(model.getValueAt(MyIndex, 2).toString());
        ItPriceTb.setText(model.getValueAt(MyIndex, 3).toString());
        ItCatCb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        GetItemPhoto();
    }//GEN-LAST:event_ItemsTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
       if(Key == 0)
       {
           JOptionPane.showMessageDialog(this, "Hãy chọn thiết bị!");
       }else {
           try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hardwaredb", "root", "");
               String Query = "Delete from itemstbl where ItId="+Key;
               Statement Del = Con.createStatement();
               Del.executeUpdate(Query);
               JOptionPane.showMessageDialog(this, "Xóa thành công");
               DisplayItems();
               Clear();
           }catch (Exception Ex) {
           }
       }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(imgPath != null) {
            try{
                InputStream img = new FileInputStream(imgPath);
                //  giá trị mới được đặt bằng dấu chấm hỏi (?) để đại diện cho các tham số được truyền vào từ PreparedStatement.
                String UpdateQuery = "Update itemstbl set ItName=?,ItQty=?,Itprice=?,ItCat=?,ItPhoto=? where Itid=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hardwaredb", "root", "");
                PreparedStatement Ps =  Con.prepareStatement(UpdateQuery);
                Ps.setString(1,ItNameTb.getText());
                Ps.setInt(2,Integer.valueOf(ItQtyTb.getText()));
                Ps.setInt(3,Integer.valueOf(ItPriceTb.getText()));
                Ps.setString(4, ItCatCb.getSelectedItem().toString());
                Ps.setBlob(5, img);
                Ps.setInt(6, Key);
                // Số lượng bản ghi cập nhật == 1
                if(Ps.executeUpdate() == 1){
                    DisplayItems();
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                }else{
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
                }
            }catch(Exception Ex){JOptionPane.showMessageDialog(this, Ex);}
        }else{
            JOptionPane.showMessageDialog(this, "Không có hình ảnh nào được chọn");
        }
        imgPath = null;
    }//GEN-LAST:event_EditBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // đóng frame hiện tại
            dispose();
            // hiển thị màn hình đăng nhập
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void SellersBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellersBtnMouseClicked
        new Sellers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellersBtnMouseClicked

    private void ItemsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsBtnMouseClicked
        
    }//GEN-LAST:event_ItemsBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> ItCatCb;
    private javax.swing.JTextField ItNameTb;
    private javax.swing.JLabel ItPictureLbl;
    private javax.swing.JTextField ItPriceTb;
    private javax.swing.JTextField ItQtyTb;
    private javax.swing.JLabel ItemsBtn;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel SellersBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
