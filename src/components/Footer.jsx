import React from 'react';
import './Footer.css';
 // Importa el archivo CSS de estilos

const Footer = () => {
  return (
    <footer className="footer">
      <p>© 2024 Mi Tienda. Todos los derechos reservados.</p>
      <ul className="footer-links">
        <li><a href="#">Política de privacidad</a></li>
        <li><a href="#">Términos de uso</a></li>
        <li><a href="#">Contacto</a></li>
      </ul>
    </footer>
  );
};

export default Footer;
