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
        <div class="travel">
            <h2>Add your travel details</h2>
            <form:form modelAttribute="travel">
                <form:label path="destination" cssClass="leftfloat">Destination:</form:label>
                <form:input path="destination"  />
                <form:errors path="destination" cssStyle="color:red"/><br/>

                <form:label path="dateFrom" cssClass="leftfloat">From</form:label>
                <form:input path="dateFrom" />
                <form:errors path="dateFrom"/><br/>

                <form:label path="dateTo" cssClass="leftfloat">To</form:label>
                <form:input path="dateTo" />
                <form:errors path="dateTo"/><br/>

                <form:label path="description" cssClass="leftfloat">Description</form:label>
                <form:textarea path="description" cols="25" rows="5"/>
                <form:errors path="description"/><br/>
                <br/>
                <input type="reset" value="Reset" />&nbsp;&nbsp;
                <input type="submit" value="Submit" />


            </form:form>
        </div>
    </div>