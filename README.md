# ☕ Java Design Patterns Project

![Java Design Patterns](https://images.unsplash.com/photo-1515879218367-8466d910aaa4?q=80&w=1200&auto=format&fit=crop)

---

## 📚 About the project | Sobre o projeto

**PT-BR:**  
Este projeto foi desenvolvido com o objetivo de estudar e aplicar os principais Design Patterns (GoF) utilizando Java, organizando o código de forma profissional e separada por categorias.

**EN:**  
This project was developed to study and apply the main GoF Design Patterns using Java, with a clean and professional structure separated by categories.

---

## 🏗️ Project Architecture | Arquitetura do projeto

The project is organized into three main categories:

### 🟢 Creational Patterns
Responsible for object creation.

- Singleton

### 🔵 Behavioral Patterns
Responsible for communication between objects.

- Strategy

### 🟣 Structural Patterns
Responsible for class composition and structure.

- Facade

---

## 🧠 Design Patterns implemented

### 🔹 Singleton
Ensures a class has only one instance and provides a global access point.

- SingletonEager
- SingletonLazy
- SingletonLazyHolder

---

### 🔹 Strategy
Defines a family of algorithms and allows them to be interchangeable.

- Comportamento (interface)
- ComportamentoNormal
- ComportamentoDefensivo
- ComportamentoOfensivo
- Robo (context)

---

### 🔹 Facade
Provides a simplified interface to a complex subsystem.

- Facade
- CepApi (subsystem)
- CrmService (subsystem)

---

## 🏢 System modules | Módulos do sistema

These modules simulate external services:

### CRM System
- Responsible for customer management

### CEP API
- Responsible for address lookup

---

## 🚀 How to run | Como executar

**PT-BR:**
1. Abra o projeto no Eclipse IDE
2. Execute a classe `Main`
3. Ou execute as classes de exemplo de cada pattern

**EN:**
1. Open the project in Eclipse IDE
2. Run the `Main` class
3. Or run each pattern example class individually

---

## 📂 Project structure

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

## 🎯 Learning goals | Objetivos de aprendizado

**PT-BR:**
- Entender padrões de projeto na prática
- Melhorar organização de código
- Aplicar princípios de POO
- Simular arquitetura real de sistemas

**EN:**
- Understand design patterns in practice
- Improve code organization
- Apply OOP principles
- Simulate real system architecture

---

## 👨‍💻 Author | Autor

**Lincoln Buk**

GitHub: https://github.com/lincolnbuk

---

## ⭐ Final note | Observação final

**PT-BR:**  
Este projeto tem fins educacionais e representa a evolução do entendimento de arquitetura de software em Java.

**EN:**  
This project is for educational purposes and represents the evolution of software architecture understanding in Java.
