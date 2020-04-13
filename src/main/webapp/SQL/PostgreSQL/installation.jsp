<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<!-- Для обеспечения правильной визуализации и сенсорного масштабирования для всех устройств -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<!-- Подключаем свои стили-->
<link rel="stylesheet" href="/style.css">

<title>Установка PostgreSQL</title>
</head>
<body>
<jsp:include page="/header.html" />
	

<main role="main" class="container">
 <div class="row">
  			<!-- Меню бар для баз данных -->
    <div class="col-md-8 blog-main" style="border-right: solid 1px red">
	    <div class="nav-scroller mb-2 pb-2 border-bottom">
		    <nav class="nav d-flex">
		      <a class="p-2 text-muted" href="mainpostgresql.jsp">PostgreSQL</a>
		      <a class="p-2 text-muted" href="#">MySQL</a>
		      <a class="p-2 text-muted" href="#">SAS</a>
		    </nav>
	 	</div>
    
      <h3 class="pb-3 mb-4 font-italic border-bottom">
        Установка PostgreSQL
      </h3>
		
<!-- =========================================================================================================================================================== -->
		<!-- Start article -->
<!-- =========================================================================================================================================================== -->
		
<h1>Установка PostgreSQL 12 на Windows 10.</h1>
Инструкция от 05.03.2020
<br>
<br>
<p><h4>1. Скачивание необходимого</h4> Переходим на официальный сайт PostgresSQL <a href="https://www.postgresql.org/" target="_blank">по ссылке</a> (откроется в другой вкладке).
Нажимаем Download в главном бар меню сверху слева</p>
<p><img style="width:50%; height:50%; box-shadow: 0 0 10px #5900AC"  src="screenshots/download1.png"></p>

<br>
<p>Жмем на <b>Windows</b> как на картинке</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/windows2.png"></p>

<br>
<p>Нажимаем <b>Download the installer</b></p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/downloadtheinstaller3.png"></p>
<p>и нас перебрасывает на сайт EnterpriseDB, где мы можем скачать интересующую нас версию PostgreSQL. 12 версия имеется пока только для 64 разрядной системы.
  Будем скачивать ее.
  Моя версия 191 MB.</p>

<br>
<p><h4>2. Установка</h4><b>2.1</b> Запускаем скачанный файл.<br>
  <b>Внимание!</b> Если на компе не установлен Visual C++ Redistributable например, то инсталятор заметит это и будет вынужден автоматически его (не спрашивая тебя) установить (скриншота нет к сожалению).
  Это обязательный компонент. Дальше просто идем по шагам</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation1.png"></p>

<br>
<p><b>2.2</b>	Выбираем директорию для установки. Я оставляю как есть</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation2.png"></p>

<br>
<p><b>2.3</b>	Дальше попадаем в окно выбора компонентов. Оставляем все как есть. 
Если вы знаете что для чего нужно уже на этом шаге, то можете выбрать интересующие Вас компоненты. Я оставляю все как есть</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation3.png"></p>

<br>
<p><b>2.4</b>	Далее будет предложено выбрать директорию для хранения данных</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation4.png"></p>

<br>
<p><b>2.5</b>	Далее необходимо выдумать пароль. Выдумываем. Вводим</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation5.png"></p>

<br>
<p><b>2.6</b>	Далее будет предложено выбрать номер порта, который будет прослушивать сервер.
Оставляем как есть, то есть 5432</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation6.png"></p>

<br>
<p><b>2.7</b>	Выбираем локаль. Пока хз че такое. Почитаю, изучу и обновлю</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation7.png"></p>

<br>
<p><b>2.8</b>	На этом шаге инсталятор показывает суммарно то что будет установлено. Смотрим внимательнейшим образом и жмем <b>Next</b> ежели удовлетворены</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation8.png"></p>

<br>
<p><b>2.9</b>	Инсталятор в последний раз предупреждает, что он готов установить и у Вас еще есть шанс отказаться от этой затеи</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation9.png"></p>

<br>
<p><b>2.10</b> Начинается установка на Ваш компьютер</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation10.png"></p>

<br>
<p><b>2.11</b>	Завершение установки.<br>
Процесс установки PostgreSQL 12 завершен. Все выбранные нами компоненты на шаге 4 установлены.
Если не снять галочку</p>
<p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/installation11.png"></p>

<p>то запуститься <b>Stack Builder</b> чтобы загрузить дополнительные компоненты. 
Нам пока ничего такого не нужно и поэтому снимаем галочку и жмакаем <b>Finish</b></p>
		
		
		

		
		
<!-- =========================================================================================================================================================== -->
		<!-- End article -->
<!-- =========================================================================================================================================================== -->


    </div><!-- /.blog-main -->

    <aside class="col-md-4 blog-sidebar">
      <div class="p-4 mb-3 bg-light rounded">
        <h4 class="font-italic">About</h4>
        <p class="mb-0">Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Archives</h4>
        <ol class="list-unstyled mb-0">
          <li><a href="#">March 2014</a></li>
          <li><a href="#">February 2014</a></li>
          <li><a href="#">January 2014</a></li>
          <li><a href="#">December 2013</a></li>
          <li><a href="#">November 2013</a></li>
          <li><a href="#">October 2013</a></li>
          <li><a href="#">September 2013</a></li>
          <li><a href="#">August 2013</a></li>
          <li><a href="#">July 2013</a></li>
          <li><a href="#">June 2013</a></li>
          <li><a href="#">May 2013</a></li>
          <li><a href="#">April 2013</a></li>
        </ol>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Elsewhere</h4>
        <ol class="list-unstyled">
          <li><a href="#">GitHub</a></li>
          <li><a href="#">Twitter</a></li>
          <li><a href="#">Facebook</a></li>
        </ol>
      </div>
    </aside><!-- /.blog-sidebar -->

  </div><!-- /.row -->

</main><!-- /.container -->


<jsp:include page="/footer.html" />
</html>