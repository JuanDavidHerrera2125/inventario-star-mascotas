# Uso Estratégico de IA en el Proyecto "Star Mascotas"

Durante el desarrollo del sistema de inventario, la IA fue utilizada como copiloto técnico bajo instrucciones específicas para garantizar código limpio, escalable y alineado a buenas prácticas.
A continuación, se documentan los 3 prompts más relevantes junto con su estructura e intención.

🔹 1. Configuración de Base de Datos H2 con Spring Boot
📥 Prompt utilizado

Actúa como un desarrollador backend senior experto en Spring Boot. Necesito configurar la persistencia de datos para un sistema de inventario usando base de datos H2 en memoria. Genera:

Configuración completa en application.properties
Repositorio JPA
Servicio con lógica de negocio
Controlador REST con endpoints CRUD

Aplica arquitectura en capas, buenas prácticas, validaciones básicas y explica cada componente. El código debe estar listo para ejecutar.

⚙️ Instrucciones dadas a la IA
Asumir rol de desarrollador backend senior
Usar H2 como base de datos en memoria
Generar código funcional (no pseudocódigo)
Incluir validaciones básicas en la entidad
Explicar cada capa del sistema
Evitar soluciones simplistas o incompletas
🎯 Objetivo

Implementar persistencia real de datos para simular un entorno productivo sin depender de una base de datos externa.

🧩 Justificación técnica

El uso de H2 facilitó pruebas rápidas y simplificó la configuración del entorno, cumpliendo con los requerimientos del MVP.

🔹 2. Implementación de Exportación de Datos a CSV
📥 Prompt utilizado

Actúa como un desarrollador frontend experto en JavaScript. Necesito una función que permita exportar un array de objetos (productos con nombre, categoría, precio y stock) a un archivo CSV descargable desde el navegador.

Requisitos:

No usar librerías externas
Convertir correctamente JSON a CSV
Incluir cabeceras
Manejar caracteres especiales
Generar descarga automática

Explica el proceso paso a paso y asegúrate de que el código sea reutilizable y limpio.

⚙️ Instrucciones dadas a la IA
Usar JavaScript puro (sin dependencias)
Transformar estructuras de datos correctamente
Generar archivo descargable con Blob
Implementar compatibilidad básica en navegador
Explicar cada parte del código
Priorizar claridad y reutilización
🎯 Objetivo

Desarrollar la funcionalidad opcional de exportación de inventario para generar reportes compatibles con Excel.

🧩 Justificación técnica

La solución permitió:

Convertir datos estructurados (JSON) a formato plano (CSV)
Implementar descarga dinámica en el navegador
Añadir valor funcional al sistema (reportes)

Esto demuestra capacidad de investigación autónoma y aplicación práctica de soluciones fuera del alcance básico del reto.

🔹 3. Desarrollo de Frontend Profesional y Enfocado en UX
📥 Prompt utilizado

Actúa como un desarrollador frontend senior especializado en UI/UX. Necesito diseñar una interfaz para un sistema de inventario llamado "Star Mascotas".

Debe incluir:

Tabla de productos (nombre, categoría, precio, stock)
Formulario de registro
Botones de acción (agregar, eliminar, exportar)

Requisitos de diseño:

Interfaz moderna y limpia
Jerarquía visual clara
Colores alineados a temática de mascotas
Buena experiencia de usuario (UX)
Código organizado en HTML, CSS y JavaScript

Evita diseños genéricos. Explica decisiones de diseño.

⚙️ Instrucciones dadas a la IA
Aplicar principios de UI/UX
Mantener coherencia visual
Diseñar para usabilidad (no solo estética)
Usar estructura semántica en HTML
Separar estilos (CSS) y lógica (JS)
Generar código mantenible
Justificar decisiones visuales
🎯 Objetivo

Crear una interfaz atractiva, funcional y alineada con el contexto del negocio, mejorando la experiencia del usuario.

🧩 Justificación técnica

Este enfoque permitió:

Mejorar la claridad en la interacción del usuario
Evitar interfaces desordenadas o poco intuitivas
Aplicar principios básicos de diseño profesional

El resultado fue un frontend más cercano a estándares reales de aplicaciones productivas.

✅ Conclusión

El uso de IA en este proyecto fue guiado mediante instrucciones específicas (prompt engineering), lo que permitió:

Obtener soluciones alineadas a buenas prácticas
Reducir tiempos de desarrollo
Mejorar la calidad del código y diseño
Comprender y validar cada implementación

La IA fue utilizada como **herramienta de apoyo**, no como sustituto del criterio técnico, asegurando que cada componente implementado fuera entendido y correctamente integrado
