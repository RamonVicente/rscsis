<%-- 
    Document   : cadastro
    Created on : 04/11/2018, 14:49:19
    Author     : 
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="head.jsp" />
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

<c:import url="footer.jsp" />

