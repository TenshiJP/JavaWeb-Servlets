document.addEventListener("DOMContentLoaded", function() {
    let btnRegistrar = document.getElementById("btn-registrar");

    btnRegistrar.addEventListener("click", function(e) {
        e.preventDefault(); // Evita que el formulario se envíe automáticamente.
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
            alert("Nombre no válido.");
            return false;
        }
        if (!apellido.match(nombreApellido)) {
            alert("Apellido no válido.");
            return false;
        }
        if (!nick.match(/^[a-zA-Z0-9\s\-_]{1,10}$/)) {
            alert("Nick solo puede contener letras, números y los símbolos - o _ y tener un máximo de 10 caracteres.");
            return false;
        }
        if (!telefono.match(telefonoRegex)) {
            alert("Teléfono debe contener exactamente 8 dígitos.");
            return false;
        }
        if (!email.match(emailRegex)) {
            alert("Correo Electrónico no válido.");
            return false;
        }
        if (!password.match(passwordRegex)) {
            alert("Contraseña debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un signo.");
            return false;
        }
        if (password !== confirmarPassword) {
            alert("La contraseña no coincide.");
            return false;
        }
        return true;
    }
});
