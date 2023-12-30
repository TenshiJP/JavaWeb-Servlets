document.addEventListener("DOMContentLoaded", function() {
    let btnRegistrar = document.getElementById("btn-registrar");

    btnRegistrar.addEventListener("click", function(e) {
        e.preventDefault(); // Evita que el formulario se env�e autom�ticamente.
        if (validarFormulario()) {
        	
            document.forms["frmPrincipal"].submit();
        }
    });

    function validarFormulario() {
        let nombre = document.getElementById("nombre").value;
        let apellido = document.getElementById("apellido").value;
        let nick = document.getElementById("nick").value;
        let telefono = document.getElementById("telefono").value;
        let email = document.getElementById("email").value;
        let password = document.getElementById("password").value;
        let confirmarPassword = document.getElementById("confirm-password").value;

        // Expresiones regulares
        let nombreApellido = /^[a-zA-Z\s]+$/;
        let telefonoRegex = /^\d{8}$/;
        let emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        let passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[-+_!@#$%^&*.,?]).{8,}$/;

        // Validaciones individuales
        if (!nombre.match(nombreApellido)) {
            alert("Nombre no v�lido.");
            return false;
        }
        if (!apellido.match(nombreApellido)) {
            alert("Apellido no v�lido.");
            return false;
        }
        if (!nick.match(/^[a-zA-Z0-9\s\-_]{1,10}$/)) {
            alert("Nick solo puede contener letras, n�meros y los s�mbolos - o _ y tener un m�ximo de 10 caracteres.");
            return false;
        }
        if (!telefono.match(telefonoRegex)) {
            alert("Tel�fono debe contener exactamente 8 d�gitos.");
            return false;
        }
        if (!email.match(emailRegex)) {
            alert("Correo Electr�nico no v�lido.");
            return false;
        }
        if (!password.match(passwordRegex)) {
            alert("Contrase�a debe tener al menos 8 caracteres, una letra may�scula, una letra min�scula, un n�mero y un signo.");
            return false;
        }
        if (password !== confirmarPassword) {
            alert("La contrase�a no coincide.");
            return false;
        }
        return true;
    }
});
