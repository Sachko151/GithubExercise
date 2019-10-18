<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<link rel="shortcut icon" type="image/png" href="style/favicon.png"/>
	<link rel="stylesheet" type="text/css" href="style/HomePageStyle.css">
	<link href="https://fonts.googleapis.com/css?family=Fascinate+Inline|Permanent+Marker&display=swap" rel="stylesheet">
	<link rel="Fascinate" type="fa" href="">
	<title>HomePage</title>
</head>
<body>
	<div id="main">
		<h1>Car Deals</h1>
		<form type="">
			<label><p id="categoryP">Категория:
			<input type="text" name="category" required="true" placeholder="CARS">
			</p></label>
			<label><p id="brandP">Име на Марка:
			<input type="text" name="brand" required="true" placeholder="Ford">
			</p></label>
			<label><p id="EPriceP">Крайна Цена:
			<input type="number" name="endPrice" required="true" placeholder="1000">
			</p></label>
			<label><p id="dateP">Година на Производство:
			<input type="text" name="manufacture" required="true" placeholder="1980">
			</p></label>
			<label><p id="powerP">Мощност:
			<input type="number" name="power" required="true" placeholder="110">
			</p></label>
			<label><p id="eurostandardP">Евростандард:
			<input type="text" name="eurostandard" required="true"placeholder="EURO5">
			</p></label>
			<label><p id="mileageP">Изминати Километри:
			<input type="number" name="mileage" required="true" placeholder="10000000">
			</p></label>
			<label><p id="colorP">Цвят:
			<input type="text" name="color" required="true" placeholder="white">
			</p></label>
			<label><p id="modelP">Модел:
			<input type="text" name="model" required="true" placeholder="ecosport">
			</p></label>
			<label><p id="regionP">Регион:
			<input type="text" name="region" required="true" placeholder="Vratsa">
			</p></label>
			<label><p id="transmissionP">Предаване:
			<input type="text" name="transmission" required="true" placeholder="MANUAL">
			</p></label>
			<label><p id="enigneP">Тип на Двигателя:
			<input type="text" name="engine" required="true" placeholder="ELECTRIC">
			</p></label>
			<input type="submit" name="submit" value="Търси" id="submit">
		</form>
	</div>
</body>
</html>