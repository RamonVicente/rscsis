<%-- 
    Document   : rsc1_ce
    Created on : 21/11/2018, 22:45:20
    Author     : Marcelo
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid"> 
        <h2>PREENCHA O FORMULÁRIO RSC1:</h2>
        <small style="color:green">${cadastrado}</small>
        <form action="RSC1" method="POST">
            <table style="width:100%">
                <tr>
                    <th>CRITÉRIOS</th>
                    <th>QUANT. UNIDADE professor </th>
                    <th>QUANT. UNIDADE avaliador</th>
                </tr>
                <tr>
                    <td>Gestao Escolar (Direção, Assistente de Direção, Gerente, Chefe)</td>
                    <td><input type="number" name="gestao_escolar_1" readonly ></td>
                    <td><input type="number" name="gestao_escolar_1" ></td>

                </tr>
                <tr>
                    <td>Gestao Escolar (Supervisao, Superviao de estadio)</td>
                    <td><input type="number" name="gestao_escolar_2" readonly></td>
                    <td><input type="number" name="gestao_escolar_2" ></td>

                </tr>
                <tr>
                    <td>Exercício de Magistério ou tutoria</td>
                    <td><input type="number" name="exercicio_magisterio_ou_tutoria" readonly></td>
                    <td><input type="number" name="exercicio_magisterio_ou_tutoria" ></td>

                </tr>
                <tr>
                    <td>Gestao no setor Público ou Pivado</td>
                    <td><input type="number" name="gestao_publico_privado" readonly></td>
                    <td><input type="number" name="gestao_publico_privado" ></td>

                </tr>
                <tr>
                    <td>Experiência na área de atuacao (tecnic, superior)</td>
                    <td><input type="number" name="experiencia_atuacao_ou_formacao" readonly></td>
                    <td><input type="number" name="experiencia_atuacao_ou_formacao" ></td>

                </tr>
                <tr>
                    <td>Participação em colegiado ou Conselhos</td>
                    <td><input type="number" name="participacao_colegiado_conselhos" readonly></td>
                    <td><input type="number" name="participacao_colegiado_conselhos" ></td>

                </tr>
                <tr>
                    <td>Atividade em Organizações sociais</td>
                    <td><input type="number" name="atividade_organizacao_social" readonly></td>
                    <td><input type="number" name="atividade_organizacao_social" ></td>

                </tr>
            </table>
            <input type="hidden" name="id_usuario" value="<c:out value="${usuario.id}" />">
            <button type="submit">Cadastrar</button>
        </form>
    </div>
</div>

</html>
<c:import url="WEB-INF/view/footer.jsp" />