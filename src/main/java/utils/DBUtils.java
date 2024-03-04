package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Models.Product;

public class DBUtils {
	Connection con;
	public DBUtils() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ArrayList<Product> getALl() throws SQLException{
		Statement st=null;
		ArrayList<Product> listall=new ArrayList<Product>();
		ResultSet rs=null;
		if(con!=null) {
			st=con.createStatement();
			rs=st.executeQuery("select *from product");
			while(rs.next()) {
				Product product=new Product(rs.getInt(1),rs.getString(2),rs.getFloat(3), rs.getString(4),rs.getString(5));
				listall.add(product);
			}
		}
		return listall;
	}
	public void insertProduct(Product product) throws SQLException {
		
			PreparedStatement pr=con.prepareStatement("insert into product (name,price,description,imagelink) values(?,?,?,?)");
			pr.setString(1, product.getName());
			pr.setFloat(2, product.getPrice());
			pr.setString(3, product.getDescription());
			pr.setString(4, product.getImageLink());
			pr.executeUpdate();
			pr.close();
	}
	public void editProduct(Product product) throws SQLException {
		
		PreparedStatement pr=con.prepareStatement("update product set name=? ,price=?,description=? ,imagelink=? where id=?");
		pr.setString(1, product.getName());
		pr.setFloat(2, product.getPrice());
		pr.setString(3, product.getDescription());
		pr.setString(4, product.getImageLink());
		pr.setInt(5, product.getId());
		pr.executeUpdate();
		pr.close();
}
public void DeleteProduct(int id) throws SQLException {
		PreparedStatement pr=con.prepareStatement("delete from product where id=?");
		pr.setInt(1,id);
		pr.executeUpdate();
		pr.close();
}
}
