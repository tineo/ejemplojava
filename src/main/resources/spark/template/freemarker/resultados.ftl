<!DOCTYPE html>
<html>
<meta charset="utf-8">
<head>
    <title>Biblioteca</title>
    <style type="text/css">
        h1{color: blue; font-size: 30px;}
        table{font-family: Arial, Helvetica, sans-serif;
            font-size: 0.8em;
            border-top-width: 1px;
            border-top-style: solid;
            border-top-color: #333;}
        th {
            padding: 0.5em;
            border-bottom-width: 1px;
            border-bottom-style: solid;
            border-bottom-color: #333;
            border-left-width: 1px;
            border-left-style: solid;
            border-left-color: #333;
            border-right-width: 1px;
            border-right-style: solid;
            border-right-color: #333;
            background-color: #E2E2E2;
        }
        td {
            padding: 0.5em;
            border-bottom-width: 1px;
            border-bottom-style: solid;
            border-bottom-color: #333;
            border-left-width: 1px;
            border-left-style: solid;
            border-left-color: #333;
            border-right-width: 1px;
            border-right-style: solid;
            border-right-color: #333;
            background-color: white;
        }
        button{flex-grow: 1;}
        a {
            display:block;
            padding:1em;
            background-color:LightGray ;
            text-align:center;
            margin-right:0.2em;
            text-decoration:none;
            color:#000000;
        }
    </style>
</head>
<body style="text-align: center; vertical-align: middle; background-color: #E1FE60">
<h1>Listado de libros</h1>
<div style="text-align: center;">


<table  style="margin: 0 auto;">

    <thead>
        <th>Codigo</th>
        <th>Nombre</th>
        <th>Autor</th>
        <th>Editorial</th>
        <th>Pais</th>
    </thead>

    <tbody>
        <#if libro.id_libro??>
        <td>${libro.id_libro}</td>
        <td>${libro.nombre}</td>
        <td>${libro.autor}</td>
        <td>${libro.editorial}</td>
        <td>${libro.pais}</td>
        <#else>
        <td colspan="5"> El codigo no coincide</td>
        </#if>
    </tbody>

</table>

</div>
<br><br>
<button><a href="/formulario">Volver a búsqueda</a></button>
</body>
</html>