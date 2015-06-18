<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   <span style="float: right">
    <a href="?language=en">EN</a> 
    | 
    <a href="?language=np">NP</a>
    |
    <a href="?language=es">ES</a>
</span>
        <div class="travel">
            <h2><spring:message code="travel.form.message"/></h2>
            <form:form modelAttribute="travel">
                <form:label path="destination" cssClass="leftfloat"><spring:message code="travel.destination"></spring:message></form:label>
                <form:input path="destination"  />
                <form:errors path="destination" cssStyle="color:red"/><br/>

                <form:label path="dateFrom" cssClass="leftfloat"><spring:message code="travel.from"></spring:message></form:label>
                <form:input path="dateFrom" />
                <form:errors path="dateFrom"/><br/>

                <form:label path="dateTo" cssClass="leftfloat"><spring:message code="travel.to"></spring:message></form:label>
                <form:input path="dateTo" />
                <form:errors path="dateTo"/><br/>

                <form:label path="description" cssClass="leftfloat"><spring:message code="travel.description"></spring:message></form:label>
                <form:textarea path="description" cols="25" rows="5"/>
                <form:errors path="description"/><br/>
                <br/>
                <input type="reset" value="Reset" />&nbsp;&nbsp;
                <input type="submit" value="Submit" />

            </form:form>
        </div>