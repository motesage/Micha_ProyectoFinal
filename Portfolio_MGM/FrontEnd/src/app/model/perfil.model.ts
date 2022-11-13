export class perfil{
    id?: number;
    nombre: String;
    apellido: String;
    fileImagen: String;

    constructor(nombre: String, apellido: String, fileImagen: String){
       this.nombre = nombre; 
       this.apellido = apellido;
       this.fileImagen = fileImagen;
    }
}