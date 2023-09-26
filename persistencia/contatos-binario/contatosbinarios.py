import pickle

def adicionar_contato():
    nome = input("Digite o nome do contato: ")
    telefone = input("Digite o número de telefone do contato: ")
    email = input("Digite o e-mail do contato: ")

    contato = {
        "Nome": nome,
        "Telefone": telefone,
        "Email": email
    }

    contatos.append(contato)
    salvar_contatos()

    print(f"Contato {nome} adicionado com sucesso!")

def listar_contatos():
    for i, contato in enumerate(contatos, 1):
        print(f"\nContato {i}:")
        print(f"Nome: {contato['Nome']}")
        print(f"Telefone: {contato['Telefone']}")
        print(f"Email: {contato['Email']}")

def salvar_contatos():
    with open("contatos.pkl", "wb") as arquivo:
        pickle.dump(contatos, arquivo)


def main():
    global contatos
    try:
        with open("contatos.pkl", "rb") as arquivo:
            contatos = pickle.load(arquivo)
    except FileNotFoundError:
        contatos = []

    while True:
        print("\nOpções:")
        print("1. Adicionar contato")
        print("2. Listar contatos")
        print("3. Sair")

        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            adicionar_contato()
        elif opcao == "2":
            listar_contatos()
        elif opcao == "3":
            print("Saindo do programa.")
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()
