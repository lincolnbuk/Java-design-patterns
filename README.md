# ☕ Java Design Patterns Project

![Java Design Patterns](https://images.unsplash.com/photo-1515879218367-8466d910aaa4?q=80&w=1200&auto=format&fit=crop)

---

## 📚 Sobre o projeto | About the project

**PT-BR:**  
Este projeto foi desenvolvido para estudar e aplicar os principais Design Patterns (GoF) utilizando Java, com uma estrutura organizada e profissional.

**EN:**  
This project was developed to study and apply the main GoF Design Patterns using Java, with a clean and professional structure.

---

## 🏗️ Arquitetura do projeto | Project architecture

**PT-BR:**  
O projeto está organizado em três categorias principais de Design Patterns.

**EN:**  
The project is organized into three main Design Pattern categories.

### 🟢 Criacionais | Creational
**PT-BR:** Responsáveis pela criação de objetos.  
**EN:** Responsible for object creation.

- Singleton

---

### 🔵 Comportamentais | Behavioral
**PT-BR:** Responsáveis pela comunicação entre objetos.  
**EN:** Responsible for communication between objects.

- Strategy

---

### 🟣 Estruturais | Structural
**PT-BR:** Responsáveis pela composição e estrutura das classes.  
**EN:** Responsible for class composition and structure.

- Facade

---

## 🧠 Design Patterns implementados | Implemented Design Patterns

### 🔹 Singleton

**PT-BR:** Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso.  
**EN:** Ensures a class has only one instance and provides a global access point.

- SingletonEager  
- SingletonLazy  
- SingletonLazyHolder  

---

### 🔹 Strategy

**PT-BR:** Permite que diferentes algoritmos sejam intercambiáveis em tempo de execução.  
**EN:** Allows different algorithms to be interchangeable at runtime.

- Comportamento (interface / interface)  
- ComportamentoNormal  
- ComportamentoDefensivo  
- ComportamentoOfensivo  
- Robo (contexto / context)  

---

### 🔹 Facade

**PT-BR:** Fornece uma interface simples para um subsistema complexo.  
**EN:** Provides a simple interface to a complex subsystem.

- Facade  
- CepApi (subsistema / subsystem)  
- CrmService (subsistema / subsystem)  

---

## 🏢 Módulos do sistema | System modules

### CRM
**PT-BR:** Responsável pelo gerenciamento de clientes  
**EN:** Responsible for customer management

### CEP API
**PT-BR:** Responsável pela consulta de endereços  
**EN:** Responsible for address lookup

---

## 🚀 Como executar | How to run

**PT-BR:**
1. Abra o projeto no Eclipse IDE  
2. Execute a classe `Main`  
3. Ou execute as classes de cada Design Pattern individualmente  

**EN:**
1. Open the project in Eclipse IDE  
2. Run the `Main` class  
3. Or run each Design Pattern class individually  

---

## 📂 Estrutura do projeto | Project structure

```bash
src/
 └── com.lincoln

     ├── designpatterns/
     │    ├── creational/
     │    │     └── singleton/
     │    ├── behavioral/
     │    │     └── strategy/
     │    ├── structural/
     │          └── facade/

     ├── system/
     │    ├── crm/
     │    └── cep/

     └── app/
          └── Main.java
```

---

## 🎯 Objetivos de aprendizado | Learning goals

**PT-BR:**
- Aprender Design Patterns na prática
- Melhorar organização de código
- Aplicar princípios de POO
- Simular arquitetura de sistemas reais

**EN:**
- Learn Design Patterns in practice
- Improve code organization
- Apply OOP principles
- Simulate real system architecture

---

## 👨‍💻 Autor | Author

**PT-BR:** Lincoln Buk  
**EN:** Lincoln Buk  

GitHub: https://github.com/lincolnbuk  

---

## ⭐ Observação final | Final note

**PT-BR:**  
Este projeto tem fins educacionais e demonstra evolução em arquitetura de software.

**EN:**  
This project is for educational purposes and demonstrates software architecture learning progress.
