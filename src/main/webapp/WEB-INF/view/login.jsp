<%-- 
    Document   : login
    Created on : 01/11/2018, 14:49:19
    Author     : Rafael
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />

        <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
              
              <h1>RSCSIS</h1>
              <div class="container">
        <form method="post" action="LoginController">
            <h2>Acesso ao sistema</h2>
            <label>Login:</label><br>
             <input type="text" name="login"><br>
             <label>Senha:</label><br>
             <input type="password" name="senha"><br><br>
             <input type="submit" class=" btn btn-primary" value="Entrar">
        </form>
                  <a href="professor-home">ir para professor</a>
        </div>

              <div class="clearfix"></div>

              
            </form>
          </section>
        </div>

        <div id="register" class="animate form registration_form">
          <section class="login_content">
            <form>
              <h1>Create Account</h1>
              <div>
                <input type="text" class="form-control" placeholder="Username" required="">
              </div>
              <div>
                <input type="email" class="form-control" placeholder="Email" required="">
              </div>
              <div>
                <input type="password" class="form-control" placeholder="Password" required="">
              </div>
              <div>
                <a class="btn btn-default submit" href="index.html">Submit</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">Already a member ?
                  <a href="#signin" class="to_register"> Log in </a>
                </p>

                <div class="clearfix"></div>
                <br>

                <div>
                  <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                  <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
  
<c:import url="WEB-INF/view/footer.jsp" />


