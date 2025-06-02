# 💡 Projeto: Controle de Lâmpada com Arduino via Web

Este projeto integra **Arduino** com **Spring Boot** e uma interface web moderna em **HTML/CSS/JavaScript**, permitindo o **controle de uma lâmpada física** conectada ao Arduino diretamente por um navegador.

---

## 🚀 Funcionalidades

- ✅ Ligar e desligar a lâmpada via botões na interface.
- 🌙 Alternância entre **modo dia/noite** conforme o estado da lâmpada.
- 📋 Histórico visual com os horários das ações realizadas.
- 🔁 Comunicação serial entre o backend e o Arduino (porta COM).
- 🗄️ Registro de horários de acionamento e desligamento com MySQL.

---

## ⚙️ Tecnologias Utilizadas

- **Back-end:** Java 17 + Spring Boot
- **Comunicação Serial:** Biblioteca RXTX
- **Banco de Dados:** MySQL
- **Front-end:** HTML & CSS
- **IDE recomendada:** IntelliJ IDEA ou VSCode

---

## 🔌 Comunicação com Arduino

- O Arduino recebe comandos via porta serial (`COMx`) enviados pelo Spring Boot.
- Comandos possíveis:
  - `"1"`: Liga o LED
  - `"2"`: Desliga o LED
- O código do Arduino lê esses valores usando `Serial.read()` e aciona o `digitalWrite`.

---

## 🧪 Como testar

1. Suba o código no Arduino com a comunicação serial a 9600 baud.
2. Conecte o Arduino via USB ao computador.
3. Verifique a porta COM usada (`COM3`, `COM4`, etc).
4. Rode o back-end Spring Boot (`ArduinoApplication.java`).
5. Acesse `index.html` no navegador.
6. Clique nos botões "Ligar" e "Desligar" para interagir com o Arduino.

---

## 📝 Exemplo de Uso

Ao clicar em **Ligar**:
- O fundo da página muda para azul claro (modo dia)
- A imagem da lâmpada acende
- Um log aparece no histórico:  
  `[10:15:32] Lâmpada ligada`

Ao clicar em **Desligar**:
- A interface entra no modo escuro
- A lâmpada apaga
- O histórico registra o desligamento

---

## 🧠 Autor

Desenvolvido como trabalho acadêmico de integração de sistemas embarcados com aplicações web modernas.
