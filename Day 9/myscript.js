function changeImage(event) {
    //alert("Hello")
    if(event.target.tagName == 'IMG') {
        //alert(event.target.src);
        document.getElementById("myImage").src = event.target.src;
    }
    
}