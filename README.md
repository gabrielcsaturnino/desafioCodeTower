Cadastro de usuário: realizado automaticamente a cada reload na pagina.

script para criação de nova 'Usuário':


async function criarNovoUsuario() {
           
            try {
                const response = await fetch(apiUrlPessoas, {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json",
                    },
                    body: JSON.stringify({
                        nome: "Gabriel",
                        idade: 21,
                    }),
                });

                if (!response.ok) {
                    throw new Error(`Erro ao criar usuário: ${response.status} - ${response.statusText}`);
                }

                const usuario = await response.json();
                console.log(`Novo usuário criado: ${JSON.stringify(usuario)}`);
                pessoaId = usuario.id;
            } catch (error) {
                console.error("Erro ao criar usuário:", error.message);
            }
        }
        

  Script ja imbutido no frontend.

  

docker-compose up -d

http://localhost:80

Necessário um pequeno tempo de espera para a criação do usuário.
