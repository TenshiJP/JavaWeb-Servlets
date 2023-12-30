<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <title>Registro - PixelArcade</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
        <style>
            body {
                display: flex;
                align-items: center;
                justify-content: center;
                min-height: 100vh;
                background-image: url('f1.jpg');
                background-size: cover; 
                background-repeat: no-repeat; 
                background-attachment: fixed;
            }
        </style>
    </head>
    <body>
        <section class="registration-form">
            <h2>Registro PixelArcade</h2>
            <form name="frmPrincipal" method="post" action="usuario">
                <div class="form-group">
                    <label for="nombre" class="form-label">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" class="form-input" required>
                </div>
                <div class="form-group">
                    <label for="apellido" class="form-label">Apellido:</label>
                    <input type="text" id="apellido" name="apellido" class="form-input" required>
                </div>
                <div class="form-group">
                    <label for="nick" class="form-label">Nick:</label>
                    <input type="text" id="nick" name="nick" class="form-input" required>
                </div>
                <div class="form-group">
                    <label for="fecha-nacimiento" class="form-label">Fecha de Nacimiento:</label>
                    <input type="date" id="fecha-nacimiento" name="fecha-nacimiento" class="form-input" required>
                </div>
                <div class="form-group">
                    <label for="pais" class="form-label">Pais:</label>
                    <input type="text" id="pais" name="pais" class="form-input" required>
                </div>
                <div class="form-group">
                    <label for="ciudad" class="form-label">Ciudad:</label>
                    <input type="text" id="ciudad" name="ciudad" class="form-input" required>
                </div>
                <div class="form-group">
                    <label for="telefono" class="form-label">Telefono:</label>
                    <input type="tel" id="telefono" name="telefono" class="form-input" minlength="8" maxlength="8" required>
                </div>
                <div class="form-group">
                    <label for="email" class="form-label">Correo Electronico:</label>
                    <input type="email" id="email" name="email" class="form-input" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" required>
                </div>
                <div class="form-group">
	                <label for="password" class="form-label">Contrase&ntildea:</label>
	                <input type="password" id="password" name="password" class="form-input" required>
	            </div>
	            <div class="form-group">
	                <label for="confirm-password" class="form-label">Confirmar Contrase&ntildea:</label>
	                <input type="password" id="confirm-password" name="confirm-password" class="form-input" required>
	            </div>
                <button type="button" class="form-button" id="btn-registrar">Registrar</button>
            </form>
        </section>
        <script src="validaciones.js"></script>
    </body>
</html>
