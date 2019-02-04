$(document).ready(function() {
    $("#testButton").on("click",function(){
    	$("#indexForm").attr('action', $("#contextPath").val()+'/employee');
    	$("#indexForm").submit();
    });
    $("#homeButton").on("click",function(){
    	window.location.href='index';
    });
    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
    });
//	$("#datepicker").datepicker();
//	$("#datepicker").on("change",function(){
//	      var selected = $(this).val();
//	 });
});	