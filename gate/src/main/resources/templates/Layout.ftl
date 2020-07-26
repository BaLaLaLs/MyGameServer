<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${title!'title'}</title>
    <script src="https://unpkg.zhimg.com/react@16/umd/react.development.js" crossorigin></script>
    <script src="https://unpkg.zhimg.com/react-dom@16/umd/react-dom.development.js" crossorigin></script>
    <script src="https://unpkg.zhimg.com/@material-ui/core@latest/umd/material-ui.development.js"
            crossorigin="anonymous"></script>
    <script src="https://unpkg.zhimg.com/babel-standalone@latest/babel.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/axios/0.20.0-0/axios.min.js"></script>
    <script src="/static/js/index.js" type="text/babel"></script>
    <script src="/static/js/theme.js" type="module"></script>
    <!-- Fonts to support Material Design -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"/>
    <!-- Icons to support Material Design -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
</head>
<body>
<div id="app">
    <#macro app>
        <#nested>
    </#macro>
</div>
</body>
</html>