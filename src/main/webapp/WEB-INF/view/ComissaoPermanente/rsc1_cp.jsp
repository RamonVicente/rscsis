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
        <h2> Siape sendo editado ${siapeSendoEditado} nome: ${SiapeUser.nome}</h2><p>
        <h2>PREENCHA O FORMULÁRIO RSC1:</h2>
        <small style="color:green">${cadastrado}</small>
        <form action="UploadFile" method="POST" enctype="multipart/form-data">
            <table style="width:100%">
                <tr>
                    <th>CRITÉRIOS</th>
                    <th>QUANT. UNIDADE</th>
                </tr>
                <tr>
                    <td>Gestao Escolar (Direção, Assistente de Direção, Gerente, Chefe)</td>
                    <td><input type="file" name="gestao_escolar_1"></td>
                </tr>
                <tr>
                    <td>Gestao Escolar (Supervisao, Superviao de estadio)</td>
                    <td><input type="file" name="gestao_escolar_2"></td>
                </tr>
                <tr>
                    <td>Exercício de Magistério ou tutoria</td>
                    <td><input type="file" name="exercicio_magisterio_ou_tutoria"></td>
                </tr>
                <tr>
                    <td>Gestao no setor Público ou Pivado</td>
                    <td><input type="file" name="gestao_publico_privado"></td>
                </tr>
                <tr>
                    <td>Experiência na área de atuacao (tecnic, superior)</td>
                    <td><input type="file" name="experiencia_atuacao_ou_formacao"></td>
                </tr>
                <tr>
                    <td>Participação em colegiado ou Conselhos</td>
                    <td><input type="file" name="participacao_colegiado_conselhos"></td>
                </tr>
                <tr>
                    <td>Atividade em Organizações sociais</td>
                    <td><input type="file" name="atividade_organizacao_social"></td>
                </tr>
            </table>
            <input type="hidden" name="id_usuario" value="<c:out value="${usuario.id}" />">
            <button type="submit">Cadastrar</button>
        </form>
    </div>
</div>
<c:import url="WEB-INF/view/footer.jsp" />
