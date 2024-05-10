class Carro():
    def __init__(self):
        self.velocidade = 0
    def acelerar(self):
        self.velocidade += 1

teste1 = Carro()
teste2 = teste1

teste1.acelerar()
teste2.acelerar()
teste2.acelerar()
teste1.acelerar()

print(teste1.velocidade)