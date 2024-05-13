def validar_cpf(cpf: str) -> int:

    cpf = ''.join(filter(str.isdigit, cpf))

    if len(cpf) != 11:
        return 0

    soma = sum(int(cpf[i]) * (10 - i) for i in range(9))
    resto = soma % 11
    digito1 = 0 if resto < 2 else 11 - resto

    if int(cpf[9]) != digito1:
        return 0

    soma = sum(int(cpf[i]) * (11 - i) for i in range(10))
    resto = soma % 11
    digito2 = 0 if resto < 2 else 11 - resto

    if int(cpf[10]) != digito2:
        return 0

    return 1
#Testes:
#Cpf válido
cpf_exemplo = "049.614.280-19"
resultado = validar_cpf(cpf_exemplo)
if resultado:
    print(f"O CPF {cpf_exemplo} é válido.")
else:
    print(f"O CPF {cpf_exemplo} não é válido.")
#Cpf inválido
cpf_exemplo = "050.615.281-20"
resultado = validar_cpf(cpf_exemplo)
if resultado:
    print(f"O CPF {cpf_exemplo} é válido.")
else:
    print(f"O CPF {cpf_exemplo} não é válido.")
#Cpf válido
cpf_exemplo = "832.104.360-70"
resultado = validar_cpf(cpf_exemplo)
if resultado:
    print(f"O CPF {cpf_exemplo} é válido.")
else:
    print(f"O CPF {cpf_exemplo} não é válido.")