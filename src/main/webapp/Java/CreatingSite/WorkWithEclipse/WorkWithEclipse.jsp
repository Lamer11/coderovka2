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
            <h4 class="blog-post-title2">Работа с проектом в Eclipse</h4>
            <p class="blog-post-meta">June 1, 2020 by <a href="/aboutme.jsp">Sergey Emelyanov</a></p>

            <p>Эта статья как продолжение создания Maven вэб-приложение из консоли. Переходим работать в Eclipse, так как мы будем работать с Java-кодом (подключение к базе данных и манипулирование ей и другое), то в Eclipse это делать намного удобнее.</p>
            <hr>
            <!-- --------------------------------------------------------------------------------------------------------------------------------- -->
            <!-- 
            Жирный текст с собственным цветом  
            <strong><font color="#5900AC">1.</font></strong>
            Картинка в бордере
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/downloadtheinstaller3.png"></p>
            -->
            <p><strong>1.</strong> Открываем Eclipse.<br>
               Как установить Eclipse и первоначально настроить - будет в другой статье. Пока этой статьи нет, то можно воспользваться другими ресурсами, которых привеликое множество в интернете.</p>

            <p><strong>2.</strong><strong><font color="#5900AC"> File -> Open Projects from File Systems</font></strong><br> 
              В графе <strong><font color="#5900AC">Import source</font></strong> через кнопку <strong><font color="#5900AC">Directory…</font></strong> выбираем свой проект и жмем <strong><font color="#5900AC">Finish</font></strong>. Проект появляется в <strong>Project Explorer</strong>.</p>

            <p><strong>3.</strong> В <strong>Project Explorer</strong> нажимаем правой кнопкой мыши по проекту, чтобы вызвать контекстное меню и далее выбираем:<br> 
            <strong><font color="#5900AC">Run As</font></strong> -> <strong><font color="#5900AC">Run Configuration…</font></strong> как на картинке</p>  
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/run_configurations_1.png"></p>

            <p><strong>4.</strong> В появившемся окне настроек находим  <strong><font color="#5900AC">Maven Build</font></strong> и правой кнопкой мыши в контекстном меню жмем на <strong><font color="#5900AC">New Configuration</font></strong></p>
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/maven_build_2.png"></p>

            <p><strong>5.</strong> Таким образом создается New_configuration</p>
            <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/missing_configuration_3.png"></p>
            <p>Пройдемся по каждому пункту:<br>
             <strong><font color=RED>1</font></strong> - в графе <strong>Name</strong> необходимо указать <strong>Run nameproject</strong>, где <strong>nameproject</strong> это имя вашего проекта/корневой папки/ArtifactId<br>
             <strong><font color=RED>2</font></strong> - поле автоматом заполняется после того как выбрать директорию проекта (путь к корневой папке проекта)<br>
             <strong><font color=RED>3</font></strong> - Нажимаем кнопку <strong>Workspace</strong>, чтобы выбрать проект
             <p><img style="box-shadow: 0 0 10px #5900AC" src="screenshots/chose_project_4.png"></p>
             <p>Выбираем проект и жмем OK. В данном примере проект называется <strong>mavenwebapp</strong></p>
             <strong><font color=RED>4</font></strong> - в <strong>Goals</strong> необходимо внести <strong><font color="#5900AC">tomcat7:run -X</font></strong>
             <br>
             В конечном итоге получаем окно с такими настройками:
             <p><img style="width:100%; height:100%; box-shadow: 0 0 10px #5900AC" src="screenshots/configuration_id_done_5.png"></p>
             Нажимаем <stront>Apply</stront> и <strong>Run</strong>

            </p>



          </div><!-- /.blog-post -->


	
    </div><!-- /.blog-main -->

    <aside class="col-md-4 blog-sidebar">
      <div class="p-4 mb-3 bg-light rounded">
        <h4 class="font-italic">О чем статейка</h4>
        <p class="mb-0">Настройки Maven в Eclipse'е</p>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Статьи</h4>
        <ol class="list-unstyled mb-0">
          <li><a href="#">1. Создание Maven проекта</a></li>
          <li><a href="/Java/CreatingSite/WorkWithEclipse/WorkWithEclipse.jsp">2. Работа с проектом в Eclipse</a></li>
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


	<jsp:include page="../../../footer.html" />
	
<!-- Подключаем скрипты JavaScript прям перед закрывающимся тегом body. Так указано на сайте Bootstrap -->
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>