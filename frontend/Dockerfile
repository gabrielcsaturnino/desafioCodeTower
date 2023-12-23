# Use uma imagem base leve com Nginx
FROM nginx:latest

# Copie os arquivos do frontend para o diretório padrão do Nginx
COPY ./src /usr/share/nginx/html

# Exponha a porta 80 para fora do contêiner
EXPOSE 80

# O comando padrão para iniciar o servidor Nginx
CMD ["nginx", "-g", "daemon off;"]
