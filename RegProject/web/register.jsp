<%-- 
    Document   : register
    Created on : 24-Feb-2024, 11:20:19 am
    Author     : ARYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <title>Register </title>
    </head>
    <body class="center-align" style="background: url(img/298_Abstract_background.jpg);background-size: cover;background-attachment: fixed">
        <div class="container" style="margin-top: 50px">
            <div class="row">
                
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3 style="margin-top: 10px">Register here!!</h3>
                    
                    <div class="form">
                        <form action="Register" method="post">
                        <input type="text" name="user_name" placeholder="Enter your name" />
                        <input type="password" name="user_password" placeholder="Enter your password" />
                        <input type="email" name="user_email" placeholder="Enter your email" />
                        <button type="submit" class="btn indigo darken-4">Submit</button>
                        </form>
                    </div>
                    
                    <div class="preloader" style="margin-top: 10px; display: none">
                                    <div class="preloader-wrapper big active">
                                      <div class="spinner-layer spinner-blue">
                                        <div class="circle-clipper left">
                                          <div class="circle"></div>
                                        </div><div class="gap-patch">
                                          <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                          <div class="circle"></div>
                                        </div>
                                      </div>

                                      <div class="spinner-layer spinner-red">
                                        <div class="circle-clipper left">
                                          <div class="circle"></div>
                                        </div><div class="gap-patch">
                                          <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                          <div class="circle"></div>
                                        </div>
                                      </div>

                                      <div class="spinner-layer spinner-yellow">
                                        <div class="circle-clipper left">
                                          <div class="circle"></div>
                                        </div><div class="gap-patch">
                                          <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                          <div class="circle"></div>
                                        </div>
                                      </div>

                                      <div class="spinner-layer spinner-green">
                                        <div class="circle-clipper left">
                                          <div class="circle"></div>
                                        </div><div class="gap-patch">
                                          <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                          <div class="circle"></div>
                                        </div>
                                      </div>
                                    </div>          
                        <h5>Please wait!!</h5>
                    </div>
                    
                    </div>
                        
                    </div>
                </div>
               
            </div>
           
        </div>
        <script src="src/main.js"></script>
    </body>
</html>
