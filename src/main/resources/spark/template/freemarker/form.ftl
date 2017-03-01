<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Biblioteca</title>
</head>

<style type="text/css">
    h1{font-size: 30px;color: blue;}
    .cajabusq h{font-size: 25px; color: blue;}
    input[type=submit]{flex-grow: 1;}
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

<body style="text-align: center; vertical-align: middle; background-color: #E1FE60">

<h1>Sistema de búsqueda de biblioteca</h1>
<form action="/resultados" method="get">
<div class="cajabusq" style="border-radius: 8px;">
    <h>Ingrese código de libro</h><br><br>

    <label>Código: </label>
    <input type="text" name="codigo" size="20">

</div>
<br>
    <input type="submit" value="Buscar" />
</form>
</body>

</html>