<%-- 
    Document   : cadastro
    Created on : 04/11/2018, 14:49:19
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>RSCSIS </title>

        <!-- Bootstrap -->
        <link href="https://colorlib.com/polygon/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Font Awesome -->
        <link href="https://colorlib.com/polygon/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <!-- NProgress -->
        <link href="https://colorlib.com/polygon/vendors/nprogress/nprogress.css" rel="stylesheet">
        <!-- Animate.css -->
        <link href="https://colorlib.com/polygon/vendors/animate.css/animate.min.css" rel="stylesheet">

        <!-- Custom Theme Style -->
        <link href="https://colorlib.com/polygon/build/css/custom.min.css" rel="stylesheet">
    </head>

    <body>
    <body class="login">
        <div>
            <a class="hiddenanchor" id="signup"></a>
            <a class="hiddenanchor" id="signin"></a>

            <div class="login_wrapper">
                <div class="animate form login_form">
                    <section class="login_content">

                        <h1>RSCSIS</h1>
                        <div class="container">
                             <small style="color:green">${cadastrado}</small>
                            <form method="post" action="CadastroUsuario">
                               
                                <h2>Cadastre-se</h2>
                                <label>Nome:</label><br>
                                <input type="text" name="nome"><br>
                                <label>Matricula:</label><br>
                                <input type="text" name="matricula"><br>
                                <label>Login:</label><br>
                                <input type="text" name="login"><br>
                                <label>Senha:</label><br>
                                <input type="password" name="senha"><br><br>
                                <label>Tipo de Usuário:</label><br>
                                <select class="form-control" name="selecionar" id="sel">
                                    <option value="" disabled selected hidden>Selecionar</option>
                                    <option value="professor" class="form-control" name="professor" id="professor">Professor</option>
                                    <option value="permanente" class="form-control" name="permanente" id="permanente">Comissao Permanente</option>
                                    <option value="especial" class="form-control" name="especial" id="especial">Comissao Especial</option>

                                </select><br>

                                <input type="submit" class=" btn btn-primary" value="Cadastre-se">
                            </form>
                        </div>

                        <div class="clearfix"></div>


                        </form>
                    </section>
                </div>

                
            </div>
        </div>


    </body>
</html>

