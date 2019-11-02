  function validar_clave(contrasenna){
      if(contrasenna.length >= 8){		
          var mayuscula = false;
          var minuscula = false;
          var numero = false;
          var caracter_raro = false;
          
          for(var i = 0;i<contrasenna.length;i++){
              if(contrasenna.charCodeAt(i) >= 65 && contrasenna.charCodeAt(i) <= 90){
                  mayuscula = true;
              }
              else if(contrasenna.charCodeAt(i) >= 97 && contrasenna.charCodeAt(i) <= 122)
              {
                  minuscula = true;
              }
              else if(contrasenna.charCodeAt(i) >= 48 && contrasenna.charCodeAt(i) <= 57)
              {
                  numero = true;
              }
              else
              {
                  caracter_raro = true;
              }
          }
          if(mayuscula == true && minuscula == true && caracter_raro == true && numero == true)
          {
              return true;
          }
      }
      return false;
  }

function validar_form()
{
    var contrasenna = document.getElementById('password').value;
    if(validar_clave(contrasenna) == true){
        alert('Cotraseña fuerte');
    }
    else
    {
        alert('La contraseña ingresada no es fuerte');
    }
}

 //Formularios

function validarTodo(){
    valideTodo = false;

    if(!validarCampo(document.getElementById('txtNombre'))){
        return false;
    }
    if(!validarCedula(document.getElementById('txtcedula'))){
        alert("Formato de cedula incorrecto");
        return false;
    }
    if(!validateEmail(document.getElementById('txtCorreo'))){
            alert("Correo Incorrecto");
        return false;
    }
       
    if(!validateTelefono(document.getElementById('txtTelefono'))){
        alert("Telefono Incorrecto");
        return false;
    }
    if(!validarPass(document.getElementById('txtContrasena'))){
          alert("Contraseña Incorecta, verifique que tenga al menos una mayuscula, una minuscula y numeros");
          return false;
    }
    validarTodo=true;
    return valideTodo;
    }
    
    
    function validarCampo(campo){
    valor = campo.value;
    if(valor.length == 0 || /ˆ\s+$/.test(valor)){
        alert("Complete todos los Espacios");
        return false;
    }
    return true;
}

function validateTelefono(campo){
    telRegex = /^[0-9]{8}$/;
    valor = campo.value;
    if(valor.length === 0 || /^\s/.test(valor)){
        return false;
    }
    return telRegex.test(campo.value);
}

function validarCedula(campo){
    cedulaRegex = /^[1-9][0-9]{4}[0-9]{4}$/;
    valor = campo.value;
    if(valor.length == 0 || /ˆ\s+$/.test(valor)){
        return false;
    }
    return cedulaRegex.test(campo.value);
}

function validateEmail(elementValue){        
   var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;  
    return emailPattern.test(elementValue.value);   
 } 
 
 function validarPass(campo){
    passRegex = /^.*(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*\d).*$/;         //(?!^[0-9]$)(?!^[a-zA-Z]$)^([a-zA-Z0-9]{8,10})$/;
    valor = campo.value;
    if(valor.length == 0 || /ˆ\s+$/.test(valor)){
        return false;
    }
    return passRegex.test(campo.value);
}

function confirmaClave(){
    var contra = document.frmIndice.txtContrasena.value;
    var confirma = document.frmIndice.txtContrasena3.value;
    var boton = document.frmIndice.agregar2;
    boton.disabled=true;
    
    if(contra===confirma){
        boton.disabled=false;
        return true;
    }else
        if(boton.disabled===true){
        
    }if(contra!==confirma){
        swal("La contraseña no coincide con la confirmación de contraseña");
        return false;
    }
}


function validateNum(campo){
    numRegex = /^([0-9])*$/;
    valor = campo.value;
    if(valor.length === 0 || /^\s/.test(valor)){
        return false;
    }
    return numRegex.test(campo.value);
}

function validarTodoProducto(){
    valideTodo = false;

    if(!validateCampo(document.getElementById('Presupuestario'))){
        alert("Codigo Presupuestario en blanco o incorrecto.");
        return false;
    }
    if(!validarCampo(document.getElementById('nombre'))){
        alert("Nombre en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Unidad'))){
        alert("Unidad en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Descripcion'))){
        alert("Descripcion en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Precio'))){
        alert("Precio en blanco.");
        return false;
    }
    if(!validateCampo(document.getElementById('Cantidad'))){
        alert("Cantidad en blanco o incorrecto.");
        return false;
    }
    if(!validarCampo(document.getElementById('Marca'))){
        alert("Marca en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Proveedor'))){
        alert("Marca en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Garantia'))){
        alert("Fecha en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Fecha'))){
        alert("Ubicacion en blanco.");
        return false;
    }
    if(!validarFecha(document.getElementById('Fecha'))){
        alert("Ubicacion en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Ubicacion'))){
        alert("Ubicacion en blanco.");
        return false;
    }
    if(!validarCampo(document.getElementById('Tipo'))){
        alert("Ubicacion en blanco.");
        return false;
    }
    validarTodo=true;
    return valideTodo;
    }
    
    
    function validarTodoModificar(){
    valideTodo = false;

    if(!validarCampo(document.getElementById('txtNombre'))){
        return false;
   
    }
    
   
       
    if(!validateTelefono(document.getElementById('txtTelefono'))){
        alert("Telefono Incorrecto");
        return false;
    }
    if(!validarPass(document.getElementById('txtContrasena'))){
          alert("Contraseña Incorecta, verifique que tenga al menos una mayuscula, una minuscula y numeros");
          return false;
    }
    validarTodo=true;
    return valideTodo;
    }
    
    
    function validarFecha(){
    var primera = document.getElementById('Garantia');
    var segunda = document.getElementById('Fecha');
 
    if(primera === segunda){
        alert("La fecha de garantia no puede ser igual a la fecha de entrada del producto");
        return false;
    }else if (primera < segunda) {
        alert("La fecha de entrada es mayor a la fecha de la garantia");
        return false;
    }else{
        return true;
    }
    }