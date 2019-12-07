<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <title>鹊巢美博汇商城首页</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
    <meta name="keywords" content="鹊巢美博汇">
    <meta name="description" content="鹊巢美博汇">
    <#if cssList?size!=0>
        <#list cssList as list>
            <link rel="stylesheet" href="${list}">
        </#list>
    </#if>

    <#if jsList?size!=0>
        <#list jsList as list>
            <script src="${list}"></script>
        </#list>
    </#if>
</head>
<body>
    <div id="main">

    </div>
</body>
</html>