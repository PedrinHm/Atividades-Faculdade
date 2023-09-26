import xml.etree.ElementTree as ET

def criar_contato(nome, telefone, email):
    contato = ET.Element("contato")
    ET.SubElement(contato, "nome").text = nome
    ET.SubElement(contato, "telefone").text = telefone
    ET.SubElement(contato, "email").text = email
    return contato

def salvar_contato(contato, arquivo):
    tree = ET.ElementTree(contato)
    tree.write(arquivo)

def main():
    nome = input("Digite o nome do contato: ")
    telefone = input("Digite o número de telefone do contato: ")
    email = input("Digite o email do contato: ")

    contato = criar_contato(nome, telefone, email)
    
    arquivo_xml = "contatos.xml"
    salvar_contato(contato, arquivo_xml)

    print(f"O contato {nome} foi salvo no arquivo {arquivo_xml}.")

if __name__ == "__main__":
    main()
