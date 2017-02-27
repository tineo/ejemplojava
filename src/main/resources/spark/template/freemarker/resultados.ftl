<table>
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