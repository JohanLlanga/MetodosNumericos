
---

# *Proyecto Final en Java*
Este proyecto se llevo a cabo en el lenguaje de programacion Java Beans el cual proporciana el manejo de interfaz no tan conpleja de entender. Se utilizo JFrame el cual es una clase en Java que pertenece al paquete javax.swing. Proporciona una ventana con una interfaz gráfica de usuario (GUI) para crear aplicaciones de escritorio. Esta clase nos ayuda a crear puedes crear ventanas con barras de título, botones de minimizar, maximizar y cerrar, y otras características comunes de las ventanas de la GUI. También puedes agregar componentes gráficos, como botones, campos de texto, etiquetas, etc., para construir una interfaz interactiva para tu aplicación.

![Gif1](https://github.com/JohanLlanga/MetodosNumericos/assets/134894866/085080bb-8b42-4b90-b490-04e5ebd5d866)

---

## *Calculadora Inteligente* :clap:
El proyecto desarrollado tiene como objetivo recopilar ejercicios y temas relacionados con la materia de Métodos Numéricos, aprendidos a lo largo del semestre. Proporciona una calculadora de conversiones numéricas y está desarrollado en Java.

## :computer:*Integrantes/Desarrolladores:computer:*

- Pablo Cisneros
- Issac LLanda
- William Vargas
- Johan LLanga
- Jessica Centeno

## *Característica principal*

Calculadora de conversiones numéricas que permite realizar conversiones entre diferentes sistemas numérico como:
- Binario
- Decimal
- Hexadecimal.
  
## *Contenido/Tabla*
  
| Conversiones | Errores  | Propagacion de Errores |Punto Flotante |
| :------------ |:---------------:|-------:|-------:|
| Binario a Decimal| Error Absoluto |........|........|
| Octal a Decimal| Error Relativo       |........|........|
| Decimal a Binario|  |........|........|
| Hexadecimal a Binario|   |........|........|

## *Librerias*

| jfreechart-1.0.19 |
| :------------ |
| hamcrest-core-1.3.jar| 
| jcommon-1.0.23.jar|
| jfreechart-1.0.19.jar|
| jfreechart-1.0.19-experimental.jar|
| jfreechart-1.0.19-swt.jar|
| jfreesvg-2.0.jar|
| junit-4.11.jar|
| orsoncharts-1.4-eval-nofx.jar|
| orsonpdf-1.6-eval.jar|
| servlet.jar|
| swtgraphics2d.jar|

## *Requisitos del sistema*

- Java (versión X.X.X)
- Sistema operativo compatible (Windows, macOS, Linux)

## *Uso*
1. Descarga el archivo ejecutable `metodos_numericos.jar` desde [enlace_del_repositorio].
2. Abre una terminal o línea de comandos.
3. Navega hasta la ubicación donde se encuentra el archivo `metodos_numericos.jar`.
4. Ejecuta el siguiente comando: `java -jar metodos_numericos.jar`.
5. Sigue las instrucciones en pantalla para utilizar la calculadora de conversiones numéricas.

## *Manual de usuario*

Para obtener instrucciones detalladas sobre el uso de la calculadora de conversiones numéricas, consulta el [manual de usuario](enlace_al_manual_de_usuario).

---

## *Interfaces*

<h3 align="center"> Conversiones </h3>

![//](https://github.com/JohanLlanga/MetodosNumericos/assets/134894866/18de671c-2ecd-44ad-8d3f-24850116a044)

<h3 align="center"> Errores </h3>
  
![Errores](https://github.com/JohanLlanga/MetodosNumericos/assets/134894866/e96f3fe7-44f7-4f7e-9326-0dee1f556d0c)

<h3 align="center"> Propagacion de Errores </h3>

![PropagacionErrores](https://github.com/JohanLlanga/MetodosNumericos/assets/134894866/9a011fae-1a17-4b88-8127-a43861d42341)

<h3 align="center"> Punto Flotante </h3>

![PuntoFlotante](https://github.com/JohanLlanga/MetodosNumericos/assets/134894866/8fd1c5d8-e413-41e8-9404-d14df2fd1c6f)


### *Codigo*

## ![Gif2](https://github.com/JohanLlanga/MetodosNumericos/assets/134894866/ce9b440f-2925-43a5-95f0-1f18774515f1)

<h4 align="center"> Botones </h4>

    // Variables declaration - do not modify                     
    private javax.swing.JButton BTcalBinAdec;
    private javax.swing.JButton BTcalDecAbin;
    private javax.swing.JButton BTcalHexaAdeci;
    private javax.swing.JButton BTcalOcAdeci;
    private javax.swing.JButton BTlimpiarBinAdec;
    private javax.swing.JTabbedPane CONVERSIONES;
    private javax.swing.JPanel PanConver;
    private javax.swing.JTextField cajaTxtConver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelTxtBinAdec;
    private javax.swing.JLabel labelTxtDecAbin;
    private javax.swing.JLabel labelTxtHexaAdeci;
    private javax.swing.JLabel labelTxtOcAdec;
    // End of variables declaration    
    
<h4 align="center"> Metodo de Limpiar </h4>

    private void Limpiar() {
        cajaTxtConver.setText("");
        labelTxtBinAdec.setText("--");
        labelTxtDecAbin.setText("--");
        labelTxtOcAdec.setText("--");
        labelTxtHexaAdeci.setText("--");
      }

