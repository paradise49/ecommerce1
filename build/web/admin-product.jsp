<%-- 
    Document   : admin-product2
    Created on : Aug 31, 2017, 4:48:19 PM
    Author     : hilink
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="admin-header.jsp"/>
<jsp:include page="admin-nav.jsp"/>

<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
   <section class="content-header">
      <h1>
        Product Form Elements
        <small>Preview</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Forms</a></li>
        <li class="active">Form Elements</li>
      </ol>
    </section>
    

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Product Forms</h3> 
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form" action="${pageContext.request.contextPath}/admin/product/add" method="POST">
              <div class="box-body">
                  <div class="form-group">
                  <label for="exampleInputEmail1">Product Id</label>
                  <input type="text" name="product_id" class="form-control" id="exampleInputEmail1" placeholder="Enter product id">
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Name</label>
                  <input type="text" name="product_name" class="form-control" id="exampleInputEmail1" placeholder="Enter product name">
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Price</label>
                  <input type="text" name="product_price" class="form-control" id="exampleInputEmail1" placeholder="Enter product price">
                </div>
                  <div class="form-group">
                <label>Product Tag</label>
                <select name="product_tag" class="form-control select2" multiple="multiple" data-placeholder="Type to show tags" style="width: 100%;">
                  <option>Food</option>
                  <option>LifeStyle</option>
                  <option>Electronics</option>
                  <option>Computer and IT gadgets</option>
                  <option>Sports</option>
                  <option>Health</option>
                  <option>Accessories</option>
                </select>
              </div>
                  <div class="form-group">
                  <label for="exampleInputEmail1">Product Rating</label>
                  <input type="text" name="product_rating" class="form-control" id="exampleInputEmail1" placeholder="Enter product name">
                </div>
                 
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Discount</label>
                  <input type="text" name="product_discount" class="form-control" id="exampleInputEmail1" placeholder="Enter discount for the price">
                </div>
                
                <div class="form-group">
                  <label for="exampleInputFile">Upload product image</label>
                  <input type="file" name="files" id="exampleInputFile">

                 
                </div>
               
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
          </div>
                </div>
              </div>
                </section>
    
  <section class="content-header">
      <h1>
        Product Tables
        <small>advanced tables</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Tables</a></li>
        <li class="active">Product tables</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
        
      <div class="row">
        <div class="col-xs-12">
          
            <!-- /.box-header -->
            <div class="box">
            <div class="box-header">
              <h3 class="box-title">Product Tables With Items</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                    <th>Product Id</th>
                  <th>Product Name</th>
                  <th>Product Price</th>
                  <th>Product Tag</th>
                  <th>Product Rating</th>
                  <th>Product Discount</th>
                  <th>Product Image</th>
                  <th>Edit</th>
                  <th>Delete</th>
                  
                </tr>
                </thead>
                <tbody>
                    <c:forEach items="${productvalue}" var="product">
                        <tr>
                            <td>${product.product_id}</td>
                            <td>${product.product_name}</td>
                            <td>${product.product_price}</td>
                            <td>${product.product_tag}</td>
                            <td>${product.product_rating}</td>
                            <td>${product.product_discount}</td>
                            <td>${product.product_image}</td>
                            <td><a href="${pageContext.request.contextPath}/admin/product/edit/?id=${product.product_id}">
                                    <span class="glyphicon glyphicon-edit">
                                </span>
                                </a>
                            </td>
                            <td><a href="${pageContext.request.contextPath}/admin/product/delete/?id=${product.product_id}">
                                    <span class="glyphicon glyphicon-remove">
                                </span>
                                </a>
                            </td>
                            
                            
                            
                        </tr>
                    </c:forEach>
                </tbody>
              </table>
            </div>
            </div>
            </div>
      </div>
                <!-- Content Wrapper. Contains page content -->
             </section>  
             
              <!-- /.box-body -->
              
  

    </div>

           <jsp:include page="admin-footer.jsp"/>
                   <script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
 Bootstrap 3.3.6 
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
 DataTables 
<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
 SlimScroll 
<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
 FastClick 
<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
 AdminLTE App 
<script src="${pageContext.request.contextPath}/dist/js/app.min.js"></script>
 AdminLTE for demo purposes 
<script src="${pageContext.request.contextPath}/dist/js/demo.js"></script>
 page script  
                <script>
 $('#example1').DataTable();
    
     </script>
 