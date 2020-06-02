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
<link rel="stylesheet" href="../../../style.css">

<title>Работа в Eclipse</title>
</head>
<body>
	<jsp:include page="../../../header.html" />
		
		
<main role="main" class="container">
  <div class="row">
    <div class="col-md-8 blog-main" style="border-right: solid 1px red">
      <h3 class="pb-3 mb-4 font-italic border-bottom">
        Создание сайта
      </h3> 

    
          <div class="blog-post">
            <h4 class="blog-post-title2">Как убить существующий процесс на нужном порту</h4>
            <p class="blog-post-meta">June 2, 2020 by <a href="/aboutme.jsp">Sergey Emelyanov</a></p>
            <!-- 
            Жирный текст с собственным цветом  
            <strong><font color="#5900AC">1.</font></strong>
            Картинка в бордере
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/downloadtheinstaller3.png"></p>
            -->
            <p> В этой небольшой статье-заметке я хочу зафиксировать как решить проблему когда пытаешься запустить свое веб-приложение на порту, где уже существует какой-то процесс. Например запустили приложение, но предыдущий запуск не был завершен.</p>
            <p>То есть еще раз, что имеется ввиду.<br>Если было запущено приложение на локальном хосте, например localhost:8080, а потом по каким-то причинам мы его не остановили и пытаемся запустить приложение снова на этом хосте, то будет ошибка.<br>
            В Eclipse выскакивает большое полотно с ошибками, в которых, если присмотреться, говорится, что причиной ошибки, мол, послужило то, что что-то уже на данном порту запущено.<br>
            Нет смысла скриншотить все полотно, но вот начало полотна привести можно. Зеленым выделено сказанное, что локальный порт 8080 уже занят.
            </p>
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/eclipseconsole_1.png"></p>

            <p>Ну и еще скриншот в самом конце полотна тоже привести можно:</p>
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/eclipseconsole_2.png"></p>
            <p>который также говорит, что адрес уже используется.<br>
              То есть по этим ошибкам понятно (должны понимать), что мы пытаемся запустить приложение на порте 8080, но на этом порту уже что-то крутится.
              Это можно проверить, набрав в браузере <strong>localhost:8080</strong> или <strong>localhost:8080/nameyourwebapp</strong> (<strong>nameyourwebapp</strong> – имя веб-приложения), в зависимости как настроено, то вы увидите ваше веб-приложение, хотя в Eclipse ничего не запущено.<br>
              Чтобы решить это и не заморачиваться с перенастройками номера порта (хотя это можно), то необходимо убить процесс на данном порту.
            </p>

            <p>Решение можно посмотреть по ссылке: <a href="https://issue.life/questions/39632667" target="_blank">https://issue.life/questions/39632667</a>.<br>
               А можно действовать по руководству ниже (тоже самое).<br>
               Итак,<br>
                1. В командной строке необходимо ввести команду <strong><font color="#5900AC">netstat –ano | findstr :8080</font></strong> (<font color=RED>1</font>)</p>
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/cmdconsole_3.png"></p>
            <p>8080 - это номер порта (может быть другой).<br>
              По стрелочке <font color=RED>2</font> видим цифру (в данном случае 8292). Ее необходимо будем ввести в следующей команде: <strong><font color="#5900AC">taskkill/PID 8292 /F</font></strong> и жмем <strong>Enter</strong>:</p>
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/cmdconsole_4.png"></p>
            <p>На скриншоте показано, что текущий процесс с идентификатором 8292 был успешно завершен.</p>
            <p>Теперь, если обновить страницу с <strong>localhost:8080/nameyourwebapp</strong>, то увидим, что этот сайт не существует или не может быть достигнут.</p>
            <p>Можно снова пользоваться портом 8080.</p>
             



          </div><!-- /.blog-post -->


	
    </div><!-- /.blog-main -->

    <aside class="col-md-4 blog-sidebar">
      <div class="p-4 mb-3 bg-light rounded">
        <h4 class="font-italic">О чем статейка</h4>
        <p class="mb-0">Как удалить текущий процесс / приложение, которое уже назначено порту (например localhost:8080)</p>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Статьи</h4>
        <ol class="list-unstyled mb-0">
          <li><a href="#" style="color: gray">1. Создание Maven проекта</a></li> <!-- style="color: gray" даем тем ссылкам, которые еще не работают-->
          <li><a href="/Java/CreatingSite/WorkWithEclipse/WorkWithEclipse.jsp">2. Работа с проектом в Eclipse</a></li> 
          <li><a href="/Java/CreatingSite/adressinuse/adressalreadyinuse.jsp">3. Как убить существующий процесс на нужном порту</a></li>
        </ol>
      </div>

      <!--
      <div class="p-4">
        <h4 class="font-italic">Elsewhere</h4>
        <ol class="list-unstyled">
          <li><a href="#">GitHub</a></li>
          <li><a href="#">Twitter</a></li>
          <li><a href="#">Facebook</a></li>
        </ol>
      </div>
    </aside>--><!-- /.blog-sidebar -->

  </div><!-- /.row -->

</main><!-- /.container -->


	<jsp:include page="../../../footer.html" />
	
<!-- Подключаем скрипты JavaScript прям перед закрывающимся тегом body. Так указано на сайте Bootstrap -->
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>