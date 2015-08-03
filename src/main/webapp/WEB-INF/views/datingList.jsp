<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="travel">
    <h2> Dating </h2>

    <div class="mytravel">
        <div class="profileimage">

            <img src="<c:url value="/resources/images/${image}"/>" alt="user images"/>
            <!--<img src="../../resources/images/no_pic.jpg" alt="User Image"/>-->
        
        </div>
        <div class="travelDetails">
            
        </div>
    </div>

    <div class="travelOtherPost">
        <h3>Peoples who want to date</h3>
        <c:forEach items="${datinglist}" var="lists">
            <div class="prof">
                <img src='<c:url value="/resources/images/no-user-image.gif"/>' alt="friends">
                <br>
                ${lists.user.firstName}  ${lists.user.middleName}  ${lists.user.lastName}
            </div>
            <div class="details">
                <b>${lists.description}</b>
                <br/>
                <em> ${lists.interestedAge} </em>
                <br>
                ${lists.interestedOn}<br>
                <a href="#"> Connect </a> <a href="#"> Details </a>
            </div>
        </c:forEach>
    </div>
</div>
