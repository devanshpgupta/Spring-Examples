$(document).ready(function(){

	$("button").click(function(){
		var zipcode=$("#zip").val();
		$.ajax({
			url:"http://api.openweathermap.org/data/2.5/weather?zip="+ zipcode +",us&appid=e886d3974863316d2a9278dc9f2db447"
		}).then(function(data){
			console.log(data);
			var temp=data.main.temp_min+"</br>";
			temp+=data.main.temp_max+"</br>";
			temp+=data.name;
			$("#myid").append("<h3>" +temp+ "</h3>");
		})
	})
})