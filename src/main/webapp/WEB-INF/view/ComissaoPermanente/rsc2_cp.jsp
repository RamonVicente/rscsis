<%-- 
    Document   : rsc2
    Created on : 17/11/2018, 21:20:31
    Author     : ramon
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid"> 
        <h2> Siape sendo editado ${siapeSendoEditado} nome: ${SiapeUser.nome}</h2><p>
        <h2>PREENCHA O FORMUL�RIO RSC2:</h2>
        <small style="color:green">${cadastrado}</small>
        <form action="UploadFile" method="POST" enctype="multipart/form-data">
            <table style="width:100%">
                <tr>
                    <th>CRIT�RIOS</th>
                    <th>QUANT. UNIDADE</th>
                </tr>
                <tr>
                    <td>Orienta��o ou Coorienta��o de trabalho de conclus�o de curso</td>
                    <td><input type="file" name="orientacao_cooerientacao_tcc"></td>
                </tr>
                <tr>
                    <td>Orientacao, tutoria, supervis�o ou acompanhamento de atividade de ensino</td>
                    <td><input type="file" name="orientacao_tutoria_supervisao_1"></td>
                </tr>
                <tr>
                    <td>Orientacao, tutoria, supervis�o ou acompanhamento de atividade de pesqusia ou extens�o</td>
                    <td><input type="file" name="orientacao_tutoria_supervisao_2"></td>
                </tr>
                <tr>
                    <td>Orienta��o ou Coorienta��o de estagios curriculares</td>
                    <td><input type="file" name="orientacao_tutoria_supervisao_3"></td>
                </tr>
                <tr>
                    <td>Orienta��o ou Coorienta��o de educandos em atividade de ensino</td>
                    <td><input type="file" name="orientacao_tutoria_supervisao_4"></td>
                </tr>
            </table>
            <input type="hidden" name="id_usuario" value="<c:out value="${usuario.id}"/>">
            <button type="submit">Cadastrar</button>
        </form>
    </div>
</div>
<c:import url="WEB-INF/view/footer.jsp" />
