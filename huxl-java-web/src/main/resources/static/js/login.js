// function reloadImg(){
//     $("#validateImg").attr("src",$("#validateImg").attr("src").split("?")[0]+"?"+new Date().getTime())
// }

$(function(){
    if(window.top!=window){
        window.top.location.href=basePath;
    }
    $("[name='userName']").focus();
    $("[name='checkCode']").keyup(function(e){
        if(e.keyCode==13){
            login();
        }
    });
});

function login(){
    var v = $("form").validate([function(){
        return true;
    }]);
    if (v.result == true) {
        $.ajax({
            url: "checkLogin",
            data: $("form").serialize(),
            type:"post",
            dataTppe:"json",
            async:false,
            success: function (data) {
                if(data.status=="1"){
                    window.location=basePath;
                }else{
                    $("[name='checkCode']").val("");
                    reloadImg();
                    alert(data.message);
                }
            }
        });
    } else {
        alert(v.message);
    }
}