# 🐾 Star Mascotas - Sistema de Inventario

![HTML5](https://img.shields.io/badge/HTML5-orange?style=for-the-badge\&logo=html5\&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-blue?style=for-the-badge\&logo=css3\&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-yellow?style=for-the-badge\&logo=javascript\&logoColor=black)
![Java](https://img.shields.io/badge/Java-red?style=for-the-badge\&logo=java\&logoColor=white)
![Spring Boot](https://img.shields.io/badge/SpringBoot-green?style=for-the-badge\&logo=springboot\&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2-Database-blue?style=for-the-badge)

---

## 🚀 Descripción del Proyecto

Aplicación web Full-Stack desarrollada como prueba técnica para la gestión de inventario de una tienda de mascotas. Permite administrar productos, controlar stock y generar reportes de forma eficiente.

### Funcionalidades principales:

* 📦 Gestión de productos (crear, listar y eliminar)
* 🏷️ Clasificación por categorías (Alimento, Juguetes, Accesorios)
* 💰 Administración de precios y stock
* 💾 Persistencia de datos mediante base de datos H2
* 📊 Exportación de inventario a formato CSV

---

## 🧱 Arquitectura

El proyecto sigue una arquitectura en capas:

* **Controller** → Manejo de endpoints REST
* **Service** → Lógica de negocio
* **Repository** → Acceso a datos mediante JPA
* **Model** → Definición de entidades

---

## 🛠️ Tecnologías Utilizadas

### 🔹 Backend

* Java
* Spring Boot
* Spring Data JPA
* H2 Database

### 🔹 Frontend

* HTML5
* CSS3
* JavaScript (Vanilla JS)

### 🔹 Herramientas

* Git & GitHub
* IntelliJ IDEA
* Visual Studio Code
* Postman

---

## ⚙️ Ejecución del Proyecto (Paso a Paso)

### 🔹 1. Clonar el repositorio

```bash
git clone https://github.com/JuanDavidHerrera2125/inventario-star-mascotas.git
cd inventario-star-mascotas
```

---

### 🔹 2. Ejecutar Backend (Spring Boot)

1. Abrir el proyecto en **IntelliJ IDEA**
2. Ejecutar la clase principal (`@SpringBootApplication`)

📌 El backend se ejecutará en:

```
http://localhost:8080
```

---

### 🔹 3. Probar API Backend

Endpoint principal:

```
http://localhost:8080/products
```

Desde aquí puedes:

* Consultar productos (GET)
* Crear productos (POST)
* Eliminar productos (DELETE)

*(Se recomienda usar Postman para pruebas completas)*

---

### 🔹 4. Ejecutar Frontend (Visual Studio Code)

📌 El frontend es independiente del backend.

Opciones:

**Opción 1 (rápida):**

* Ir a la carpeta `frontend`
* Abrir `index.html` con doble clic

**Opción 2 (recomendada):**

* Abrir con extensión **Live Server** en VS Code

---

### 🔹 5. Acceso a la Consola H2

Una vez el backend esté en ejecución:

```
http://localhost:8080/h2-console
```

### 🔐 Credenciales:

* **JDBC URL:** `jdbc:h2:mem:starmascotas`
* **User Name:** `sa`
* **Password:** *(vacío)*

---

## 📊 Exportación de Datos

El sistema permite exportar el inventario en formato `.csv`, compatible con Excel, facilitando la generación de reportes.

---

## 🤖 Uso de Inteligencia Artificial

Durante el desarrollo se utilizó IA como herramienta de apoyo para:

* Generación de estructura base
* Implementación de funcionalidades
* Mejora de diseño frontend
* Debugging y optimización

📄 Ver detalles en el archivo `PROMPTS.md`

---

## 📌 Buenas Prácticas Aplicadas

* Código limpio y modular
* Separación de responsabilidades
* Uso de arquitectura en capas
* Nombres descriptivos en funciones y variables
* Validaciones básicas
* Documentación clara

---

## 📬 Repositorio

🔗 https://github.com/JuanDavidHerrera2125/inventario-star-mascotas

---

## 👨‍💻 Autor

Juan David Herrera
Prueba técnica - Desarrollador Full-Stack Junior
