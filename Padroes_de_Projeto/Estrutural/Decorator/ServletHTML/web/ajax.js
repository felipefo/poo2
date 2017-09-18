
function onloadBody(){
    var form;
    form = document.getElementById("form");
    form.onsubmit = function (e) {
        e.preventDefault();
            var data = {};
        for (var i = 0; i < form.length; i++) {
        var  input = form[i];
            console.log(input);
        if (input.name) {
            data[input.name] = input.value;
        }
  } 
  var xhr = new XMLHttpRequest();
  xhr.open(form.method, form.action, true);
  xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');  
  xhr.send(JSON.stringify(data));
  xhr.onloadend = function () {    
  };
};
}
