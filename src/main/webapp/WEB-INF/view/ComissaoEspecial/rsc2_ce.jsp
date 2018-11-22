<%-- 
    Document   : rsc2_ce
    Created on : 21/11/2018, 22:45:32
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
        <h2>PREENCHA O FORMULÁRIO RSC2:</h2>
        <small style="color:green">${cadastrado}</small>
        <form action="RSC2" method="POST">
            <table style="width:100%">
                <tr>
                    <th>CRITÉRIOS</th>
                    <th>QUANT. UNIDADE professor</th>
                    <th>QUANT. UNIDADE avaliador</th>

                </tr>
                <tr>
                    <td>Orientação ou Coorientação de trabalho de conclusão de curso</td>
                    <td><input type="number" name="orientacao_cooerientacao_tcc"  readonly></td>
                    <td><input type="number" name="orientacao_cooerientacao_tcc"  ></td>

                </tr>
                <tr>
                    <td>Orientacao, tutoria, supervisão ou acompanhamento de atividade de ensino</td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_1" readonly></td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_1" ></td>

                </tr>
                <tr>
                    <td>Orientacao, tutoria, supervisão ou acompanhamento de atividade de pesqusia ou extensão</td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_2"  readonly></td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_2" ></td>

                </tr>
                <tr>
                    <td>Orientação ou Coorientação de estagios curriculares</td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_3"  readonly></td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_3" ></td>

                </tr>
                <tr>
                    <td>Orientação ou Coorientação de educandos em atividade de ensino</td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_4"  readonly></td>
                    <td><input type="number" name="orientacao_tutoria_supervisao_4" ></td>
                </tr>
            </table>
            <input type="hidden" name="id_usuario" readonly="<c:out readonly="${usuario.id}"/>">
            <button type="submit">Cadastrar</button>
        </form>
    </div>
</div>

</html>
<c:import url="WEB-INF/view/footer.jsp" />