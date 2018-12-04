<%-- 
    Document   : rsc1
    Created on : 17/11/2018, 20:31:13
    Author     : ramon
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid"> 
        <h2>PREENCHA O FORMUL�RIO RSC1:</h2>
        <small style="color:green">${cadastrado}</small>
        <form action="RSC1" method="POST">
            <table style="width:100%">
                <tr>
                    <th>CRIT�RIOS</th>
                    <th>QUANT. UNIDADE</th>
                </tr>
                <tr>
                    <td>Gestao Escolar (Dire��o, Assistente de Dire��o, Gerente, Chefe)</td>
                    <td><input type="number" name="gestao_escolar_1" value="0"></td>
                </tr>
                <tr>
                    <td>Gestao Escolar (Supervisao, Superviao de estadio)</td>
                    <td><input type="number" name="gestao_escolar_2" value="0"></td>
                </tr>
                <tr>
                    <td>Exerc�cio de Magist�rio ou tutoria</td>
                    <td><input type="number" name="exercicio_magisterio_ou_tutoria" value="0"></td>
                </tr>
                <tr>
                    <td>Gestao no setor P�blico ou Pivado</td>
                    <td><input type="number" name="gestao_publico_privado" value="0"></td>
                </tr>
                <tr>
                    <td>Experi�ncia na �rea de atuacao (tecnic, superior)</td>
                    <td><input type="number" name="experiencia_atuacao_ou_formacao" value="0"></td>
                </tr>
                <tr>
                    <td>Participa��o em colegiado ou Conselhos</td>
                    <td><input type="number" name="participacao_colegiado_conselhos" value="0"></td>
                </tr>
                <tr>
                    <td>Atividade em Organiza��es sociais</td>
                    <td><input type="number" name="atividade_organizacao_social" value="0"></td>
                </tr>
            </table>
            <input type="hidden" name="id_usuario" value="<c:out value="${usuario.id}" />"><br>
            <button type="submit" id="Cadastrar" class="btn btn-default">Cadastrar</button>
            <a href="rsc1" class="btn btn-default">RSC1</a>
            <a href="rsc2" class="btn btn-default">RSC2</a>
            <a href="rsc3" class="btn btn-default">RSC3</a> 
        </form>
    </div>
</div>
<c:import url="WEB-INF/view/footer.jsp" />
