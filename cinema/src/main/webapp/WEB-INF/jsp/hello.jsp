<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>">
    <script src="<c:url value="/resources/js/require.js"/> "></script>
    <script type="application/javascript">
        <%@include file="/resources/js/require_config.js"%>
        require(['require'], function (require) {
            require(["./bootstrap-main"]);
        });
    </script>
</head>
<body>
<div class="container">

    <%--<div class="row">--%>
                <%--<tabset justified="true">--%>
                    <%--<tab>--%>
                        <%--<tab-heading>--%>
                        <%--<button ui-sref="bash">Bash</button>--%>
                        <%--</tab-heading>--%>
                    <%--</tab>--%>
                    <%--<tab heading="Justified Tab 2"> Justified Content!</tab>--%>
                <%--</tabset>--%>
        <%--</div>--%>

    <button ui-sref="bash">BAFSF</button>

    <div class="row">
        <div class="col-lg-12" ui-view="test1">
        </div>

        </div>
    </div>
</body>
</html>
