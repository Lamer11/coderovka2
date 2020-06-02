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
<link rel="stylesheet" href="style.css">

<title>coderovka.ru - About me</title>
</head>
<body>
<!-- HEADER -->
<jsp:include page="/header.html" />

<main role="main" class="container">
  <div class="row">
    <div class="col-md-8 blog-main">
      <h3 class="pb-3 mb-4 font-italic border-bottom">
        About me
      </h3>

      <!-- <p><img style="width:30%; height:30%; box-shadow: 0 0 10px #5900AC" src="myphotos/iam.jpg"></p> -->
      <p>Ит'с ми</p>
      <p><img style="width:50%; height:50%; box-shadow: 0 0 10px #5900AC" src="myphotos/ilovejava.jpg"></p> 

      <p>Напиши письмо на <strong>coderovka@gmail.com</strong> если ты тут был :-) </p>

    </div><!-- /.blog-main -->

    <aside class="col-md-4 blog-sidebar">
      <div class="p-4 mb-3 bg-light rounded">
        <h4 class="font-italic">О чем</h4>
        <p class="mb-0">Обо мне</p>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Archives</h4>
        <ol class="list-unstyled mb-0">
          <li><a href="#" style="color: gray">March 2014</a></li>
          <li><a href="#" style="color: gray">February 2014</a></li>
          <li><a href="#" style="color: gray">January 2014</a></li>
          <li><a href="#" style="color: gray">December 2013</a></li>
          <li><a href="#" style="color: gray">November 2013</a></li>
          <li><a href="#" style="color: gray">October 2013</a></li>
          <li><a href="#" style="color: gray">September 2013</a></li>
          <li><a href="#" style="color: gray">August 2013</a></li>
          <li><a href="#" style="color: gray">July 2013</a></li>
          <li><a href="#" style="color: gray">June 2013</a></li>
          <li><a href="#" style="color: gray">May 2013</a></li>
          <li><a href="#" style="color: gray">April 2013</a></li>
        </ol>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Elsewhere</h4>
        <ol class="list-unstyled">
          <li><a href="#" style="color: gray">GitHub</a></li>
          <li><a href="#" style="color: gray">Twitter</a></li>
          <li><a href="#" style="color: gray">Facebook</a></li>
        </ol>
      </div>
    </aside><!-- /.blog-sidebar -->

  </div><!-- /.row -->

</main><!-- /.container -->



<!-- FOOTER -->
<jsp:include page="/footer.html" />
</html>