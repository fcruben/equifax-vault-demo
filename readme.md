**Documentación de referencia:**

 - Componente spring-cloud-vault:
 https://cloud.spring.io/spring-cloud-vault/multi/multi_spring-cloud-vault.html
 - Herramienta Hashicorp Vault:
 https://www.vaultproject.io/docs/index.html

**Requisitos:**

 - MySqlServer
 - Binario de Vault (vault.exe) incluido en el proyecto (/vault/vault.exe)
 - Maven 
 - JDK 1.8

**Pasos para montar el entorno:**

 - Creación de BBDD (usuario y tabla). Comandos en (/vault/commands.txt)
 - Levantar Vault Server en modo dev y creación de policies, token y almacenamiento de secrets. Comandos en (/vault/commands.txt)
 
 **Probar proyecto:**
 
 - Levantar demo con 

> mvn spring-boot:run

 - Acceder con un navegador a la url: http://localhost:8080/