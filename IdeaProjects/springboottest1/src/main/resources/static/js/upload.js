function upImg() {
    var fileObj = document.getElementById("file").files[0];
    var FileController = "/uploadImage";
    if(!fileObj.type.match('image.*')){
        alert("请选择正确的图片");

    }else{
        var form = new FormData();
        form.append("file",fileObj);
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange=function () {
            if(this.readyState == 4 && this.status == 200){
                var b = this.responseText;
                if(b == "success"&&(fileObj.type.match('image.*'))){
                    alert("上传成功！");
                }
            }
        };
        xhr.open("post", FileController, true);
        xhr.send(form);
    }
};
function updateGuardian(){
    var imageurl=$('#file').val();
    alert(imageurl);
    var name=$('#username').val();
    var password=$('#password').val();
    var confirpassword = $('#confirmpassword').val();
    var usertype=$('#userType').val();

    if(name!=""){
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "/registerConfirm?username="+name+"&password"+password+"&confirpassword="+confirpassword+"&usertype="+usertype+"&file="+imageurl,
            contentType: "application/json",
            success: function (data) {
                if(data["code"]=="1"){
                    alert("修改成功")
                    window.location.reload();
                }else{
                    alert("修改失败")
                }
            },
            error : function() {
                alert("异常！");
            }
        });
    }else{
        alert("姓名未填写");
        return false;
    }
};

