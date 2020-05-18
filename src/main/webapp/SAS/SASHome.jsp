<%@ page contentType="text/html;charset=UTF-8" language="java" 
%>
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
<link rel="stylesheet" href="../style.css">

<title>SAS Home</title>
</head>



<body>
  <jsp:include page="../header.html" />
    
<main role="main" class="container">
  <div class="row">
    <div class="col-md-8 blog-main" style="border-right: solid 1px red">
      <h3 class="pb-3 mb-4 font-italic border-bottom">
        SAS Page
      </h3>
      <p>счётчик просмотров: (как только подключу базу данных, то тут будет выводиться цифра того, сколько раз посещали страницу)<%/*= count */%></p>
    <p><img src="screenshots/logosasuni.png"></p>
    <p>SAS® University Edition</p>
    
    <h1>Установка</h1>
    
    <p>1. Проходим по <a href="http://www.sas.com/en_us/software/university-edition/download-software.html">ссылке</a></p>
    <p>И попадаем на страницу скачивания. Тут нам необходимо выбрать систему, на которую будем устанавливать.</p>
    png image:
    <p><img style="width:100%; height:100%;" src="screenshots/sasscreen1.png"></p>
    jpeg image
    <p><img style="width:100%; height:100%;" src="screenshots/sasscreen1.jpg"></p>
    <p>Я выбираю <bold>Windows</bold>. Жмем и далее действуем по шагам.</p>
    <p>2. Идем дальше</p>
    <text>.. в общем нужно закончить статью :)</text>
    
    
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


<jsp:include page="../footer.html" />
</html>