<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<spring:url value="/css/stylesheet.css" var="stylesheet" />
<link href="${stylesheet}" rel="stylesheet" />
<title>Smetner test data</title>

</head>

<div class="center">
<h2>All browsers</h2>
  <table class="flat-table">
    <tbody>
      <tr>
        <th>Name</th>
        <th>Rendering engine</th>
        <th>Engine version</th>
        <th>Platform</th>
        <th>Css grade</th>
      </tr>
      <c:forEach var="browser" items="${browsers}">
        <tr>
          <td>${browser.name}</td>
          <td>${browser.renderingEngine}</td>
          <td>${browser.engineVersion}</td>
          <td>${browser.platform}</td>
          <td>${browser.cssGrade}</td>
        </tr>
      </c:forEach>
      <c:if test="${empty summaries}">
        <tr>
          <td colspan="5" class="centered_text">Sorry, no browser data is available</td>
        </tr>
      </c:if>
    </tbody>
  	</table>
</div>

<div class="center">
<h2>Summary</h2>
  <table class="flat-table">
    <tbody>
      <tr>
        <th>Rendering engine</th>
        <th>Maximum engine version</th>
        <th>Best css grade</th>
        <th>Platforms</th>
        <th>Total count</th>
      </tr>
      <c:forEach var="summary" items="${summaries}">
        <tr>
          <td>${summary.renderingEngine}</td>
          <td>${summary.maxEngineVersion}</td>
          <td>${summary.bestCssGrade}</td>
          <td>${summary.platforms}</td>
          <td>${summary.quantity}</td>
        </tr>
      </c:forEach>
      <c:if test="${empty summaries}">
        <tr>
          <td colspan="5" class="centered_text">Sorry, no browser data is available</td>
        </tr>
      </c:if>
    </tbody>
  	</table>
</div>

</body>
</html>