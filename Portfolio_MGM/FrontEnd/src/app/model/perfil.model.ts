export class perfil{
    id?: number;
    nombre: string;
    apellido: string;
    fileImagen: string;

    constructor(nombre: string, apellido: string, fileImagen: string){
       this.nombre = nombre; 
       this.apellido = apellido;
       this.fileImagen = fileImagen;
    }
}