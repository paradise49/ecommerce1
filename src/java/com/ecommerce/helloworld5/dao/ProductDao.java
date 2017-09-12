package com.ecommerce.helloworld5.dao;

import com.ecommerce.helloworld5.model.ProductModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sanish
 */
public class ProductDao {

    public static void insert(ProductModel pm) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con = null;
        Statement st = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_api", "root", "password");
            // con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres","root");
        } catch (Exception e) {
            System.out.println(e);
        }
        //String sql="insert into product(product_id,product_price,product_tag,product_rating,product_discount,product_image) values("+pm.getProductId()+","+pm.getProductPrice()+""+pm.getProductTag()+","+pm.getProductRating()+","+pm.getProductDiscount()+","+pm.getProductImage()+")";
        String sql = "insert into products(product_id,product_name,product_price,"
                + "product_tag,product_rating,product_discount,product_image) "
                + "values(" + pm.getProduct_id() + ",'" + pm.getProduct_name() + "'," + pm.getProduct_price() + ",'"
                + pm.getProduct_tag() + "','" + pm.getProduct_rating() + "'," + pm.getProduct_discount() + ",'" + pm.getProduct_image() + "')";
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<ProductModel> select() {
        ArrayList al = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con = null;
        Statement st = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_api", "root", "password");
            // con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres","root");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "select * from products";
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new ProductModel(rs.getInt("product_id"),rs.getString("product_name"), rs.getInt("product_price"),
                        rs.getString("product_tag"), rs.getString("product_rating"),
                        rs.getInt("product_discount"), rs.getString("product_image")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }

    public static void delete(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con = null;
        Statement st = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_api", "root", "password");
            // con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres","root");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "delete from products where product_id=" + id;
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
