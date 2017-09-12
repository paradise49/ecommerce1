/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworld5.controller;

import com.ecommerce.helloworld5.model.ProductModel;
import com.ecommerce.helloworld5.dao.ProductDao;
import com.ecommerce.helloworld5.utilities.Tag;
import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hilink
 */
@WebServlet({"/admin/product/add","/admin/product/delete/"})
public class ProductController extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/admin/product/delete/")){
            int id=Integer.parseInt(request.getParameter("id"));
            ProductDao.delete(id);
            response.sendRedirect(contextPath+"/admin/product");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath+"/admin/product/add")){
            int id=Integer.parseInt(request.getParameter("product_id"));
            String name = request.getParameter("product_name");
            int price = Integer.parseInt(request.getParameter("product_price"));
            String[] tempTag=request.getParameterValues("product_tag");
            String tag=Tag.convertTag(tempTag);
            
           // String tag = request.getParameter("product_tag");
            String rating = request.getParameter("product_rating");
            int discount = Integer.parseInt(request.getParameter("product_discount"));
            String image = request.getParameter("product_image");
            //String choice = request.getParameter("pchoice");
            
            ProductModel pm = new ProductModel();
            pm.setProduct_id(id);
            pm.setProduct_name(name);
            pm.setProduct_price(price);
            pm.setProduct_tag(tag);
            pm.setProduct_rating(rating);
            pm.setProduct_discount(discount);
            pm.setProduct_image(image);
            
           ProductDao.insert(pm);
           
            response.sendRedirect(contextPath+"/admin/product");
            
         }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
