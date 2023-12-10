<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html>
<html>

<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>
	<h1>Resumen de factura: </h1>
	<b><s:text name="form.subject.message"/></b>
	<s:text name="invoiceBean.subject"/><br>
	<b><s:text name="form.dateFrom.message"/></b>
	<s:text name="invoiceBean.dateFrom"/><br>
  <b><s:text name="form.dateTo.message"/></b>
	<s:text name="invoiceBean.dateTo"/><br>
  <b><s:text name="form.price.message"/></b>
  <s:text name="invoiceBean.price"/><br>
  <b><s:text name="form.total.message"/></b>
  <s:text name="invoiceBean.priceWithTaxes"/><br>
</body>

</html>