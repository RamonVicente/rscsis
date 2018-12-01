<%-- 
    Document   : cadastro
    Created on : 04/11/2018, 14:49:19
    Author     : 
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />

<h1>RSCSIS</h1>

<div class="container" style=" border: 8px double; width:50%" >

    <div class="container-fluid">  
        <small style="color:green">${cadastrado}</small>
         <small style="color:green">${jaExisteUsuario}</small>
        <form method="post" action="CadastroUsuario">

            <h3>Cadastre-se</h3>

            <label>Nome:</label><br>
            <input type="text" class="form-control" name="nome" size="30"><br>
            <label>Matricula:</label><br>
            <input type="text"  class="form-control" name="matricula"size="30"><br>
            <label>Login:</label><br>
            <input type="text" class="form-control" name="login" size="30"><br>
            <label>Senha:</label><br>
            <input type="password" class="form-control" name="senha" size="30"><br><br>
            <label>Tipo de Usuário:</label><br>
            <select class="form-control" name="selecionar" id="sel">
                <option value="" disabled selected hidden>Selecionar</option>
                <option value="professor" class="form-control" name="professor" id="professor">Professor</option>
                <option value="permanente" class="form-control" name="permanente" id="permanente">Comissao Permanente</option>
                <option value="especial" class="form-control" name="especial" id="especial">Comissao Especial</option>

            </select><br>

            <input type="submit" class="btn btn-default" value="Cadastre-se">
        </form>
    </div> 
</div>

</section>

<c:import url="WEB-INF/view/footer.jsp" />

