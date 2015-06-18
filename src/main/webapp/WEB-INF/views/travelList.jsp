<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <body>
        <div class="wrapper">
            <div class="logo"></div>
            <div class="menu">
                <div class="slogan"> Fantastic4 Connecting People
                </div>
            </div>
            <hr/>    
            <div class="travelContainer">
                <h2>My Travel Posts</h2>

                <div class="mytravel">
                    <div class="profileimage">
                        <img src="<c:url value="resources/images/no_pic.jpg"/>" alt="user images"/>
                        <!--<img src="../../resources/images/no_pic.jpg" alt="User Image"/>-->
                    </div>
                    <div class="travelDetails">
                        fdfsdf
                    </div>
                </div>

                <div class="travelOtherPost">
                    <h3>Peoples who want to travel</h3>
                    <c:forEach items="${travellist}" var="lists">
                        <div class="prof">
                            <img src='<c:url value="resources/images/no-user-image.gif"/>' alt="friends">
                            <br>
                            Royan
                        </div>
                        <div class="details">
                            <b>${lists.destination}</b>
                            <br/>
                            <em> ${lists.dateFrom} </em> To <em> ${lists.dateTo} </em>
                            <br>
                            ${lists.description}<br>
                            <a href="#"> Connect </a> <a href="#"> Details </a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>    
    </body>
</html>
