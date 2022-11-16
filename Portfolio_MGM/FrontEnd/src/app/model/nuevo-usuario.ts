export class NuevoUsuario {
    nombre!: String;
    nombreUsuario!: String;
    email!: String;
    password!: String;
    authority!: String[];
    /* el signo de adminracion ! es para que ignore el error (falta inicializacion de las variables) */
}
