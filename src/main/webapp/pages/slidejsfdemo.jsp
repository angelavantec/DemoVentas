<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Bootstrap Admin Theme</title>


<!-- Custom Fonts -->
<link href="../bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- Bootstrap Core CSS -->
<link href="../bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>

</head>

<body>
	<div id="wrapper" style="width: 100%;">

		<!-- /.row -->
		<f:view >
			<div id="slider1_container"
				style="position: relative; top: 0px; left: 0px; height: 800px; width: 100%;">
				<!-- Slides Container -->
				<div u="slides"
					style="cursor: move; position: absolute; overflow: hidden; left: 0px; top: 0px; height: 800px; width: 100%;">

					

						<div style="width: 100%">

							<div id="page-wrapper">
							<div class="row">
								<div class="col-lg-12">
									<h1 class="page-header">Dashboard</h1>
								</div>
								<!-- /.col-lg-12 -->
							</div>
							<div class="row">
								<c:forEach var="item" items="#{editor.lenguajes}">
									<div class="col-lg-3 col-md-6">
										<div class="panel panel-primary">
											<div class="panel-heading">
												<div class="row">
													<div class="col-xs-3">
														<i class="fa fa-comments fa-5x"></i>
													</div>
													<div class="col-xs-9 text-right">
														<div class="huge">26</div>
														<div>
															<h:outputText value="#{item.nombreLenguaje}" />
														</div>
													</div>
												</div>
											</div>
											<a href="#">
												<div class="panel-footer">
													<span class="pull-left">View Details</span> <span
														class="pull-right"><i
														class="fa fa-arrow-circle-right"></i></span>
													<div class="clearfix"></div>
												</div>
											</a>
										</div>
									</div>
								</c:forEach>

							</div>
							</div>
						</div>
						<div>
							<div id="page-wrapper">
							<div class="row">
								<div class="col-lg-12">
									<h1 class="page-header">Dashboard</h1>
								</div>
								<!-- /.col-lg-12 -->
							</div>
							<div class="row">
								<div class="col-lg-3 col-md-6">
									<div class="panel panel-primary">
										<div class="panel-heading">
											<div class="row">
												<div class="col-xs-3">
													<i class="fa fa-comments fa-5x"></i>
												</div>
												<div class="col-xs-9 text-right">
													<div class="huge">26</div>
													<div>
														<h:outputText value="#{editor.value}" />
													</div>
												</div>
											</div>
										</div>
										<a href="#">
											<div class="panel-footer">
												<span class="pull-left">View Details</span> <span
													class="pull-right"><i
													class="fa fa-arrow-circle-right"></i></span>
												<div class="clearfix"></div>
											</div>
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<script>jssor_slider1_starter('slider1_container');</script>
			</div>

			<!-- jQuery -->
			<script src="../bower_components/jquery/dist/jquery.min.js"></script>

			<!-- Bootstrap Core JavaScript -->
			<script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

			<script src="../js/jssor.slider.mini.js"></script>


			<script>
					jQuery(document).ready(
							function($) {
								
								
								var options = {
									$AutoPlay : false
								};
								var jssor_slider1 = new $JssorSlider$(
										'slider1_container', options);
								
								 function ScaleSlider() {
							            var parentWidth = $('#slider1_container').parent().width();
							            if (parentWidth) {
							                jssor_slider1.$ScaleWidth(parentWidth);
							            }
							            else
							                window.setTimeout(ScaleSlider, 30);
							        }
								 
								 var parentWidth = $('#slider1_container').parent().width();
								 if (parentWidth) {
						                jssor_slider1.$ScaleWidth("100%");
						            }
							        //Scale slider after document ready
							        //ScaleSlider();
							                                        
							        //Scale slider while window load/resize/orientationchange.
							        //$(window).bind("load", ScaleSlider);
							        //$(window).bind("resize", ScaleSlider);
							        //$(window).bind("orientationchange", ScaleSlider);
							        //responsive code end
							});
				</script>
		</f:view>
	</div>
</body>
</html>