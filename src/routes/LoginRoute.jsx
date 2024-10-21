import React from 'react';

const LoginRoute = () => {
  return (
    <div className="container mx-auto mt-10 p-4">
      <h2 className="text-2xl font-bold mb-4">Iniciar Sesión</h2>
      <form className="max-w-md mx-auto">
        <div className="mb-4">
          <label htmlFor="email" className="block mb-2">Email</label>
          <input
            type="email"
            id="email"
            className="w-full p-2 border rounded"
            placeholder="tu@email.com"
          />
        </div>
        <div className="mb-4">
          <label htmlFor="password" className="block mb-2">Contraseña</label>
          <input
            type="password"
            id="password"
            className="w-full p-2 border rounded"
            placeholder="********"
          />
        </div>
        <button
          type="submit"
          className="w-full bg-teal-500 text-white p-2 rounded hover:bg-teal-600"
        >
          Iniciar Sesión
        </button>
      </form>
    </div>
  );
};

export default LoginRoute;