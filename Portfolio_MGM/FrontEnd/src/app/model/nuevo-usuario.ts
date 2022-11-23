export class NuevoUsuario {
    nombre!: string;
    nombreUsuario!: string;
    email!: string;
    password!: string;
    authority!: string[];
    /* el signo de adminracion ! es para que ignore el error (falta inicializacion de las variables) */
}
