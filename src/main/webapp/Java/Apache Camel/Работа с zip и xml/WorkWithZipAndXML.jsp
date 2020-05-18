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

<title>Работа с Zip и XML файлами</title>
</head>
<body>
	<jsp:include page="../../../header.html" />
		
		
<main role="main" class="container">
  <div class="row">
    <div class="col-md-8 blog-main" style="border-right: solid 1px red">
      <h3 class="pb-3 mb-4 font-italic border-bottom">
        Работа с Zip и XML файлами
      </h3>

    <h5>Сценарий 1</h5>
    <p>Архив формата <strong>.zip</strong>, который имеет в себе один <strong>.xml</strong> файл, 
    прогнать через маршрут, распаковать и сохранить распакованный файл в другую папку.</p>
    <p>Для этого сценария будут использоваться:</p>
    <ul>
      <li><strong><font color="#5900AC">zazipovano.zip</font></strong> - архив, в котором запакован <strong><font color="#5900AC">semelyanov.xml</font></strong> фай</li>
      <li>Путь к папке, где находится архив <strong><font color="#5900AC">C:/Users/Sergey/Desktop/Camel/zips</font></strong></li>
      <li>Путь к папке, куда мы архив будем перемещать/распаковывать/еще что-либо делать: 
      <strong><font color="#5900AC">C:/Users/Sergey/Desktop/Camel/unzips</font></strong></li>
    </ul>
    <p>Названия путей здесь приводятся для того, чтобы наглядно видеть в Java коде кто за что отвечает.</p>
    <p>Содержимое файла .xml следующее:<br>
    <div style="border: solid 1px; box-shadow: 0 0 7px #5900AC;">
    <pre><code>&lt;persone&gt;
    &lt;name&gt;Sergey&lt;/name&gt;
    &lt;lastname&gt;Emelyanov&lt;/lastname&gt;
    &lt;old&gt;34&lt;/old&gt;
&lt;/persone&gt;
    </code></pre></p></div>

    <p>Для примера столь простое содержание файла вполне сойдет.</p>


	
    </div><!-- /.blog-main -->

    <aside class="col-md-4 blog-sidebar">
      <div class="p-4 mb-3 bg-light rounded">
        <h4 class="font-italic">О чем</h4>
        <p class="mb-0">Apache Camel - <em>(кратко)</em> это java-фреймворк, с помощью которого можно интегрировать приложения просто и понятно.</p>
      </div>

      <div class="p-4">
        <h4 class="font-italic">Статьи</h4>
        <ol class="list-unstyled mb-0">
          <li><a href="#">Работа с zip и xml файлами</a></li>
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