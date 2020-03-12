<%-- 
    Document   : FECHAS
    Created on : 11/03/2020, 10:41:16 PM
    Author     : Allan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <jsp:include page="Header.jsp"/>
        <h4  style="color: #000; font-style: bold; font-size: 20px;">Fecha Inicial</h4>
         <form action="Fechas">
        <select style="border-color: #394a6d; border-width: 3px;" name="dia1">
  <option value="01">01</option>
  <option value="02">02</option>
  <option value="03">03</option>
  <option value="04">04</option>
   <option value="05">05</option>
    <option value="06">06</option>
     <option value="07">07</option> 
     <option value="08">08</option>
      <option value="09">09</option>
       <option value="10">10</option>
        <option value="11">11</option>
         <option value="12">12</option> 
         <option value="13">13</option>
            <option value="14">14</option>
        <option value="15">15</option>
    <option value="16">16</option>
            <option value="17">17</option>
     <option value="18">18</option>
            <option value="19">19</option>
        <option value="20">20</option>
  <option value="21">21</option>
         <option value="22">22</option>
                  <option value="23">23</option>
                 <option value="24">24</option>
                     <option value="25">25</option>
      <option value="26">26</option>
           <option value="27">27</option>
                           <option value="28">28</option>                                                                                                                                     <option value="20">20</option>
                              <option value="29">29</option>                                                                                                                                  
                                             <option value="30">30</option> 
                         <option value="31">31</option>
         
     
</select>
            <select style="border-color: #394a6d; border-width: 3px;" name="mes1">
  <option value="01">Enero</option>
  <option value="02">Febrero</option>
  <option value="03">Marzo</option>
  <option value="04">Abril</option>
    <option value="05">Mayo</option>
      <option value="06">Junio</option>
        <option value="07">Julio</option>
          <option value="08">Agosto</option>
            <option value="09">Septiembre</option>
              <option value="10">Octubre</option>
                <option value="11">Noviembre</option>
                  <option value="12">Diciembre</option>
                  
      
</select>
            <select style="border-color: #394a6d; border-width: 3px;" name="ano1">
   <option value="2017">2017</option>            
  <option value="2018">2018</option>
  <option selected value="2019">2019</option>
  <option value="2020">2020</option>
  <option value="2021">2021</option>
  <option value="2022">2022</option>
</select>
        <br> <br>
        <h4 style="color: #000; font-style: normal; font-size: 20px;"> Fecha Final </h4>
        <select style="border-color: #394a6d; border-width: 3px;" name="dia2">
   <option value="01">01</option>
  <option value="02">02</option>
  <option value="03">03</option>
  <option value="04">04</option>
   <option value="05">05</option>
    <option value="06">06</option>
     <option value="07">07</option> 
     <option value="08">08</option>
      <option value="09">09</option>
       <option value="10">10</option>
        <option value="11">11</option>
         <option value="12">12</option> 
         <option value="13">13</option>
            <option value="14">14</option>
        <option value="15">15</option>
    <option value="16">16</option>
            <option value="17">17</option>
     <option value="18">18</option>
            <option value="19">19</option>
        <option value="20">20</option>
  <option value="21">21</option>
         <option value="22">22</option>
                  <option value="23">23</option>
                 <option value="24">24</option>
                     <option value="25">25</option>
      <option value="26">26</option>
           <option value="27">27</option>
                           <option value="28">28</option>                                                                                                                                     <option value="20">20</option>
                              <option value="29">29</option>                                                                                                                                  
                                             <option value="30">30</option> 
                         <option value="31">31</option>
</select>
            <select style="border-color: #394a6d; border-width: 3px;" name="mes2">
  <option value="01">Enero</option>
  <option value="02">Febrero</option>
  <option value="03">Marzo</option>
  <option value="04">Abril</option>
    <option value="05">Mayo</option>
      <option value="06">Junio</option>
        <option value="07">Julio</option>
          <option value="08">Agosto</option>
            <option value="09">Septiembre</option>
              <option value="10">Octubre</option>
                <option value="11">Noviembre</option>
                  <option value="12">Diciembre</option>
</select>
            <select style="border-color: #394a6d; border-width: 3px;" name="ano2">
                <option value="2017">2017</option>
                  <option value="2018">2018</option>
                  <option selected value="2019">2019</option>
  <option value="2020">2020</option>
  <option value="2021">2021</option>
  <option value="2022">2022</option>
   <option value="2023">2023</option>
    <option value="2024">2024</option>
            </select>
 <button type="submit" data-placement="bottom" class="btn btn-primary"><i class="zmdi zmdi-search"></i> &nbsp;&nbsp; Consultar</button>
    </form>
          <jsp:include page="Footer.jsp"/>
    </body>
</html>
